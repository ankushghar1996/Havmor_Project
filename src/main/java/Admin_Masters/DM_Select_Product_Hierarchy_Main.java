package Admin_Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DM_Select_Product_Hierarchy_Main {
	
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Depot Creation']")
	private WebElement Depot_Creation;
	
	@FindBy(how = How.XPATH, using = "(//table[@class='rgMasterTable rgClipCells']//tr//td//a)[2]")
	private WebElement Depot_Creation_Product_Hierarchy_Button;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnClose']")
	private WebElement Depot_Creation_Close_Button;
	
	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_btnSave1']")
	private WebElement Depot_Creation_Save_Button;




	public WebElement getBtnApproval() {
		return BtnApproval;
	}


	@FindBy(how = How.XPATH, using = "//input[@id='ParentMasterContentPlaceHolder1_BtnApproval']")
	private WebElement BtnApproval;



	public WebElement getDepot_Creation() {
		return Depot_Creation;
	}




	public WebElement getDepot_Creation_Close_Button() {
		return Depot_Creation_Close_Button;
	}



	public WebElement getDepot_Creation_Save_Button() {
		return Depot_Creation_Save_Button;
	}


	public WebElement getDepot_Creation_Product_Hierarchy_Button() {
		return Depot_Creation_Product_Hierarchy_Button;
	}
	
	
	
	
	
	
	
}
	

