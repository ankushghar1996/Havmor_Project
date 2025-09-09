package Com_Utility_Havmor;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import Com_LoginPage_POM.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	 public static WebDriver driver;
	    public static Confiq_Data_Provider_Havmor confiq;
	    public static Excel_Data_Provider_Havmor excel;
	    public WebDriverWait wait;
	 
	    // BeforeSuite to initialize the ExtentReports
	    @BeforeSuite
	    public void Data_Provider() throws Exception {
	        // Initialize the data providers
	        confiq = new Confiq_Data_Provider_Havmor();
	        excel = new Excel_Data_Provider_Havmor();
	 
	        // Initialize Extent Reports
	        ObjectRepo_Havmor.initializeReport();
	    }
	  
	    // BeforeMethod to open the browser and run the login process
	    @BeforeMethod
	    public void openbrowser() throws Exception {
	        // Automatically download and set up the ChromeDriver using WebDriverManager
	        WebDriverManager.chromedriver().setup();
	        // Initialize the WebDriver for Chrome browser
	        driver = new ChromeDriver();
	        driver.get("https://havmoruat.hspldms.com/");
	        driver.manage().window().maximize();
	        
	        ObjectRepo_Havmor.driver = driver;
	        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	        
	        
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        // Initialize the LoginPage object using PageFactory
	        LoginPage loginelements = PageFactory.initElements(driver, LoginPage.class);
	 
	        // Use custom methods to send keys and clicks, replace Liabrary with Library
	        Liabrary_Havmor.custom_Sendkeys(loginelements.getUsername(), excel.getStringdata2("Sheet1", 1, 0), "UserName Field");
	        Thread.sleep(1000);
	        Liabrary_Havmor.custom_Sendkeys(loginelements.getPassword(), excel.getStringdata2("Sheet1", 1, 1), "Password Field");
	        Thread.sleep(3000);
	        
	        // Wait for Continue button
	        wait.until(ExpectedConditions.elementToBeClickable(loginelements.getContinue()));
	        Liabrary_Havmor.custom_click(loginelements.getContinue(), "Continue Btn");
	        Thread.sleep(1000);
	        
	        Liabrary_Havmor.custom_Sendkeys(loginelements.getTxtOTP(), excel.getStringdata2("Sheet1", 1, 2), "OTP Field");
	        Thread.sleep(1000);
	        
	        wait.until(ExpectedConditions.elementToBeClickable(loginelements.getVerify_OTP()));
	        Liabrary_Havmor.custom_click(loginelements.getVerify_OTP(), "Verify OTP Btn");
	        Thread.sleep(1000);
	        
	        
	    }
	    
	// AfterMethod to close the browser after each test
	    // AfterMethod → Always close browser
	    @AfterMethod(alwaysRun = true)
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	 
	    
	    // AfterSuite to finalize the ExtentReports and generate the final report after all tests are executed
	    // AfterSuite → Finalize report
	    @AfterSuite
	    public void generateReport() {
	        ObjectRepo_Havmor.finalizeReport();
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

