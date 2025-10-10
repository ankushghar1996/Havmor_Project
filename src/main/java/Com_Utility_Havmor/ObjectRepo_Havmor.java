package Com_Utility_Havmor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import org.openqa.selenium.TimeoutException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ObjectRepo_Havmor {

    private static volatile ExtentReports extent;
    public static ExtentTest test;
    public static WebDriver driver;
    private static boolean reportAlreadySent = false;

    // ===============================
    // 1️⃣ Initialize Extent Report (Singleton)
    // ===============================
    public static synchronized ExtentReports initializeReport() {
        if (extent != null) {
            return extent;
        }

        String reportFolderPath = System.getProperty("user.dir") + File.separator
                + "test-output" + File.separator + "Extent_Reports" + File.separator;

        File reportDir = new File(reportFolderPath);
        if (!reportDir.exists()) {
            reportDir.mkdirs();
        }

        ExtentSparkReporter reporter = new ExtentSparkReporter(reportFolderPath + "TestReport.html");

        // Embed CSS/JS for offline (no broken design)
        reporter.config().setOfflineMode(true);
        reporter.config().setTheme(Theme.DARK);
        reporter.config().setDocumentTitle("Test Execution Report");
        reporter.config().setReportName("Automation Test Report For Fosroc_HO");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Browser Name", "Chrome");
        extent.setSystemInfo("QA Name", "Ankush Gharsle, Aniket Jadhav");
        extent.setSystemInfo("Environment", "QA Environment");

        return extent;
    }

    // ===============================
    // 2️⃣ Driver Setter
    // ===============================
    public static void setDriver(WebDriver drv) {
        driver = drv;
    }

    // ===============================
    // 3️⃣ Start Test Methods
    // ===============================
    public static void startTest(String testName, String testDescription) {
        initializeReport();
        test = extent.createTest(testName, testDescription);
    }

    public static void startTestAndLog_1(String testNumber, String testDescription) {
        initializeReport();
        test = extent.createTest(testNumber, testDescription);
    }

    public static void startTestAndLog_1_SS(String testNumber, String testDescription, Runnable action) {
        initializeReport();
        test = extent.createTest(testNumber, testDescription);

        try {
            // Wait for old toast to disappear
            try {
                new WebDriverWait(driver, Duration.ofSeconds(5))
                        .until(ExpectedConditions.invisibilityOfElementLocated(
                                By.xpath("//div[@id='toast-container']")));
            } catch (TimeoutException te) {
                // ignore timeout
            }

            test.info(testDescription);
            action.run();

            // Flash message handling
            List<WebElement> flashMessages = driver.findElements(By.xpath("//div[@id='toast-container']"));
            boolean flashErrorFound = false;

            List<String> safeFlashKeywords = Arrays.asList(
                    "successfully", "record saved", "submitted", "otp has been sent",
                    "otp sent", "otp sent successfully", "success otp", "otp dispatched",
                    "okay", "yes", "added", "new"
            );

            for (WebElement msg : flashMessages) {
                if (msg.isDisplayed()) {
                    String messageText = msg.getText().trim().toLowerCase();
                    boolean isSafe = safeFlashKeywords.stream().anyMatch(messageText::contains);

                    if (isSafe) {
                        test.pass("✅ Flash Message: " + messageText);
                        captureScreenshot("Screenshot - Flash Success");
                    } else if (messageText.contains("error saving scheme: unauthorized")
                            || messageText.contains("error duplicate data")) {
                        test.fail("❌ Critical Flash Message: " + messageText);
                        captureScreenshot("Screenshot - Critical Flash Message");
                        flashErrorFound = true;
                        throw new RuntimeException("Critical flash message found: " + messageText);
                    } else {
                        test.fail("❌ Flash Message Detected: " + messageText);
                        flashErrorFound = true;
                        captureScreenshot("Screenshot - Flash Error");
                    }
                }
            }

            if (!flashErrorFound) {
                test.pass("✅ " + testDescription);
                captureScreenshot("Screenshot - Passed");
            }

        } catch (Exception e) {
            test.fail("❌ Exception in step: " + testDescription + " | " + e.getMessage());
            captureScreenshot("Screenshot - Exception");
        }
    }

    // ===============================
    // 4️⃣ Screenshot Handling
    // ===============================
    private static void captureScreenshot(String label) {
        if (driver != null) {
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
            throw new IllegalStateException("Driver is not initialized.");
        }

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        byte[] fileContent = FileUtils.readFileToByteArray(srcFile);
        return Base64.getEncoder().encodeToString(fileContent);
    }

    // ===============================
    // 5️⃣ Logging Helpers
    // ===============================
    public static void startTestAndLog_2(String testNumber, String testDescription) {
        initializeReport();
        test = extent.createTest(testNumber, testDescription);
        test.log(Status.INFO, testDescription);
    }

    public static void AssertTextAndLog(String actualText, String expectedText) throws Exception {
        try {
            Assert.assertEquals(actualText, expectedText);
            test.log(Status.PASS, "| Expected: " + expectedText + " | Actual: " + actualText);
        } catch (AssertionError e) {
            test.fail("| Expected: " + expectedText + " | Actual: " + actualText);
            String screenshot = takeScreenshot();
            test.addScreenCaptureFromBase64String(screenshot);
            throw e;
        }
    }

    public static void logTestWithScreenshot(String logMessage) {
        try {
            String encodedScreenshot = takeScreenshot();
            if (encodedScreenshot != null && !encodedScreenshot.isEmpty()) {
                test.info(logMessage + " ==> Screenshot Captured");
                test.addScreenCaptureFromBase64String(encodedScreenshot);
            }
        } catch (IOException e) {
            test.fail("Error capturing screenshot: " + e.getMessage());
        }
    }

    // ===============================
    // 6️⃣ Finalize Report
    // ===============================
    public static synchronized void finalizeReport() {
        if (reportAlreadySent) {
            System.out.println("🚫 Report already finalized, skipping duplicate...");
            return;
        }
        reportAlreadySent = true;

        System.out.println("🟡 finalizeReport() START: " + java.time.LocalTime.now());

        if (extent != null) {
            extent.flush();
        } else {
            System.out.println("⚠️ Extent was null at finalize time.");
        }

        System.out.println("✅ Extent Report flushed successfully...");

        try {
            String reportPath = System.getProperty("user.dir") + File.separator
                    + "test-output" + File.separator + "Extent_Reports" + File.separator + "TestReport.html";
            File reportFile = new File(reportPath);
            if (!reportFile.exists()) {
                System.out.println("❌ Report file not found at: " + reportPath);
                return;
            }

            // Auto-open report after execution
            if (java.awt.Desktop.isDesktopSupported()) {
                java.awt.Desktop.getDesktop().browse(reportFile.toURI());
            }

            Thread.sleep(2000);
            Demo_Mail_Havmor.sendReportEmail();

        } catch (Exception e) {
            System.out.println("❌ Failed to open or email report: " + e.getMessage());
        }

        System.out.println("🟢 finalizeReport() END at: " + java.time.LocalTime.now());
    }

    // ===============================
    // 7️⃣ Accessor (Optional)
    // ===============================
    public static ExtentReports extentreport() {
        return initializeReport();
    }
}
