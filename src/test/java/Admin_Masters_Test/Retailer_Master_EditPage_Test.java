package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Retailer_Master_AddPage;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Retailer_Master_EditPage_Test extends BaseClass{
	
	
	
	@Test
	public void Retailer_Edit() throws Exception {
	
		
		HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
		Retailer_Master_AddPage Add = PageFactory.initElements(driver , Retailer_Master_AddPage.class);
		
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Edit_TC_01", "Verify that user Click On Master Menu ", () ->{
		Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Edit_TC_02", "Verify that user Click on Retailer Master Sub Menu ", () ->{
		Liabrary_Havmor.custom_click(Add.getRetailer_Master_Submenu(), "Click On Retailer Master Sub Menu");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Edit_TC__03", "Verify that user Click on Retailer Master Menu ", () ->{
		Liabrary_Havmor.custom_click(Add.getRetailer_Master_menu(), "Click On Retailer Master Menu");      
		});
		Thread.sleep(1000);
	
		
		//Grid data Edit
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Edit_TC__04", "Verify that user Click on Edit Button //Grid Data Edit First Value", () ->{
	    Liabrary_Havmor.custom_click(Add.getEdit_btn(), "Click On Grid Row Edit Button");      
	     });
		Thread.sleep(1000);
			
			
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Edit_TC__05", "Verify that user Click on Retailer Firm Name Field should Clear", () ->{
		Liabrary_Havmor.custom_clear(Add.getRetailer_Firm_Name())    ;  
		});
		Thread.sleep(1000);
				
				
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Edit_TC__06", "Verify that user Enter Retailer Firm Name in Field ", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getRetailer_Firm_Name(), "Mango Belgian Firm", "Add New Retailer Firm")  ;
		});
		
	
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Edit_TC__07", "Verify that user Click on ", () ->{
		Liabrary_Havmor.custom_click(Add.getSave_btn(), "Save Button");
		});
		Thread.sleep(1000);	
	
	
	
	
	
	
	
	
	
	
	
	}

}
