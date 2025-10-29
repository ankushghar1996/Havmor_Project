package NSM_Portal_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility_Havmor.BaseClass_NSM;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;
import NSM_Portal_Main.Saleman_Master_NSM_Main;

public class Saleman_Master_NSM_Test extends BaseClass_NSM{


	@Test
	public void SalesMan_Approval() throws Exception {
	
	Saleman_Master_NSM_Main app = PageFactory.initElements(driver , Saleman_Master_NSM_Main.class);
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("SalesMan_Approval_NSM_Test_01", "Verify that user Click On Master Menu", () ->{
	Liabrary_Havmor.custom_click(app.getMaster_Menu(), "Click On Master Menu");      
	});
	Thread.sleep(1000);
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("SalesMan_Approval_NSM_Test_02", "Verify that user Click On Salesman Master SubMenu", () ->{
	Liabrary_Havmor.custom_click(app.getSalesman_SubMenu(), "Click On Salesman Master SubMenu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("SalesMan_Approval_NSM_Test_03", "Verify that user Click On Salesman Approval", () ->{
	Liabrary_Havmor.custom_click(app.getSalesman_Approval(), "Click On Salesman Approval");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("SalesMan_Approval_NSM_Test_04", "Verify that user Click On Grid data", () ->{
	Liabrary_Havmor.custom_click(app.getGrid_Data(), "Click On Grid data");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("SalesMan_Approval_NSM_Test_05", "Verify that user Click On Approval button", () ->{
	Liabrary_Havmor.custom_click(app.getBtnApproval(), "Click On Approval button");      
	});
	Thread.sleep(1000);
	
	


	
	}
	
}
