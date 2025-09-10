package Admin_Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Vendor_Master_Main {
	
	
	@FindBy(how = How.XPATH, using = "(//p[contains(text(),'Vendor Master')])[2]")
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
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlTown']")
	private WebElement Town_dropdown_value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtPincode']")
	private WebElement Pincode;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnVendorSave']")
	private WebElement Save_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnModalClose']")
	private WebElement Close_btn;
	
	
	
	
	
	
	
	
	
	
	
	

}
