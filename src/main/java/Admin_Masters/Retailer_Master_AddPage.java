package Admin_Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Retailer_Master_AddPage {

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-link btn-block text-left label_default']")
	private WebElement Godown_Address;
	
	@FindBy(how = How.XPATH, using = "//input[@id='txtGD1ShippingAddressName1']")
		private WebElement ShippingAddressName;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtRetailerFirmName']")
	private WebElement Retailer_Firm_Name;
		
		
	
	
		public WebElement getRetailer_Firm_Name() {
		return Retailer_Firm_Name;
	}


		@FindBy(how = How.XPATH, using = "//input[@id='txtGD1ShippingAddLine1']")
		private WebElement ShippingAddress;
		
		
		@FindBy(how = How.XPATH, using = "//select[@id='ddlGD1State']")
		private WebElement Godown_state;
		
		
		@FindBy(how = How.XPATH, using = "//select[@id='ddlGD1State']//option[normalize-space()='Maharashtra']")
		private WebElement Godown_state_value;
		
		
		@FindBy(how = How.XPATH, using = "//select[@id='ddlGD1City']")
		private WebElement Godown_City;
		
		
		@FindBy(how = How.XPATH, using = "//select[@id='ddlGD1City']//option[normalize-space()='Mumbai']")
		private WebElement Godown_City_Value;
		
		
		@FindBy(how = How.XPATH, using = "//input[@id='txtGD1PinCode']")
		private WebElement PinCode_Godown;
		
		
		
	
	@FindBy(how = How.XPATH, using = "//p[@class='menu-color'][normalize-space()='Retailer Master']")
	private WebElement Retailer_Master_Submenu;
	
	
	public WebElement getRetailer_Master_Submenu() {
		return Retailer_Master_Submenu;
	}


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Retailer Creation']")
	private WebElement Retailer_Master_menu;
	
	
	public WebElement getGodown_Address() {
		return Godown_Address;
	}


	public WebElement getShippingAddressName() {
		return ShippingAddressName;
	}


	public WebElement getShippingAddress() {
		return ShippingAddress;
	}


	public WebElement getGodown_state() {
		return Godown_state;
	}


	public WebElement getGodown_state_value() {
		return Godown_state_value;
	}


	public WebElement getGodown_City() {
		return Godown_City;
	}


	public WebElement getGodown_City_Value() {
		return Godown_City_Value;
	}


	public WebElement getPinCode_Godown() {
		return PinCode_Godown;
	}


	public WebElement getRetailer_Master_menu() {
		return Retailer_Master_menu;
	}

	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnAdd']")
	private WebElement Add_btn;
	

	public WebElement getAdd_btn() {
		return Add_btn;
	}


	public WebElement getChannelType() {
		return ChannelType;
	}


	public WebElement getChannelType_value() {
		return ChannelType_value;
	}


	public WebElement getDistributor() {
		return Distributor;
	}


	public WebElement getDistributor_value() {
		return Distributor_value;
	}


	public WebElement getFSG() {
		return FSG;
	}


	public WebElement getFSG_value() {
		return FSG_value;
	}


	public WebElement getRoute() {
		return Route;
	}


	public WebElement getRoute_value() {
		return Route_value;
	}


	public WebElement getRetailerFirmName() {
		return RetailerFirmName;
	}


	public WebElement getERPCode() {
		return ERPCode;
	}


	public WebElement getAddressLine1() {
		return AddressLine1;
	}


	public WebElement getLandmark() {
		return landmark;
	}


	public WebElement getState() {
		return State;
	}


	public WebElement getState_value() {
		return State_value;
	}


	public WebElement getDistrict() {
		return District;
	}


	public WebElement getDistrict_value() {
		return District_value;
	}


	public WebElement getCity() {
		return City;
	}


	public WebElement getCity_value() {
		return City_value;
	}


	public WebElement getPinCode() {
		return PinCode;
	}


	public WebElement getContactPersonName() {
		return ContactPersonName;
	}


	public WebElement getContactNumber() {
		return ContactNumber;
	}


	public WebElement getEmailId() {
		return EmailId;
	}


	public WebElement getDOB() {
		return DOB;
	}


	public WebElement getPANNo() {
		return PANNo;
	}


	public WebElement getTotlBusinessInConstructionChemicals() {
		return TotlBusinessInConstructionChemicals;
	}


	public WebElement getGstType() {
		return GstType;
	}


	public WebElement getGstType_value() {
		return GstType_value;
	}


	public WebElement getLiceseNumber() {
		return liceseNumber;
	}


	public WebElement getLicenseType() {
		return licenseType;
	}


	public WebElement getLicenseType_value() {
		return licenseType_value;
	}


	public WebElement getExpiry_date() {
		return Expiry_date;
	}


	public WebElement getBankName() {
		return BankName;
	}


	public WebElement getBankName_value() {
		return BankName_value;
	}


	public WebElement getBankAccountNo() {
		return BankAccountNo;
	}


	@FindBy(how = How.XPATH, using = "//div[@class='col-md-3 mb-2']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlChannelType']")
	private WebElement ChannelType;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlChannelType_DropDown']//ul//li)[1]")
	private WebElement ChannelType_value;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-3 mb-2']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributor']")
	private WebElement Distributor;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributor_DropDown']//ul//li)[5]")
	private WebElement Distributor_value;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-3 mb-2']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFSG']")
	private WebElement FSG;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFSG_DropDown']//ul//li)[1]")
	private WebElement FSG_value;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-3 mb-2']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRoute']")
	private WebElement Route;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRoute_DropDown']//ul//li)[1]")
	private WebElement Route_value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtRetailerFirmName']")
	private WebElement RetailerFirmName;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtERPCode']")
	private WebElement ERPCode;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtAddressLine1']")
	private WebElement AddressLine1;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtlandmark']")
	private WebElement landmark;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-3 mb-2']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlState']")
	private WebElement State;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlState_DropDown']//ul//li[normalize-space()='Maharashtra']")
	private WebElement State_value;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-3 mb-2']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistrict']")
	private WebElement District;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistrict_DropDown']//ul//li[normalize-space()='Mumbai']")
	private WebElement District_value;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-3 mb-2']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlCity']")
	private WebElement City;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlCity_DropDown']//ul//li[normalize-space()='Mumbai']")
	private WebElement City_value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtPinCode']")
	private WebElement PinCode;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtContactPersonName']")
	private WebElement ContactPersonName;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtContactNumber']")
	private WebElement ContactNumber;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtEmailId']")
	private WebElement EmailId;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_dtpDOB_dateInput']")
	private WebElement DOB;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtPANNo']")
	private WebElement PANNo;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtTotlBusinessInConstructionChemicals']")
	private WebElement TotlBusinessInConstructionChemicals;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-3 mb-2']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGstType']")
	private WebElement GstType;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGstType_DropDown']//ul//li)[2]")
	private WebElement GstType_value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtliceseNumber']")
	private WebElement liceseNumber;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-3 mb-2']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddllicenseType']")
	private WebElement licenseType;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddllicenseType_DropDown']//ul//li)[1]")
	private WebElement licenseType_value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_dtpExpiry_dateInput']")
	private WebElement Expiry_date;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-3 mb-2']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlBankName']")
	private WebElement BankName;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlBankName_DropDown']//ul//li)[1]")
	private WebElement BankName_value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtBankAccountNo']")
	private WebElement BankAccountNo;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnView']")
	private WebElement View_btn;
	
	
	public WebElement getView_btn() {
		return View_btn;
	}


	public WebElement getEdit_btn() {
		return Edit_btn;
	}


	public WebElement getDownload_btn() {
		return Download_btn;
	}


	public WebElement getDeActivate_btn() {
		return DeActivate_btn;
	}


	public WebElement getSave() {
		return Save_btn;
	}


	public WebElement getClose() {
		return Close_btn;
	}

	

	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGridRetailerMaster_GridData']//child::table//tr//td//a[@id='ctl00_ParentMasterContentPlaceHolder1_radGridRetailerMaster_ctl00_ctl04_BtnUpdate']")
	private WebElement Edit_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnExport']")
	private WebElement Download_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnDeActivate']")
	private WebElement DeActivate_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnSave']")
	private WebElement Save_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Close_btn;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-3 mb-2']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRetailerCategory']")
	private WebElement RetailerCategory;
	
	
	public WebElement getSave_btn() {
		return Save_btn;
	}


	public WebElement getClose_btn() {
		return Close_btn;
	}


	public WebElement getRetailerCategory() {
		return RetailerCategory;
	}


	public WebElement getRetailerCategory_value() {
		return RetailerCategory_value;
	}


	public WebElement getType2() {
		return Type2;
	}


	public WebElement getType2_value() {
		return Type2_value;
	}


	public WebElement getType3() {
		return Type3;
	}


	public WebElement getType3_value() {
		return Type3_value;
	}


	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRetailerCategory_DropDown']//ul//li)[1]")
	private WebElement RetailerCategory_value;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-3 mb-2']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlType2']")
	private WebElement Type2;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlType2_DropDown']//ul//li)[1]")
	private WebElement Type2_value;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-3 mb-2']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlType3']")
	private WebElement Type3;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlType3_DropDown']//ul//li)[1]")
	private WebElement Type3_value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtgstNumbers']")
	private WebElement gstNumbers;


	public WebElement getGstNumbers() {
		return gstNumbers;
	}
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtBankIfscCode']")
	private WebElement BankIfscCode;


	public WebElement getBankIfscCode() {
		return BankIfscCode;
	}
	
	@FindBy(how = How.XPATH, using = "(//div[contains(@id,'ctl00_ParentMasterContentPlaceHolder1_radGridRetailerMaster_GridData')]//table//tr//td//a)[1]")
	private WebElement Action_View_btn;
	
	public WebElement getAction_View_btn() {
		return Action_View_btn;
	}


	public WebElement getAction_Close_btn() {
		return Action_Close_btn;
	}


	public WebElement getView_Attributes() {
		return View_Attributes;
	}


	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Action_Close_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@value='View Attributes']")
	private WebElement View_Attributes;
	
	//===================================================
	//Retailer Attributes
	
	
	
	@FindBy(how = How.XPATH, using = "//input[@type='button' and @value='Select Attributes']")
	private WebElement Select_Attributes;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlsVicinityName_0']//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlsVicinityName_0_Input']")
	private WebElement Vicinity_Name_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@class='rcbScroll rcbWidth']//ul//li[text()='Airport']")
	private WebElement Vicinity_Name_Dropdown_Value;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlsUrbanRetailer_1']//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlsUrbanRetailer_1_Input']")
	private WebElement Urban_Retailer_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@class='rcbScroll rcbWidth']//ul//li[text()='Citybased outlets']")
	private WebElement Urban_Retailer_Dropdown_Value;
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12 mb-3']//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlsDFStatus_2_Input']")
	private WebElement DF_Status_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@class='rcbScroll rcbWidth']//ul//li[text()='DF']")
	private WebElement DF_Status_Dropdown_Value;
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12 mb-3']//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlsBrandingStatus_3_Input']")
	private WebElement Branding_Status_Dropdown;
	
	@FindBy(how = How.XPATH, using = "//div[@class='rcbScroll rcbWidth']//ul//li[text()='Branded']")
	private WebElement Branding_Status_Dropdown_Value;
	
	@FindBy(how = How.XPATH, using = "//button[@type='button' and text()='Close']")
	private WebElement Close_Button_Select_Attribute;




	public WebElement getSelect_Attributes() {
		return Select_Attributes;
	}


	public WebElement getVicinity_Name_Dropdown() {
		return Vicinity_Name_Dropdown;
	}


	public WebElement getVicinity_Name_Dropdown_Value() {
		return Vicinity_Name_Dropdown_Value;
	}


	public WebElement getUrban_Retailer_Dropdown() {
		return Urban_Retailer_Dropdown;
	}


	public WebElement getUrban_Retailer_Dropdown_Value() {
		return Urban_Retailer_Dropdown_Value;
	}


	public WebElement getDF_Status_Dropdown() {
		return DF_Status_Dropdown;
	}


	public WebElement getDF_Status_Dropdown_Value() {
		return DF_Status_Dropdown_Value;
	}


	public WebElement getBranding_Status_Dropdown() {
		return Branding_Status_Dropdown;
	}


	public WebElement getBranding_Status_Dropdown_Value() {
		return Branding_Status_Dropdown_Value;
	}


	public WebElement getClose_Button_Select_Attribute() {
		return Close_Button_Select_Attribute;
	}
	
	
	
	
}
