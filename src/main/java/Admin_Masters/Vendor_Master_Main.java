package Admin_Masters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Vendor_Master_Main {
	
	
	WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getVendor_Master() {
		return Vendor_Master;
	}


	public WebElement getAdd_btn() {
		return Add_btn;
	}


	public WebElement getVendorType() {
		return VendorType;
	}


	public WebElement getVendorType_value() {
		return VendorType_value;
	}


	public WebElement getUserID() {
		return UserID;
	}


	public WebElement getVendorName() {
		return VendorName;
	}


	public WebElement getVendorIDFrmSAP() {
		return VendorIDFrmSAP;
	}


	public WebElement getEmailID() {
		return EmailID;
	}


	public WebElement getMobile() {
		return Mobile;
	}


	public WebElement getGSTNo() {
		return GSTNo;
	}


	public WebElement getAddress() {
		return Address;
	}


	public WebElement getAddress2() {
		return Address2;
	}


	public WebElement getState_dropdown() {
		return State_dropdown;
	}


	public WebElement getState_dropdown_value() {
		return State_dropdown_value;
	}


	public WebElement getTown_dropdown() {
		return Town_dropdown;
	}


	public WebElement getTown_dropdown_value() {
		return Town_dropdown_value;
	}


	public WebElement getPincode() {
		return Pincode;
	}


	public WebElement getSave_btn() {
		return Save_btn;
	}


	public WebElement getClose_btn() {
		return Close_btn;
	}


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Vendor Creation']")
	private WebElement Vendor_Master;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnAdd']")
	private WebElement Add_btn;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlVendorType']")
	private WebElement VendorType;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlVendorType_DropDown']//ul//li[normalize-space()='Manufacturer']")
	private WebElement VendorType_value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtUserID']")
	private WebElement UserID;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtVendorName']")
	private WebElement VendorName;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtVendorIDFrmSAP']")
	private WebElement VendorIDFrmSAP;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtEmailID']")
	private WebElement EmailID;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtMobile']")
	private WebElement Mobile;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtGSTNo']")
	private WebElement GSTNo;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtAddress']")
	private WebElement Address;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtAdd2']")
	private WebElement Address2;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlState']")
	private WebElement State_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlState_DropDown']//ul//li[normalize-space()='Maharashtra']")
	private WebElement State_dropdown_value;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlTown']")
	private WebElement Town_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlTown_DropDown']//ul//li[normalize-space()='Mumbai']")
	private WebElement Town_dropdown_value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtPincode']")
	private WebElement Pincode;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnVendorSave']")
	private WebElement Save_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnModalClose']")
	private WebElement Close_btn;
	
	
	public WebElement getVendor_Master_submenu() {
		return Vendor_Master_submenu;
	}


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Vendor Master']")
	private WebElement Vendor_Master_submenu;
	
	
	
	
	
	
	
	
	

}
