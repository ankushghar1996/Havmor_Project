package Admin_Masters_Test;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Admin_Masters.Retailer_Beat_Alignment_Main;
import Admin_Masters.Retailer_Master_AddPage;
import Admin_Masters.Route_Master_Add_BTN_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Retailer_Select_Attribute_Test extends BaseClass {

	
	@Test
	public void Retailer_Beat_Alignment() throws Exception {

		HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
        Retailer_Master_AddPage Add = PageFactory.initElements(driver , Retailer_Master_AddPage.class);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC_01", "Verify that user Click On Master Menu ", () ->{
		Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC_02", "Verify that user Click on Retailer Master Sub Menu ", () ->{
		Liabrary_Havmor.custom_click(Add.getRetailer_Master_Submenu(), "Click On Retailer Master Sub Menu");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__03", "Verify that user Click on Retailer Master Menu ", () ->{
		Liabrary_Havmor.custom_click(Add.getRetailer_Master_menu(), "Click On Retailer Master Menu");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__04", "Verify that user Click on Add btn ", () ->{
		Liabrary_Havmor.custom_click(Add.getAdd_btn(), "Click On Add btn");      
		});
		Thread.sleep(1000);
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__05", "Verify that user Click on Select Attributes ", () ->{
			Liabrary_Havmor.custom_click(Add.getSelect_Attributes(), "Click On Select Attributes");      
			});
			Thread.sleep(1000);
	
	    ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__06", "Verify that user Click on Vicinity Name Dropdown ", () ->{
		Liabrary_Havmor.custom_click(Add.getVicinity_Name_Dropdown(), "Vicinity Name Dropdown");      
		});
		Thread.sleep(1000);
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__07", "Verify that user Click on Vicinity Name Dropdown Value", () ->{
	    Liabrary_Havmor.custom_click(Add.getVicinity_Name_Dropdown_Value(), "Vicinity Name Dropdown Value");      
		});
		Thread.sleep(1000);
	
		 ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__08", "Verify that user Click on Urban Retailer Dropdown ", () ->{
		  Liabrary_Havmor.custom_click(Add.getUrban_Retailer_Dropdown(), "Urban Retailer Dropdown");      
			});
		  Thread.sleep(1000);
			
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__09", "Verify that user Click on Urban Retailer Dropdown Value", () ->{
	    Liabrary_Havmor.custom_click(Add.getUrban_Retailer_Dropdown_Value(), "Urban Retailer Dropdown Value");      
	    });
		Thread.sleep(1000);
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__10", "Verify that user Click on DF Status Dropdown ", () ->{
	    Liabrary_Havmor.custom_click(Add.getDF_Status_Dropdown(), "DF Status Dropdown");      
		});
		Thread.sleep(1000);
				
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__11", "Verify that user Click on DF Status Dropdown Value", () ->{
	    Liabrary_Havmor.custom_click(Add.getDF_Status_Dropdown_Value(), "DF Status Dropdown Value");      
	    });
		Thread.sleep(1000);
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__12", "Verify that user Click on Branding Status Dropdown ", () ->{
		    Liabrary_Havmor.custom_click(Add.getBranding_Status_Dropdown(), "Branding Status Dropdown");      
			});
			Thread.sleep(1000);
					
			ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__13", "Verify that user Click on Branding Status Dropdown Value", () ->{
		    Liabrary_Havmor.custom_click(Add.getBranding_Status_Dropdown_Value(), "Branding Status Dropdown Value");      
		    });
			Thread.sleep(1000);
	
			ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__14", "Verify that user Click on Close Button", () ->{
			Liabrary_Havmor.custom_click(Add.getClose_Button_Select_Attribute(), "Close Button");      
		    });
		  Thread.sleep(1000);
		
	
	
	
	}
	
}
