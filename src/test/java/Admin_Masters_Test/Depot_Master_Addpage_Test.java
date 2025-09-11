package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Depot_Master_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Depot_Master_Addpage_Test extends BaseClass{

	
	@Test
	public void Depot_Add() throws Exception {
	
		
		HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
		Depot_Master_Main Add = PageFactory.initElements(driver , Depot_Master_Main.class);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_01", "Verify that user Click On Master Menu ", () ->{
		Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
		});
		Thread.sleep(1000);
	
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_02", "Verify that user Click On Depot Master subMenu ", () ->{
		Liabrary_Havmor.custom_click(Add.getDepot_Master_submenu(), "Click On Depot Master subMenu");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_03", "Verify that user Click On Depot Master", () ->{
		Liabrary_Havmor.custom_click(Add.getDepot_Master(), "Click On Depot Master");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_04", "Verify that user Click On Add btn", () ->{
		Liabrary_Havmor.custom_click(Add.getAdd_btn(), "Click On Add btn");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_05", "Verify that user send Depot Code", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getDepotCode(), excel.getStringdata2("Depot_Add", 1, 0), "send Depot Code");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_06", "Verify that user send Depot Name", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getDepotName(), excel.getStringdata2("Depot_Add", 1, 1), "send Depot Name");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_07", "Verify that user send Contact Person Name", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getContactPerson(), excel.getStringdata2("Depot_Add", 1, 2), "send Contact Person Name");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_08", "Verify that user send UserID", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getUserId(), excel.getStringdata2("Depot_Add", 1, 3), "send UserID");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_09", "Verify that user send EmailID", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getEmail(), excel.getStringdata2("Depot_Add", 1, 4), "send EmailID");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_10", "Verify that user send Mobile No", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getMobile(), excel.getStringdata2("Depot_Add", 1, 5), "send Mobile No");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_11", "Verify that user send Address1", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getAddress1(), excel.getStringdata2("Depot_Add", 1, 6), "send Address1");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_12", "Verify that user Click On State Dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getState_dropdown(), "Click On State Dropdown");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_13", "Verify that user Click On State Dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getState_dropdown_value(), "Click On State Dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_14", "Verify that user Click On City Dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getCity_dropdown(), "Click On City Dropdown");      
		});
		Thread.sleep(1000);
			
			
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_15", "Verify that user Click On City Dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getCity_dropdown_value(), "Click On City Dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_16", "Verify that user send PinCode", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getPinCode(), excel.getStringdata2("Depot_Add", 1, 7), "send PinCode");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_17", "Verify that user Click On GST Type Dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getGstType_dropdown(), "Click On GST Type Dropdown");      
		});
		Thread.sleep(1000);
				
				
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_18", "Verify that user Click On GST Type Dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getGstType_dropdown_value(), "Click On GST Type Dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_19", "Verify that user send GST Number", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getGstNumber(), excel.getStringdata2("Depot_Add", 1, 8), "send GST Number");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_20", "Verify that user Click On FSSAI Type Dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getFSSAIType_dropdown(), "Click On FSSAI Type Dropdown");      
		});
		Thread.sleep(1000);
					
					
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_21", "Verify that user Click On FSSAI Type Dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getFSSAIType_dropdown_value(), "Click On FSSAI Type Dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_22", "Verify that user send FSSAI Licence number", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getFSSAILicense(), excel.getStringdata2("Depot_Add", 1, 9), "send FSSAI Licence number");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_23", "Verify that user send FSSAI Expiry date", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getFSSAIExpiry_dateInput(), excel.getStringdata2("Depot_Add", 1, 10), "send FSSAI Expiry date");      
		});
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
