package Admin_Masters_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Distributor_Master;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Distributor_Master_Add extends BaseClass{

	
	
	@Test
	public void Distributor_Add() throws Exception {
	
	
	HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
	Distributor_Master DM = PageFactory.initElements(driver , Distributor_Master.class);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_01", "Verify that user Click On Master Menu ", () ->{
	Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_02", "Verify that user Click On Distributor Master Sub Menu ", () ->{
		Liabrary_Havmor.custom_click(home.getDistributorMaster_SubMenu(), "Click On Distributor Master Menu");      
		});
		Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_03", "Verify that user Click On Distributor Master Menu ", () ->{
	Liabrary_Havmor.custom_click(DM.getDistributor_Master(), "Click On Distributor Master Menu");
	});
	Thread.sleep(1000);
	
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_04", "Verify that user Click On Add btn ", () ->{
		Liabrary_Havmor.custom_click(DM.getAdd_btn(), "Click On Add btn");
		});
		Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_05", "Verify that user Click On Sales Hierarchy dropdown", () ->{
		Liabrary_Havmor.custom_click(DM.getSales_Hierarchy_dropdown(), "Click On Sales Hierarchy dropdown");
		});
		Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_06", "Verify that user Click On Sales Hierarchy value", () ->{
		Liabrary_Havmor.custom_click(DM.getSales_Hierarchy_Value(), "Click On Sales Hierarchy value");
		});
		Thread.sleep(1000);
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_07", "Verify that user send Distributor Code", () ->{
		Liabrary_Havmor.custom_Sendkeys(DM.getDistributorCode(), excel.getStringdata2("Distributor_Add", 1, 0), "send Distributor Code");
		});
		Thread.sleep(1000);	
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_08", "Verify that user send Distributor Name", () ->{
		Liabrary_Havmor.custom_Sendkeys(DM.getDistributorName(), excel.getStringdata2("Distributor_Add", 1, 1), "send Distributor Name");
		});
		Thread.sleep(1000);	
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_09", "Verify that user click on Distributor Category", () ->{
		Liabrary_Havmor.custom_click(DM.getDistributorCategory(), "click on Distributor Category");
		});
		Thread.sleep(1000);	
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_10", "Verify that user click on checkbox", () ->{
		Liabrary_Havmor.custom_click(DM.getModernTrade_CheckBox(), "click on checkbox");
		});
		Thread.sleep(1000);	
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_11", "Verify that user click on Deopt Code dropdown", () ->{
		Liabrary_Havmor.custom_click(DM.getDepoCode(), "click on Deopt Code dropdown");
		});
		Thread.sleep(1000);	
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_12", "Verify that user click on Deopt Code dropdown value", () ->{
		Liabrary_Havmor.custom_click(DM.getDepoCode_value(), "click on Deopt Code dropdown value");
		});
		Thread.sleep(1000);	
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_13", "Verify that user send contact person name", () ->{
		Liabrary_Havmor.custom_Sendkeys(DM.getTxtContactPersonName(), excel.getStringdata2("Distributor_Add", 1, 2), "send contact person name");
		});
		Thread.sleep(1000);	
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_14", "Verify that user send mobile number", () ->{
		Liabrary_Havmor.custom_Sendkeys(DM.getTxtContactNumber(), excel.getStringdata2("Distributor_Add", 1, 3), "send mobile number");
		});
		Thread.sleep(1000);	
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_15", "Verify that user send email", () ->{
		Liabrary_Havmor.custom_Sendkeys(DM.getTxtEmail(), excel.getStringdata2("Distributor_Add", 1, 4), "send email");
		});
		Thread.sleep(1000);	
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_16", "Verify that user send Address1", () ->{
		Liabrary_Havmor.custom_Sendkeys(DM.getTxtAddress1(), excel.getStringdata2("Distributor_Add", 1, 5), "send Address1");
		});
		Thread.sleep(1000);	
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_17", "Verify that user send Address2", () ->{
		Liabrary_Havmor.custom_Sendkeys(DM.getTxtAddress2(), excel.getStringdata2("Distributor_Add", 1, 6), "send Address2");
		});
		Thread.sleep(1000);
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_18", "Verify that user send Address3", () ->{
		Liabrary_Havmor.custom_Sendkeys(DM.getTxtAddress3(), excel.getStringdata2("Distributor_Add", 1, 7), "send Address3");
		});
		Thread.sleep(1000);	
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_19", "Verify that user click on State dropdown", () ->{
		Liabrary_Havmor.custom_click(DM.getState_dropdown(), "click on State dropdown");
		});
		Thread.sleep(1000);	
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_20", "Verify that user click on State value dropdown", () ->{
		Liabrary_Havmor.custom_click(DM.getState_dropdown_value(), "click on State value dropdown");
		});
		Thread.sleep(1000);	
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_21", "Verify that user click on City dropdown", () ->{
		Liabrary_Havmor.custom_click(DM.getCity_dropdown(), "click on City dropdown");
		});
		Thread.sleep(1000);	
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_22", "Verify that user click on City value dropdown", () ->{
		Liabrary_Havmor.custom_click(DM.getCity_dropdown_Value(), "click on City value dropdown");
		});
		Thread.sleep(1000);	
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_23", "Verify that user send PIN Code", () ->{
		Liabrary_Havmor.custom_Sendkeys(DM.getTxtPinCode(), excel.getStringdata2("Distributor_Add", 1, 8), "send PIN Code");
		});
		Thread.sleep(1000);
		
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_23", "Verify that user send PAN Number", () ->{
		Liabrary_Havmor.custom_Sendkeys(DM.getTxtpanNumber(), excel.getStringdata2("Distributor_Add", 1, 9), "send PAN Number");
		});
		Thread.sleep(1000);	
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_24", "Verify that user click on FSSAI dropdown", () ->{
		Liabrary_Havmor.custom_click(DM.getFSSAIType_dropdown(), "click on FSSAI dropdown");
		});
		Thread.sleep(1000);	
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_25", "Verify that user click on FSSAI value dropdown", () ->{
		Liabrary_Havmor.custom_click(DM.getFSSAIType_dropdown_Value(), "click on FSSAI value dropdown");
		});
		Thread.sleep(1000);	
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_26", "Verify that user send FSSAI licene number", () ->{
		Liabrary_Havmor.custom_Sendkeys(DM.getTxtFSSAILicense(), excel.getStringdata2("Distributor_Add", 1, 10), "send FSSAI licene number");
		});
		Thread.sleep(1000);	
		
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Distributor_Master_Test_27", "Verify that user send FSSAI licene number", () ->{	
		driver.findElement(By.xpath("//input[@id='ctl00_ParentMasterContentPlaceHolder1_dtpFSSAIExpiry_dateInput']")).sendKeys("20/09/2025");
	});
	Thread.sleep(1000);
	
	
	
	
	WebElement fileUpload = driver.findElement(By.id("ParentMasterContentPlaceHolder1_fileUpload1"));
	Thread.sleep(1000);
	fileUpload.sendKeys("C:\\COde\\Havmor_Project\\test-output\\Upload_Files\\1_Aadhar_SECR-008_202504160337577650 (1).jpeg");
	Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
}
