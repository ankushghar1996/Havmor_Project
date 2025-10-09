package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Salesman_Master_AddBTN_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Salesman_Master_Action_Transfer_Test extends BaseClass {
	
	
	 @Test
	  public void Salesman_Transfer() throws Exception {

		 	Salesman_Master_AddBTN_Main trans = PageFactory.initElements(driver, Salesman_Master_AddBTN_Main.class);
	        HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);

	    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Transfer_TC_01", "Verify that user Click On Master Menu ", () ->{
	    	Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
	    	});
	    	Thread.sleep(1000);
		
	    	
	    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Transfer_TC_02", "Verify that user click on Salesman Master Sub Menu ", () ->{
	        Liabrary_Havmor.custom_click(home.getSalesman_Master_Submenu(), "Salesman Master Submenu");    });  
	    	Thread.sleep(1000);
		
	    	
	    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Transfer_TC_03", "Verify that user click on Salesman Master", () ->{
	        Liabrary_Havmor.custom_click(trans.getSalesman_Master(), "Salesman Master"); });  
	        Thread.sleep(1000);
	
	
	        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Transfer_TC_04", "Verify that user click on Action transfer btn", () ->{
		    Liabrary_Havmor.custom_click(trans.getAction_transfer_btn(), "Action transfer btn"); });  
	        Thread.sleep(1000);
	
	
	        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Transfer_TC_05", "Verify that user click on distributor dropdown", () ->{
		   Liabrary_Havmor.custom_click(trans.getDistributor(), "click on distributor dropdown"); });  
	       Thread.sleep(1000);
	
	
	       ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Transfer_TC_06", "Verify that user click on distributor dropdown value", () ->{
		   Liabrary_Havmor.custom_click(trans.getDistributor_Value(), "click on distributor dropdown value"); });  
	       Thread.sleep(1000);
	
	
	       ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Transfer_TC_07", "Verify that user click on Approve btn", () ->{
		   Liabrary_Havmor.custom_click(trans.getAction_transfer_btn(), "click on Approve btn"); });  
           Thread.sleep(1000);
	
	
           ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Transfer_TC_04", "Verify that user click on No btn", () ->{
    	    Liabrary_Havmor.custom_click(trans.getAction_transfer_btn(), "click on No btn"); });  
           Thread.sleep(1000);
	
	
	
	
	
	
	
	 }

}
