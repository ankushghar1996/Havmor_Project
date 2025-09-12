package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Retailer_Beat_Alignment_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Retailer_Beat_Alignment_Test extends BaseClass{

	
	@Test
	public void Retailer_Beat_Alignment() throws Exception {
	
		
		HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
		Retailer_Beat_Alignment_Main Trans = PageFactory.initElements(driver , Retailer_Beat_Alignment_Main.class);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Beat_Alignment_Test_TC_01", "Verify that user Click On Master Menu ", () ->{
		Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
		});
		Thread.sleep(1000);
	
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Beat_Alignment_Test_TC_02", "Verify that user Click On Retailer Master Menu ", () ->{
		Liabrary_Havmor.custom_click(Trans.getRetailer_Master_Submenu(), "Click On Retailer Master Menu");      
		});
		Thread.sleep(1000);
	
	
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Beat_Alignment_Test_TC_03", "Verify that user Click On Retailer Beat Alignment SubMenu ", () ->{
		Liabrary_Havmor.custom_click(Trans.getRetailer_Beat_Realignment_Submenu(), "Click On Retailer Beat Alignment SubMenu");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Beat_Alignment_Test_TC_04", "Verify that user Click On From distributor dropdown ", () ->{
		Liabrary_Havmor.custom_click(Trans.getFromDistributor_dropdown(), "Click On From distributor dropdown");      
		});
		Thread.sleep(1000);
			
			
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Beat_Alignment_Test_TC_05", "Verify that user Click On From distributor dropdown value", () ->{
		Liabrary_Havmor.custom_click(Trans.getFromDistributor_dropdown_value(), "Click On From distributor dropdown value");      
		});
		Thread.sleep(1000);
			
			
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Beat_Alignment_Test_TC_06", "Verify that user Click On Route distributor dropdown", () ->{
		Liabrary_Havmor.custom_click(Trans.getFromRoute_dropdown(), "Click On From Route dropdown");      
		});
		Thread.sleep(1000);
			
			
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Beat_Alignment_Test_TC_07", "Verify that user Click On From Route dropdown value", () ->{
		Liabrary_Havmor.custom_click(Trans.getFromRoute_dropdown_value(), "Click On From Route dropdown value");      
		});
		Thread.sleep(1000);
			
			
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Beat_Alignment_Test_TC_08", "Verify that user Click On First checkbox", () ->{
		Liabrary_Havmor.custom_click(Trans.getFirst_FromSelectCheckBox(), "Click On First checkbox");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Beat_Alignment_Test_TC_11", "Verify that user Click On TO Route distributor dropdown", () ->{
		Liabrary_Havmor.custom_click(Trans.getToRoute_dropdown(), "Click On TO Route dropdown");      
		});
		Thread.sleep(1000);
				
				
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Beat_Alignment_Test_TC_12", "Verify that user Click On TO Route dropdown value", () ->{
		Liabrary_Havmor.custom_click(Trans.getToRoute_dropdown_value(), "Click On TO Route dropdown value");      
		});
		Thread.sleep(1000);
			
			
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Beat_Alignment_Test_TC_13", "Verify that user Click On Right Ratailer btn", () ->{
		Liabrary_Havmor.custom_click(Trans.getRightRatailer_btn(), "Click On Right Ratailer btn");      
		});
		Thread.sleep(1000);
			
			
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Beat_Alignment_Test_TC_14", "Verify that user Click On First checkbox", () ->{
		Liabrary_Havmor.custom_click(Trans.getFirst_ToSelectCheckBox(), "Click On First checkbox");      
		});
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	}
		
}
