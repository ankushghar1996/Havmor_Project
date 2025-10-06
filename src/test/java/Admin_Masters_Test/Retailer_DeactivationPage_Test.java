package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Distributor_DeactivationPage;
import Admin_Masters.Retailer_DeactivationPage_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Retailer_DeactivationPage_Test extends BaseClass {

	
	@Test
	public void Retailer_Deactivate() throws Exception {
	
	
	HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
	Retailer_DeactivationPage_Main DM = PageFactory.initElements(driver , Retailer_DeactivationPage_Main.class);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Deactivate_Test_01", "Verify that user Click On Master Menu ", () ->{
	Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Deactivate_Test_02", "Verify that user Click On Retailer Master Sub Menu ", () ->{
	Liabrary_Havmor.custom_click(home.getRetailer_Master_Submenu(), "Retailer Master Sub Menu");      
	});
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Deactivate_Test_03", "Verify that user Click On Retailer Creation  ", () ->{
	Liabrary_Havmor.custom_click(DM.getRetailer_Creation(), "Retailer Creation");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Deactivate_Test_04", "Verify that user Click On Retailer Action View Deactivation", () ->{
	Liabrary_Havmor.custom_click(DM.getDeactivate_BTN(), "Click On Retailer Action View Deactivation Button");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Deactivate_Test_05", "Verify That User Click On Reason Dropdown", () ->{
     Liabrary_Havmor.custom_click(DM.getSelect_Deactivate_Reason_Dropdown(), "Click On Reason Dropdown");      
	 });
	 Thread.sleep(1000);
				
	ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Deactivate_Test_06", "Verify That User Click On Reason Dropdown Value", () ->{
	Liabrary_Havmor.custom_click(DM.getSelect_Deactivate_Reason_Dropdown_Value(), "Click On Reason Dropdown Value");      
	});
    Thread.sleep(1000);
    
    ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Deactivate_Test_07", "Verify That User Click On No Button", () ->{
    Liabrary_Havmor.custom_click(DM.getNo_Button(), "No Button");      
    });
    Thread.sleep(1000);
    
//    ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_08", "Verify That User Click On YES Button", () ->{
//    Liabrary_Havmor.custom_click(DM.getYes_Button(), "YES Button");      
//    });
//    Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
