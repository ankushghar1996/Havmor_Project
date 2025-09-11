package Admin_Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class User_master_Add_BTN_Main {

	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnAdd']")
	private WebElement Add_Button;
	
	public WebElement getUser_Master() {
		return User_Master;
	}

	@FindBy(how = How.XPATH, using = "(//p[text()='User Master'])[2]")
	private WebElement User_Master;
		
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12']//child::div//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserType']")
	private WebElement User_Type_Dropdown;
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlUserType_DropDown']//ul//li)[1]")
	private WebElement User_Type_Dropdown_Value;
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12']//child::div//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDivision']")
	private WebElement Division;
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDivision_DropDown']//ul//li)[1]")
	private WebElement Division_Value;
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12']//child::div//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlArea']")
	private WebElement Sales_Hierarchy ;
	
	@FindBy(how = How.XPATH, using = "")
	private WebElement Sales_Hierarchy_Value;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtUserId']")
	private WebElement User_ID_Textbox_EXCEL;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtName']")
	private WebElement Name_Textbox_EXCEL;
	
	public WebElement getMobile_Textbox_EXCEL() {
		return Mobile_Textbox_EXCEL;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtMobileNo']")
	private WebElement Mobile_Textbox_EXCEL;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtEmail']")
	private WebElement Email_Textbox_EXCEL;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnSave']")
	private WebElement Save_Button;
	
	public WebElement getAdd_Button() {
		return Add_Button;
	}

	public WebElement getUser_Type_Dropdown() {
		return User_Type_Dropdown;
	}

	public WebElement getUser_Type_Dropdown_Value() {
		return User_Type_Dropdown_Value;
	}

	public WebElement getDivision() {
		return Division;
	}

	public WebElement getDivision_Value() {
		return Division_Value;
	}

	public WebElement getSales_Hierarchy() {
		return Sales_Hierarchy;
	}

	public WebElement getSales_Hierarchy_Value() {
		return Sales_Hierarchy_Value;
	}

	public WebElement getUser_ID_Textbox_EXCEL() {
		return User_ID_Textbox_EXCEL;
	}

	public WebElement getName_Textbox_EXCEL() {
		return Name_Textbox_EXCEL;
	}

	public WebElement getEmail_Textbox_EXCEL() {
		return Email_Textbox_EXCEL;
	}

	public WebElement getSave_Button() {
		return Save_Button;
	}

	public WebElement getClose_Button() {
		return Close_Button;
	}

	@FindBy(how = How.XPATH, using = "")
	private WebElement Close_Button;

	
}
