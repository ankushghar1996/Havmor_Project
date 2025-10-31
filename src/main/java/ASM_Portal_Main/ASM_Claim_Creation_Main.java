package ASM_Portal_Main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ASM_Claim_Creation_Main {

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Claim']")
	private WebElement Claim_Menu;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Claim Master']")
	private WebElement Claim_Master;
	
	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Claim Creation']")
	private WebElement Claim_Creation;

	public WebElement getClaim_Menu() {
		return Claim_Menu;
	}

	public WebElement getClaim_Master() {
		return Claim_Master;
	}

	public WebElement getClaim_Creation() {
		return Claim_Creation;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
