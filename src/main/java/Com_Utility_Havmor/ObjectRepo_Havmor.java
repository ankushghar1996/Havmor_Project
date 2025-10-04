package Com_Utility_Havmor;
 
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import org.openqa.selenium.TimeoutException;   // ✅ This one


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
 
    public static ExtentReports extent;
    public static ExtentTest test;
    public static WebDriver driver;
    public static Object startTest;
 
    private static boolean reportAlreadySent = false;
 
    public static ExtentReports initializeReport() {
        String reportFolderPath = System.getProperty("user.dir") + File.separator + "test-output" + File.separator + "Extent_Reports" + File.separator;
        File reportDir = new File(reportFolderPath);
        if (!reportDir.exists()) {
            reportDir.mkdirs();
        }
        ExtentSparkReporter reporter = new ExtentSparkReporter(reportFolderPath + "TestReport.html");
        // ✅ this is the key line – embed all CSS/JS inside HTML
        reporter.config().setOfflineMode(true); 
        
        reporter.config().setDocumentTitle("Test Execution Report");
        reporter.config().setReportName("Automation Test Report For Fosroc_HO");
        reporter.config().setTheme(Theme.DARK);
 
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Browser Name", "Chrome");
        extent.setSystemInfo("QA Name", "Ankush Gharsle, Aniket Jadhav,");
        extent.setSystemInfo("Environment", "QA Environment");
        return extent;
    }
 
    public static void startTest(String testName, String testDescription) {
        test = extent.createTest(testName, testDescription);
    }
 
    public static void startTestAndLog_1(String testNumber, String testDescription) {
        test = extent.createTest(testNumber, testDescription);
    }
 
   
    public static void startTestAndLog_1_SS(String testNumber, String testDescription, Runnable action) {
        test = extent.createTest(testNumber, testDescription); // ✅ Create test

        try {  // ✅ Outer try for everything

            // --- Wait for old toast to disappear
            try {
                new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.invisibilityOfElementLocated(
                        By.xpath("//div[@id='toast-container']")));
            } catch (TimeoutException te) {
                // ignore if still visible, proceed
            }

            test.info(testDescription);

            // --- Run the actual step
            action.run();

            // 2️⃣ Now look for new flash messages
            List<WebElement> flashMessages = driver.findElements(By.xpath("//div[@id='toast-container']"));
            boolean flashErrorFound = false;

            // ✅ Safe flash keywords (including OTP success cases)
            List<String> safeFlashKeywords = Arrays.asList(
                "successfully",
                "record saved",
                "submitted",
                "otp has been sent",
                "otp sent",
                "otp sent successfully",
                "success otp",
                "otp dispatched",
                "okay",
                "yes",
                "Added",
                "New"
                
            );

            for (WebElement msg : flashMessages) {
                if (msg.isDisplayed()) {
                    String messageText = msg.getText().trim().toLowerCase();
                    boolean isSafe = safeFlashKeywords.stream().anyMatch(messageText::contains);

                    if (isSafe) {
                        test.pass("✅ Flash Message: " + messageText);
                        captureScreenshot("Screenshot - Flash Success");
                    } 
                    // 🆕 Added: Critical error messages check
                    else if (messageText.contains("error saving scheme: unauthorized") 
                          || messageText.contains("error duplicate data"))
                    	{
                        test.fail("❌ Critical Flash Message: " + messageText);
                        captureScreenshot("Screenshot - Critical Flash Message");
                        flashErrorFound = true;
                        // ⛔ Stop execution immediately
                        throw new RuntimeException("Critical flash message found: " + messageText);
                    }
                    // 🔴 Old hardcoded handling continues untouched
                    else {
                        test.fail("❌ Flash Message Detected: " + messageText);
                        flashErrorFound = true;
                        captureScreenshot("Screenshot - Flash Error");
                    }
                }
            }

            // ✅ Final decision
            if (!flashErrorFound) {
                test.pass("✅ " + testDescription);
                captureScreenshot("Screenshot - Passed");
            } else {
                // ❌ Fail only for error messages, NOT for safe ones
                // throw new RuntimeException("Flash error found — test failed.");
                // Mark fail but do NOT throw, so execution continues
               // test.fail("❌ Flash error found in step: " + testDescription);
            }

        } catch (Exception e) {
            test.fail("❌ Exception in step: " + testDescription + " | " + e.getMessage());
            captureScreenshot("Screenshot - Exception");
            // No throw here either
        }
    }

/*
// 🔁 NEW METHOD: Flash message support version
    public static void startTestAndLog_1_SS(String testNumber, String testDescription, Runnable action) {
        test = extent.createTest(testNumber, testDescription); // ✅ Create test
 
        try {
            test.info(testDescription); // ✅ Log step
            action.run(); // ✅ Execute action
 
            // ✅ Flash message check after action
>>>>>>> Aniket_211
            List<WebElement> flashMessages = driver.findElements(By.xpath("//div[@id='toast-container']"));
            boolean flashFound = false;
 
            List<String> safeFlashKeywords = Arrays.asList(
                "successfully", "record saved", "submitted", "otp has been sent", 
                "otp sent", "otp sent successfully", "success otp", 
                "otp dispatched", "okay", "yes"
            );
 
            for (WebElement msg : flashMessages) {
                if (msg.isDisplayed()) {
                    String messageText = msg.getText().trim().toLowerCase();
                    boolean isSafe = safeFlashKeywords.stream().anyMatch(messageText::contains);
 
                    if (isSafe) {
                        test.pass("✅ Flash Message: " + messageText);
                        captureScreenshot("Screenshot - Flash Success");
                    } else {
                        test.fail("❌ Flash Message Detected: " + messageText);
                        flashFound = true;
                        captureScreenshot("Screenshot - Flash Error");
                    }
                }
            }
 
            if (!flashFound) {
                test.pass("✅ " + testDescription);
                captureScreenshot("Screenshot - Passed");
            } else {
                throw new RuntimeException("Flash error found — test failed.");
            }
 
        } catch (Exception e) {
            test.fail("❌ Exception in step: " + testDescription + " | " + e.getMessage());
            captureScreenshot("Screenshot - Exception");
            throw new RuntimeException(e);
        }
    }    */
 
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
    public static void startTestAndLog_2(String testNumber, String testDescription) {
        test = extent.createTest(testNumber, testDescription);
        test.log(Status.INFO, testDescription);
    }
 
    public static void AssertTextAndLog(String actualText, String expectedText) throws Exception {
        try {
            Assert.assertEquals(actualText, expectedText);
            test.log(Status.PASS, "| Expected: " + expectedText + " | Actual: " + actualText);
        } catch (AssertionError e) {
            test.fail(" | Expected: " + expectedText + " | Actual: " + actualText);
            String screenshotPath = takeScreenshot();
            test.addScreenCaptureFromPath(screenshotPath);
            throw e;
        }
    }
 
    public static void logTestResult(String testName, String testDescription, boolean isTestPassed, String additionalInfo) {
        startTest(testName, testDescription);
        if (isTestPassed) {
            test.pass(additionalInfo);
        } else {
            test.fail(additionalInfo);
        }
    }
 
    public static void Headlines_logOnlyDescription(String testDescription) {
        test = extent.createTest(testDescription);
        test.info("📝 " + testDescription);
        System.out.println("🖨️ Logged Only Description: " + testDescription);
    }
 
    public static void Print_Dynamic_Flash_Massage(WebDriver driver, String xpathLocator, String testNumber_Print_Massage) {
        try {
            test = extent.createTest(testNumber_Print_Massage);
            List<WebElement> errorMessageList = driver.findElements(By.xpath(xpathLocator));
            if (!errorMessageList.isEmpty()) {
                for (WebElement errorMessage : errorMessageList) {
                    if (errorMessage.isDisplayed()) {
                        String errorText = errorMessage.getText();
                        System.out.println("Flash Message Print: " + errorText);
                        System.out.println("Test Case Number: " + testNumber_Print_Massage);
                        test.fail("  Flash Massage: " + errorText);
                        logTestWithScreenshot("Error captured for  " + testNumber_Print_Massage);
                    }
                }
            } else {
                System.out.println("No error message displayed.");
            }
        } catch (Exception e) {
            System.err.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
            test.fail("An unexpected error occurred: " + e.getMessage());
        }
    }
 
    
    public static String takeScreenshot() throws IOException {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized.");
        }
 
        try {
            Thread.sleep(300); // Helps avoid capturing duplicate/stale screenshots
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
 
 
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        byte[] fileContent = FileUtils.readFileToByteArray(srcFile);
        String base64Screenshot = Base64.getEncoder().encodeToString(fileContent);
 
        System.out.println("📸 Screenshot captured at: " + System.currentTimeMillis());
        return base64Screenshot;
    }
 
 
    public static void startTestAndLog_1_NS(String testDescription) {
        test = extent.createTest("❌ Negative Scenario");
        test.info("🔸 " + testDescription);
        test.fail("❌ This is a negative scenario - Marking as Failed");
        System.out.println("🖨️ Negative Scenario Logged as Failed: " + testDescription);
    }
 
 
 
    public static void logTestWithScreenshot(String logMessage) {
        try {
            String encodedScreenshot = takeScreenshot();
            if (encodedScreenshot != null && !encodedScreenshot.isEmpty()) {
                test.info(logMessage + " ==>Screenshot Captured");
                test.addScreenCaptureFromBase64String(encodedScreenshot);
            } else {
                test.fail("Screenshot could not be captured.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            test.fail("Error while capturing screenshot: " + e.getMessage());
        }
    }
 
    public static synchronized void finalizeReport() {
        if (reportAlreadySent) {
            System.out.println("🚫 Report already finalized, skipping duplicate...");
            return;
        }
        reportAlreadySent = true;
 
        System.out.println("🟡 finalizeReport() START called at: " + java.time.LocalTime.now() +
                " | Thread: " + Thread.currentThread().getName());
 
        if (extent != null) {
            extent.flush();
        }
        System.out.println("✅ Extent Report flushed successfully...");
 
        try {
            String reportPath = System.getProperty("user.dir") + "/test-output/Extent_Reports/TestReport.html";
            File reportFile = new File(reportPath);
            if (!reportFile.exists()) {
                System.out.println("❌ Report file not found at: " + reportPath);
                return;
            }
            Thread.sleep(5000);
            Demo_Mail_Havmor.sendReportEmail();
        } catch (Exception e) {
            System.out.println("❌ Failed to send email: " + e.getMessage());
            e.printStackTrace();
        }
 
        System.out.println("🟢 finalizeReport() END at: " + java.time.LocalTime.now());
    }
 
    public static ExtentReports extentreport() {
        return extent;
    }
    
    
    /*
    @AfterClass
    public static void finalizeReportAfterClass() {
        finalizeReport();
    }
    */
    
    
    
}