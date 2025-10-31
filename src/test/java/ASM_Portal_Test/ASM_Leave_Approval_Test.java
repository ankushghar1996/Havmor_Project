package ASM_Portal_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com_Utility_Havmor.BaseClass_ASM;
import Com_Utility_Havmor.BaseClass_ZSM;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;
import ZSM_Portal_Main.ZSM_Leave_Approval_Main;

public class ASM_Leave_Approval_Test extends BaseClass_ASM{
	
	@Test
	public void ASM_Leave_Approval() throws Exception {

    ZSM_Leave_Approval_Main ass = PageFactory.initElements(driver , ZSM_Leave_Approval_Main.class);

	ObjectRepo_Havmor.startTestAndLog_1_SS("ZSM_Leave_Approval_Test_01", "Verify that user Click On Attendance and leave", () ->{
	Liabrary_Havmor.custom_click(ass.getAttendence_And_Leave(), "Click On Attendance and leave");     
	});
	Thread.sleep(1000);
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("ZSM_Leave_Approval_Test_02", "Verify that user Click On Leave Master Submenu", () ->{
	Liabrary_Havmor.custom_click(ass.getLeave_Master(), "Click On Leave Master SubMenu");      
	});
	Thread.sleep(1000);	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("ZSM_Leave_Approval_Test_03", "Verify that user Click On Leave Approval", () ->{
		Liabrary_Havmor.custom_click(ass.getLeave_Approval(), "Click On Leave Approval");      
		});
		Thread.sleep(1000);
		
		
		
	}
	
}
