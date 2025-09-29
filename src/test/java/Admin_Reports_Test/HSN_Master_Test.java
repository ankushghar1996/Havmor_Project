package Admin_Reports_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Reports.HSN_Master_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.BaseClass_otp;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class HSN_Master_Test extends BaseClass_otp {
	
	
	@Test
	public void HSN_Masters_Reports() throws Exception {
	
		
		HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
		HSN_Master_Main report = PageFactory.initElements(driver , HSN_Master_Main.class);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("HSN_Master_Reports_TC_01", "Verify that user Click On Reports Menu ", () ->{
		Liabrary_Havmor.custom_click(home.getReports_Menu(), "Click On Reports Menu");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("HSN_Master_Reports_TC_02", "Verify that user Click On HSN Master Sub Menu ", () ->{
		Liabrary_Havmor.custom_click(report.getHSN_Master(), "Click On HSN Master SubMenu");      
		});
		Thread.sleep(1000);
	
	
	
		
		
		
		
		
		
		
		
		
	}

}
