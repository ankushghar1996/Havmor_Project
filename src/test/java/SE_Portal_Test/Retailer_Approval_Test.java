package SE_Portal_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility_Havmor.BaseClass_SE;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;
import SE_Portal.Retailer_Approval_Main;

public class Retailer_Approval_Test extends BaseClass_SE{

	
	@Test
	public void Retailer_Approval() throws Exception {
	
	
	Retailer_Approval_Main app = PageFactory.initElements(driver , Retailer_Approval_Main.class);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Approval_Test_01", "Verify that user Click On Master Menu", () ->{
	Liabrary_Havmor.custom_click(app.getMaster_Menu(), "Click On Master Menu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Approval_Test_02", "Verify that user Click On Retailer Master SubMenu", () ->{
	Liabrary_Havmor.custom_click(app.getRetailer_Master_SubMenu(), "Click On Retailer Master SubMenu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Approval_Test_03", "Verify that user Click On Retailer Approval", () ->{
	Liabrary_Havmor.custom_click(app.getRetailer_Approval(), "Click On Retailer Approval");      
	});
	Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
