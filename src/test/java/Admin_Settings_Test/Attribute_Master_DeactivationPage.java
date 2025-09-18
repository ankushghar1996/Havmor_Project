package Admin_Settings_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Settings.Attribute_Master_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Attribute_Master_DeactivationPage extends BaseClass{

	
	@Test
	public void Attribute_Master_Add() throws Exception {
	
		
		HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
		Attribute_Master_Main Add = PageFactory.initElements(driver , Attribute_Master_Main.class);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Attribute_Master_Deactivation_Test_Add_TC_01", "Verify that user Click On Setting menu ", () ->{
		Liabrary_Havmor.custom_click(home.getSettings_Menu(), "Click On Setting menu");      
		});
		Thread.sleep(1000);
	
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Attribute_Master_Deactivation_Test_Add_TC_02", "Verify that user Click On Attribute Master menu ", () ->{
		Liabrary_Havmor.custom_click(Add.getAttribute_Master_menu(), "Click On Attribute Master");      
		});
		Thread.sleep(1000);
	
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Attribute_Master_Deactivation_Test_Add_TC_03", "Verify that user Click On Attribute Master Submenu ", () ->{
		Liabrary_Havmor.custom_click(Add.getAttribute_Master_submenu(), "Click On Attribute Master Submenu");      
		});
		Thread.sleep(1000);
	
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Attribute_Master_Deactivation_Test_Add_TC_04", "Verify that user Click On Deactivate btn", () ->{
		Liabrary_Havmor.custom_click(Add.getDeactivate_btn(), "Click On Deactivate btn");      
		});
		Thread.sleep(1000);
	
		
//		ObjectRepo_Havmor.startTestAndLog_1_SS("Attribute_Master_Test_Add_TC_05", "Verify that user Click On Yes btn", () ->{
//		Liabrary_Havmor.custom_click(Add.getYes(), "Click On Yes btn");      
//		});
//		Thread.sleep(1000);
		
		
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Attribute_Master_Deactivation_Test_Add_TC_05", "Verify that user Click On Close btn", () ->{
		Liabrary_Havmor.custom_click(Add.getCloseDeactivate_btn(), "Click On Close btn");      
		});
		Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	}
	
}
