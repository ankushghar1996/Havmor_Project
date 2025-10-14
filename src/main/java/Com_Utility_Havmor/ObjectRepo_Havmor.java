package Com_Utility_Havmor;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.time.Duration;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

public class ObjectRepo_Havmor {

    // single ExtentReports instance shared
    public static ExtentReports extent;

    // single ExtentTest for sequential runs
    public static ExtentTest test;

    public static WebDriver driver;
    private static boolean reportAlreadySent = false;

    // Initialize extent (idempotent)
    public static synchronized ExtentReports initializeReport() {
        if (extent != null) return extent;

        String reportFolderPath = System.getProperty("user.dir")
                + File.separator + "test-output" + File.separator + "Extent_Reports" + File.separator;
        try {
            File reportDir = new File(reportFolderPath);
            if (!reportDir.exists()) reportDir.mkdirs();

            ExtentSparkReporter reporter = new ExtentSparkReporter(reportFolderPath + "TestReport.html");
            reporter.config().setOfflineMode(true);
            reporter.config().setDocumentTitle("Test Execution Report");
            reporter.config().setReportName("Automation Test Report For Fosroc_HO");
            reporter.config().setTheme(Theme.DARK);

            extent = new ExtentReports();
            extent.attachReporter(reporter);
            extent.setSystemInfo("Browser Name", "Chrome");
            extent.setSystemInfo("QA Name", "Ankush Gharsle, Aniket Jadhav");
            extent.setSystemInfo("Environment", "QA Environment");

            System.out.println("✅ Extent initialized at: " + reportFolderPath + "TestReport.html");
        } catch (Exception e) {
            System.err.println("❌ Error initializing Extent: " + e.getMessage());
            e.printStackTrace();
        }
        return extent;
    }

    // Start a test (sequential)
    public static void startTest(String testName, String testDescription) {
        if (extent == null) initializeReport();
        test = extent.createTest(testName, testDescription);
    }

    // helper to retrieve current ExtentTest (single-threaded)
    public static ExtentTest getTest() {
        return test;
    }

    public static void startTestAndLog_1_SS(String testNumber, String testDescription, Runnable action) {
        startTest(testNumber, testDescription);

        ExtentTest cur = getTest();
        if (cur == null) {
            System.err.println("❌ getTest() returned null in startTestAndLog_1_SS");
            return;
        }

        List<String> safeFlashKeywords = Arrays.asList(
                "successfully", "success", "record saved", "submitted",
                "otp has been sent", "otp sent", "otp sent successfully",
                "success otp", "otp dispatched", "okay", "yes", "added"
        );

        try {
            try {
                new WebDriverWait(driver, Duration.ofSeconds(5))
                        .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='toast-container']")));
            } catch (Exception ignored) {}

            cur.info(testDescription);
            action.run();

            List<WebElement> flashMessages = driver.findElements(By.xpath("//div[@id='toast-container']"));
            boolean flashErrorFound = false;

            for (WebElement msg : flashMessages) {
                if (msg.isDisplayed()) {
                    String messageText = msg.getText().trim().toLowerCase();

                    boolean isSafe = safeFlashKeywords.stream().anyMatch(messageText::contains);

                    if (isSafe) {
                        cur.pass("✅ Flash Message: " + messageText);
                        captureScreenshot("Screenshot - Flash Success");
                    } else if (messageText.contains("error saving scheme: unauthorized")
                            || messageText.contains("error duplicate data")
                            || messageText.contains("unauthorized")
                            || messageText.contains("internal server error")) {
                        cur.fail("❌ Critical Flash Message: " + messageText);
                        captureScreenshot("Screenshot - Critical Flash Message");
                        flashErrorFound = true;
                        throw new RuntimeException("Critical flash message found: " + messageText);
                    } else {
                        cur.fail("❌ Flash Message Detected: " + messageText);
                        captureScreenshot("Screenshot - Flash Error");
                        flashErrorFound = true;
                    }
                }
            }

            if (!flashErrorFound) {
                cur.pass("✅ " + testDescription);
                captureScreenshot("Screenshot - Passed");
            }
        } catch (Exception e) {
            if (cur != null) cur.fail("❌ Exception in step: " + testDescription + " | " + e.getMessage());
            captureScreenshot("Screenshot - Exception");
        }
    }

    private static void captureScreenshot(String label) {
        ExtentTest cur = getTest();
        if (driver != null && cur != null) {
            try {
                String screenshot = takeScreenshot();
                if (screenshot != null && !screenshot.isEmpty()) {
                    cur.addScreenCaptureFromBase64String(screenshot, label);
                }
            } catch (IOException e) {
                cur.warning("⚠️ Screenshot capture failed: " + e.getMessage());
            }
        }
    }

    public static String takeScreenshot() throws IOException {
        if (driver == null) {
            return null;
        }
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        byte[] fileContent = FileUtils.readFileToByteArray(srcFile);
        return Base64.getEncoder().encodeToString(fileContent);
    }

    public static void logTestResult(String testName, String testDescription, boolean isTestPassed, String additionalInfo) {
        startTest(testName, testDescription);
        ExtentTest cur = getTest();
        if (isTestPassed) {
            cur.pass(additionalInfo);
        } else {
            cur.fail(additionalInfo);
        }
    }

    // flush extent and send email (only once)
    public static synchronized void finalizeReport() {
        if (reportAlreadySent) {
            System.out.println("🚫 Report already finalized, skipping duplicate...");
            return;
        }
        reportAlreadySent = true;

        System.out.println("🟡 finalizeReport() START called at: " + java.time.LocalTime.now() +
                " | Thread: " + Thread.currentThread().getName());

        try {
            if (extent != null) {
                extent.flush();
                System.out.println("✅ Extent.flush() called");
            } else {
                System.out.println("⚠️ Extent was null in finalizeReport()");
            }

            Path reportPath = Paths.get(System.getProperty("user.dir"), "test-output", "Extent_Reports", "TestReport.html");
            File reportFile = reportPath.toFile();

            if (!reportFile.exists()) {
                System.err.println("❌ Report file not found at: " + reportPath.toAbsolutePath());
                try {
                    Path dir = reportPath.getParent();
                    if (dir != null && Files.exists(dir)) {
                        System.out.println("Listing " + dir + ":");
                        Files.list(dir).forEach(p -> System.out.println(" - " + p.getFileName()));
                    }
                } catch (Exception e) {
                    System.err.println("Error listing report dir: " + e.getMessage());
                }
                return;
            }

            try { Thread.sleep(800); } catch (InterruptedException ignored) {}

            Demo_Mail_Havmor.sendReportEmail(reportFile.getAbsolutePath());

            System.out.println("🟢 finalizeReport() END at: " + java.time.LocalTime.now());
        } catch (Exception e) {
            System.err.println("❌ finalizeReport error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static ExtentReports extentreport() {
        return extent;
    }
}
