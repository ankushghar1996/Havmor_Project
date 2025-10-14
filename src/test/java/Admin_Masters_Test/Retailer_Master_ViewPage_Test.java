package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Retailer_Master_AddPage;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Retailer_Master_ViewPage_Test extends BaseClass {
    
	@Test
	public void Retailer_View() throws Exception {
		
		
		HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
		Retailer_Master_AddPage Add = PageFactory.initElements(driver , Retailer_Master_AddPage.class);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC_01", "Verify that user Click On Master Menu ", () ->{
		Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC_02", "Verify that user Click on Retailer Master Sub Menu ", () ->{
		Liabrary_Havmor.custom_click(Add.getRetailer_Master_Submenu(), "Click On Retailer Master Sub Menu");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__03", "Verify that user Click on Retailer Master Menu ", () ->{
		Liabrary_Havmor.custom_click(Add.getRetailer_Master_menu(), "Click On Retailer Master Menu");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__04", "Verify that user Click on Action view btn", () ->{
		Liabrary_Havmor.custom_click(Add.getAction_View_btn(), "Click on Action view btn");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__05", "Verify that user Click on Close btn", () ->{
		Liabrary_Havmor.custom_click(Add.getAction_Close_btn(), "Click on Close btn");      
		});
		Thread.sleep(1000);
		
		
		
		
	
	}

}
