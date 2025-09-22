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

	@FindBy(how = How.XPATH, using = "(//div[@id='mainDiv']//p[text()='Salesman Master'])[2]")
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
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSalesmanType_DropDown']//ul//li)[1]")
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
	
	@FindBy(how = How.XPATH, using = "//span[@id='ctl00_ParentMasterContentPlaceHolder1_ddlBankName_Arrow']")
	private WebElement Bank_Name ;
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlBankName_DropDown']//ul//li)[49]")
	private WebElement Bank_Name_Value;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Close_Button;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtEmployeeCode']")
	private WebElement Employee_Code_UserId_Textbox_EXCEL;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtUserId']")
	private WebElement UserId_Textbox_EXCEL;
	
	public WebElement getUserId_Textbox_EXCEL() {
		return UserId_Textbox_EXCEL;
	}

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
	

	
	
	//Employee Code/UserId 

	
	
	
}
