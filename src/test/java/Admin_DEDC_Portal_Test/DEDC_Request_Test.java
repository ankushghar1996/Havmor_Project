package Admin_DEDC_Portal_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_DEDC_Request.DEDC_Request_Main;
import Com_Utility_Havmor.BaseClass_otp;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class DEDC_Request_Test extends BaseClass_otp{
	
	
	@Test
	public void Add_DEDC_Request() throws Exception {
	
	
	DEDC_Request_Main ass = PageFactory.initElements(driver , DEDC_Request_Main.class);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_01", "Verify that user Click On Scheme Menu", () ->{
	Liabrary_Havmor.custom_click(ass.getScheme_Menu(), "Click On Scheme Menu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_02", "Verify that user Click On DEDC SubMenu", () ->{
	Liabrary_Havmor.custom_click(ass.getDEDC_Menu(), "Click On DEDC SubMenu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_03", "Verify that user Click On Asset Master SubMenu", () ->{
	Liabrary_Havmor.custom_click(ass.getDEDCRequest_SubMenu(), "Click On DEDC Request SubMenu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_04", "Verify that user Click On Add btn", () ->{
	Liabrary_Havmor.custom_click(ass.getAdd_btn(), "Click On Add btn");      
	});
	Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	

}
