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
	
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='nav nav-treeview']/li[@class='nav-item menu-is-opening menu-open']//p[normalize-space()='Distributor Master'])[2]")
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
	
	

	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlArea_DropDown']//child::ul//li[normalize-space()='Mumbai']")
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
	

	
	//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlState_DropDown']//ul//li[normalize-space()='Maharashtra']
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlState_DropDown']//ul//li[15]")
	private WebElement State_dropdown_value;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-box mb-3']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlCity']")
	private WebElement City_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlCity_DropDown']//ul//li[normalize-space()='Mumbai']")
	private WebElement City_dropdown_Value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtPinCode']")
	private WebElement txtPinCode;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtpanNumber']")
	private WebElement txtpanNumber;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-box mb-3']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFSSAIType']")
	private WebElement FSSAIType_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFSSAIType_DropDown']//ul//li[normalize-space()='State']")
	private WebElement FSSAIType_dropdown_Value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtFSSAILicense']")
	private WebElement txtFSSAILicense;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_dtpFSSAIExpiry_dateInput']")
	private WebElement txtFSSAILicense_dateInput;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
