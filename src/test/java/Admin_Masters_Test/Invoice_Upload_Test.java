package Admin_Masters_Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Admin_Masters.Invoice_Upload_Main;
import Admin_Masters.Product_Image_Uplod_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Invoice_Upload_Test extends BaseClass {


	@Test
	   public void Product_Image_Uplod() throws Exception {
		
	   Invoice_Upload_Main PIMGU = PageFactory.initElements(driver, Invoice_Upload_Main.class);
	   HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);

		ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Invoice_Upload_Test_TC_01", "Verify that user Click On Master Menu ", () ->{
		Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
		});
		Thread.sleep(1000);
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Invoice_Upload_Test_TC_02", "Verify that user click on Product Master Sub Menu ", () ->{
	   Liabrary_Havmor.custom_click(home.getProduct_Master_Submenu(), "Product Master Sub Menu");    });  
		Thread.sleep(1000);	
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Invoice_Upload_Test_TC_03", "Verify that user click on Invoice Upload Test Button", () ->{
			Liabrary_Havmor.custom_click(PIMGU.getInvoice_Upload_Main(), " Invoice Upload Test Button "); });  
			Thread.sleep(1000);
		
			ObjectRepo_Havmor.startTestAndLog_1_SS(
				    "ADMIN_Invoice_Upload_Test_TC_04",
				   "Verify that user uploads the invoice Image",
				    () -> {
				        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

				        // Wait for the file input to be present in the DOM
				        WebElement uploadInput = wait.until(ExpectedConditions.presenceOfElementLocated
				        		(By.id("ParentMasterContentPlaceHolder1_FileUploadControl"))
				        );

				        // Build an absolute path to your file
				        String filePath = System.getProperty("user.dir") + "\\test-output\\Image_Upload\\havmor_80kb Size.jpg";
				        System.out.println("Uploading file: " + filePath);

				        // Send the file path directly to the hidden file input
				        uploadInput.sendKeys(filePath);
				    }
				);
	

	
	
	
	
	}
	
	
}
