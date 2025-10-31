package ASM_Portal_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ASM_Portal_Main.Asset_DF_Confirmation_By_Depo_Main;
import Com_Utility_Havmor.BaseClass_ASM;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Asset_DF_Confirmation_By_Depo_Test extends BaseClass_ASM {

	
	
	@Test
	public void Asser_DF_Confirmation_By_Distributor() throws Exception {
	
	
	Asset_DF_Confirmation_By_Depo_Main ass = PageFactory.initElements(driver , Asset_DF_Confirmation_By_Depo_Main.class);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_01", "Verify that user Click On Asset Menu", () ->{
	Liabrary_Havmor.custom_click(ass.getAsset_Menu(), "Click On Asset Menu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_02", "Verify that user Click On Deep Freezer SubMenu", () ->{
	Liabrary_Havmor.custom_click(ass.getDeep_Freezer_SubMenu(), "Click On Deep Freezer SubMenu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_03", "Verify that user Click On DF Confirmation_By_Distributor", () ->{
	Liabrary_Havmor.custom_click(ass.getDF_Confirmation_By_Depo(), "Click On DF Confirmation_By_Distributor");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Asser_master_Approval_Test_04", "Verify that user Click On Grid data", () ->{
	Liabrary_Havmor.custom_click(ass.getGrid_data(), "Click On Grid data");      
	});
	Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
