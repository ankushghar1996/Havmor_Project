package Admin_Masters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Distributor_Master {

	
WebDriver driver;
	
	public WebDriver getDriver() {
	return driver;
}
	
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='nav nav-treeview']/li[@class='nav-item menu-is-opening menu-open']//p[normalize-space()='Distributor Master'])[2]")
	private WebElement Distributor_Master;

	public WebElement getDistributor_Master() {
		return Distributor_Master;
	}
	
	
	
	
	
	
	
	
}
