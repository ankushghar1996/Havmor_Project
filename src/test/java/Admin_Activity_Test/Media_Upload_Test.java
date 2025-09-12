package Admin_Activity_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.HSN_Master_Main;
import Admin_Masters.Media_Upload_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Media_Upload_Test extends BaseClass{
	//ParentMasterContentPlaceHolder1_fuImage
	
	@Test
    public void Media_Upload_Page() throws Exception {

        Media_Upload_Main  MUP = PageFactory.initElements(driver, Media_Upload_Main.class);
        HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
    	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Media_Upload_TC_01", "Verify that user Click On Activity Master Menu ", () ->{
    	Liabrary_Havmor.custom_click(home.getActivity_Master_Menu(), "Activity_Master_Menu");      
    	});
    	Thread.sleep(1000);
	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Media_Upload_TC_02", "Verify that user click on Activity Media Sub Menu ", () ->{
        Liabrary_Havmor.custom_click(home.getActivity_Media_SubMenu(), "Activity Media Submenu");      
    	});
    	Thread.sleep(1000);
    	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Media_Upload_TC_03", "Verify that user click on Media Upload", () ->{
            Liabrary_Havmor.custom_click(MUP.getMedia_Upload(), "Media Upload");      
        	});
        	Thread.sleep(1000);
    	 	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Media_Upload_TC_04", "Verify that user Click on Add Media ", () ->{
    	Liabrary_Havmor.custom_click(MUP.getAdd_Media(), "Add Media");
    	});
    	Thread.sleep(1000);
    	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Media_Upload_TC_05", "Verify that user Click on Category", () ->{
        	Liabrary_Havmor.custom_click(MUP.getCategory(), "Category");
        	});
        	Thread.sleep(1000);
        	
      	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Media_Upload_TC_06", "Verify that user Click on Category Value", () ->{
        Liabrary_Havmor.custom_click(MUP.getCategory_Value(), "Category Value");
          });
       	Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	
	
}
