package Admin_Scheme_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Admin_Scheme_Main.Admin_Scheme_Master_Main;
import Admin_Target_Upload_Main.Program_Target_Upload_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Admin_Scheme_Master_Test extends BaseClass{

	@Test
    public void Program_Target_Upload_Page() throws Exception {

		Admin_Scheme_Master_Main ASMM = PageFactory.initElements(driver, Admin_Scheme_Master_Main.class);
        HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
    
        
           ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_01", "Verify that user click on Scheme Menu ", () ->{
            Liabrary_Havmor.custom_click(home.getScheme_Menu(), "Scheme Menu");      
        	});
        	Thread.sleep(1000);
        	
        	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_02", "Verify that user click on Scheme 	Setup Submenu", () ->{
         	Liabrary_Havmor.custom_click(home.getScheme_Setup_Submenu(), "Scheme Setup Submenu");      
           	});
           	Thread.sleep(1000);
        	 	
        	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_03", "Verify that user Click on Program_Target_Upload ", () ->{
        	Liabrary_Havmor.custom_click(ASMM.getScheme_Creation(), "Scheme Creation");
        	});
        	Thread.sleep(1000);
	
        	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_04", "Verify that user Click on Add Button", () ->{
            Liabrary_Havmor.custom_click(ASMM.getAdd_Button(), "Add Button");
           	});
           	Thread.sleep(1000);
           	
            ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_05", "Verify that user Send Scheme Name", () ->{
            Liabrary_Havmor.custom_Sendkeys(ASMM.getScheme_Name_Textbox(), excel.getStringdata2("Scheme", 1, 0), "Scheme Name");
             });
            Thread.sleep(1000);
           	        
            ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_06", "Verify that user Send Scheme Short Name", () ->{
            Liabrary_Havmor.custom_Sendkeys(ASMM.getScheme_Short_Name_Textbox_EXCEL(), excel.getStringdata2("Scheme", 1, 1), "Scheme Short Name");
            });
            Thread.sleep(1000);
            
            ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_06", "Verify that user Send Scheme Short Name", () ->{
            Liabrary_Havmor.custom_Sendkeys(ASMM.getScheme_Short_Name_Textbox_EXCEL(), excel.getStringdata2("Scheme", 1, 1), "Scheme Short Name");
             });
            Thread.sleep(1000);
            
            
            
               	
           	
	
	}
}
