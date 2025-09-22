package Admin_Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Salesman_Extension_Main {

	@FindBy(how = How.XPATH, using = "//span[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFromDistributor_Arrow']")
	private WebElement From_Distributor;
	
	public WebElement getFrom_Distributor() {
		return From_Distributor;
	}

	public WebElement getTo_Distributor() {
		return To_Distributor;
	}

	public WebElement getFrom_Distributor_Value() {
		return From_Distributor_Value;
	}

	public WebElement getTo_Distributor_Value() {
		return To_Distributor_Value;
	}

	public WebElement getSalesman_Transfer_1_Checkbox() {
		return Salesman_Transfer_1_Checkbox;
	}

	public WebElement getSalesman_Transfer_2_Checkbox() {
		return Salesman_Transfer_2_Checkbox;
	}

	public WebElement getSalesman_Transfer_Forward_button() {
		return Salesman_Transfer_Forward_button;
	}

	public WebElement getSalesman_Transfer_Backward_button() {
		return Salesman_Transfer_Backward_button;
	}

	public WebElement getClose_Button() {
		return Close_Button;
	}



	public WebElement getSalesman_Extention() {
		return Salesman_Extention;
	}



	@FindBy(how = How.XPATH, using = "//span[@id='ctl00_ParentMasterContentPlaceHolder1_ddlToDistributor_Arrow']")
	private WebElement To_Distributor;
	
	@FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlFromDistributor_DropDown']//ul//li)[1]")
	private WebElement From_Distributor_Value;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='rcbSlide']//child::div//ul//li)[1]")
	private WebElement To_Distributor_Value;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid0_ctl00_ctl04_pTemplate0SelectCheckBox']")
	private WebElement Salesman_Transfer_1_Checkbox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ctl00_ParentMasterContentPlaceHolder1_RadGrid1_ctl00_ctl04_pTemplate1SelectCheckBox']")
	private WebElement Salesman_Transfer_2_Checkbox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnRightRatailer']")
	private WebElement Salesman_Transfer_Forward_button;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnLeft']")
	private WebElement Salesman_Transfer_Backward_button;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btncancel']")
	private WebElement Close_Button;
	
	@FindBy(how=How.XPATH,using="(//div[@id='mainDiv']//ul//li//p[text()='Salesman Extension'])[1]")
    private WebElement Salesman_Extention;

}
