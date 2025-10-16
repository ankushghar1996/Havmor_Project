package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Salesman_Action_Icon_Main;
import Admin_Masters.Salesman_Master_AddBTN_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Salesman_Deactivate_Icon_Test extends BaseClass {

	
	 @Test
	  public void Salesman_Master_Deactivate () throws Exception {
		  
	        Salesman_Action_Icon_Main STMADD = PageFactory.initElements(driver, Salesman_Action_Icon_Main.class);
	        HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);

	    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Deactivate_TC_01", "Verify that user Click On Master Menu ", () ->{
	    	Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");});
	    	Thread.sleep(1000);
		  
	    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Deactivate_TC_02", "Verify that user click on Salesman Master Sub Menu ", () ->{
	        Liabrary_Havmor.custom_click(home.getSalesman_Master_Submenu(), "Salesman Master Submenu");    });  
	    	Thread.sleep(1000);
		
	    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Deactivate_TC_03", "Verify that user click on Salesman Master ", () ->{
	        Liabrary_Havmor.custom_click(STMADD.getSalesman_Master(), " Salesman Master "); });  
	    	Thread.sleep(1000);
	
	    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Deactivate_TC_04", "Verify that user click on Salesman Deactivate", () ->{
		    Liabrary_Havmor.custom_click(STMADD.getDeactivate_Button(), " Salesman Deactivate "); });  
		  	Thread.sleep(1000);
	
		  	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Deactivate_TC_05", "Verify that user click on Salesman Deactivate No", () ->{
			Liabrary_Havmor.custom_click(STMADD.getDeactivate_Close(), " Salesman Deactivate No"); });  
		  	Thread.sleep(1000);
	
	

	
	 }
}
