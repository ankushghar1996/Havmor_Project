package Admin_Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Depot_Select_Sales_Hierarchy_Main {

	
	@FindBy(how = How.XPATH, using = "(//ul[@class='nav nav-treeview']/li[@class='nav-item menu-is-opening menu-open']//p[normalize-space()='Deactivation Approval'])")
	private WebElement Deactivation_Approval;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRejectReason']//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRejectReason_Input']")
	private WebElement Select_Deactivate_Reason_Dropdown;
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRejectReason_DropDown']//li)[1]")
	private WebElement Select_Deactivate_Reason_Dropdown_Value;
	
	@FindBy(how = How.XPATH, using = "//div[@class='modal-footer']//button[text()='No']")
	private WebElement No_Button;
	
	@FindBy(how = How.XPATH, using = "(//table[@class='rgMasterTable rgClipCells']//td//a)[3]")
	private WebElement Deactivate_BTN;
	
	@FindBy(how = How.XPATH, using = "//div[@class='modal-footer']//input[@id='ParentMasterContentPlaceHolder1_btnYes']")
	private WebElement Yes_Button;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Depot Creation']")
	private WebElement Depot_Creation;
	
	@FindBy(how = How.XPATH, using = "(//table[@class='rgMasterTable rgClipCells']//tr//td//a)[3]")
	private WebElement Depot_Creation_View_Button;
	
	@FindBy(how = How.XPATH, using = "(//table[@class='rgMasterTable rgClipCells']//tr//td//a)[1]")
	private WebElement Depot_Creation_Sales_Hirarchy;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Depot_Creation_Close_Button;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_Btnsave']")
	private WebElement Depot_Creation_Save_Button;
	
	
	
	//input[@id='ParentMasterContentPlaceHolder1_btnClose']
	
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





	public WebElement getDeactivate_BTN() {
		return Deactivate_BTN;
	}


	public WebElement getDepot_Creation() {
		return Depot_Creation;
	}


	public WebElement getDepot_Creation_View_Button() {
		return Depot_Creation_View_Button;
	}


	public WebElement getDepot_Creation_Close_Button() {
		return Depot_Creation_Close_Button;
	}


	public WebElement getDepot_Creation_Sales_Hirarchy() {
		return Depot_Creation_Sales_Hirarchy;
	}


	public WebElement getDepot_Creation_Save_Button() {
		return Depot_Creation_Save_Button;
	}
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
