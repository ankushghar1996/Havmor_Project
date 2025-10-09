package Admin_Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Product_Sales_Rate_Upload_Main {

	@FindBy(how=How.XPATH,using = "//div[@id='mainDiv']//p[text()='Sales Rate Upload']")
	private WebElement  Sales_Rate_Upload_Submenu ;
	
	@FindBy(how=How.XPATH,using = "//input[@id='ParentMasterContentPlaceHolder1_Button3']")
	private WebElement  Upload_Now_Button ;
	
	@FindBy(how=How.XPATH,using = "//input[@id='ParentMasterContentPlaceHolder1_BtnExport']")
	private WebElement  Download_Template ;
	
	public WebElement getUpload_Now_Button() {
		return Upload_Now_Button;
	}

	public WebElement getDownload_Template() {
		return Download_Template;
	}

	public WebElement getSales_Rate_Upload_Submenu() {
		return Sales_Rate_Upload_Submenu;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
