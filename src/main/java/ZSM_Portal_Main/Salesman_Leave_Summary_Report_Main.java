package ZSM_Portal_Main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Salesman_Leave_Summary_Report_Main {

	
	@FindBy(how=How.XPATH,using= "//div[@id='mainDiv']//child::li//p[contains(text(),'and Leave')]")
	private WebElement Attendence_And_Leave ;
	
	@FindBy(how=How.XPATH,using= "//div[@id='mainDiv']//child::li//p[contains(text(),'Reports')]")
	private WebElement Reports;
	
	@FindBy(how=How.XPATH,using= "//div[@id='mainDiv']//child::li//p[contains(text(),'Salesman leave summary report')]")
	private WebElement Salesman_Leave_Summary_Report;
	
	@FindBy(how=How.XPATH,using= "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlYear']//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlYear_Input']")
	private WebElement Select_Year_Dropdown;
	
	@FindBy(how=How.XPATH,using= "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlYear_DropDown']//li[text()='2025']")
	private WebElement Select_Year_Dropdown_Value;

	public WebElement getReports() {
		return Reports;
	}

	public WebElement getSalesman_Leave_Summary_Report() {
		return Salesman_Leave_Summary_Report;
	}

	public WebElement getSelect_Year_Dropdown() {
		return Select_Year_Dropdown;
	}

	public WebElement getSelect_Year_Dropdown_Value() {
		return Select_Year_Dropdown_Value;
	}

	public WebElement getAttendence_And_Leave() {
		return Attendence_And_Leave;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
