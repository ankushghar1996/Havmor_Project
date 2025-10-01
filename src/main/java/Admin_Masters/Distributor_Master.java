package Admin_Masters;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class Distributor_Master {
 
	
WebDriver driver;
	
	public WebDriver getDriver() {
	return driver;
}
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Distributor Creation']")
	private WebElement Distributor_Master;
 
	public WebElement getDistributor_Master() {
		return Distributor_Master;
	}
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ParentMasterContentPlaceHolder1_SFAMasterBody']//input[@id='ParentMasterContentPlaceHolder1_BtnAdd']")
	private WebElement Add_btn;
	
	
	public WebElement getAdd_btn() {
		return Add_btn;
	}
 
 
	public WebElement getSales_Hierarchy_dropdown() {
		return Sales_Hierarchy_dropdown;
	}
 
 
	public WebElement getSales_Hierarchy_Value() {
		return Sales_Hierarchy_Value;
	}
 
 
	public WebElement getDistributorCode() {
		return DistributorCode;
	}
 
 
	public WebElement getDistributorName() {
		return DistributorName;
	}
 
 
	public WebElement getDistributorCategory() {
		return DistributorCategory;
	}
 
 
	public WebElement getModernTrade_CheckBox() {
		return ModernTrade_CheckBox;
	}
 
 
	public WebElement getDepoCode() {
		return DepoCode;
	}
 
 
	public WebElement getDepoCode_value() {
		return DepoCode_value;
	}
 
 
	public WebElement getTxtContactPersonName() {
		return txtContactPersonName;
	}
 
 
	public WebElement getTxtContactNumber() {
		return txtContactNumber;
	}
 
 
	public WebElement getTxtEmail() {
		return txtEmail;
	}
 
 
	public WebElement getTxtAddress1() {
		return txtAddress1;
	}
 
 
	public WebElement getTxtAddress2() {
		return txtAddress2;
	}
 
 
	public WebElement getTxtAddress3() {
		return txtAddress3;
	}
 
 
	public WebElement getState_dropdown() {
		return State_dropdown;
	}
 
 
	public WebElement getState_dropdown_value() {
		return State_dropdown_value;
	}
 
 
	public WebElement getCity_dropdown() {
		return City_dropdown;
	}
 
 
	public WebElement getCity_dropdown_Value() {
		return City_dropdown_Value;
	}
 
 
	public WebElement getTxtPinCode() {
		return txtPinCode;
	}
 
 
	public WebElement getTxtpanNumber() {
		return txtpanNumber;
	}
 
 
	public WebElement getFSSAIType_dropdown() {
		return FSSAIType_dropdown;
	}
 
 
	public WebElement getFSSAIType_dropdown_Value() {
		return FSSAIType_dropdown_Value;
	}
 
 
	public WebElement getTxtFSSAILicense() {
		return txtFSSAILicense;
	}
 
 
	public WebElement getTxtFSSAILicense_dateInput() {
		return txtFSSAILicense_dateInput;
	}
 
 
	@FindBy(how = How.XPATH, using = "//div[@id='ParentMasterContentPlaceHolder1_divUserBody']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlArea']")
	private WebElement Sales_Hierarchy_dropdown;
	
	
 
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlArea_DropDown']//ul//li[1]")
	private WebElement Sales_Hierarchy_Value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtDistributorCode']")
	private WebElement DistributorCode;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtDistributorName']")
	private WebElement DistributorName;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ParentMasterContentPlaceHolder1_category']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributorCategory']")
	private WebElement DistributorCategory;
	
	
	@FindBy(how = How.XPATH, using = "//label[normalize-space()='Modern Trade']")
	private WebElement ModernTrade_CheckBox;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ParentMasterContentPlaceHolder1_DepotCodeDiv']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDepot']")
	private WebElement DepoCode;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDepot_DropDown']//ul//li[1]")
	private WebElement DepoCode_value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtContactPersonName']")
	private WebElement txtContactPersonName;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtContactNumber']")
	private WebElement txtContactNumber;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtEmail']")
	private WebElement txtEmail;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtAddress1']")
	private WebElement txtAddress1;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtAddress2']")
	private WebElement txtAddress2;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtAddress3']")
	private WebElement txtAddress3;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-3 mb-2']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlState']")
	private WebElement State_dropdown;
	
 
	//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlState_DropDown']//ul//li[15]
	//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlState_DropDown']//ul//li[normalize-space()='Maharashtra']
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlState_DropDown']//ul//li[normalize-space()='Maharashtra']")
	private WebElement State_dropdown_value;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-box mb-3']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlCity']")
	private WebElement City_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlCity_DropDown']//ul//li[1]")
	private WebElement City_dropdown_Value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtPinCode']")
	private WebElement txtPinCode;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtpanNumber']")
	private WebElement txtpanNumber;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-3 mb-2']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFSSAIType']")
	private WebElement FSSAIType_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFSSAIType_DropDown']//ul//li[1]")
	private WebElement FSSAIType_dropdown_Value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtFSSAILicense']")
	private WebElement txtFSSAILicense;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_dtpFSSAIExpiry_dateInput']")
	private WebElement txtFSSAILicense_dateInput;
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGstType']")
	private WebElement GstType_dropdown;
	
	
	public WebElement getGstType_dropdown() {
		return GstType_dropdown;
	}
 
 
	public WebElement getGstType_dropdown_value() {
		return GstType_dropdown_value;
	}
 
 
	public WebElement getTxtGSTNumber() {
		return txtGSTNumber;
	}
 
 
	public WebElement getGSTState_dropdown() {
		return GSTState_dropdown;
	}
 
 
	public WebElement getGSTState_dropdown_values() {
		return GSTState_dropdown_values;
	}
 
 
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGstType_DropDown']//ul//li)[2]")
	private WebElement GstType_dropdown_value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtGSTNumber']")
	private WebElement txtGSTNumber;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGSTState']")
	private WebElement GSTState_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGSTState_DropDown']//ul//li[normalize-space()='Maharashtra']")
	private WebElement GSTState_dropdown_values;
	
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_dtpFSSAIExpiry_dateInput']")
	private WebElement FSSAI_ExpiryDate;


	public WebElement getFSSAI_ExpiryDate() {
		return FSSAI_ExpiryDate;
	}
	
	


	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-link btn-block text-left label_default collapsed']")

	private WebElement Godown_Address;
	
	
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
 
 
	public WebElement getPinCode() {
		return PinCode;
	}
 
 
	public WebElement getSave_btn() {
		return Save_btn;
	}
 
 
	public WebElement getClose_btn() {
		return Close_btn;
	}
 
 

	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtGD1ShippingAddressName1']")
	private WebElement ShippingAddressName;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtGD1ShippingAddLine1']")
	private WebElement ShippingAddress;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-box mb-3']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGD1State']")
	private WebElement Godown_state;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGD1State_DropDown']//ul//li[normalize-space()='Maharashtra']")
	private WebElement Godown_state_value;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-box mb-3']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGD1City']")
	private WebElement Godown_City;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGD1City_DropDown']//ul//li[normalize-space()='Achalpur']")
	private WebElement Godown_City_Value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtGD1PinCode']")
	private WebElement PinCode;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnSave']")
	private WebElement Save_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Close_btn;
	
	
	
	
	
	
	
	
	
	
	
	
}
 