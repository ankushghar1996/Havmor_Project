package Admin_Settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Sales_Hierarchy_Creation_Main {
	
	
WebDriver driver;
	
	public WebDriver getDriver() {
	return driver;
}


public WebElement getConfigurations_menu() {
	return Configurations_menu;
}


public WebElement getSales_Hierarchy_Creation_menu() {
	return Sales_Hierarchy_Creation_menu;
}


public WebElement getAdd_btn() {
	return Add_btn;
}


public WebElement getView_btn() {
	return View_btn;
}


public WebElement getAreaType_dropdown() {
	return AreaType_dropdown;
}


public WebElement getAreaType_dropdown_value() {
	return AreaType_dropdown_value;
}


public WebElement getAreaName() {
	return AreaName;
}


public WebElement getSave_btn() {
	return Save_btn;
}


public WebElement getCancel_btn() {
	return Cancel_btn;
}


public WebElement getGridData() {
	return GridData;
}


	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Configurations']")
	private WebElement Configurations_menu;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Sales Hierarchy Creation']")
	private WebElement Sales_Hierarchy_Creation_menu;
	
	
	@FindBy(how = How.XPATH, using = "//button[@id='btnAddAreaModal']")
	private WebElement Add_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnView']")
	private WebElement View_btn;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='input-box mb-2']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType']")
	private WebElement AreaType_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlAreaType_DropDown']//ul//li)[1]")
	private WebElement AreaType_dropdown_value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtAreaName']")
	private WebElement AreaName;
	
	
	@FindBy(how = How.XPATH, using = "#ParentMasterContentPlaceHolder1_btnSaveAreaCreation")
	private WebElement Save_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnCloseAreaCreation']")
	private WebElement Cancel_btn;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGridAreaCreation_GridData']//table//tbody//tr)[1]")
	private WebElement GridData;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
