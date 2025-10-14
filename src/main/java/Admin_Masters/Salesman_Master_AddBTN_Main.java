package Admin_Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Salesman_Master_AddBTN_Main {

	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnAdd']")
	private WebElement Add_Button;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnSave']")
	private WebElement Save_Button;
	
	public WebElement getSave_Button() {
		return Save_Button;
	}

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Salesman Creation']")
	private WebElement Salesman_Master;
	
	public WebElement getSalesman_Master() {
		return Salesman_Master;
	}

	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlTypeCreation']")
	private WebElement Creation_Type ;
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlTypeCreation_DropDown']//ul//li)[1]")
	private WebElement Creation_Type_Value ;
	
	@FindBy(how = How.XPATH, using = "//span[@id='ctl00_ParentMasterContentPlaceHolder1_ddlChannelType_Arrow']")
	private WebElement Channel_Type;
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlChannelType_DropDown']//ul//li)[1]")
	private WebElement Channel_Type_Value;
	
	@FindBy(how = How.XPATH, using = "//span[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSalesmanType_Arrow']")
	private WebElement Salesman_Type ;
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSalesmanType_DropDown']//ul//li)[2]")
	private WebElement Salesman_Type_Value ;
	
	@FindBy(how = How.XPATH, using = "//span[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributor_Arrow']")
	private WebElement Distributor ;
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributor_DropDown']//ul//li)[1]")
	private WebElement Distributor_Value ;
	
	@FindBy(how = How.XPATH, using = "//span[@id='ctl00_ParentMasterContentPlaceHolder1_ddlState_Arrow']")
	private WebElement State ;
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlState_DropDown']//ul//li)[21]")
	private WebElement State_Value ;
	
	@FindBy(how = How.XPATH, using = "//span[@id='ctl00_ParentMasterContentPlaceHolder1_ddlTown_Arrow']")
	private WebElement Town ;
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlTown_DropDown']//ul//li)[36]")
	private WebElement Town_Value ;
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-box mb-3']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlBankName']")
	private WebElement Bank_Name ;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@id,'ddlBankName_DropDown')]//li[contains(text(),'ABHYUDAYA CO-OP BANK LTD')]")
	private WebElement Bank_Name_Value;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Close_Button;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtEmployeeCode']")
	private WebElement Employee_Code_UserId_Textbox_EXCEL;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtSalesmanName']")
	private WebElement Salesman_Name_Textbox_EXCEL;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtAddress1']")
	private WebElement Address1_Textbox_EXCEL;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtPinCode']")
	private WebElement Pincode_Textbox_EXCEL;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtMobile']")
	private WebElement Mobile_Number_Textbox_EXCEL;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtEmailId']")
	private WebElement Email_ID_Textbox_EXCEL;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtAadhaarNo']")
	private WebElement Adhar_Number_Textbox_EXCEL;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtPanNo']")
	private WebElement Pan_Number_Textbox_EXCEL;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtAccountHolderName']")
	private WebElement Account_Holder_Name_Textbox_EXCEL;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtBankAccountNo']")
	private WebElement Bank_Account_Number_Textbox_EXCEL;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtBankIfscCode']")
	private WebElement Bank_IFSC_Code_Textbox_EXCEL;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtBranchName']")
	private WebElement Branch_Name_Textbox_EXCEL;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtSalaryContribution']")
	private WebElement Salary_Contribution_Textbox_EXCEL;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtDistributionContribution']")
	private WebElement Distributor_Contribution_Textbox_EXCEL;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtCompanyContribution']")
	private WebElement Company_Contribution_Textbox_EXCEL;

	public WebElement getAdd_Button() {
		return Add_Button;
	}

	public WebElement getCreation_Type() {
		return Creation_Type;
	}

	public WebElement getCreation_Type_Value() {
		return Creation_Type_Value;
	}

	public WebElement getChannel_Type() {
		return Channel_Type;
	}

	public WebElement getChannel_Type_Value() {
		return Channel_Type_Value;
	}

	public WebElement getSalesman_Type() {
		return Salesman_Type;
	}

	public WebElement getSalesman_Type_Value() {
		return Salesman_Type_Value;
	}

	public WebElement getDistributor() {
		return Distributor;
	}

	public WebElement getDistributor_Value() {
		return Distributor_Value;
	}

	public WebElement getState() {
		return State;
	}

	public WebElement getState_Value() {
		return State_Value;
	}

	public WebElement getTown() {
		return Town;
	}

	public WebElement getTown_Value() {
		return Town_Value;
	}

	public WebElement getBank_Name() {
		return Bank_Name;
	}

	public WebElement getBank_Name_Value() {
		return Bank_Name_Value;
	}

	public WebElement getClose_Button() {
		return Close_Button;
	}

	public WebElement getEmployee_Code_UserId_Textbox_EXCEL() {
		return Employee_Code_UserId_Textbox_EXCEL;
	}

	public WebElement getSalesman_Name_Textbox_EXCEL() {
		return Salesman_Name_Textbox_EXCEL;
	}

	public WebElement getAddress1_Textbox_EXCEL() {
		return Address1_Textbox_EXCEL;
	}

	public WebElement getPincode_Textbox_EXCEL() {
		return Pincode_Textbox_EXCEL;
	}

	public WebElement getMobile_Number_Textbox_EXCEL() {
		return Mobile_Number_Textbox_EXCEL;
	}

	public WebElement getEmail_ID_Textbox_EXCEL() {
		return Email_ID_Textbox_EXCEL;
	}

	public WebElement getAdhar_Number_Textbox_EXCEL() {
		return Adhar_Number_Textbox_EXCEL;
	}

	public WebElement getPan_Number_Textbox_EXCEL() {
		return Pan_Number_Textbox_EXCEL;
	}

	public WebElement getAccount_Holder_Name_Textbox_EXCEL() {
		return Account_Holder_Name_Textbox_EXCEL;
	}

	public WebElement getBank_Account_Number_Textbox_EXCEL() {
		return Bank_Account_Number_Textbox_EXCEL;
	}

	public WebElement getBank_IFSC_Code_Textbox_EXCEL() {
		return Bank_IFSC_Code_Textbox_EXCEL;
	}

	public WebElement getBranch_Name_Textbox_EXCEL() {
		return Branch_Name_Textbox_EXCEL;
	}

	public WebElement getSalary_Contribution_Textbox_EXCEL() {
		return Salary_Contribution_Textbox_EXCEL;
	}

	public WebElement getDistributor_Contribution_Textbox_EXCEL() {
		return Distributor_Contribution_Textbox_EXCEL;
	}

	public WebElement getCompany_Contribution_Textbox_EXCEL() {
		return Company_Contribution_Textbox_EXCEL;
	}
	

	
	// Transfer btn xpath

	
	@FindBy(how = How.XPATH, using = "(//div[contains(@id,'ctl00_ParentMasterContentPlaceHolder1_radGridSalesmanMaster_GridData')]//table//tr//td//a)[5]")
	private WebElement Action_transfer_btn;
	
	
	public WebElement getAction_transfer_btn() {
		return Action_transfer_btn;
	}

	public WebElement getAction_reset_btn() {
		return Action_reset_btn;
	}

	public WebElement getAction_deactivate_btn() {
		return Action_deactivate_btn;
	}

	public WebElement getAction_Edit_btn() {
		return Action_Edit_btn;
	}

	public WebElement getAction_View_btn() {
		return Action_View_btn;
	}

	public WebElement getAction_Close_btn() {
		return Action_Close_btn;
	}

	public WebElement getTransfer_Approve_btn() {
		return Transfer_Approve_btn;
	}

	public WebElement getTransfer_Rejection_btn() {
		return Transfer_Rejection_btn;
	}

	public WebElement getTransfer_Close_btn() {
		return Transfer_Close_btn;
	}

	public WebElement getTransfer_ApproveYes_btn() {
		return Transfer_ApproveYes_btn;
	}

	public WebElement getTransfer_ApproveNo_btn() {
		return Transfer_ApproveNo_btn;
	}

	public WebElement getRejectReason_dropdown() {
		return RejectReason_dropdown;
	}

	public WebElement getRejectReasonValue_DropDown() {
		return RejectReasonValue_DropDown;
	}

	public WebElement getTransfer_RejectYes_btn() {
		return Transfer_RejectYes_btn;
	}

	public WebElement getTransfer_RejectNo_btn() {
		return Transfer_RejectNo_btn;
	}

	@FindBy(how = How.XPATH, using = "(//div[contains(@id,'ctl00_ParentMasterContentPlaceHolder1_radGridSalesmanMaster_GridData')]//table//tr//td//a)[4]")
	private WebElement Action_reset_btn;
	
	
	@FindBy(how = How.XPATH, using = "(//div[contains(@id,'ctl00_ParentMasterContentPlaceHolder1_radGridSalesmanMaster_GridData')]//table//tr//td//a)[3]")
	private WebElement Action_deactivate_btn;
	
	
	@FindBy(how = How.XPATH, using = "(//div[contains(@id,'ctl00_ParentMasterContentPlaceHolder1_radGridSalesmanMaster_GridData')]//table//tr//td//a)[2]")
	private WebElement Action_Edit_btn;
	
	
	@FindBy(how = How.XPATH, using = "(//div[contains(@id,'ctl00_ParentMasterContentPlaceHolder1_radGridSalesmanMaster_GridData')]//table//tr//td//a)[1]")
	private WebElement Action_View_btn;
	
	//input[@id='ParentMasterContentPlaceHolder1_btnClose']
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Action_Close_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnApproval']")
	private WebElement Transfer_Approve_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnRejection']")
	private WebElement Transfer_Rejection_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Transfer_Close_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnApproveYes']")
	private WebElement Transfer_ApproveYes_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnNo']")
	private WebElement Transfer_ApproveNo_btn;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='form-group row']//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRejectReason']")
	private WebElement RejectReason_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlRejectReason_DropDown']//ul//li)[1]")
	private WebElement RejectReasonValue_DropDown;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnRejectYes']")
	private WebElement Transfer_RejectYes_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnRejectNo']")
	private WebElement Transfer_RejectNo_btn;
	
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnExport']")
	private WebElement download_btn;

	public WebElement getDownload_btn() {
		return download_btn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Employee Code/UserId 


	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtUserId']")
	private WebElement txtUserId;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_chkSFAApplicationDisable']")
	private WebElement Mobile_Checkbox;

	public WebElement getTxtUserId() {
		return txtUserId;
	}

	public WebElement getMobile_Checkbox() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
