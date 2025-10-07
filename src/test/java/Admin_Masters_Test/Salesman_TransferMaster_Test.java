package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Route_Master_Add_BTN_Main;
import Admin_Masters.Salesman_Transfer_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Salesman_TransferMaster_Test extends BaseClass {

  @Test
  public void Salesman_Transfer() throws Exception {

        Salesman_Transfer_Main STM = PageFactory.initElements(driver, Salesman_Transfer_Main.class);
        HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);

    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Transfer_TC_01", "Verify that user Click On Master Menu ", () ->{
    	Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
    	});
    	Thread.sleep(1000);
	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Transfer_TC_02", "Verify that user click on Salesman Master Sub Menu ", () ->{
        Liabrary_Havmor.custom_click(home.getSalesman_Master_Submenu(), "Salesman Master Submenu");    });  
    	Thread.sleep(1000);
	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Transfer_TC_03", "Verify that user click on Salesman Transfer ", () ->{
        Liabrary_Havmor.custom_click(STM.getSalesman_Transfer(), " Salesman Transfer "); });  
        Thread.sleep(1000);
	
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Transfer_TC_04", "Verify that user click on From Distributor ", () ->{
        Liabrary_Havmor.custom_click(STM.getFrom_Distributor(), "From Distributor"); });  
        Thread.sleep(1000);
	
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Transfer_TC_05", "Verify that user click on From Distributor value", () ->{
        Liabrary_Havmor.custom_click(STM.getFrom_Distributor_Value(), "From_Distributor Value"); });  
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Transfer_TC_06", "Verify that user click on Salesman_Transfer_1_Checkbox", () ->{
        Liabrary_Havmor.custom_click(STM.getSalesman_Transfer_1_Checkbox(), "Salesman_Transfer_1_Checkbox");});  
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Transfer_TC_07", "Verify that user click on Salesman_Transfer_1_Checkbox", () ->{
        Liabrary_Havmor.custom_click(STM.getSalesman_Transfer_Forward_button(), "Salesman_Transfer Forward Button");});  
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Transfer_TC_08", "Verify that user click on To Distributor ", () ->{
        Liabrary_Havmor.custom_click(STM.getTo_Distributor(), "To Distributor");});  
        Thread.sleep(1000);
            
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Transfer_TC_09", "Verify that user click on To Distributor_Value", () ->{
        Liabrary_Havmor.custom_click(STM.getTo_Distributor_Value(), "To Distributor Value");});  
        Thread.sleep(1000);
        
	
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Transfer_TC_10", "Verify that user click on Salesman_Transfer_2_Checkbox", () ->{
        Liabrary_Havmor.custom_click(STM.getSalesman_Transfer_2_Checkbox(), "Salesman_Transfer_2_Checkbox");});  
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Transfer_TC_11", "Verify that user click on Close Button", () ->{
        Liabrary_Havmor.custom_click(STM.getClose_Button(), "Close Button");});  
        Thread.sleep(1000);
	
	
	
	
}
  
}
