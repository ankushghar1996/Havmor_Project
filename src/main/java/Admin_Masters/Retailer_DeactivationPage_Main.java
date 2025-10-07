package Admin_Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Retailer_DeactivationPage_Main {

	
	@FindBy(how = How.XPATH, using = "(//ul[@class='nav nav-treeview']/li[@class='nav-item menu-is-opening menu-open']//p[normalize-space()='Deactivation Approval'])")
	private WebElement Deactivation_Approval;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRejectReason']//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRejectReason_Input']")
	private WebElement Select_Deactivate_Reason_Dropdown;
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRejectReason_DropDown']//li)[1]")
	private WebElement Select_Deactivate_Reason_Dropdown_Value;
	
	@FindBy(how = How.XPATH, using = "//div[@class='modal-footer']//button[text()='No']")
	private WebElement No_Button;
	
	@FindBy(how = How.XPATH, using = "(//table[@class='rgMasterTable rgClipCells']//td//a)[18]")
	private WebElement Deactivate_BTN;
	
	@FindBy(how = How.XPATH, using = "//div[@class='modal-footer']//input[@id='ParentMasterContentPlaceHolder1_btnYes']")
	private WebElement Yes_Button;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Retailer Creation']")
	private WebElement Retailer_Creation;
	
	public WebElement getDeactivation_Approval() {
		return Deactivation_Approval;
	}


	public WebElement getBtnApproval() {
		return BtnApproval;
	}


	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnApproval']")
	private WebElement BtnApproval;


	public WebElement getSelect_Deactivate_Reason_Dropdown() {
		return Select_Deactivate_Reason_Dropdown;
	}


	public WebElement getSelect_Deactivate_Reason_Dropdown_Value() {
		return Select_Deactivate_Reason_Dropdown_Value;
	}


	public WebElement getNo_Button() {
		return No_Button;
	}


	public WebElement getYes_Button() {
		return Yes_Button;
	}


	public WebElement getDistributor_Creation() {
		return Retailer_Creation;
	}


	public WebElement getDeactivate_BTN() {
		return Deactivate_BTN;
	}


	public WebElement getRetailer_Creation() {
		return Retailer_Creation;
	}
	
	
	
	
	
	
	
}
