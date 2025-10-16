package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Depot_Master_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Demo_Depo extends BaseClass {

	
	@Test
	public void Depot_Add() throws Exception {
	
		
		HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
		Depot_Master_Main Add = PageFactory.initElements(driver , Depot_Master_Main.class);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_01", "Verify that user Click On Master Menu ", () ->{
		Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
		});
		Thread.sleep(1000);
	
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_02", "Verify that user Click On Depot Master subMenu ", () ->{
		Liabrary_Havmor.custom_click(Add.getDepot_Master_submenu(), "Click On Depot Master subMenu");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_03", "Verify that user Click On Depot Master", () ->{
		Liabrary_Havmor.custom_click(Add.getDepot_Master(), "Click On Depot Master");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Depot_Master_Test_Add_TC_04", "Verify that user Click On Add btn", () ->{
		Liabrary_Havmor.custom_click(Add.getAdd_btn(), "Click On Add btn");      
		});
		Thread.sleep(1000);
}

	
}