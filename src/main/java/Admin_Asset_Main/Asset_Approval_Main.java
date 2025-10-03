package Admin_Asset_Main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Asset_Approval_Main {

	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Asset']")
	private WebElement Asset_Menu;
	
	
	public WebElement getAsset_Menu() {
		return Asset_Menu;
	}


	public WebElement getAssetMaster_Menu() {
		return AssetMaster_Menu;
	}


	public WebElement getAsset_Approval() {
		return Asset_Approval;
	}


	public WebElement getGrid_data() {
		return Grid_data;
	}


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Asset Master']")
	private WebElement AssetMaster_Menu;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Asset Approval']")
	private WebElement Asset_Approval;
	
	
	@FindBy(how = How.XPATH, using = "")
	private WebElement Grid_data;
	
	
	
	
	
	
	
	
	
	
}
