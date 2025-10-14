package Com_Utility_Havmor;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.time.Duration;
import java.util.Base64;
import java.util.List;

public class ObjectRepo_Havmor {

    public static ExtentReports extent;
    public static ExtentTest test;
    public static WebDriver driver;
    public static Object startTest;

    private static boolean reportAlreadySent = false;

    // Keep existing initializeReport but ensure extent assigned
    public static ExtentReports initializeReport() {
        if (extent != null) return extent; // already initialized

        String reportFolderPath = System.getProperty("user.dir")
                + File.separator + "test-output" + File.separator + "Extent_Reports" + File.separator;
        File reportDir = new File(reportFolderPath);
        if (!reportDir.exists()) {
            reportDir.mkdirs();
        }
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
        return extent;
    }

    // helper to create test
    public static void startTest(String testName, String testDescription) {
        if (extent == null) initializeReport();
        test = extent.createTest(testName, testDescription);
    }

    // example step wrapper with screenshot and flash handling
    public static void startTestAndLog_1_SS(String testNumber, String testDescription, Runnable action) {
        startTest(testNumber, testDescription);

        try {
            try {
                new WebDriverWait(driver, Duration.ofSeconds(5))
                        .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='toast-container']")));
            } catch (Exception ignored) {}

            test.info(testDescription);
            action.run();

            List<WebElement> flashMessages = driver.findElements(By.xpath("//div[@id='toast-container']"));
            boolean flashErrorFound = false;

            for (WebElement msg : flashMessages) {
                if (msg.isDisplayed()) {
                    String messageText = msg.getText().trim().toLowerCase();
                    if (messageText.contains("success") || messageText.contains("added") || messageText.contains("submitted") || messageText.contains("otp")) {
                        test.pass("✅ Flash Message: " + messageText);
                        captureScreenshot("Screenshot - Flash Success");
                    } else {
                        test.fail("❌ Flash Message Detected: " + messageText);
                        captureScreenshot("Screenshot - Flash Error");
                        flashErrorFound = true;
                    }
                }
            }

            if (!flashErrorFound) {
                test.pass("✅ " + testDescription);
                captureScreenshot("Screenshot - Passed");
            }
        } catch (Exception e) {
            if (test != null) test.fail("❌ Exception in step: " + testDescription + " | " + e.getMessage());
            captureScreenshot("Screenshot - Exception");
        }
    }

    private static void captureScreenshot(String label) {
        if (driver != null && test != null) {
            try {
                String screenshot = takeScreenshot();
                if (screenshot != null && !screenshot.isEmpty()) {
                    test.addScreenCaptureFromBase64String(screenshot, label);
                }
            } catch (IOException e) {
                test.warning("⚠️ Screenshot capture failed: " + e.getMessage());
            }
        }
    }

    public static String takeScreenshot() throws IOException {
        if (driver == null) {
            return null;
        }
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        byte[] fileContent = FileUtils.readFileToByteArray(srcFile);
        String base64Screenshot = Base64.getEncoder().encodeToString(fileContent);
        System.out.println("📸 Screenshot captured");
        return base64Screenshot;
    }

    public static void logTestResult(String testName, String testDescription, boolean isTestPassed, String additionalInfo) {
        startTest(testName, testDescription);
        if (isTestPassed) {
            test.pass(additionalInfo);
        } else {
            test.fail(additionalInfo);
        }
    }

    // IMPORTANT: finalizeReport flushes extent and triggers email by passing explicit path
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
                extent.flush();  // crucial to write the HTML file
                System.out.println("✅ Extent.flush() called");
            } else {
                System.out.println("⚠️ Extent was null in finalizeReport()");
            }

            Path reportPath = Paths.get(System.getProperty("user.dir"), "test-output", "Extent_Reports", "TestReport.html");
            File reportFile = reportPath.toFile();

            if (!reportFile.exists()) {
                System.err.println("❌ Report file not found at: " + reportPath.toAbsolutePath());
                // optional: print listing to help debug
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

            // small pause to ensure file handle release
            try { Thread.sleep(800); } catch (InterruptedException ignored) {}

            // Call mailer with explicit path
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
