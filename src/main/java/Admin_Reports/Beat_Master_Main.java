package Admin_Reports;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Beat_Master_Main {

	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Master Report']")
	private WebElement Master_Report_submenu;
	
	
	public WebElement getMaster_Report_submenu() {
		return Master_Report_submenu;
	}


	public WebElement getBeat_Master() {
		return Beat_Master;
	}


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Beat Master']")
	private WebElement Beat_Master;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
