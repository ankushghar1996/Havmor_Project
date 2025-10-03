package ZSM_Portal_Main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DEDC_Approval_ZSM_Main {

	
	
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


	public WebElement getGrid_Data() {
		return Grid_Data;
	}


	public WebElement getBtnApproval() {
		return BtnApproval;
	}


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='DEDC']")
	private WebElement DEDC_SubMenu;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='DEDC Approval']")
	private WebElement DEDC_Approval;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGridSalesmanMaster_GridData']//table//tbody//tr)[1]")
	private WebElement Grid_Data;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnApproval']")
	private WebElement BtnApproval;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
