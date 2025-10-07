package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Vendor_Master_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Vendor_Master_ViewPage_Test extends BaseClass {
	
	
	@Test
	public void Vendor_View() throws Exception {
	
		
		HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
		Vendor_Master_Main Add = PageFactory.initElements(driver , Vendor_Master_Main.class);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_View_TC_01", "Verify that user Click On Master Menu ", () ->{
		Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_View_TC_02", "Verify that user Click On Vendor Master Sub Menu ", () ->{
		Liabrary_Havmor.custom_click(Add.getVendor_Master_submenu(), "Click On Vendor Master sub Menu");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_View_TC_03", "Verify that user Click On Vendor Master Sub Menu ", () ->{
		Liabrary_Havmor.custom_click(Add.getVendor_Master(), "Click On Vendor Master sub Menu");      
		});
		Thread.sleep(1000);
	
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_View_TC_04", "Verify that user Click On Action View btn", () ->{
		Liabrary_Havmor.custom_click(Add.getAction_View_btn(), "Click On Action View btn");      
		});
		Thread.sleep(1000);
	
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_View_TC_05", "Verify that user Click On Action Close btn", () ->{
		Liabrary_Havmor.custom_click(Add.getAction_Close_btn(), "Click On Action Close btn");      
		});
		Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	}
	

}
