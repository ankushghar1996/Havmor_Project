package Admin_Reports;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Retailer_Master_Main {

	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Master Report']")
	private WebElement Master_Report_submenu;
	
	
	public WebElement getMaster_Report_submenu() {
		return Master_Report_submenu;
	}


	public WebElement getRetailer_Master() {
		return Retailer_Master;
	}


	@FindBy(how = How.XPATH, using = "(//p[contains(text(),'Retailer Master')])[2]")
	private WebElement Retailer_Master;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
