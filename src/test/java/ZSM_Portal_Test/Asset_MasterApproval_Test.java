package ZSM_Portal_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility_Havmor.BaseClass_ZSM;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;
import ZSM_Portal_Main.Asset_MasterApproval_Main;

public class Asset_MasterApproval_Test extends BaseClass_ZSM {
	
	
	@Test
	public void Asser_master_Approval() throws Exception {
		
	Asset_MasterApproval_Main ass = PageFactory.initElements(driver , Asset_MasterApproval_Main.class);
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_01", "Verify that user Click On Asset Menu", () ->{
	Liabrary_Havmor.custom_click(ass.getAsset_Menu(), "Click On Asset Menu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_02", "Verify that user Click On Asset Master SubMenu", () ->{
	Liabrary_Havmor.custom_click(ass.getAsset_Master_SubMenu(), "Click On Asset Master SubMenu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_03", "Verify that user Click On Asset Master Approval", () ->{
	Liabrary_Havmor.custom_click(ass.getAsset_Approval(), "Click On Asset Master Approval");      
	});
	Thread.sleep(1000);
	
	
//	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_04", "Verify that user Click On Grid data", () ->{
//	Liabrary_Havmor.custom_click(ass.getGrid_Data(), "Click On Grid data");      
//	});
//	Thread.sleep(1000);
//	
//	
//	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_05", "Verify that user Click On Approval btn", () ->{
//	Liabrary_Havmor.custom_click(ass.getBtnApproval(), "Click On Approval btn");      
//	});
//	Thread.sleep(1000);
	

	
	}
	
}
