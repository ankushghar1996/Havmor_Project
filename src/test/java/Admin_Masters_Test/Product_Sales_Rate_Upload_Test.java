package Admin_Masters_Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Admin_Masters.Product_Image_Uplod_Main;
import Admin_Masters.Product_Sales_Rate_Upload_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Product_Sales_Rate_Upload_Test extends BaseClass {

	
	@Test
	   public void Product_Sales_Rate_Uplod() throws Exception {	
	   Product_Image_Uplod_Main PIMGU = PageFactory.initElements(driver, Product_Image_Uplod_Main.class);
	   HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
	   Product_Sales_Rate_Upload_Main PSUM = PageFactory.initElements(driver,Product_Sales_Rate_Upload_Main.class );
	   
		ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Product_Sales Rate_Uplod_TC_01", "Verify that user Click On Master Menu ", () ->{
		Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
		});
		Thread.sleep(1000);
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Product_Sales Rate_Uplod_TC_02", "Verify that user Click Product Master ", () ->{
		Liabrary_Havmor.custom_click(home.getProduct_Master_Submenu(), "Product Master");      
		});
		Thread.sleep(1000);
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Product_Sales Rate_Uplod_TC_03", "Verify that user Click Sales Rate Upload ", () ->{
		Liabrary_Havmor.custom_click(PSUM.getSales_Rate_Upload_Submenu(), "Sales Rate Upload Submenu ");      
		});
		Thread.sleep(1000);
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Product_Sales Rate_Uplod_TC_04", "Verify that user Click Sales Rate Upload ", () ->{
		Liabrary_Havmor.custom_click(PSUM.getSales_Rate_Upload_Submenu(), "Sales Rate Upload Submenu ");      
		});
		Thread.sleep(1000);
	
	
		ObjectRepo_Havmor.startTestAndLog_1_SS(
			    "ADMIN_Product_Sales Rate_Uplod_TC_05",
			    "Verify that user uploads the Sales Rate Upload",
			    () -> {
			        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			        // Wait for the file input to be present in the DOM
			        WebElement uploadInput = wait.until(
			            ExpectedConditions.presenceOfElementLocated(
			                By.id("ParentMasterContentPlaceHolder1_FileUploadControl"))
			        );

			        // Build an absolute path to your file
			        String filePath = System.getProperty("user.dir") + "\\test-output\\Image_Upload\\HSNMaster_1_20250912_110935.csv";
			        System.out.println("Uploading file: " + filePath);

			        // Send the file path directly to the hidden file input
			        uploadInput.sendKeys(filePath);
			    }
			);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
