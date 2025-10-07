package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Vendor_Master_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Vendor_Master_EditPage_Test extends BaseClass {
	
	
	
	@Test
	public void Vendor_Edit() throws Exception {
	
		
		HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
		Vendor_Master_Main Add = PageFactory.initElements(driver , Vendor_Master_Main.class);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Edit_TC_01", "Verify that user Click On Master Menu ", () ->{
		Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Edit_TC_02", "Verify that user Click On Vendor Master Sub Menu ", () ->{
		Liabrary_Havmor.custom_click(Add.getVendor_Master_submenu(), "Click On Vendor Master sub Menu");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Edit_TC_03", "Verify that user Click On Vendor Master Sub Menu ", () ->{
		Liabrary_Havmor.custom_click(Add.getVendor_Master(), "Click On Vendor Master sub Menu");      
		});
		Thread.sleep(1000);
	
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Edit_TC_04", "Verify that user Click On Action Edit btn", () ->{
		Liabrary_Havmor.custom_click(Add.getAction_Edit_btn(), "Click On Action Edit btn");      
		});
		Thread.sleep(1000);
	
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Edit_TC_05", "Verify that user Clear Emial id", () ->{
		Liabrary_Havmor.custom_clear(Add.getEmailID());      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Edit_TC_06", "Verify that user Clear Mobile Number", () ->{
		Liabrary_Havmor.custom_clear(Add.getMobile());      
		});
		Thread.sleep(1000);	
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_07", "Verify that user send Email ID", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getEmailID(), excel.getStringdata2("Vendor_Add", 2, 3), "send Email ID");      
		});
		Thread.sleep(1000);
			
			
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_08", "Verify that user send Mobile", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getMobile(), excel.getStringdata2("Vendor_Add", 2, 4), "send Mobile");      
		});
		Thread.sleep(1000);
		
		
//		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Edit_TC_09", "Verify that user Click On Save btn", () ->{
//		Liabrary_Havmor.custom_click(Add.getEdit_Save_btn(), "Click On Save btn");      
//		});
//		Thread.sleep(1000);
		
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Edit_TC_0", "Verify that user Click On Close btn", () ->{
		Liabrary_Havmor.custom_click(Add.getEdit_Close_btn(), "Click On Close btn");      
		});
		Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
