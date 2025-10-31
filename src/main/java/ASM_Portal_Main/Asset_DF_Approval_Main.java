package ASM_Portal_Main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Asset_DF_Approval_Main {
	
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Asset']")
	private WebElement Asset_Menu;
	
	
	public WebElement getAsset_Menu() {
		return Asset_Menu;
	}


	public WebElement getDeep_Freezer_SubMenu() {
		return Deep_Freezer_SubMenu;
	}


	public WebElement getDF_Approval() {
		return DF_Approval;
	}


	public WebElement getGrid_data() {
		return Grid_data;
	}


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Deep-Freezer']")
	private WebElement Deep_Freezer_SubMenu;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='DF Approval']")
	private WebElement DF_Approval;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Asset']")
	private WebElement Grid_data;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
