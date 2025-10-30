package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Distributor_Master;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;



public class Distributor_Master_View_Test extends BaseClass{

	
	@Test
	public void Distributor_View() throws Exception {

	HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
	Distributor_Master DM = PageFactory.initElements(driver , Distributor_Master.class);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_01", "Verify that user Click On Master Menu ", () ->{
	Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_02", "Verify that user Click On Distributor Master Sub Menu ", () ->{
	Liabrary_Havmor.custom_click(home.getDistributorMaster_SubMenu(), "Click On Distributor Master Menu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_03", "Verify that user Click On Distributor Master Menu ", () ->{
	Liabrary_Havmor.custom_click(DM.getDistributor_Master(), "Click On Distributor Master Menu");
	});
	Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
