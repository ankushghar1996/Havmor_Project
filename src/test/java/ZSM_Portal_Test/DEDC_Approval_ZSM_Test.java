package ZSM_Portal_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility_Havmor.BaseClass_ZSM;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;
import ZSM_Portal_Main.DEDC_Approval_ZSM_Main;

public class DEDC_Approval_ZSM_Test extends BaseClass_ZSM {

	
	@Test
	public void Asser_master_Approval() throws Exception {
	
	
		DEDC_Approval_ZSM_Main ass = PageFactory.initElements(driver , DEDC_Approval_ZSM_Main.class);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_01", "Verify that user Click On Scheme Menu", () ->{
	Liabrary_Havmor.custom_click(ass.getScheme_Menu(), "Click On Scheme Menu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_02", "Verify that user Click On DEDC SubMenu", () ->{
	Liabrary_Havmor.custom_click(ass.getDEDC_SubMenu(), "Click On DEDC SubMenu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_03", "Verify that user Click On DEDC Approval", () ->{
	Liabrary_Havmor.custom_click(ass.getDEDC_Approval(), "Click On DEDC Approval");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_04", "Verify that user Click On DEDC Grid data", () ->{
	Liabrary_Havmor.custom_click(ass.getGrid_Data(), "Click On DEDC Grid data");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_05", "Verify that user Click On Approval btn", () ->{
	Liabrary_Havmor.custom_click(ass.getBtnApproval(), "Click On Approval btn");      
	});
	Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
