package Admin_DEDC_Request;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DEDC_Request_Main {
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Scheme']")
	private WebElement Scheme_Menu;
	
	
	public WebElement getScheme_Menu() {
		return Scheme_Menu;
	}


	public WebElement getDEDC_Menu() {
		return DEDC_Menu;
	}


	public WebElement getDEDCRequest_SubMenu() {
		return DEDCRequest_SubMenu;
	}


	public WebElement getAdd_btn() {
		return Add_btn;
	}


	public WebElement getDistributor_dropdown() {
		return Distributor_dropdown;
	}


	public WebElement getDistributor_dropdownValue() {
		return Distributor_dropdownValue;
	}


	public WebElement getOutlet_dropdown() {
		return Outlet_dropdown;
	}


	public WebElement getOutlet_dropdownValue() {
		return Outlet_dropdownValue;
	}


	public WebElement getEstimatedSales_TextBox() {
		return EstimatedSales_TextBox;
	}


	public WebElement getCompitativeOutlet_dropdown() {
		return CompitativeOutlet_dropdown;
	}


	public WebElement getCompitativeOutlet_dropdownValue() {
		return CompitativeOutlet_dropdownValue;
	}


	public WebElement getTCS_TextBox() {
		return TCS_TextBox;
	}


	public WebElement getDEDC_TextBox() {
		return DEDC_TextBox;
	}


	public WebElement getCompanyContribution_TextBox() {
		return CompanyContribution_TextBox;
	}


	public WebElement getSchemeApplicable_dropdown() {
		return SchemeApplicable_dropdown;
	}


	public WebElement getIn_Billed_Running_CheckBox() {
		return In_Billed_Running_CheckBox;
	}


	public WebElement getCheckAllItems_CheckBox() {
		return CheckAllItems_CheckBox;
	}


	public WebElement getPeriodicQPS_CheckBox() {
		return PeriodicQPS_CheckBox;
	}


	public WebElement getPoint_Base_CheckBox() {
		return Point_Base_CheckBox;
	}


	public WebElement getPayoutFrequency_dropdown() {
		return PayoutFrequency_dropdown;
	}


	public WebElement getPayoutFrequency_dropdownValue() {
		return PayoutFrequency_dropdownValue;
	}


	public WebElement getDiscountAppOn_dropdown() {
		return DiscountAppOn_dropdown;
	}


	public WebElement getDiscountAppOn_dropdownValue() {
		return DiscountAppOn_dropdownValue;
	}


	public WebElement getPayoutType_dropdown() {
		return PayoutType_dropdown;
	}


	public WebElement getPayoutType_dropdownValue() {
		return PayoutType_dropdownValue;
	}


	public WebElement getProductWise_dropdown() {
		return ProductWise_dropdown;
	}


	public WebElement getProductWise_dropdownValue() {
		return ProductWise_dropdownValue;
	}


	public WebElement getBtnSendRequest() {
		return btnSendRequest;
	}


	public WebElement getBtnModalClose() {
		return btnModalClose;
	}


	public WebElement getProductHierarchy_dropdown() {
		return ProductHierarchy_dropdown;
	}


	public WebElement getProductHierarchy_dropdownValue() {
		return ProductHierarchy_dropdownValue;
	}


	public WebElement getCategoryWise_dropdown() {
		return CategoryWise_dropdown;
	}


	public WebElement getICECREAM_CheckBox() {
		return ICECREAM_CheckBox;
	}


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='DEDC']")
	private WebElement DEDC_Menu;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='DEDC Request']")
	private WebElement DEDCRequest_SubMenu;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnAdd']")
	private WebElement Add_btn;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-box mb-3']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributor']")
	private WebElement Distributor_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributor_DropDown']//ul//li)[1]")
	private WebElement Distributor_dropdownValue;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-3']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlOutlet']")
	private WebElement Outlet_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlOutlet_DropDown']//ul//li)[1]")
	private WebElement Outlet_dropdownValue;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_EstimatedSales']")
	private WebElement EstimatedSales_TextBox;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-box']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlCompitativeOutlet']")
	private WebElement CompitativeOutlet_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlCompitativeOutlet_DropDown']//ul//li)[1]")
	private WebElement CompitativeOutlet_dropdownValue;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_TCS']")
	private WebElement TCS_TextBox;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_txtDEDC']")
	private WebElement DEDC_TextBox;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_txtCompanyContribution']")
	private WebElement CompanyContribution_TextBox;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-box']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_RadComboBox1']")
	private WebElement SchemeApplicable_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//label[normalize-space()='In Billed Running']")
	private WebElement In_Billed_Running_CheckBox;
	
	
	@FindBy(how = How.XPATH, using = "//input[@class='rcbCheckAllItemsCheckBox']")
	private WebElement CheckAllItems_CheckBox;
	
	
	@FindBy(how = How.XPATH, using = "//label[normalize-space()='Periodic (QPS)']")
	private WebElement PeriodicQPS_CheckBox;
	
	
	@FindBy(how = How.XPATH, using = "//label[normalize-space()='Point Base']")
	private WebElement Point_Base_CheckBox;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-box']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_PayoutFrequency']")
	private WebElement PayoutFrequency_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_PayoutFrequency_DropDown']//ul//li)[1]")
	private WebElement PayoutFrequency_dropdownValue;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-box']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_DiscountAppOn']")
	private WebElement DiscountAppOn_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_DiscountAppOn_DropDown']//ul//li)[1]")
	private WebElement DiscountAppOn_dropdownValue;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-box']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_PayoutType']")
	private WebElement PayoutType_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_PayoutType_DropDown']//ul//li)[1]")
	private WebElement PayoutType_dropdownValue;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-box']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlProduct']")
	private WebElement ProductWise_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlProduct_DropDown']//ul//li)[1]")
	private WebElement ProductWise_dropdownValue;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnSendRequest']")
	private WebElement btnSendRequest;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnModalClose']")
	private WebElement btnModalClose;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-box mb-3']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlProductHierarchy']")
	private WebElement ProductHierarchy_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlProductHierarchy_DropDown']//ul//li)[1]")
	private WebElement ProductHierarchy_dropdownValue;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-box mb-3']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlCategory']")
	private WebElement CategoryWise_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//label[normalize-space()='ICECREAM']")
	private WebElement ICECREAM_CheckBox;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
