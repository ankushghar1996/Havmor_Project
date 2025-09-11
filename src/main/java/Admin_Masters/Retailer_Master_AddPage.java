package Admin_Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Retailer_Master_AddPage {

	
	
	@FindBy(how = How.XPATH, using = "(//p[contains(text(),'Retailer Master')])[1]")
	private WebElement Retailer_Master_Submenu;
	
	
	public WebElement getRetailer_Master_Submenu() {
		return Retailer_Master_Submenu;
	}


	@FindBy(how = How.XPATH, using = "(//p[contains(text(),'Retailer Master')])[2]")
	private WebElement Retailer_Master_menu;
	
	
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
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributor_DropDown']//ul//li)[1]")
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


	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnUpdate']")
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
	
	
	
	
	
	
	
	
}
