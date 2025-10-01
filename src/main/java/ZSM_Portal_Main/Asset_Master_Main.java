package ZSM_Portal_Main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Asset_Master_Main {
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Asset']")
	private WebElement Asset_Menu;
	
	
	public WebElement getAsset_Menu() {
		return Asset_Menu;
	}


	public WebElement getAsset_Master_SubMenu() {
		return Asset_Master_SubMenu;
	}


	public WebElement getAsset_Approval() {
		return Asset_Approval;
	}


	public WebElement getGrid_Data() {
		return Grid_Data;
	}


	public WebElement getBtnApproval() {
		return BtnApproval;
	}


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Asset Master']")
	private WebElement Asset_Master_SubMenu;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Asset Approval']")
	private WebElement Asset_Approval;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGridSalesmanMaster_GridData']//table//tbody//tr)[1]")
	private WebElement Grid_Data;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnApproval']")
	private WebElement BtnApproval;
	
	
	
	
	
	
	
	

}
