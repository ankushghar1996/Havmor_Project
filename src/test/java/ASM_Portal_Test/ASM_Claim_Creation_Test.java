package ASM_Portal_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ASM_Portal_Main.ASM_Claim_Creation_Main;
import Com_Utility_Havmor.BaseClass_ASM;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;


public class ASM_Claim_Creation_Test extends BaseClass_ASM {

	@Test
	public void ASM_Claim_Creation() throws Exception {

    ASM_Claim_Creation_Main ass = PageFactory.initElements(driver , ASM_Claim_Creation_Main.class);

	ObjectRepo_Havmor.startTestAndLog_1_SS("ASM_Claim_Creation_Test_01", "Verify that user Click On Claim Menu", () ->{
	Liabrary_Havmor.custom_click(ass.getClaim_Menu(), "Click On Claim Menu");     
	});
	Thread.sleep(1000);
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("ASM_Claim_Creation_Test_02", "Verify that user Click On Claim Master Submenu", () ->{
	Liabrary_Havmor.custom_click(ass.getClaim_Master(), "Click On Claim Master Submenu");      
	});
	Thread.sleep(1000);		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
