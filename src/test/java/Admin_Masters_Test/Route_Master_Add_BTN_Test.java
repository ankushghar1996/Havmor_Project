package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.PJP_Master_Main;
import Admin_Masters.Route_Master_Add_BTN_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Route_Master_Add_BTN_Test  extends BaseClass{
	
	@Test
    public void PJP_Front_Page() throws Exception {

        Route_Master_Add_BTN_Main RMADD = PageFactory.initElements(driver, Route_Master_Add_BTN_Main.class);
        HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
    	
    	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_01", "Verify that user Click On Master Menu ", () ->{
    	Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
    	});
    	Thread.sleep(1000);
	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_02", "Verify that user click on Route Master Sub Menu ", () ->{
        Liabrary_Havmor.custom_click(home.getRoute_Master_Submenu(), "Route Master Submenu");    });  
    	Thread.sleep(1000);
    	 	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_03", "Verify that user Click on Route Master ", () ->{
    	Liabrary_Havmor.custom_click(RMADD.getRoute_Master(),"Route Master");
    	});
    	Thread.sleep(1000);
    	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_04", "Verify that user Click on Add Button", () ->{
        Liabrary_Havmor.custom_click(RMADD.getAdd_Button(),"Add Button");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_05", "Verify that user Click on Add Button", () ->{
        Liabrary_Havmor.custom_click(RMADD.getAdd_Button(),"Add Button");
        });
        Thread.sleep(1000);
            
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_06", "Verify that user Click on Channel Type Dropdown", () ->{
        Liabrary_Havmor.custom_click(RMADD.getChannel_Type_Dropdown(),"Channel Type Dropdown");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_07", "Verify that user Click on Channel Type Dropdown Value", () ->{
        Liabrary_Havmor.custom_click(RMADD.getChannel_Type_Dropdown_Value(),"Channel Type Dropdown Value");
         });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_08", "Verify that user Click on Distributor Name Dropdown", () ->{
        Liabrary_Havmor.custom_click(RMADD.getDistributor_Name(),"Distributor Name Dropdown");
        });
        Thread.sleep(1000);
            
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_09", "Verify that user Click on Distributor Name Dropdown Value", () ->{
        Liabrary_Havmor.custom_click(RMADD.getDistributor_Name_Value(),"Distributor Name Dropdown Value");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_10", "Verify that user Click on Salesman Name Dropdown", () ->{
        Liabrary_Havmor.custom_click(RMADD.getSalesman_Name_Dropdown(),"Salesman Name Dropdown");
        });
        Thread.sleep(1000);
                
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_11", "Verify that user Click on Salesman Name Dropdown Value", () ->{
        Liabrary_Havmor.custom_click(RMADD.getSalesman_Name_Dropdown_Value(),"Salesman Name Dropdown Value");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_11", "Verify that user Click on Salesman Name Dropdown Value", () ->{
        Liabrary_Havmor.custom_Sendkeys(RMADD.getRoute_Name_Excel(), excel.getStringdata2("Sheet1", 1, 2), "OTP Field");
        });
        Thread.sleep(1000);

}

}