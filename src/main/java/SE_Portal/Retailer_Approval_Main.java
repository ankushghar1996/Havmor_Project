package SE_Portal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Retailer_Approval_Main {
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Master']")
	private WebElement Master_Menu;
	
	
	public WebElement getMaster_Menu() {
		return Master_Menu;
	}


	public WebElement getRetailer_Master_SubMenu() {
		return Retailer_Master_SubMenu;
	}


	public WebElement getRetailer_Approval() {
		return Retailer_Approval;
	}


	public WebElement getGrid_Data() {
		return Grid_Data;
	}


	public WebElement getBtnApproval() {
		return BtnApproval;
	}


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Retailer Master']")
	private WebElement Retailer_Master_SubMenu;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Retailer Approval']")
	private WebElement Retailer_Approval;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Retailer Approval']")
	private WebElement Grid_Data;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnApproval']")
	private WebElement BtnApproval;
	
	
	
	
	
	
	
	
	
	
	
	

}
