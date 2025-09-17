package Admin_Target_Upload_Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Admin_Activity_Main.PJP_Upload_Main;
import Admin_Target_Upload_Main.Program_Target_Upload_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Program_Target_Upload_Test extends BaseClass {

	@Test
    public void Program_Target_Upload_Page() throws Exception {

		Program_Target_Upload_Main PTUM = PageFactory.initElements(driver, Program_Target_Upload_Main.class);
        HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
    
	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Program_Target_Upload_TC_01", "Verify that user click on Target Menu ", () ->{
        Liabrary_Havmor.custom_click(home.getTarget_Menu(), "Target Menu");      
    	});
    	Thread.sleep(1000);
    	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Program_Target_Upload_TC_02", "Verify that user click on Target_Upload_Submenu", () ->{
            Liabrary_Havmor.custom_click(home.getTarget_Upload_Submenu(), "Target_Upload_Submenu");      
        	});
        	Thread.sleep(1000);
    	 	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Program_Target_Upload_TC_03", "Verify that user Click on Program_Target_Upload ", () ->{
    	Liabrary_Havmor.custom_click(PTUM.getProgram_Target_Upload(), "Program_Target_Upload");
    	});
    	Thread.sleep(1000);
    	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Program_Target_Upload_TC_04", "Verify that user Click on Download_Template ", () ->{
        Liabrary_Havmor.custom_click(PTUM.getDownload_Template(), "Download_Template");
       	});
       	Thread.sleep(1000);
      	
       	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Program_Target_Upload_TC_05", "Verify that user Click on Select File to upload ", () ->{
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
       	
       	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Program_Target_Upload_TC_06", "Verify that user Click on Upload Button ", () ->{
        Liabrary_Havmor.custom_click(PTUM.getUpload_button(), "Upload_Button");
        });
        Thread.sleep(1000);
	
	
	

	
	
	}
	
}
