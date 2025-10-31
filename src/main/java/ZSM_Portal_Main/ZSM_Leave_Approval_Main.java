package ZSM_Portal_Main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ZSM_Leave_Approval_Main {

	
	@FindBy(how=How.XPATH,using= "//div[@id='mainDiv']//child::li//p[contains(text(),'and Leave')]")
	private WebElement Attendence_And_Leave ;
	
	@FindBy(how=How.XPATH,using= "//div[@id='mainDiv']//child::li//p[contains(text(),'Leave Master')]")
	private WebElement Leave_Master ;
	
	@FindBy(how=How.XPATH,using= "//div[@id='mainDiv']//child::li//p[contains(text(),'Leave Approval')]")
	private WebElement Leave_Approval;

	public WebElement getAttendence_And_Leave() {
		return Attendence_And_Leave;
	}

	public WebElement getLeave_Master() {
		return Leave_Master;
	}

	public WebElement getLeave_Approval() {
		return Leave_Approval;
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
