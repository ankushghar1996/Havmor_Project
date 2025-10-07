package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Retailer_DeactivationPage_Main;
import Admin_Masters.Vendor_DeactivationPage_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Vendor_DeactivationPage_Test {


public class Vendor_Deactivation extends BaseClass {
	
	@Test
	public void Vendor_Deactivate() throws Exception {
	
	
	HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
	Vendor_DeactivationPage_Main DM = PageFactory.initElements(driver , Vendor_DeactivationPage_Main.class);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Deactivate_Test_01", "Verify that user Click On Master Menu ", () ->{
	Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Deactivate_Test_02", "Verify that user Click On Vendor Master Sub Menu ", () ->{
	Liabrary_Havmor.custom_click(home.getVendor_Master_Menu(), "Vendor Master Sub Menu");      
	});
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Deactivate_Test_03", "Verify that user Click On Vendor Creation  ", () ->{
	Liabrary_Havmor.custom_click(DM.getVendor_Creation(), "Vendor Creation");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Deactivate_Test_04", "Verify that user Click On Vendor Action View Deactivation", () ->{
	Liabrary_Havmor.custom_click(DM.getDeactivate_BTN(), "Click On Vendor Action View Deactivation Button");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Deactivate_Test_05", "Verify That User Click On Reason Dropdown", () ->{
     Liabrary_Havmor.custom_click(DM.getSelect_Deactivate_Reason_Dropdown(), "Click On Reason Dropdown");      
	 });
	 Thread.sleep(1000);
				
	ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Deactivate_Test_06", "Verify That User Click On Reason Dropdown Value", () ->{
	Liabrary_Havmor.custom_click(DM.getSelect_Deactivate_Reason_Dropdown_Value(), "Click On Reason Dropdown Value");      
	});
    Thread.sleep(1000);
    
    ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Deactivate_Test_07", "Verify That User Click On No Button", () ->{
    Liabrary_Havmor.custom_click(DM.getNo_Button(), "No Button");      
    });
    Thread.sleep(1000);
    
//    ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_08", "Verify That User Click On YES Button", () ->{
//    Liabrary_Havmor.custom_click(DM.getYes_Button(), "YES Button");      
//    });
//    Thread.sleep(1000);
	

	
	
	
	}
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
