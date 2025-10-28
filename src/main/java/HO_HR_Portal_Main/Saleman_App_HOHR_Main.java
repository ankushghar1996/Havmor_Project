package HO_HR_Portal_Main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Saleman_App_HOHR_Main {
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Master']")
	private WebElement Master_Menu;
	
	
	public WebElement getMaster_Menu() {
		return Master_Menu;
	}


	public WebElement getSalesman_SubMenu() {
		return Salesman_SubMenu;
	}


	public WebElement getSalesman_Approval() {
		return Salesman_Approval;
	}


	public WebElement getGrid_Data() {
		return Grid_Data;
	}


	public WebElement getBtnApproval() {
		return BtnApproval;
	}


	public WebElement getAction_View() {
		return Action_View;
	}


	public WebElement getBtnProceedForApproval() {
		return btnProceedForApproval;
	}


	public WebElement getBtnReject() {
		return btnReject;
	}


	public WebElement getBtnClose() {
		return btnClose;
	}


	public WebElement getBtnYes() {
		return btnYes;
	}


	public WebElement getBtnNo() {
		return btnNo;
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


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Salesman Master']")
	private WebElement Salesman_SubMenu;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Salesman Approval']")
	private WebElement Salesman_Approval;
	
	
	@FindBy(how = How.XPATH, using = "//table[@class='rgMasterTable rgClipCells']//child::td//a[@id='ctl00_ParentMasterContentPlaceHolder1_radGridSalesmanMaster_ctl00_ctl04_BtnApproval']")
	private WebElement Grid_Data;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnApproval']")
	private WebElement BtnApproval;
	
	
	@FindBy(how = How.XPATH, using = "//a[@id='ctl00_ParentMasterContentPlaceHolder1_radGridSalesmanMaster_ctl00_ctl04_BtnView']//i[@title='View']")
	private WebElement Action_View;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnProceedForApproval']")
	private WebElement btnProceedForApproval;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnReject']")
	private WebElement btnReject;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement btnClose;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnYes']")
	private WebElement btnYes;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnNo']")
	private WebElement btnNo;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-sm-10']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRejectReason']")
	private WebElement RejectReason_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRejectReason_DropDown']//ul//li[normalize-space()='Address proof / ID proof not valid']")
	private WebElement RejectReason_dropdown_Value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnRejectYes']")
	private WebElement btnRejectYes;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_Button1']")
	private WebElement btnRejectNo;
	
	
	
	
	
	
	
	
	
	
	
	
	

}
