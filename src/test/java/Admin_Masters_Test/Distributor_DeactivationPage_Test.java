package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Distributor_DeactivationPage;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Distributor_DeactivationPage_Test extends BaseClass{

	
	@Test
	public void Distributor_Deactivate() throws Exception {
	
	
	HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
	Distributor_DeactivationPage DM = PageFactory.initElements(driver , Distributor_DeactivationPage.class);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_01", "Verify that user Click On Master Menu ", () ->{
	Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_02", "Verify that user Click On Distributor Master Sub Menu ", () ->{
		Liabrary_Havmor.custom_click(home.getDistributorMaster_SubMenu(), "Click On Distributor Master Menu");      
		});
		Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_03", "Verify that user Click On Distributor Deactivation Menu ", () ->{
		Liabrary_Havmor.custom_click(DM.getDeactivation_Approval(), "Click On Distributor Deactivation Menu");      
		});
		Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
