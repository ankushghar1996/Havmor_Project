package Admin_Settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Attribute_Master_Main {
	
	
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "(//p[normalize-space()='Attribute Master'])[1]")
	private WebElement Attribute_Master_menu;
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAttribute_Master_menu() {
		return Attribute_Master_menu;
	}

	public WebElement getAttribute_Master_submenu() {
		return Attribute_Master_submenu;
	}

	public WebElement getAdd_btn() {
		return Add_btn;
	}

	public WebElement getAttributeFor_dropdown() {
		return AttributeFor_dropdown;
	}

	public WebElement getAttributeFor_dropdown_value() {
		return AttributeFor_dropdown_value;
	}

	public WebElement getAttribute_dropdown() {
		return Attribute_dropdown;
	}

	public WebElement getAttribute_dropdown_value() {
		return Attribute_dropdown_value;
	}

	public WebElement getSingle_radioBtn() {
		return Single_radioBtn;
	}

	public WebElement getMultiple_radioBtn() {
		return Multiple_radioBtn;
	}

	public WebElement getMandatory_CheckBox() {
		return Mandatory_CheckBox;
	}

	public WebElement getTxtValue() {
		return txtValue;
	}

	public WebElement getSave_btn() {
		return Save_btn;
	}

	public WebElement getClose_btn() {
		return Close_btn;
	}

	public WebElement getAdd_LinkBtn() {
		return Add_LinkBtn;
	}

	public WebElement getCancel_LinkBtn() {
		return Cancel_LinkBtn;
	}

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Attribute Creation']")
	private WebElement Attribute_Master_submenu;
	
	
	@FindBy(how = How.XPATH, using = "//button[@id='btnAddAreaModal']")
	private WebElement Add_btn;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12 mb-3']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAttributeFor']")
	private WebElement AttributeFor_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAttributeFor_DropDown']//ul//li)[1]")
	private WebElement AttributeFor_dropdown_value;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12 mb-3']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAttributes']")
	private WebElement Attribute_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAttributes_DropDown']//ul//li)[1]")
	private WebElement Attribute_dropdown_value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_rbSingle']")
	private WebElement Single_radioBtn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_rbMultiple']")
	private WebElement Multiple_radioBtn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_chkMandatory']")
	private WebElement Mandatory_CheckBox;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtValue']")
	private WebElement txtValue;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnSave']")
	private WebElement Save_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Close_btn;
	
	
	@FindBy(how = How.XPATH, using = "//a[@id='lnkAddAttribute']")
	private WebElement Add_LinkBtn;
	//a[@id='lnkAddAttribute']
	//a[@id='lnkCancelAttribute']
	
	@FindBy(how = How.XPATH, using = "//a[@id='lnkCancelAttribute']")
	private WebElement Cancel_LinkBtn;
	
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGridAttributeCreation_GridData']//a[contains(@id,'ctl00_ParentMasterContentPlaceHolder1_radGridAttributeCreation_ctl00_ctl04_BtnDeactivate')]")
	private WebElement Deactivate_btn;
	
	
	public WebElement getDeactivate_btn() {
		return Deactivate_btn;
	}

	public WebElement getYes() {
		return Yes;
	}

	public WebElement getCloseDeactivate_btn() {
		return CloseDeactivate_btn;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnYes']")
	private WebElement Yes;
	
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Close']")
	private WebElement CloseDeactivate_btn;
	
	
	
	
	
	
	
	
	

}
