package RSM_Portal_Main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DEDC_Approval_Main {

	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Scheme']")
	private WebElement Scheme_Menu;
	
	
	public WebElement getScheme_Menu() {
		return Scheme_Menu;
	}


	public WebElement getDEDC_SubMenu() {
		return DEDC_SubMenu;
	}


	public WebElement getDEDC_Approval() {
		return DEDC_Approval;
	}


	public WebElement getGrid_data() {
		return Grid_data;
	}


	public WebElement getApprove_btn() {
		return Approve_btn;
	}


	public WebElement getReject_btn() {
		return Reject_btn;
	}


	public WebElement getClose_btn() {
		return Close_btn;
	}


	public WebElement getApprove_BtnYes() {
		return Approve_BtnYes;
	}


	public WebElement getApprove_BtnNo() {
		return Approve_BtnNo;
	}


	public WebElement getRejectReason_dropdown() {
		return RejectReason_dropdown;
	}


	public WebElement getRejectReason_dropdown_Value() {
		return RejectReason_dropdown_Value;
	}


	public WebElement getBtnRejectYes() {
		return btnRejectYes;
	}


	public WebElement getBtnRejectNo() {
		return btnRejectNo;
	}


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='DEDC']")
	private WebElement DEDC_SubMenu;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='DEDC Approval']")
	private WebElement DEDC_Approval;
	
	
	@FindBy(how = How.XPATH, using = "//table[@class='rgMasterTable rgClipCells']//child::td//a[@id='ctl00_ParentMasterContentPlaceHolder1_radGridDEDCApprovalMaster_ctl00_ctl04_BtnView']")
	private WebElement Grid_data;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnApprove']")
	private WebElement Approve_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnReject']")
	private WebElement Reject_btn;
	
	
	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Close']")
	private WebElement Close_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnYes']")
	private WebElement Approve_BtnYes;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_Button1']")
	private WebElement Approve_BtnNo;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-10']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRejectReason']")
	private WebElement RejectReason_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRejectReason_DropDown']//ul//li[1]")
	private WebElement RejectReason_dropdown_Value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnRejectYes']")
	private WebElement btnRejectYes;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_Button2']")
	private WebElement btnRejectNo;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
