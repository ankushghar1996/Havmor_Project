package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Vendor_Master_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Vendor_Master_Add_Test extends BaseClass {

	
	@Test
	public void Vendor_Add() throws Exception {
	
	HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
		Vendor_Master_Main Add = PageFactory.initElements(driver , Vendor_Master_Main.class);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_01", "Verify that user Click On Master Menu ", () ->{
		Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_02", "Verify that user Click On Vendor Master Sub Menu ", () ->{
		Liabrary_Havmor.custom_click(Add.getVendor_Master_submenu(), "Click On Vendor Master sub Menu");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_02", "Verify that user Click On Vendor Master Sub Menu ", () ->{
		Liabrary_Havmor.custom_click(Add.getVendor_Master(), "Click On Vendor Master sub Menu");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_03", "Verify that user Click On Add button", () ->{
		Liabrary_Havmor.custom_click(Add.getAdd_btn(), "Click On Add button");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_04", "Verify that user Click On Vendor Type dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getVendorType(), "Click On Vendor Type dropdown");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_05", "Verify that user Click On Vendor Type dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getVendorType_value(), "Click On Vendor Type dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_05", "Verify that user send USERID", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getUserID(), excel.getStringdata2("Vendor_Add", 1, 0), "send USERID");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_06", "Verify that user send Vendor Name", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getVendorName(), excel.getStringdata2("Vendor_Add", 1, 1), "send Vendor Name");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_07", "Verify that user send Vendor ID From ERP", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getVendorIDFrmSAP(), excel.getStringdata2("Vendor_Add", 1, 2), "send Vendor ID From ERP");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_08", "Verify that user send Email ID", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getEmailID(), excel.getStringdata2("Vendor_Add", 1, 3), "send Email ID");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_09", "Verify that user send Mobile", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getMobile(), excel.getStringdata2("Vendor_Add", 1, 4), "send Mobile");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_10", "Verify that user send GST Nmuber", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getGSTNo(), excel.getStringdata2("Vendor_Add", 1, 5), "send GST Nmuber");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_11", "Verify that user send Address1", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getAddress(), excel.getStringdata2("Vendor_Add", 1, 6), "send Address1");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_12", "Verify that user send Address2", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getAddress2(), excel.getStringdata2("Vendor_Add", 1, 7), "send Address2");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_13", "Verify that user Click On State dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getState_dropdown(), "Click On State dropdown");      
		});
		Thread.sleep(1000);
			
			
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_14", "Verify that user Click On State dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getState_dropdown_value(), "Click On State dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_15", "Verify that user Click On city dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getTown_dropdown(), "Click On city dropdown");      
		});
		Thread.sleep(1000);
				
				
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_16", "Verify that user Click On city dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getTown_dropdown_value(), "Click On city dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_12", "Verify that user send PinCode", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getPincode(), excel.getStringdata2("Vendor_Add", 1, 8), "send PinCode");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_13", "Verify that user click on save btn", () ->{
		Liabrary_Havmor.custom_click(Add.getSave_btn(), "click on save btn");  
		});
		Thread.sleep(1000);
		
		
//		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_12", "Verify that user close btn", () ->{
//		Liabrary_Havmor.custom_click(Add.getClose_btn(), "Click on close btne");      
//		});
//		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
