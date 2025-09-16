package Admin_Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HSN_Master_Main {


	@FindBy(how=How.XPATH , using = "//input[@id='ParentMasterContentPlaceHolder1_BtnExport']")
	private WebElement Download_Template;
	
	@FindBy(how=How.XPATH , using = "//div[@id='mainDiv']//p[text()='HSN Master']")
	private WebElement HSN_Master;
	
	
	public WebElement getHSN_Master() {
		return HSN_Master;
	}
	

	@FindBy(how=How.XPATH , using = "//input[@id='ParentMasterContentPlaceHolder1_UploadButton']")
	private WebElement Select_File_to_upload;
	
	@FindBy(how=How.XPATH , using = "//input[@id='ParentMasterContentPlaceHolder1_Button3']")
	private WebElement Upload_button;

	public WebElement getDownload_Template() {
		return Download_Template; 
	} 

	public WebElement getSelect_File_to_upload() {
		return Select_File_to_upload;
	}

	public WebElement getUpload_button() {
		return Upload_button;
	}
	
	
	

	
}
