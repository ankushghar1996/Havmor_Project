package Admin_Masters_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.User_DeactivationPage_Main;
import Admin_Masters.Vendor_DeactivationPage_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class User_DeactivationPage_Test extends BaseClass {


	@Test
	public void User_Deactivate() throws Exception {
	
	
	HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
      User_DeactivationPage_Main DM = PageFactory.initElements(driver , User_DeactivationPage_Main.class);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("User_Deactivate_Test_01", "Verify that user Click On Master Menu ", () ->{
	Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("User_Deactivate_Test_02", "Verify that user Click On User Master Sub Menu ", () ->{
	Liabrary_Havmor.custom_click(home.getUser_Master_Menu(), "User Master Sub Menu");      
	});
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("User_Deactivate_Test_03", "Verify that user Click On User Creation ", () ->{
	Liabrary_Havmor.custom_click(DM.getUser_Creation(), "User Creation");      
	});
	Thread.sleep(1000);
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("User_Deactivate_Test_04", "Verify that user Click On User Type Dropdown ", () ->{
    driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserType_Input']")).click();
		});
		Thread.sleep(1000);
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("User_Deactivate_Test_05", "Verify that user Click On User Type Dropdown Value ", () ->{
	    driver.findElement(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserType_DropDown']//ul//li[text()='NSM']")).click();
	    });
			Thread.sleep(1000);
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("User_Deactivate_Test_06", "Verify that user Click On Search button ", () ->{
	 driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_btnSearch']")).click();
	 });
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("User_Deactivate_Test_07", "Verify that user Click On User Action View Deactivation", () ->{
	Liabrary_Havmor.custom_click(DM.getDeactivate_BTN(), "Click On User Action View Deactivation Button");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("User_Deactivate_Test_08", "Verify That User Click On Reason Dropdown", () ->{
     Liabrary_Havmor.custom_click(DM.getSelect_Deactivate_Reason_Dropdown(), "Click On Reason Dropdown");      
	 });
	 Thread.sleep(1000);
				
	ObjectRepo_Havmor.startTestAndLog_1_SS("User_Deactivate_Test_09", "Verify That User Click On Reason Dropdown Value", () ->{
	Liabrary_Havmor.custom_click(DM.getSelect_Deactivate_Reason_Dropdown_Value(), "Click On Reason Dropdown Value");      
	});
    Thread.sleep(1000);
    
    ObjectRepo_Havmor.startTestAndLog_1_SS("User_Deactivate_Test_10", "Verify That User Click On No Button", () ->{
    Liabrary_Havmor.custom_click(DM.getNo_Button(), "No Button");      
    });
    Thread.sleep(1000);
    
//    ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_08", "Verify That User Click On YES Button", () ->{
//    Liabrary_Havmor.custom_click(DM.getYes_Button(), "YES Button");      
//    });
//    Thread.sleep(1000);	
	
	
	
	

	
	
	}	
}
