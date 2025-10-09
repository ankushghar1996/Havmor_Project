package Admin_Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Salesman_Action_Icon_Main {


	@FindBy(how = How.XPATH, using = "(//table[@class='rgMasterTable rgClipCells']//td//a)[4]")
	private WebElement Reset_Button;
	   
	@FindBy(how = How.XPATH, using = "(//table[@class='rgMasterTable rgClipCells']//td//a)[3]")
	private WebElement Deactivate_Button;
	
	@FindBy(how = How.XPATH, using = "(//table[@class='rgMasterTable rgClipCells']//td//a)[2]")
	private WebElement Edit_Button;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnDeactivateFSG']")
	private WebElement Deactivate_YES;
	
	@FindBy(how = How.XPATH, using = "(//button[text()='Close'])[1]")
	private WebElement Deactivate_Close;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnResetDevice']")
	private WebElement Reset_YES; 
	
	@FindBy(how = How.XPATH, using = "(//button[text()='Close'])[2]")
	private WebElement Reset_Close;
	

	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Edit_Close;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnSave']")
	private WebElement Edit_Save;
		 
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_txtAadhaarNo']")
	private WebElement Adhar_Number_Textbox;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Salesman Creation']")
	private WebElement Salesman_Master;

	public WebElement getReset_Button() {
		return Reset_Button;
	}

	public WebElement getDeactivate_Button() {
		return Deactivate_Button;
	}

	public WebElement getEdit_Button() {
		return Edit_Button;
	}

	public WebElement getDeactivate_YES() {
		return Deactivate_YES;
	}

	public WebElement getDeactivate_Close() {
		return Deactivate_Close;
	}

	public WebElement getReset_YES() {
		return Reset_YES;
	}

	public WebElement getReset_Close() {
		return Reset_Close;
	}

	public WebElement getAdhar_Number_Textbox() {
		return Adhar_Number_Textbox;
	}

	public WebElement getSalesman_Master() {
		return Salesman_Master;
	}

	public WebElement getEdit_Close() {
		return Edit_Close;
	}

	public WebElement getEdit_Save() {
		return Edit_Save;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
