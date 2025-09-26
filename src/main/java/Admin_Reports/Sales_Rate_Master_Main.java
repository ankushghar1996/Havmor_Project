package Admin_Reports;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Sales_Rate_Master_Main {

	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Master Report']")
	private WebElement Master_Report_submenu;
	
	
	public WebElement getMaster_Report_submenu() {
		return Master_Report_submenu;
	}


	public WebElement getSales_Rate_Master() {
		return Sales_Rate_Master;
	}


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Sales Rate Master']")
	private WebElement Sales_Rate_Master;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
