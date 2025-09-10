package Admin_Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Route_Master_Main {

	
	
   @FindBy(how = How.XPATH, using = "(//div[@id='mainDiv']//ul//li//p[text()='Route Master'])[2]")
   private WebElement Route_Master;
   
   @FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_radGridRouteMaster_GridData']//tbody//tr)[1]")
   private WebElement Grid_Data;
   
   @FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnAdd']")
   private WebElement Add_Button;
   
   @FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlchaneltype']")
   private WebElement Channel_Type_Dropdown;
   
   @FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlchaneltype_DropDown']//ul//li)[1]")
   private WebElement Channel_Type_Dropdown_Value;
   
   @FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddldistributor']")
   private WebElement Distributor_Name;
   
   @FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddldistributor_DropDown']//ul//li)[5]")
   private WebElement Distributor_Name_Value;
   
   @FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlsalesman']")
   private WebElement Salesman_Name_Dropdown;
   
   @FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlsalesman_DropDown']//ul//li)[1]")
   private WebElement Salesman_Name_Dropdown_Value;
   
   
   @FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlVisitFrequency']")
   private WebElement Visit_Frequency_Dropdown;
   
   @FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlVisitFrequency_DropDown']//ul//li)[1]")
   private WebElement Visit_Frequency_Dropdown_Value;
   
   @FindBy(how = How.XPATH, using = "//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlWeekDay1']")
   private WebElement WeekDay1_Dropdown;
   
   @FindBy(how = How.XPATH, using = "(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlWeekDay1_DropDown']//ul//li)[1]")
   private WebElement WeekDay1_Dropdown_Value;
   
 //input[@id='ParentMasterContentPlaceHolder1_BtnSave']
   
   @FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnSave']")
   private WebElement Save_Button;
   
   
   
	
}
