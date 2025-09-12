package Admin_Masters_Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Admin_Masters.HSN_Master_Main;
import Admin_Masters.PJP_Master_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class HSN_Master_Test extends BaseClass {

	@Test
    public void HSN_Master_Page() throws Exception {

        HSN_Master_Main  HSN = PageFactory.initElements(driver, HSN_Master_Main.class);
        HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
    	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_HSN_Master_TC_01", "Verify that user Click On Master Menu ", () ->{
    	Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
    	});
    	Thread.sleep(1000);
	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_HSN_Master_TC_02", "Verify that user click on Product Master Sub Menu ", () ->{
        Liabrary_Havmor.custom_click(home.getProduct_Master_Submenu(), "Product Master Submenu");      
    	});
    	Thread.sleep(1000);
    	 	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_HSN_Master_TC_03", "Verify that user Click on HSN Master ", () ->{
    	Liabrary_Havmor.custom_click(HSN.getHSN_Master(), "HSN Master");
    	});
    	Thread.sleep(1000);
    	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_HSN_Master_TC_04", "Verify that user Click on Download_Template ", () ->{
        Liabrary_Havmor.custom_click(HSN.getDownload_Template(), "Download_Template");
       	});
       	Thread.sleep(1000);
      	
       	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_HSN_Master_TC_05", "Verify that user Click on Select File to upload ", () ->{
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
       	});
       	Thread.sleep(5000);
       	
       	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_HSN_Master_TC_06", "Verify that user Click on Upload Button ", () ->{
        Liabrary_Havmor.custom_click(HSN.getUpload_button(), "Upload_Button");
        });
        Thread.sleep(1000);
           	 
           	
       
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
