package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Salesman_Master_AddBTN_Main;
import Admin_Masters.User_master_Add_BTN_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class User_master_Add_BTN_Test extends BaseClass {
		
 @Test
 public void User_Master_Add() throws Exception {	
		 
   	User_master_Add_BTN_Main UMADD = PageFactory.initElements(driver, User_master_Add_BTN_Main.class);
    HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
    
    
    ObjectRepo_Havmor.startTestAndLog_1_SS("Vendor_Master_Test_Add_TC_", "Verify that user Click On Master Menu ", () ->{
		Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
		});
		Thread.sleep(1000); 

 	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_User_Master_Add_TC_01", "Verify that user Click On User Master Menu ", () ->{
 	Liabrary_Havmor.custom_click(home.getUser_Master_Menu(), "User Master Menu");      
 	});
 	Thread.sleep(1000);
	
// 	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_User_Master_Add_TC_02", "Verify that user click on Salesman Master Sub Menu ", () ->{
//     Liabrary_Havmor.custom_click(home.getSalesman_Master_Submenu(), "Salesman Master Submenu");    });  
// 	Thread.sleep(1000);	
 	
 	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_User_Master_Add_TC_02", "Verify that user click on User Master ", () ->{
     Liabrary_Havmor.custom_click(home.getUser_Master_Submenu(), " User Master Submenu "); });  
 	Thread.sleep(1000);
 	
 	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_User_Master_Add_TC_03", "Verify that user click on Add Button ", () ->{
     Liabrary_Havmor.custom_click(UMADD.getAdd_Button(), " Add Button "); });  
	 Thread.sleep(1000);
	
	 ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_User_Master_Add_TC_04", "Verify that user click on User Type Dropdown ", () ->{
	 Liabrary_Havmor.custom_click(UMADD.getUser_Type_Dropdown(), " User Type "); });  
	Thread.sleep(1000);
		 
	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_User_Master_Add_TC_05", "Verify that user click on User Type Dropdown Value", () ->{
	 Liabrary_Havmor.custom_click(UMADD.getUser_Type_Dropdown_Value(), " User Type Value "); });  
	 Thread.sleep(1000);
				 
	 ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_User_Master_Add_TC_06", "Verify that user click on Division Dropdown ", () ->{
	  Liabrary_Havmor.custom_click(UMADD.getDivision(), "Division Dropdown"); });  
	 Thread.sleep(1000);
					 
	 ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_User_Master_Add_TC_07", "Verify that user click on Division Dropdown Value ", () ->{
	 Liabrary_Havmor.custom_click(UMADD.getDivision_Value(), "Division Dropdown Value"); });  
	 Thread.sleep(1000);
						 
	 ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_User_Master_Add_TC_08", "Verify that user click on Sales Hierarchy Dropdown ", () ->{
     Liabrary_Havmor.custom_click(UMADD.getSales_Hierarchy(), " Sales Hierarchy Dropdown "); });  
	 Thread.sleep(1000);
							 
	 ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_User_Master_Add_TC_09", "Verify that user click on Sales Hierarchy Dropdown Value ", () ->{
	  Liabrary_Havmor.custom_click(UMADD.getSales_Hierarchy_Value(), " Sales Hierarchy Dropdown Value "); });  
	 Thread.sleep(1000);
	
	 ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_User_Master_Add_TC_10", "Verify that user Should Enter USER ID in Textbox", () ->{
     Liabrary_Havmor.custom_Sendkeys(UMADD.getUser_ID_Textbox_EXCEL(), excel.getStringdata2("User_Master_ADD", 1, 0), "USER ID ");
      });
	 Thread.sleep(1000);
	 
	 ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_User_Master_Add_TC_11", "Verify that user Should Enter Name in Textbox", () ->{
	 Liabrary_Havmor.custom_Sendkeys(UMADD.getName_Textbox_EXCEL(), excel.getStringdata2("User_Master_ADD", 1, 1), "Name");
    });
    Thread.sleep(1000);

	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_User_Master_Add_TC_12", "Verify that user Should Enter Email in Textbox", () ->{
	Liabrary_Havmor.custom_Sendkeys(UMADD.getEmail_Textbox_EXCEL(), excel.getStringdata2("User_Master_ADD", 1, 2), "Email");
	});
     Thread.sleep(1000);
		 
    ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_User_Master_Add_TC_13", "Verify that user Should Enter Mobile in Textbox", () ->{
	  Liabrary_Havmor.custom_Sendkeys(UMADD.getMobile_Textbox_EXCEL(), excel.getStringdata2("User_Master_ADD", 1, 3), "Mobile");
	});
	 Thread.sleep(1000);	
	
	 ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_User_Master_Add_TC_14", "Verify that user click on Save button", () ->{
	 Liabrary_Havmor.custom_click(UMADD.getSave_Button(), " Save button "); });  
	 Thread.sleep(1000);
	
	

	
	}
}
