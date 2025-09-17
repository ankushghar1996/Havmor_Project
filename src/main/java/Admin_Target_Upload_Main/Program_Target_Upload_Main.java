package Admin_Target_Upload_Main;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Program_Target_Upload_Main {

	
	@FindBy(how=How.XPATH,using="//div[@id='mainDiv']//p[text()='Program Target Upload']")
    private WebElement Program_Target_Upload;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_BtnAdd']")
    private WebElement Add_Media;
	
	@FindBy(how=How.XPATH , using = "//input[@id='ParentMasterContentPlaceHolder1_BtnExport']")
	private WebElement Download_Template;
	

	

	public WebElement getProgram_Target_Upload() {
		return Program_Target_Upload;
	}

	public WebElement getAdd_Media() {
		return Add_Media;
	}

	@FindBy(how=How.XPATH , using = "//input[@id='ParentMasterContentPlaceHolder1_UploadButton']")
	private WebElement Select_File_to_upload;
	
	@FindBy(how=How.XPATH , using = "//div[@id='ParentMasterContentPlaceHolder1_BtnUpload']//child::div//input[@id='ParentMasterContentPlaceHolder1_BtnUpload']")
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
