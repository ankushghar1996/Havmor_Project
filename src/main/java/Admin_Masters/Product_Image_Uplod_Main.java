package Admin_Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Product_Image_Uplod_Main {

	@FindBy(how = How.XPATH, using = "(//div[@id='mainDiv']//p[text()='Product Image Upload'])[1]")
	   private WebElement Product_Image_Upload;
	
	@FindBy(how = How.XPATH, using = "//div[@class='container-fluid']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlProductHierarchy']")
	   private WebElement Product_Hierarchy;
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlProductHierarchy_DropDown']//ul//li)[1]")
	   private WebElement Product_Hierarchy_Value;
	
	
	@FindBy(how = How.XPATH, using = "//div[@class='container-fluid']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlCategory']")
	   private WebElement Category;
	
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlCategory_DropDown']//label[normalize-space()='ICECREAM']")
	   private WebElement Category_Value;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnView']")
	   private WebElement View_Button;
	
	
	@FindBy(how = How.XPATH, using = "(//div[@class=' pb-2 pt-1']//child::div[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_GridData']//tbody//tr)[1]")
	   private WebElement Grid_Data;
	
	@FindBy(how = How.XPATH, using = "//table[@class='rgMasterTable rgClipCells']//child::tbody//td//a[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00_ctl04_BtnUpdate']")
	   private WebElement Upload_Product_Image_BTN;
	
	@FindBy(how = How.XPATH, using = "//div[@class='container']//input[@id='ParentMasterContentPlaceHolder1_btnCloseModal']")
	   private WebElement Close_Button;
	
	
	
	//div[@class='container']//input[@id='ParentMasterContentPlaceHolder1_btnSave']
	public WebElement getProduct_Image_Upload() {
		return Product_Image_Upload;
	}

	public WebElement getProduct_Hierarchy() {
		return Product_Hierarchy;
	}

	public WebElement getProduct_Hierarchy_Value() {
		return Product_Hierarchy_Value;
	}

	public WebElement getCategory() {
		return Category;
	}

	public WebElement getCategory_Value() {
		return Category_Value;
	}

	public WebElement getView_Button() {
		return View_Button;
	}

	public WebElement getGrid_Data() {
		return Grid_Data;
	}

	public WebElement getUpload_Product_Image_BTN() {
		return Upload_Product_Image_BTN;
	}

	public WebElement getClose_Button() {
		return Close_Button;
	}

	public WebElement getSave_Button() {
		return Save_Button;
	}

	public WebElement getDownload_Button() {
		return Download_Button;
	}

	@FindBy(how = How.XPATH, using = "//div[@class='container']//input[@id='ParentMasterContentPlaceHolder1_btnSave']")
	   private WebElement Save_Button;
	
	@FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_GridData']//child::tr/td/a[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00_ctl04_LinkButtonDownload']")
	  private WebElement Download_Button;
	
	
	
}
