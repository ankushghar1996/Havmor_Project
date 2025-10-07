package Admin_Asset_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Asset_Main.Asset_Approval_Main;
import Com_Utility_Havmor.BaseClass_otp;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Asset_Approval_Test extends BaseClass_otp {

	
	
	@Test
	public void Asset_Master_Approval() throws Exception {
	
	
	Asset_Approval_Main ass = PageFactory.initElements(driver , Asset_Approval_Main.class);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asset_Master_Approval_Test_01", "Verify that user Click On Asset Menu", () ->{
	Liabrary_Havmor.custom_click(ass.getAsset_Menu(), "Click On Asset Menu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asset_Master_Approval_Test_02", "Verify that user Click On Asset Master SubMenu", () ->{
	Liabrary_Havmor.custom_click(ass.getAssetMaster_Menu(), "Click On Asset Master SubMenu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asset_Master_Approval_Test_03", "Verify that user Click On Asset Approval", () ->{
	Liabrary_Havmor.custom_click(ass.getAsset_Approval(), "Click On Asset Approval");      
	});
	Thread.sleep(1000);
	
	
//	ObjectRepo_Havmor.startTestAndLog_1_SS("Asset_Master_Approval_Test_04", "Verify that user Click On Grid data", () ->{
//	Liabrary_Havmor.custom_click(ass.getGrid_Data(), "Click On Grid data");      
//	});
//	Thread.sleep(1000);
//	
//	
//	ObjectRepo_Havmor.startTestAndLog_1_SS("Asset_Master_Approval_Test_05", "Verify that user Click On Approval button", () ->{
//	Liabrary_Havmor.custom_click(ass.getBtnApproval(), "Click On Approval button");      
//	});
//	Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
