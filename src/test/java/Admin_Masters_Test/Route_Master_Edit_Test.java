package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Route_Master_Add_BTN_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Route_Master_Edit_Test extends BaseClass {

	
	@Test
    public void RM_Edit_Page() throws Exception {
	
	Route_Master_Add_BTN_Main RMADD = PageFactory.initElements(driver, Route_Master_Add_BTN_Main.class);
    HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_Master_View_TC_01", "Verify that user Click On Master Menu ", () ->{
	Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
	});
	Thread.sleep(1000);
	

	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_Master_View_TC_02", "Verify that user click on Route Master Sub Menu ", () ->{
    Liabrary_Havmor.custom_click(home.getRoute_Master_Submenu(), "Route Master Submenu");    });  
	Thread.sleep(1000);
	
	 	
	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_Master_View_TC_03", "Verify that user Click on Route Master ", () ->{
	Liabrary_Havmor.custom_click(RMADD.getRoute_Master(),"Route Master");
	});
	Thread.sleep(1000);
	
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_Master_View_TC_03", "Verify that user Click on Route Master ", () ->{
		Liabrary_Havmor.custom_click(RMADD.getAction_Edit_btn(),"Route Master");
		});
		Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
}
