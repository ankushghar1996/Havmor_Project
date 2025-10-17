package Admin_Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PJP_Master_Main {

	
	
	@FindBy(how=How.XPATH,using="(//div[@class='content-wrapper']//div[contains(@class,'rcbSlide') and contains(@style,'display: block')]//ul[@class='rcbList']/li)[1]")
    private WebElement Salesman_Name_Value;
	
	@FindBy(how=How.XPATH,using="//div[@id='mainDiv']//child::nav/ul[@class='nav nav-pills nav-sidebar flex-column']//ul//li//p[text()='PJP Master']")
    private WebElement Pjp_Master;
	
	@FindBy(how=How.XPATH,using="(//div[@id='mainDiv']//ul//li//p[text()='Route Master'])[1]")
    private WebElement Route_Master_Submenu;
	
	
	public WebElement getPjp_Master() {
		return Pjp_Master;
	}

	public WebElement getRoute_Master_Submenu() {
		return Route_Master_Submenu;
	}

	@FindBy(how=How.XPATH,using="(//div[@class='content-wrapper']//child::div//child::div/ul/li)[6]")
    private WebElement Distributor_Name_Value;
	
	@FindBy(how=How.XPATH,using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlSalesmanName_Input']")
    private WebElement Salesman_Name_Dropdown;
	
	@FindBy(how=How.XPATH,using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDistributorName_Input']")
    private WebElement Distributor_Name_Dropdown;
	
	@FindBy(how=How.XPATH,using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlDivision_Input']")
    private WebElement Select_Division_Dropdown;
	
	@FindBy(how=How.XPATH,using="(//div[@class='content-wrapper']//child::div//child::div/ul/li)[1]")
    private WebElement Select_Division_Value;
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_BtnView']")
    private WebElement View_Button;
	
	@FindBy(how=How.XPATH,using="//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlchaneltype_Input']")
    private WebElement Channel_Type_Dropdown;
	
	public WebElement getView_Button() {
		return View_Button;
	}

	public WebElement getSalesman_Name_Value() {
		return Salesman_Name_Value;
	}

	public WebElement getDistributor_Name_Value() {
		return Distributor_Name_Value;
	}

	public WebElement getSalesman_Name_Dropdown() {
		return Salesman_Name_Dropdown;
	}

	public WebElement getDistributor_Name_Dropdown() {
		return Distributor_Name_Dropdown;
	}

	public WebElement getSelect_Division_Dropdown() {
		return Select_Division_Dropdown;
	}

	public WebElement getSelect_Division_Value() {
		return Select_Division_Value;
	}

	public WebElement getChannel_Type_Dropdown() {
		return Channel_Type_Dropdown;
	}

	public WebElement getChannel_Type_Value() {
		return Channel_Type_Value;
	}

	@FindBy(how=How.XPATH,using="(//div[@class=\"content-wrapper\"]//child::div/ul/li)[1]")
    private WebElement Channel_Type_Value;
	
	
}
