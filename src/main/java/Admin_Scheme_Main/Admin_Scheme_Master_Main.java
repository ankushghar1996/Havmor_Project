package Admin_Scheme_Main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Admin_Scheme_Master_Main {
	
	//Basic Info Tab Button	
	@FindBy(how=How.XPATH,using = "//div[@id='mainDiv']//ul//li//p[text()='Scheme Master']")
	private WebElement Scheme_Master;
	
	@FindBy(how=How.XPATH,using = "//div[@id='ParentMasterContentPlaceHolder1_SchemeMasterdiv']//child::div/input[@id='ParentMasterContentPlaceHolder1_btnSearch']")
	private WebElement Search_Button;
	
	@FindBy(how=How.XPATH,using = "(//div[@class='col-md-12 mt-1']//child::div/table/tbody/tr[@id='ctl00_ParentMasterContentPlaceHolder1_radGridSchemeMaster_ctl00__0'])[1]")
	private WebElement Scheme_Grid_Data;
	
	@FindBy(how=How.XPATH,using = "//input[@id='ParentMasterContentPlaceHolder1_BtnAdd']")
	private WebElement Add_Button;
	
	@FindBy(how=How.XPATH,using = "//input[@id='ParentMasterContentPlaceHolder1_txtSchemeName']")
	private WebElement Scheme_Short_Name_Textbox_EXCEL;
		
	@FindBy(how=How.XPATH,using = "//div[@class='row ml-4 mr-4']//child::input[@id='ParentMasterContentPlaceHolder1_txtSchemeName']")
	private WebElement Scheme_Name_Textbox;
		
	@FindBy(how=How.XPATH,using = "//div[@class='row ml-4 mr-4']//child::input[@id='ParentMasterContentPlaceHolder1_txtSchemeDesc']")
	private WebElement Scheme_Description_Textbox_EXCEL;
		
	@FindBy(how=How.XPATH,using = "//div[@class='row ml-4 mr-4']//child::input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSchemeOn_Input']")
	private WebElement Scheme_Type_Dropdown;
	
	@FindBy(how=How.XPATH,using = "//div[@class='rcbSlide']//child::div//ul//li[text()='Secondary']")
	private WebElement Scheme_Type_Dropdown_Value;
	
	@FindBy(how=How.XPATH,using = "//div[@class='row ml-4 mr-4']//child::input[@id='ddlSchemeMechanics_Input']")
	private WebElement Scheme_Mechanics_Dropdown;
	
	@FindBy(how=How.XPATH,using = "//div[@class='rcbSlide']//child::div//ul//li[text()='Automated']")
	private WebElement Scheme_Mechanics_Dropdown_Value;
	
	@FindBy(how=How.XPATH,using = "//div[@class='row ml-4 mr-4']//child::input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSchemeMethod_Input']")
	private WebElement Scheme_Method_Dropdown;
	
	@FindBy(how=How.XPATH,using = "//div[@class='content-wrapper']//child::div//ul//li[text()='In bill scheme']")
	private WebElement Scheme_Method_Dropdown_Value1_In_bill_scheme;
	
	@FindBy(how=How.XPATH,using = "//div[@class='content-wrapper']//child::div//ul//li[text()='In bill scheme (Running Purchases)']")
	private WebElement Scheme_Method_Dropdown_Value2_Running_Purchases;
	
	@FindBy(how=How.XPATH,using = "//div[@class='content-wrapper']//child::div//ul//li[text()='Periodic (QPS)']")
	private WebElement Scheme_Method_Dropdown_Value3_Periodic_QPS;
	
	@FindBy(how=How.XPATH,using = "//div[@class='row ml-4 mr-4']//child::input[@id='ctl00_ParentMasterContentPlaceHolder1_txtApplyOnbills']")
	private WebElement Apply_in_No_of_Bills_Textbox_EXCEL;
	
	@FindBy(how=How.XPATH,using = "//div[@class='row ml-4 mr-4']//child::input[@id='ctl00_ParentMasterContentPlaceHolder1_txtbillperDay']")
	private WebElement No_of_Bills_Per_Day_Textbox_EXCEL;
	
	@FindBy(how=How.XPATH,using = "//div[@class='row ml-4 mr-4']//child::input[@id='ddlOrderSource_Input']")
	private WebElement Order_Source_Dropdown;
	
	@FindBy(how=How.XPATH,using = "//div[@class='row ml-4 mr-4']//child::input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMinLinesOrSkus_Input']")
	private WebElement Minimum_or_Skus_Dropdown;
	
	@FindBy(how=How.XPATH,using = "//div[@class='row ml-4 mr-4']//child::input[@id='ctl00_ParentMasterContentPlaceHolder1_txtFromMRP']")
	private WebElement From_MRP_Textbox_EXCEL;
	
	@FindBy(how=How.XPATH,using = "//div[@class='row ml-4 mr-4']//child::input[@id='ctl00_ParentMasterContentPlaceHolder1_txtToMRP']")
	private WebElement To_MRP_Textbox_EXCEL;
	
	@FindBy(how=How.XPATH,using = "//div[@class='row ml-4 mr-4']//child::input[@id='ddlFreeQtyTreatment_Input']")
	private WebElement Free_Qty_Treatment_Dropdown; 
	
	@FindBy(how=How.XPATH,using = "//div[@class='content-wrapper']//child::div/ul/li[text()='Not Applicable']")
	private WebElement Free_Qty_Treatment_Dropdown_Value; 
	
	@FindBy(how=How.XPATH,using = "//div[@class='Custom-Footer fixed-bottom']//child::div/input[@id='ParentMasterContentPlaceHolder1_btnSaveDetails']")
	private WebElement Save_And_ContinueBTN; 
	

	//Product info Tab Button	
	@FindBy(how=How.XPATH,using = "//div[@class='Hierarchysection ml-3 mr-3']//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlProductHierarchy_Input']")
	private WebElement Product_Hierarchy_Dropdown; 
	
	@FindBy(how=How.XPATH,using = "//div[@class='content-wrapper']//child::div/ul/li[text()='Category']")
	private WebElement Product_Hierarchy_Dropdown_Value1; 
	
	@FindBy(how=How.XPATH,using = "//div[@class='content-wrapper']//child::div/ul/li[text()='SubCategory']")
	private WebElement Product_Hierarchy_Dropdown_Value2; 
	
	@FindBy(how=How.XPATH,using = "//div[@class='content-wrapper']//child::div/ul/li[text()='ProductDesc']")
	private WebElement Product_Hierarchy_Dropdown_Value3; 
	
	@FindBy(how=How.XPATH,using = "//div[@class='content-wrapper']//child::div/ul/li[text()='Parentcode']")
	private WebElement Product_Hierarchy_Dropdown_Value4; 
	
	@FindBy(how=How.XPATH,using = "(//div[@class='col-md-12 d-flex align-items-start justify-content-between upload-section custom-upload-align']//child::div//a[normalize-space()='Download Template'])[1]")
	private WebElement Download_Template;
	
	@FindBy(how=How.XPATH,using = "//input[@id='ParentMasterContentPlaceHolder1_Button4']")
	private WebElement  Select_File_to_upload_CSV_Product_Info;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement  Upload_Button_Product_Info;

	//Slab Tab Button		
	@FindBy(how=How.XPATH,using = "")
	private WebElement  Slab_Type_Dropdown;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement  Slab_Type_Dropdown_Value;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement  Slab_Calculation_On_Dropdown;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement  Slab_Calculation_On_Value_Textbox_EXCEL;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement Basis_for_Scheme_Bifurcation_Dropdown;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement Basis_for_Scheme_Bifurcation_Dropdown_Value;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement  Is_purchase_limit_applicable_Dropdown;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement  Is_purchase_limit_applicable_Dropdown_Value;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement  Discount_Calculated_on_Dropdown;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement  Discount_Calculated_On_Dropdown_Value;
	
	
	
	//Add slab link/button
	@FindBy(how=How.XPATH,using = "")
	private WebElement Slab_Add_Link1_BTN;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement  On_QTY__Textbox_EXCEL;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement  From_Discount__Textbox_EXCEL;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement  To_Discount__Textbox_EXCEL;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement  Flat_Discount__Textbox_EXCEL;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement Discount_Per_Unit__Textbox_EXCEL;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement Add_Slab_Button;
	
	
	
	//Applicable For Tab Button	
	@FindBy(how=How.XPATH,using = "")
	private WebElement National_Budget__Textbox_EXCEL;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement Allocated_Budget_Per_Distributor_Textbox_EXCEL;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement Allocated_Budget_Per_Retailer_Textbox_EXCEL;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement Upload_Retailer_Specific_Budget_Switch_Button;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement Upload_Distributor_Specific_Budget_Switch_Button;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement Download_Template_Retailer;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement Download_Template_Distributor;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement  Select_File_to_upload_Retailer_CSV_Budget_Upload;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement  Upload_Button_Retailer_Budget_Info;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement  Select_File_to_upload_Distributor_CSV_Budget_Upload;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement  Upload_Button_Distributor_Budget_Info;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement  Final_Close_Button_Budget_INFO;
	

	
}
