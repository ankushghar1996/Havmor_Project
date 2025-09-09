package Com_LoginPage_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	
WebDriver driver;
	
	public WebDriver getDriver() {
	return driver;
}


public WebElement getUsername() {
	return username;
}


public WebElement getPassword() {
	return password;
}


public WebElement getContinue() {
	return Continue;
}


public WebElement getTxtOTP() {
	return txtOTP;
}


public WebElement getVerify_OTP() {
	return Verify_OTP;
}


	@FindBy(how = How.XPATH, using = "//input[@id='txtusername']")
	private WebElement username;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='txtpassword']")
	private WebElement password;
	
	
	@FindBy(how = How.XPATH, using = "//input[@value='Continue']")
	private WebElement Continue;
	
	
	@FindBy(how = How.XPATH, using = "//input[@id='txtOTP']")
	private WebElement txtOTP;
	
	
	@FindBy(how = How.XPATH, using = "//input[@value='Verify OTP']")
	private WebElement Verify_OTP;
	
	
	
	
	
	
	
}
