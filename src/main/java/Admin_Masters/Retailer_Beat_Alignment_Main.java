package Admin_Masters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Retailer_Beat_Alignment_Main {
	
	
	WebDriver driver;
	
	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getRetailer_Master_Submenu() {
		return Retailer_Master_Submenu;
	}


	public WebElement getRetailer_Beat_Realignment_Submenu() {
		return Retailer_Beat_Realignment_Submenu;
	}


	public WebElement getFromDistributor_dropdown() {
		return FromDistributor_dropdown;
	}


	public WebElement getFromDistributor_dropdown_value() {
		return FromDistributor_dropdown_value;
	}


	public WebElement getFromRoute_dropdown() {
		return FromRoute_dropdown;
	}


	public WebElement getFromRoute_dropdown_value() {
		return FromRoute_dropdown_value;
	}


	public WebElement getFirst_FromSelectCheckBox() {
		return First_FromSelectCheckBox;
	}


	public WebElement getToRoute_dropdown() {
		return ToRoute_dropdown;
	}


	public WebElement getToRoute_dropdown_value() {
		return ToRoute_dropdown_value;
	}


	public WebElement getRightRatailer_btn() {
		return RightRatailer_btn;
	}


	public WebElement getLeft_btn() {
		return Left_btn;
	}


	public WebElement getFirst_ToSelectCheckBox() {
		return First_ToSelectCheckBox;
	}


	public WebElement getSave_btn() {
		return save_btn;
	}


	@FindBy(how = How.XPATH, using = "(//p[contains(text(),'Retailer Master')])[1]")
	private WebElement Retailer_Master_Submenu;
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Retailer Beat Realignment']")
	private WebElement Retailer_Beat_Realignment_Submenu;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12 ml-0']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFromDistributor']")
	private WebElement FromDistributor_dropdown;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFromDistributor_DropDown']//ul//li[normalize-space()='MAI ENTERPRISES (PUNE) DIST [10008399]'])[1]")
	private WebElement FromDistributor_dropdown_value;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-12 ml-0']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFromRoute']")
	private WebElement FromRoute_dropdown;
	
	
    //	(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFromRoute_DropDown']//ul//li)[1]
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFromRoute_DropDown']//ul//li[normalize-space()='Shivane']")
	private WebElement FromRoute_dropdown_value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid0_ctl00_ctl04_pTemplate0SelectCheckBox']")
	private WebElement First_FromSelectCheckBox;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='col-md-5 mt-2']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlToRoute']")
	private WebElement ToRoute_dropdown;
	
	
    //	(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlToRoute_DropDown']//ul//li)[1]
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlToRoute_DropDown']//ul//li[normalize-space()='Deccan']")
	private WebElement ToRoute_dropdown_value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnRightRatailer']")
	private WebElement RightRatailer_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnLeft']")
	private WebElement Left_btn;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00_ctl04_pTemplate1SelectCheckBox']")
	private WebElement First_ToSelectCheckBox;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnsave']")
	private WebElement save_btn;
	
	
	
	
	
	
	
	
	
	
	
	

}
