package RSM_Portal_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility_Havmor.BaseClass_RSM;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;
import ZSM_Portal_Main.Asset_Branding_Approval_Main;

public class Asset_Branding_Approval_Test extends BaseClass_RSM {

	
	@Test
	public void Asser_Branding_Approval() throws Exception {
	
	
	Asset_Branding_Approval_Main ass = PageFactory.initElements(driver , Asset_Branding_Approval_Main.class);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_01", "Verify that user Click On Asset Menu", () ->{
	Liabrary_Havmor.custom_click(ass.getAsset_Menu(), "Click On Asset Menu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_02", "Verify that user Click On Branding SubMenu", () ->{
	Liabrary_Havmor.custom_click(ass.getBranding_SubMenu(), "Click On Branding SubMenu");      
	});
	Thread.sleep(1000);
	
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_03", "Verify that user Click On Branding Approval", () ->{
	Liabrary_Havmor.custom_click(ass.getBranding_Approval(), "Click On Branding Approval");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_04", "Verify that user Click On Grid data", () ->{
	Liabrary_Havmor.custom_click(ass.getGrid_data(), "Click On Grid data");      
	});
	Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
