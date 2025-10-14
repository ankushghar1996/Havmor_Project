package Admin_Masters_Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Admin_Masters.Product_Image_Uplod_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Product_Image_Uplod_Test extends BaseClass {

   @Test
   public void Product_Image_Uplod() throws Exception {
	
   Product_Image_Uplod_Main PIMGU = PageFactory.initElements(driver, Product_Image_Uplod_Main.class);
   HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);

	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Product_Image_Uplod_TC_01", "Verify that user Click On Master Menu ", () ->{
	Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
	});
	Thread.sleep(1000);
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Product_Image_Uplod_TC_02", "Verify that user click on Product master Sub Menu ", () ->{
   Liabrary_Havmor.custom_click(home.getProduct_Master_Submenu(), "Product master Submenu");  });  
	Thread.sleep(1000);
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Product_Image_Uplod_TC_03", "Verify that user click on Product Image Upload ", () ->{
   Liabrary_Havmor.custom_click(PIMGU.getProduct_Image_Upload(), " Product Image Upload "); });  
	Thread.sleep(1000);
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Product_Image_Uplod_TC_04", "Verify that user click on Product Hierarchy Dropdwon", () ->{
	 Liabrary_Havmor.custom_click(PIMGU.getProduct_Hierarchy(), " Product Hierarchy "); });  
    Thread.sleep(1000);
			
	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Product_Image_Uplod_TC_05", "Verify that user click on Product Hierarchy Dropdown Value ", () ->{
	 Liabrary_Havmor.custom_click(PIMGU.getProduct_Hierarchy_Value(), " Product Hierarchy Value "); });  
	Thread.sleep(1000);
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Product_Image_Uplod_TC_06", "Verify that user click on Category ", () ->{
    Liabrary_Havmor.custom_click(PIMGU.getCategory(), " Category "); });  
    Thread.sleep(1000);
				
    ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Product_Image_Uplod_TC_07", "Verify that user click on Category Value ", () ->{
    Liabrary_Havmor.custom_click(PIMGU.getCategory_Value(), " Category Value "); });  
	Thread.sleep(1000);
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Product_Image_Uplod_TC_08", "Verify that user click on View Button", () ->{
	Liabrary_Havmor.custom_click(PIMGU.getView_Button(), " View Button "); });  
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Product_Image_Uplod_TC_09", "Verify that user click on Upload_Product_Image Grid Button", () ->{
		Liabrary_Havmor.custom_click(PIMGU.getUpload_Product_Image_BTN(), " Upload Product Image Grid Button "); });  
		Thread.sleep(1000);
	
		ObjectRepo_Havmor.startTestAndLog_1_SS(
			    "ADMIN_Product_Image_Uplod_TC_10",
			    "Verify that user uploads the Product Image",
			    () -> {
			        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			        // Wait for the file input to be present in the DOM
			        WebElement uploadInput = wait.until(
			            ExpectedConditions.presenceOfElementLocated(
			                By.id("ParentMasterContentPlaceHolder1_fileUpload"))
			        );

			        // Build an absolute path to your file
			        String filePath = System.getProperty("user.dir") + "\\test-output\\Image_Upload\\havmor_80kb Size.jpg";
			        System.out.println("Uploading file: " + filePath);

			        // Send the file path directly to the hidden file input
			        uploadInput.sendKeys(filePath);
			    }
			);

	
			ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Product_Image_Uplod_TC_11", "Verify that user click on Save Button", () ->{
				Liabrary_Havmor.custom_click(PIMGU.getSave_Button(), " Save Button"); });  
				Thread.sleep(1000);
	
	
	
	
	
}	
	
}
