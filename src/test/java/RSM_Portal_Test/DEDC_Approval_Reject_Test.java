package RSM_Portal_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility_Havmor.BaseClass_RSM;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;
import RSM_Portal_Main.DEDC_Approval_Main;

public class DEDC_Approval_Reject_Test extends BaseClass_RSM {
	
	
	
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
	
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_05", "Verify that user Click On Reject btn", () ->{
	Liabrary_Havmor.custom_click(ass.getReject_btn(), "Click On Reject btn");      
	});
	Thread.sleep(1000);
	
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_06", "Verify that user Click On Reject reason dropdown", () ->{
	Liabrary_Havmor.custom_click(ass.getRejectReason_dropdown(), "Click On Reject reason dropdown");      
	});
	Thread.sleep(1000);
	
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_07", "Verify that user Click On Reject reason dropdown value", () ->{
	Liabrary_Havmor.custom_click(ass.getRejectReason_dropdown_Value(), "Click On Reject reason dropdown value");      
	});
	Thread.sleep(1000);
	
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_08", "Verify that user Click On Reject No btn", () ->{
	Liabrary_Havmor.custom_click(ass.getBtnRejectNo(), "Click On Reject No btn");      
	});
	Thread.sleep(1000);
	
	
	
//	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_08", "Verify that user Click On Reject Yes btn", () ->{
//	Liabrary_Havmor.custom_click(ass.getReject_btn(), "Click On Reject Yes btn");      
//	});
//	Thread.sleep(1000);
					
					
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_09", "Verify that user Click On close btn", () ->{
	Liabrary_Havmor.custom_click(ass.getClose_btn(), "Click On close btn");      
	});
	Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
					
					
	
	}
	

}
