package ZSM_Portal_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility_Havmor.BaseClass_ZSM;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;
import ZSM_Portal_Main.Salesman_Leave_Summary_Report_Main;

public class Salesman_Leave_Summary_Report_Test extends BaseClass_ZSM {

	@Test
	public void ZSM_Leave_Summary_Report() throws Exception {

    Salesman_Leave_Summary_Report_Main ass = PageFactory.initElements(driver , Salesman_Leave_Summary_Report_Main.class);

	ObjectRepo_Havmor.startTestAndLog_1_SS("ZSM_Leave_summary_Test_01", "Verify that user Click On Attendance and leave", () ->{
	Liabrary_Havmor.custom_click(ass.getAttendence_And_Leave(), "Click On Attendance and leave");     
	});
	Thread.sleep(1000);

	ObjectRepo_Havmor.startTestAndLog_1_SS("ZSM_Leave_summary_Test_02", "Verify that user Click On Report Submenu", () ->{
	Liabrary_Havmor.custom_click(ass.getReports(), "Click On Report SubMenu");      
	});
	Thread.sleep(1000);
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("ZSM_Leave_summary_Test_03", "Verify that user Click On leave summary Report", () ->{
		Liabrary_Havmor.custom_click(ass.getSalesman_Leave_Summary_Report(), "Click On leave summary Report");      
		});
		Thread.sleep(1000);
		
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
