package Admin_Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Invoice_Upload_Main {

	
	@FindBy(how=How.XPATH , using = "//div[@id='mainDiv']//ul//li//p[normalize-space()='Invoice Upload']")
	private WebElement Invoice_Upload_Main ;
	
	
	@FindBy(how=How.XPATH , using = "//input[@id='ParentMasterContentPlaceHolder1_Button3']")
	private WebElement Upload_Button ;


	public WebElement getInvoice_Upload_Main() {
		return Invoice_Upload_Main;
	}


	public WebElement getUpload_Button() {
		return Upload_Button;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
