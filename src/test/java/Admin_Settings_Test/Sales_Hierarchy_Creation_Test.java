package Admin_Settings_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Settings.Sales_Hierarchy_Creation_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Sales_Hierarchy_Creation_Test extends BaseClass{


	@Test
	public void Sales_Hierarchy_Creation_Add() throws Exception {
	
		
		HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
		Sales_Hierarchy_Creation_Main Add = PageFactory.initElements(driver , Sales_Hierarchy_Creation_Main.class);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Sales_Hierarchy_Creation_Test_Add_TC_01", "Verify that user Click On Setting menu ", () ->{
		Liabrary_Havmor.custom_click(home.getSettings_Menu(), "Click On Setting menu");      
		});
		Thread.sleep(1000);
	
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Sales_Hierarchy_Creation_Test_Add_TC_02", "Verify that user Click On Configurations menu ", () ->{
		Liabrary_Havmor.custom_click(Add.getConfigurations_menu(), "Click On Configurations menu");      
		});
		Thread.sleep(1000);
		
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Sales_Hierarchy_Creation_Test_Add_TC_03", "Verify that user Click On Sales Hierarchy Creation menu ", () ->{
		Liabrary_Havmor.custom_click(Add.getSales_Hierarchy_Creation_menu(), "Click On Sales Hierarchy Creation menu");      
		});
		Thread.sleep(1000);
	
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Sales_Hierarchy_Creation_Test_Add_TC_04", "Verify that user Click On Add button", () ->{
		Liabrary_Havmor.custom_click(Add.getAdd_btn(), "Click On Add button");      
		});
		Thread.sleep(1000);
	
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Sales_Hierarchy_Creation_Test_Add_TC_05", "Verify that user Click On Sales Hierarchy dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getAreaType_dropdown(), "Click On Sales Hierarchy dropdown");      
		});
		Thread.sleep(1000);
	
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Sales_Hierarchy_Creation_Test_Add_TC_06", "Verify that user Click On Sales Hierarchy dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getAreaType_dropdown_value(), "Click On Sales Hierarchy dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Sales_Hierarchy_Creation_Test_Add_TC_07", "Verify that user send Sales Hierarchy Name Textbox", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getAreaName(), excel.getStringdata2("Sales_Hierarchy_Add", 1, 0), "send Sales Hierarchy Name Textbox");     
		});
		Thread.sleep(1000);
		
		
//		ObjectRepo_Havmor.startTestAndLog_1_SS("Sales_Hierarchy_Creation_Test_Add_TC_08", "Verify that user Click On Save button", () ->{
//		Liabrary_Havmor.custom_click(Add.getSave_btn(), "Click On Save button");      
//		});
//		Thread.sleep(1000);
			
			
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Sales_Hierarchy_Creation_Test_Add_TC_08", "Verify that user Click On Cancel button", () ->{
		Liabrary_Havmor.custom_click(Add.getCancel_btn(), "Click On Cancel button");      
		});
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
	
	}
	
	
}
