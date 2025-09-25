package Admin_Masters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Depot_Master_Main {
	
	
	WebDriver driver;
	
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getDepot_Master_submenu() {
		return Depot_Master_submenu;
	}


	public WebElement getDepot_Master() {
		return Depot_Master;
	}


	public WebElement getAdd_btn() {
		return Add_btn;
	}


	public WebElement getDepotCode() {
		return DepotCode;
	}


	public WebElement getDepotName() {
		return DepotName;
	}


	public WebElement getContactPerson() {
		return ContactPerson;
	}


	public WebElement getUserId() {
		return userId;
	}


	public WebElement getEmail() {
		return Email;
	}


	public WebElement getMobile() {
		return Mobile;
	}


	public WebElement getAddress1() {
		return Address1;
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


	public WebElement getCity_dropdown_value() {
		return City_dropdown_value;
	}


	public WebElement getPinCode() {
		return PinCode;
	}


	public WebElement getGstType_dropdown() {
		return GstType_dropdown;
	}


	public WebElement getGstType_dropdown_value() {
		return GstType_dropdown_value;
	}


	public WebElement getGstNumber() {
		return gstNumber;
	}


	public WebElement getFSSAIType_dropdown() {
		return FSSAIType_dropdown;
	}


	public WebElement getFSSAIType_dropdown_value() {
		return FSSAIType_dropdown_value;
	}


	public WebElement getFSSAILicense() {
		return FSSAILicense;
	}


	public WebElement getFSSAIExpiry_dateInput() {
		return FSSAIExpiry_dateInput;
	}


	public WebElement getSave_btn() {
		return Save_btn;
	}


	public WebElement getClose_btn() {
		return Close_btn;
	}


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Depot Master']")
	private WebElement Depot_Master_submenu;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Depot Creation']")
	private WebElement Depot_Master;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnAdd']")
	private WebElement Add_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtDepotCode']")
	private WebElement DepotCode;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtDepotName']")
	private WebElement DepotName;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtContactPerson']")
	private WebElement ContactPerson;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtuserId']")
	private WebElement userId;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtEmail']")
	private WebElement Email;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtMobile']")
	private WebElement Mobile;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtAddress1']")
	private WebElement Address1;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlState']")
	private WebElement State_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlState_DropDown']//ul//li[normalize-space()='Maharashtra']")
	private WebElement State_dropdown_value;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlCity']")
	private WebElement City_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlCity_DropDown']//ul//li[normalize-space()='Mumbai']")
	private WebElement City_dropdown_value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtPinCode']")
	private WebElement PinCode;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGstType']")
	private WebElement GstType_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlGstType_DropDown']//ul//li)[2]")
	private WebElement GstType_dropdown_value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtgstNumbers']")
	private WebElement gstNumber;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFSSAIType']")
	private WebElement FSSAIType_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFSSAIType_DropDown']//ul//li)[1]")
	private WebElement FSSAIType_dropdown_value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtFSSAILicense']")
	private WebElement FSSAILicense;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_dtpFSSAIExpiry_dateInput']")
	private WebElement FSSAIExpiry_dateInput;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnSave']")
	private WebElement Save_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Close_btn;
	
	
	
	
	
	
	
	

}
