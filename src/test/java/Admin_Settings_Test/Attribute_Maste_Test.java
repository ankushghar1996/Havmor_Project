package Admin_Settings_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Settings.Attribute_Master_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Attribute_Maste_Test extends BaseClass{

	
	@Test
	public void Attribute_Master_Add() throws Exception {
	
		
		HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
		Attribute_Master_Main Add = PageFactory.initElements(driver , Attribute_Master_Main.class);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Attribute_Master_Test_Add_TC_01", "Verify that user Click On Setting menu ", () ->{
		Liabrary_Havmor.custom_click(home.getSettings_Menu(), "Click On Setting menu");      
		});
		Thread.sleep(1000);
	
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Attribute_Master_Test_Add_TC_02", "Verify that user Click On Attribute Master menu ", () ->{
		Liabrary_Havmor.custom_click(Add.getAttribute_Master_menu(), "Click On Attribute Master");      
		});
		Thread.sleep(1000);
	
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Attribute_Master_Test_Add_TC_03", "Verify that user Click On Attribute Master Submenu ", () ->{
		Liabrary_Havmor.custom_click(Add.getAttribute_Master_submenu(), "Click On Attribute Master Submenu");      
		});
		Thread.sleep(1000);
	
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Attribute_Master_Test_Add_TC_04", "Verify that user Click On Add btn", () ->{
		Liabrary_Havmor.custom_click(Add.getAdd_btn(), "Click On Add btn");      
		});
		Thread.sleep(1000);
	
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Attribute_Master_Test_Add_TC_05", "Verify that user Click On Attribute For dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getAttributeFor_dropdown(), "Click On Attribute For dropdown");      
		});
		Thread.sleep(1000);
	
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Attribute_Master_Test_Add_TC_06", "Verify that user Click On Attribute For dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getAttributeFor_dropdown_value(), "Click On Attribute For dropdown value");      
		});
		Thread.sleep(1000);
	
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Attribute_Master_Test_Add_TC_07", "Verify that user Click On Attribute dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getAttribute_dropdown(), "Click On Attribute dropdown");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Attribute_Master_Test_Add_TC_08", "Verify that user Click On Attribute dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getAttribute_dropdown_value(), "Click On Attribute dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Attribute_Master_Test_Add_TC_09", "Verify that user Click On single radio button", () ->{
		Liabrary_Havmor.custom_click(Add.getSingle_radioBtn(), "Click On single radio button");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Attribute_Master_Test_Add_TC_10", "Verify that user Click On Mandetory Checkbox", () ->{
		Liabrary_Havmor.custom_click(Add.getMandatory_CheckBox(), "Click On Mandetory Checkbox");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Attribute_Master_Test_Add_TC_11", "Verify that user send value in textbox", () ->{
		driver.findElement(By.xpath("//input[@id='ParentMasterContentPlaceHolder1_txtValue']")).sendKeys("12");   
		});
		Thread.sleep(1000);
		
		
//		ObjectRepo_Havmor.startTestAndLog_1_SS("Attribute_Master_Test_Add_TC_12", "Verify that user Click On save button", () ->{
//		Liabrary_Havmor.custom_click(Add.getSingle_radioBtn(), "Click On save button");      
//		});
//		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Attribute_Master_Test_Add_TC_12", "Verify that user Click On Close button", () ->{
		Liabrary_Havmor.custom_click(Add.getSingle_radioBtn(), "Click On Close button");      
		});
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
	
	
	
	}
	
}
