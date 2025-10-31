package RSM_Portal_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility_Havmor.BaseClass_RSM;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;
import RSM_Portal_Main.DEDC_Approval_Main;

public class DEDC_Approval_Test extends BaseClass_RSM {
	
	
	
	@Test
	public void DEDC_Approval() throws Exception {
	
	
	DEDC_Approval_Main ass = PageFactory.initElements(driver , DEDC_Approval_Main.class);
	
	
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
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_04", "Verify that user Click On DEDC Approval grid data", () ->{
	Liabrary_Havmor.custom_click(ass.getGrid_data(), "Click On DEDC Approval grid data");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_05", "Verify that user Click On DEDC Approve btn", () ->{
	Liabrary_Havmor.custom_click(ass.getApprove_btn(), "Click On DEDC Approve btn");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_06", "Verify that user Click On DEDC Approve Yes btn", () ->{
	Liabrary_Havmor.custom_click(ass.getApprove_btn(), "Click On DEDC Approve Yes btn");      
	});
	Thread.sleep(1000);
	
	
//	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_05", "Verify that user Click On DEDC Approve No btn", () ->{
//	Liabrary_Havmor.custom_click(ass.getApprove_btn(), "Click On DEDC Approve No btn");      
//	});
//	Thread.sleep(1000);
	
	
	
	
	
	}
	

}
