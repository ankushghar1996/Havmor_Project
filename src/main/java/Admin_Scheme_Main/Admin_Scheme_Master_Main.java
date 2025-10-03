package Admin_Scheme_Main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Admin_Scheme_Master_Main {
	
	public WebElement getCategory_Checkbox1() {
		return Category_Checkbox1;
	}

	//Basic Info Tab Button	
	@FindBy(how=How.XPATH,using = "//div[@id='mainDiv']//ul//li//p[text()='Scheme Creation']")
	private WebElement Scheme_Creation;
	
	@FindBy(how=How.XPATH,using = "(//div[@id='ParentMasterContentPlaceHolder1_rptCategoriesPanel']//child::input[@type='checkbox'])[1]")
	private WebElement Category_Checkbox1;
	
	@FindBy(how=How.XPATH,using = "")
	private WebElement Mininum_QTY;
	
	//(//div[@id='ParentMasterContentPlaceHolder1_rptCategoriesPanel']//child::input[@type='number'])[1]
	
	public WebElement getMininum_QTY() {
		return Mininum_QTY;
	}

	@FindBy(how=How.XPATH,using = "//div[@id='ParentMasterContentPlaceHolder1_SchemeMasterdiv']//child::div/input[@id='ParentMasterContentPlaceHolder1_btnSearch']")
	private WebElement Search_Button;
	
	@FindBy(how=How.XPATH,using = "(//div[@class='col-md-12 mt-1']//child::div/table/tbody/tr[@id='ctl00_ParentMasterContentPlaceHolder1_radGridSchemeMaster_ctl00__0'])[1]")
	private WebElement Scheme_Grid_Data;
	
	@FindBy(how=How.XPATH,using = "//input[@id='ParentMasterContentPlaceHolder1_BtnAdd']")
	private WebElement Add_Button;
	
	
	@FindBy(how=How.XPATH,using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGLCode']")
	private WebElement GL_Code_Dropdown;
	
	@FindBy(how=How.XPATH,using = "//div[@id='ddlOrderSource']")
	private WebElement Order_Source;
	
	@FindBy(how=How.XPATH,using = "//div[@id='ddlOrderSource_DropDown']//ul//li[text()='ALL']")
	private WebElement Order_Source_Value;
	
	
	//div[@id='ddlOrderSource_DropDown']//ul//li[text()='ALL']
	public WebElement getGL_Code_Dropdown() {
		return GL_Code_Dropdown;
	}

	public WebElement getGL_Code_Dropdown_Value() {
		return GL_Code_Dropdown_Value;
	}

	@FindBy(how=How.XPATH,using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGLCode_DropDown']//ul//li)[1]")
	private WebElement GL_Code_Dropdown_Value;
	
	@FindBy(how=How.XPATH,using = "//input[@id='ParentMasterContentPlaceHolder1_txtActivityCode']")
	private WebElement Activity_Code_Textbox_Excel;
	

	public WebElement getActivity_Code_Textbox_Excel() {
		return Activity_Code_Textbox_Excel;
	}

	public WebElement getScheme_Creation() {
		return Scheme_Creation;
	}

	public WebElement getSearch_Button() {
		return Search_Button;
	}

	public WebElement getScheme_Grid_Data() {
		return Scheme_Grid_Data;
	}

	public WebElement getAdd_Button() {
		return Add_Button;
	}

	public WebElement getScheme_Short_Name_Textbox_EXCEL() {
		return Scheme_Short_Name_Textbox_EXCEL;
	}

	public WebElement getScheme_Name_Textbox() {
		return Scheme_Name_Textbox;
	}

	public WebElement getScheme_Description_Textbox_EXCEL() {
		return Scheme_Description_Textbox_EXCEL;
	}

	public WebElement getScheme_Type_Dropdown() {
		return Scheme_Type_Dropdown;
	}

	public WebElement getScheme_Type_Dropdown_Value() {
		return Scheme_Type_Dropdown_Value;
	}

	public WebElement getScheme_Mechanics_Dropdown() {
		return Scheme_Mechanics_Dropdown;
	}

	public WebElement getScheme_Mechanics_Dropdown_Value() {
		return Scheme_Mechanics_Dropdown_Value;
	}

	public WebElement getScheme_Method_Dropdown() {
		return Scheme_Method_Dropdown;
	}

	public WebElement getScheme_Method_Dropdown_Value1_In_bill_scheme() {
		return Scheme_Method_Dropdown_Value1_In_bill_scheme;
	}

	public WebElement getScheme_Method_Dropdown_Value2_Running_Purchases() {
		return Scheme_Method_Dropdown_Value2_Running_Purchases;
	}

	public WebElement getScheme_Method_Dropdown_Value3_Periodic_QPS() {
		return Scheme_Method_Dropdown_Value3_Periodic_QPS;
	}

	public WebElement getApply_in_No_of_Bills_Textbox_EXCEL() {
		return Apply_in_No_of_Bills_Textbox_EXCEL;
	}

	public WebElement getNo_of_Bills_Per_Day_Textbox_EXCEL() {
		return No_of_Bills_Per_Day_Textbox_EXCEL;
	}

	public WebElement getClaimable_Dropdown() {
		return Claimable_Dropdown;
	}

	public WebElement getClaimable_Dropdown_Value() {
		return Claimable_Dropdown_Value;
	}

	public WebElement getOrder_Source_Dropdown() {
		return Order_Source_Dropdown;
	}

	public WebElement getOrder_Source() {
		return Order_Source;
	}

	public WebElement getOrder_Source_Value() {
		return Order_Source_Value;
	}

	public WebElement getMinimum_or_Skus_Dropdown() {
		return Minimum_or_Skus_Dropdown;
	}

	public WebElement getFrom_MRP_Textbox_EXCEL() {
		return From_MRP_Textbox_EXCEL;
	}

	public WebElement getTo_MRP_Textbox_EXCEL() {
		return To_MRP_Textbox_EXCEL;
	}

	public WebElement getFree_Qty_Treatment_Dropdown() {
		return Free_Qty_Treatment_Dropdown;
	}

	public WebElement getFree_Qty_Treatment_Dropdown_Value() {
		return Free_Qty_Treatment_Dropdown_Value;
	}

	public WebElement getSave_And_ContinueBTN() {
		return Save_And_ContinueBTN;
	}

	public WebElement getProduct_Hierarchy_Dropdown() {
		return Product_Hierarchy_Dropdown;
	}

	public WebElement getProduct_Hierarchy_Dropdown_Value1() {
		return Product_Hierarchy_Dropdown_Value1;
	}

	public WebElement getProduct_Hierarchy_Dropdown_Value2() {
		return Product_Hierarchy_Dropdown_Value2;
	}

	public WebElement getProduct_Hierarchy_Dropdown_Value3() {
		return Product_Hierarchy_Dropdown_Value3;
	}

	public WebElement getProduct_Hierarchy_Dropdown_Value4() {
		return Product_Hierarchy_Dropdown_Value4;
	}

	public WebElement getDownload_Template() {
		return Download_Template;
	}

	public WebElement getSelect_File_to_upload_CSV_Product_Info() {
		return Select_File_to_upload_CSV_Product_Info;
	}

	public WebElement getUpload_Button_Product_Info() {
		return Upload_Button_Product_Info;
	}

	public WebElement getSlab_Type_Dropdown() {
		return Slab_Type_Dropdown;
	}

	public WebElement getSlab_Type_Dropdown_Value() {
		return Slab_Type_Dropdown_Value;
	}

	public WebElement getSlab_Calculation_On_Dropdown() {
		return Slab_Calculation_On_Dropdown;
	}

	

	public WebElement getBasis_for_Scheme_Bifurcation_Dropdown() {
		return Basis_for_Scheme_Bifurcation_Dropdown;
	}

	public WebElement getBasis_for_Scheme_Bifurcation_Dropdown_Value() {
		return Basis_for_Scheme_Bifurcation_Dropdown_Value;
	}

	public WebElement getIs_purchase_limit_applicable_Dropdown() {
		return Is_purchase_limit_applicable_Dropdown;
	}

	public WebElement getIs_purchase_limit_applicable_Dropdown_Value() {
		return Is_purchase_limit_applicable_Dropdown_Value;
	}

	public WebElement getDiscount_Calculated_on_Dropdown() {
		return Discount_Calculated_on_Dropdown;
	}

	public WebElement getDiscount_Calculated_On_Dropdown_Value() {
		return Discount_Calculated_On_Dropdown_Value;
	}

	public WebElement getSlab_Add_Link1_BTN() {
		return Slab_Add_Link1_BTN;
	}

	public WebElement getOn_QTY__Textbox_EXCEL() {
		return On_QTY__Textbox_EXCEL;
	}

	public WebElement getFrom_Discount__Textbox_EXCEL() {
		return From_Discount__Textbox_EXCEL;
	}

	public WebElement getTo_Discount__Textbox_EXCEL() {
		return To_Discount__Textbox_EXCEL;
	}

	public WebElement getFlat_Discount__Textbox_EXCEL() {
		return Flat_Discount__Textbox_EXCEL;
	}

	public WebElement getDiscount_Per_Unit__Textbox_EXCEL() {
		return Discount_Per_Unit__Textbox_EXCEL;
	}

	public WebElement getAdd_Slab_Button() {
		return Add_Slab_Button;
	}

	public WebElement getNational_Budget__Textbox_EXCEL() {
		return National_Budget__Textbox_EXCEL;
	}

	public WebElement getAllocated_Budget_Per_Distributor_Textbox_EXCEL() {
		return Allocated_Budget_Per_Distributor_Textbox_EXCEL;
	}

	public WebElement getAllocated_Budget_Per_Retailer_Textbox_EXCEL() {
		return Allocated_Budget_Per_Retailer_Textbox_EXCEL;
	}

	public WebElement getUpload_Retailer_Specific_Budget_Switch_Button() {
		return Upload_Retailer_Specific_Budget_Switch_Button;
	}

	public WebElement getUpload_Distributor_Specific_Budget_Switch_Button() {
		return Upload_Distributor_Specific_Budget_Switch_Button;
	}

	public WebElement getDownload_Template_Retailer() {
		return Download_Template_Retailer;
	}

	public WebElement getDownload_Template_Distributor() {
		return Download_Template_Distributor;
	}

	public WebElement getSelect_File_to_upload_Retailer_CSV_Budget_Upload() {
		return Select_File_to_upload_Retailer_CSV_Budget_Upload;
	}

	public WebElement getUpload_Button_Retailer_Budget_Info() {
		return Upload_Button_Retailer_Budget_Info;
	}

	public WebElement getSelect_File_to_upload_Distributor_CSV_Budget_Upload() {
		return Select_File_to_upload_Distributor_CSV_Budget_Upload;
	}

	public WebElement getUpload_Button_Distributor_Budget_Info() {
		return Upload_Button_Distributor_Budget_Info;
	}

	public WebElement getFinal_Close_Button_Budget_INFO() {
		return Final_Close_Button_Budget_INFO;
	}

	@FindBy(how=How.XPATH,using = "//input[@id='ParentMasterContentPlaceHolder1_txt1shortName']")
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
	
	public WebElement getMinimum_or_Skus_Dropdown_Value() {
		return Minimum_or_Skus_Dropdown_Value;
	}
	

	@FindBy(how=How.XPATH,using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlMinLinesOrSkus_DropDown']//ul//li)[3]")
	private WebElement Minimum_or_Skus_Dropdown_Value;
	
	@FindBy(how=How.XPATH,using = "//div[@class='row ml-4 mr-4']//child::input[@id='ctl00_ParentMasterContentPlaceHolder1_txtFromMRP']")
	private WebElement From_MRP_Textbox_EXCEL;
	
	@FindBy(how=How.XPATH,using = "//div[@class='row ml-4 mr-4']//child::input[@id='ctl00_ParentMasterContentPlaceHolder1_txtToMRP']")
	private WebElement To_MRP_Textbox_EXCEL;
	
	@FindBy(how=How.XPATH,using = "//div[@class='row ml-4 mr-4']//child::input[@id='ddlFreeQtyTreatment_Input']")
	private WebElement Free_Qty_Treatment_Dropdown; 
	
	@FindBy(how=How.XPATH,using = "(//div[@id='ddlFreeQtyTreatment_DropDown']//ul//li)[4]")
	private WebElement Free_Qty_Treatment_Dropdown_Value; 
	
	@FindBy(how=How.XPATH,using = "//div[@class='Custom-Footer fixed-bottom']//child::div/input[@id='ParentMasterContentPlaceHolder1_btnSaveDetails']")
	private WebElement Save_And_ContinueBTN; 
	
	@FindBy(how=How.XPATH,using = "//div[@class='Custom-Footer fixed-bottom']//child::div/input[@id='ParentMasterContentPlaceHolder1_btnSaveProduct']")
	private WebElement Save_And_ContinueProductInfo_BTN; 
	
	public WebElement getSave_And_ContinueProductInfo_BTN() {
		return Save_And_ContinueProductInfo_BTN;
	}

	@FindBy(how=How.XPATH,using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlClaimableScheme_Input']")
	private WebElement  Claimable_Dropdown; 
	
	@FindBy(how=How.XPATH,using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlClaimableScheme_DropDown']//ul//li[text()='Yes']")
	private WebElement  Claimable_Dropdown_Value; 
	


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
	@FindBy(how=How.XPATH,using = "//div[@class='row ml-3 mr-4']//child::div//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSlabType_Input']")
	private WebElement  Slab_Type_Dropdown;
	
	@FindBy(how=How.XPATH,using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSlabType_DropDown']//ul//li[text()='Unit']")
	private WebElement  Slab_Type_Dropdown_Value;
	
	@FindBy(how=How.XPATH,using = "//div[@class='row ml-3 mr-4']//child::div//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSlabCalculationOn_Input']")
	private WebElement  Slab_Calculation_On_Dropdown;
	
	@FindBy(how=How.XPATH,using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSlabCalculationOn_DropDown']//ul//li[text()='Sale rate without GST']")
	private WebElement  Slab_Calculation_On_Value_Dropdown;
	
	//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSlabCalculationOn_DropDown']//ul//li[text()='Sale rate without GST']
	
	public WebElement getSlab_Calculation_On_Value_Dropdown() {
		return Slab_Calculation_On_Value_Dropdown;
	}

	@FindBy(how=How.XPATH,using = "//div[@class='row ml-3 mr-4']//child::div//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSchemeBifurcation_Input']")
	private WebElement Basis_for_Scheme_Bifurcation_Dropdown;
	
	@FindBy(how=How.XPATH,using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSchemeBifurcation_DropDown']//ul//li[text()='Value']")
	private WebElement Basis_for_Scheme_Bifurcation_Dropdown_Value;
	
	@FindBy(how=How.XPATH,using = "//div[@class='row ml-3 mr-4']//child::div//input[@id='ctl00_ParentMasterContentPlaceHolder1_txtCAPDiscountAmt']")
	private WebElement CAP_on_Discount_Amt_Textbox_Excel ;
 
	
	//div[@class='row ml-3 mr-4']//child::div//input[@id='ctl00_ParentMasterContentPlaceHolder1_txtCAPDiscountAmt']
	
	@FindBy(how=How.XPATH,using = "//div[@class='row ml-3 mr-4']//child::div//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlPurchaseLimit_Input']")
	private WebElement  Is_purchase_limit_applicable_Dropdown;
	
	@FindBy(how=How.XPATH,using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlPurchaseLimit_DropDown']//ul//li[text()='No']")
	private WebElement  Is_purchase_limit_applicable_Dropdown_Value;
	
	@FindBy(how=How.XPATH,using = "//div[@class='row ml-3 mr-4']//child::div//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSchemeDiscountCalc_Input']")
	private WebElement  Discount_Calculated_on_Dropdown;
	
	

	@FindBy(how=How.XPATH,using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSchemeDiscountCalc_DropDown']//ul//li[text()='MRP']")
	private WebElement  Discount_Calculated_On_Dropdown_Value;
	
	
	
	//Add slab link/button
	@FindBy(how=How.XPATH,using = "")
	private WebElement Slab_Add_Link1_BTN;
	
	@FindBy(how=How.XPATH,using = "//div[@class='modal-content']//child::div//Input[@id='ctl00_ParentMasterContentPlaceHolder1_txtOnAmt']")
	private WebElement  On_QTY__Textbox_EXCEL;
	
	@FindBy(how=How.XPATH,using = "//div[@class='modal-content']//child::div//Input[@id='ctl00_ParentMasterContentPlaceHolder1_txtDiscountPercent']")
	private WebElement  From_Discount__Textbox_EXCEL;
	
	@FindBy(how=How.XPATH,using = "//div[@class='modal-content']//child::div//Input[@id='ctl00_ParentMasterContentPlaceHolder1_txtDiscountTo']")
	private WebElement  To_Discount__Textbox_EXCEL;
	
	@FindBy(how=How.XPATH,using = "//div[@class='modal-content']//child::div//Input[@id='ctl00_ParentMasterContentPlaceHolder1_txtDiscountAmt']")
	private WebElement  Flat_Discount__Textbox_EXCEL;
	
	@FindBy(how=How.XPATH,using = "//div[@class='modal-content']//child::div//Input[@id='ctl00_ParentMasterContentPlaceHolder1_txtDiscountPerUnit']")
	private WebElement Discount_Per_Unit__Textbox_EXCEL;
	
	@FindBy(how=How.XPATH,using = "//div[@class='modal-content']//child::div//Input[@id='ParentMasterContentPlaceHolder1_btnValidateSKU']")
	private WebElement Add_Slab_Button;
	
	@FindBy(how=How.XPATH,using = "//div[@class='Custom-Footer fixed-bottom']//child::div/input[@id='ParentMasterContentPlaceHolder1_btnSlabInfo']")
	private WebElement Save_And_Continue_Slab_BTN;
	
	
	
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

	public WebElement getSave_And_Continue_Slab_BTN() {
		return Save_And_Continue_Slab_BTN;
	}

	public WebElement getCAP_on_Discount_Amt_Textbox_Excel() {
		return CAP_on_Discount_Amt_Textbox_Excel;
	}
	

	
}
