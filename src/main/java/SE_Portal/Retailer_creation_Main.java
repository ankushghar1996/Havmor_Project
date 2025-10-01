package SE_Portal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Retailer_creation_Main {

	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Master']")
	private WebElement Master_Menu;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Retailer Master']")
	private WebElement Retailer_Master_SubMenu;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Retailer Creation']")
	private WebElement Retailer_Creation;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
