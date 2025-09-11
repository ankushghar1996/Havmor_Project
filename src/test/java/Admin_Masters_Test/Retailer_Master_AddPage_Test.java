package Admin_Masters_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Retailer_Master_AddPage;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Retailer_Master_AddPage_Test extends BaseClass{

	
	@Test
	public void Retailer_Add() throws Exception {
	
		
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
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__05", "Verify that user Click on Sales Hierarchy dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getChannelType(), "Click On Sales Hierarchy dropdown");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__06", "Verify that user select on Sales Hierarchy value", () ->{
		Liabrary_Havmor.custom_click(Add.getChannelType_value(), "select on Sales Hierarchy value");      
		});
		Thread.sleep(1000);
		
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__07", "Verify that user click on Distributor dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getDistributor(), "click on Distributor dropdown");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__08", "Verify that user click on Distributor dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getDistributor_value(), "click on Distributor dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__09", "Verify that user click on SalesMan dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getFSG(), "click on SalesMan dropdown");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__10", "Verify that user click on SalesMan dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getFSG_value(), "click on SalesMan dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__11", "Verify that user click on Route dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getRoute(), "click on Route dropdown");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__12", "Verify that user click on Route dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getRoute_value(), "click on Route dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__13", "Verify that user send Retailer Firm Name", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getRetailerFirmName(), excel.getStringdata2("Retailer_Add", 1, 0), "send Retailer Firm Name");    
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__14", "Verify that user send ERP Code", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getERPCode(), excel.getStringdata2("Retailer_Add", 1, 1), "send ERP Code");    
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__15", "Verify that user click on RE dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getRetailerCategory(), "click on RE dropdown");      
		});
		Thread.sleep(1000);
			
			
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__16", "Verify that user click on RE dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getRetailerCategory_value(), "click on RE dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__17", "Verify that user click on Type2 dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getType2(), "click on Type2 dropdown");      
		});
		Thread.sleep(1000);
				
				
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__18", "Verify that user click on Type2 dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getType2_value(), "click on Type2 dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__19", "Verify that user click on Type2 dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getType2(), "click on Type2 dropdown");      
		});
		Thread.sleep(1000);
					
					
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__20", "Verify that user click on Type2 dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getType2_value(), "click on Type2 dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__21", "Verify that user click on Type3 dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getType3(), "click on Type3 dropdown");      
		});
		Thread.sleep(1000);
						
						
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__22", "Verify that user click on Type3 dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getType3_value(), "click on Type3 dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__23", "Verify that user send Address line 1", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getAddressLine1(), excel.getStringdata2("Retailer_Add", 1, 2), "send Address line 1");    
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__24", "Verify that user send Land Mark", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getLandmark(), excel.getStringdata2("Retailer_Add", 1, 3), "send Land Mark");    
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__25", "Verify that user click on State dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getState(), "click on State dropdown");      
		});
		Thread.sleep(1000);
							
							
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__26", "Verify that user click on State dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getState_value(), "click on State dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__27", "Verify that user click on District dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getDistrict(), "click on District dropdown");      
		});
		Thread.sleep(1000);
								
								
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__28", "Verify that user click on District dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getDistrict_value(), "click on District dropdown value");      
		});
		Thread.sleep(1000);
		
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__29", "Verify that user click on City dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getCity(), "click on City dropdown");      
		});
		Thread.sleep(1000);
								
								
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__30", "Verify that user click on City dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getCity_value(), "click on City dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__31", "Verify that user send PinCode", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getLandmark(), excel.getStringdata2("Retailer_Add", 1, 4), "send PinCode");    
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__32", "Verify that user send Contact Person Name", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getContactPersonName(), excel.getStringdata2("Retailer_Add", 1, 5), "send Contact Person Name");    
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__33", "Verify that user send Contact Number", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getContactNumber(), excel.getStringdata2("Retailer_Add", 1, 6), "send Contact Number");    
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__34", "Verify that user send Email Address", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getEmailId(), excel.getStringdata2("Retailer_Add", 1, 7), "send Email Address");    
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__35", "Verify that user send Date Of Birth", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getDOB(), excel.getStringdata2("Retailer_Add", 1, 8), "send Date Of Birth");    
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__36", "Verify that user send PAN Number", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getPANNo(), excel.getStringdata2("Retailer_Add", 1, 10), "send PAN Number");    
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__37", "Verify that user send Potential Business", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getTotlBusinessInConstructionChemicals(), excel.getStringdata2("Retailer_Add", 1, 11), "send Potential Business");    
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__38", "Verify that user click on GST Type dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getGstType(), "click on GST Type dropdown");      
		});
		Thread.sleep(1000);
									
									
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__39", "Verify that user click on GST Type dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getGstType_value(), "click on GST Type dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__40", "Verify that user send GST Number", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getGstNumbers(), excel.getStringdata2("Retailer_Add", 1, 12), "send GST Number");    
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__41", "Verify that user send Food License Number", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getLiceseNumber(), excel.getStringdata2("Retailer_Add", 1, 13), "send Food License Number");    
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__42", "Verify that user click on Food License Category dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getLicenseType(), "click on Food License Category dropdown");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__43", "Verify that user click on Food License Category dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getLicenseType_value(), "click on Food License Category dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__44", "Verify that user send Expiry Date", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getExpiry_date(), excel.getStringdata2("Retailer_Add", 1, 14), "send Food Expiry Date");    
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__45", "Verify that user click on Bank dropdown", () ->{
		Liabrary_Havmor.custom_click(Add.getBankName(), "click on Bank dropdown");      
		});
		Thread.sleep(1000);
			
			
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__46", "Verify that user click on Bank dropdown value", () ->{
		Liabrary_Havmor.custom_click(Add.getBankName_value(), "click on Bank dropdown value");      
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__47", "Verify that user send Bank Account Number", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getBankAccountNo(), excel.getStringdata2("Retailer_Add", 1, 15), "send Bank Account Number");    
		});
		Thread.sleep(1000);
		
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("Retailer_Master_Test_Add_TC__48", "Verify that user send Bank IFSC Code", () ->{
		Liabrary_Havmor.custom_Sendkeys(Add.getBankIfscCode(), excel.getStringdata2("Retailer_Add", 1, 16), "send Bank IFSC Code");    
		});
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
