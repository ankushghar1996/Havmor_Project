package Com_LoginPage_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage_Havmor {

WebDriver driver;
	
	public WebDriver getDriver() {
	return driver;
}
	
	@FindBy(how = How.XPATH, using = "//ul[@class='nav nav-pills nav-sidebar flex-column']/li//p[normalize-space()='Master']")
	private WebElement Master_Menu;
	
	@FindBy(how=How.XPATH,using="(//div[@id='mainDiv']//ul//li//p[text()='Route Master'])[1]")
    private WebElement Route_Master_Submenu;
	
	@FindBy(how=How.XPATH,using="//div[@id='mainDiv']//p[text()='Product Management']")
    private WebElement Product_Management_Submenu;
	
	@FindBy(how=How.XPATH,using="//div[@id='mainDiv']//p[text()='Product Master']")
    private WebElement Product_Master_Submenu;
	
	@FindBy(how=How.XPATH,using="//div[@id='mainDiv']//p[text()='Special Product Defination']")
    private WebElement Special_Product_Defination_Submenu;
	
	@FindBy(how=How.XPATH,using="//div[@id='mainDiv']//p[text()='Product Image Upload']")
    private WebElement Product_Image_Upload_Submenu;
	
	@FindBy(how = How.XPATH, using = "//ul[@class='nav nav-pills nav-sidebar flex-column']/li//p[normalize-space()='Activity']")
	private WebElement Activity_Master_Menu;
	
	@FindBy(how = How.XPATH, using = "//ul[@class='nav nav-pills nav-sidebar flex-column']/li//p[normalize-space()='Media']")
	private WebElement Activity_Media_SubMenu;
	
	@FindBy(how = How.XPATH, using = "//ul[@class='nav nav-pills nav-sidebar flex-column']/li//p[normalize-space()='PJP Management']")
	private WebElement PJP_Management_SubMenu;

	public WebElement getActivity_Master_Menu() {
		return Activity_Master_Menu;
	}

	public WebElement getActivity_Media_SubMenu() {
		return Activity_Media_SubMenu;
	}

	public WebElement getPJP_Management_SubMenu() {
		return PJP_Management_SubMenu;
	}

	public WebElement getProduct_Management_Submenu() {
		return Product_Management_Submenu;
	}

	public WebElement getSpecial_Product_Defination_Submenu() {
		return Special_Product_Defination_Submenu;
	}

	public WebElement getProduct_Master_Submenu() {
		return Product_Master_Submenu;
	}



	public WebElement getProduct_Image_Upload_Submenu() {
		return Product_Image_Upload_Submenu;
	}

	public WebElement getSalesman_Master_Submenu() {
		return Salesman_Master_Submenu;
	}

	public WebElement getSalesman_Transfer() {
		return Salesman_Transfer;
	}

	@FindBy(how=How.XPATH,using="(//div[@id='mainDiv']//ul//li//p[text()='Salesman Master'])[1]")
    private WebElement Salesman_Master_Submenu;
	
	@FindBy(how=How.XPATH,using="(//div[@id='mainDiv']//ul//li//p[text()='Salesman Transfer'])[1]")
    private WebElement Salesman_Transfer;
	
	public WebElement getRoute_Master_Submenu() {
		return Route_Master_Submenu;
	}





	public WebElement getMaster_Menu() {
		return Master_Menu;
	}


	


	public WebElement getReports_Menu() {
		return Reports_Menu;
	}


	public WebElement getSettings_Menu() {
		return Settings_Menu;
	}


	public WebElement getActivity_Menu() {
		return Activity_Menu;
	}


	public WebElement getScheme_Menu() {
		return Scheme_Menu;
	}


	public WebElement getDistributorMaster_SubMenu() {
		return DistributorMaster_SubMenu;
	}


	@FindBy(how = How.XPATH, using = "//ul[@class='nav nav-pills nav-sidebar flex-column']/li//p[normalize-space()='Reports']")
	private WebElement Reports_Menu;
	
	
	@FindBy(how = How.XPATH, using = "//ul[@class='nav nav-pills nav-sidebar flex-column']/li//p[normalize-space()='Settings']")
	private WebElement Settings_Menu;
	
	
	@FindBy(how = How.XPATH, using = "//ul[@class='nav nav-pills nav-sidebar flex-column']/li//p[normalize-space()='Activity']")
	private WebElement Activity_Menu;
	
	
	@FindBy(how = How.XPATH, using = "//ul[@class='nav nav-pills nav-sidebar flex-column']/li//p[normalize-space()='Scheme']")
	private WebElement Scheme_Menu;
	
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='nav nav-treeview']/li//p[normalize-space()='Distributor Master'])[1]")
	private WebElement DistributorMaster_SubMenu;
	
	
	
	
	
	
	
	
	
	
	
	
	
}
