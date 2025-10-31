package ZSM_Portal_Main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Asset_Branding_Purchase_Order_Main {

	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Asset']")
	private WebElement Asset_Menu;
	
	
	public WebElement getAsset_Menu() {
		return Asset_Menu;
	}


	public WebElement getBranding_SubMenu() {
		return Branding_SubMenu;
	}


	public WebElement getBranding_Purchase_Order() {
		return Branding_Purchase_Order;
	}


	public WebElement getGrid_data() {
		return Grid_data;
	}


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Branding']")
	private WebElement Branding_SubMenu;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Branding Purchase Order']")
	private WebElement Branding_Purchase_Order;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Asset']")
	private WebElement Grid_data;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
