package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Admin_Masters.Depot_Master_View_Page_Main;
import Admin_Masters.Distributor_DeactivationPage;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Depot_Master_ViewPage_Test extends BaseClass {

	@Test
	public void Depot_View_Page() throws Exception {
	
	
	HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
	Depot_Master_View_Page_Main DM = PageFactory.initElements(driver , Depot_Master_View_Page_Main.class);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_View_Test_01", "Verify that user Click On Master Menu ", () ->{
	Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Master Menu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_View_Test_02", "Verify that user Click On Depot Master Sub Menu ", () ->{
	Liabrary_Havmor.custom_click(home.getDepot_Master(), "Depot Master Menu");      
	});
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_View_Test_03", "Verify that user Click On Depot Creation  ", () ->{
	Liabrary_Havmor.custom_click(DM.getDepot_Creation(), "Depot Creation");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_View_Test_05", "Verify that user Click On Depot Action View button", () ->{
	Liabrary_Havmor.custom_click(DM.getDepot_Creation_View_Button(), "Depot Action View button");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_View_Test_06", "Verify that user Click On Depot Action View Close Button", () ->{
    Liabrary_Havmor.custom_click(DM.getDepot_Creation_Close_Button(), "Depot Action View Close button");      
	});
	Thread.sleep(1000);
	

}
	
}
