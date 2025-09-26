package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Distributor_Master;
import Admin_Masters.PJP_Master_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;


public class PJP_Master_Page_Test extends BaseClass {

	@Test
    public void PJP_Front_Page() throws Exception {

        PJP_Master_Main PJP = PageFactory.initElements(driver, PJP_Master_Main.class);
        HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
    	
    	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_PJP_Master_TC_01", "Verify that user Click On Master Menu ", () ->{
    	Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
    	});
    	Thread.sleep(1000);
	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_PJP_Master_TC_02", "Verify that user click on Route Master Sub Menu ", () ->{
    		Liabrary_Havmor.custom_click(PJP.getRoute_Master_Submenu(), "Route Master Submenu");      
    		});
    		Thread.sleep(1000);
    	 	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_PJP_Master_TC_03", "Verify that user Click on PJP Master ", () ->{
    	Liabrary_Havmor.custom_click(PJP.getPjp_Master(), "PJP Master");
    	});
    	Thread.sleep(1000);

        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_PJP_Master_TC_04", "Click on Select Division Dropdown", () -> {
            Liabrary_Havmor.custom_click(PJP.getSelect_Division_Dropdown(), " Division Dropdown");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_PJP_Master_TC_05", "Click on Select Division Dropdown Value", () -> {
            Liabrary_Havmor.custom_click(PJP.getSelect_Division_Value(), " Division Dropdown Value");
        });
        Thread.sleep(1000);
	
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_PJP_Master_TC_06", "Click on Channel Type Dropdown", () -> {
            Liabrary_Havmor.custom_click(PJP.getChannel_Type_Dropdown(), "Channel Type Dropdown");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_PJP_Master_TC_07", "Click on Channel Type Dropdown Value", () -> {
            Liabrary_Havmor.custom_click(PJP.getChannel_Type_Value(), "Channel Type Dropdown Value");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_PJP_Master_08", "Click on Distributor Name", () -> {
            Liabrary_Havmor.custom_click(PJP.getDistributor_Name_Dropdown(), "Distributor Name ");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_PJP_Master_TC_09", "Click on Distributor Name Value", () -> {
            Liabrary_Havmor.custom_click(PJP.getDistributor_Name_Value(), "Distributor Name Value ");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_PJP_Master_TC_10", "Click on Salesman Name", () -> {
            Liabrary_Havmor.custom_click(PJP.getSalesman_Name_Dropdown(), "Salesman Name ");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_PJP_Master_TC_11", "Click on Salesman Name Value", () -> {
            Liabrary_Havmor.custom_click(PJP.getSalesman_Name_Value(), " Salesman name Value ");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_PJP_Master_TC_12", "Click on View Button", () -> {
            Liabrary_Havmor.custom_click(PJP.getView_Button(), " View Button ");
        });
        Thread.sleep(1000);
	
	
	
	
	
	
	}	
}
