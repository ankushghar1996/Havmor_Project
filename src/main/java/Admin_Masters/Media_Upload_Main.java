package Admin_Masters;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Media_Upload_Main {

	
	@FindBy(how=How.XPATH,using="//div[@id='mainDiv']//p[text()='Media Upload']")
    private WebElement Media_Upload;
	
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_BtnAdd']")
    private WebElement Add_Media;
	
	public WebElement getMedia_Upload() {
		return Media_Upload;
	}

	public WebElement getAdd_Media() {
		return Add_Media;
	}

	public WebElement getCategory() {
		return Category;
	}

	public WebElement getCategory_Value() {
		return Category_Value;
	}

	public WebElement getMedia_Title_Textbox_Excel() {
		return Media_Title_Textbox_Excel;
	}

	public WebElement getDescription_Textbox_Excel() {
		return Description_Textbox_Excel;
	}

	public WebElement getSelect_Image_Upload_Button() {
		return Select_Image_Upload_Button;
	}

	public WebElement getSave_Button() {
		return Save_Button;
	}

	@FindBy(how=How.XPATH,using="//div[@class='modal-dialog  modal-dialog-right']//input[@id='ctl00_ParentMasterContentPlaceHolder1_ddlCategory_Input']")
    private WebElement Category;
	
	@FindBy(how=How.XPATH,using="(//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlCategory_DropDown']//child::div/ul/li)[1]")
    private WebElement Category_Value;
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_txtMediaTitle']")
    private WebElement Media_Title_Textbox_Excel;
	
	@FindBy(how=How.XPATH,using="//textarea[@id='ParentMasterContentPlaceHolder1_txtMediaDescription']")
    private WebElement Description_Textbox_Excel;
	
	@FindBy(how=How.XPATH,using="//input[@id='ParentMasterContentPlaceHolder1_fuImage']")  
    private WebElement Select_Image_Upload_Button;
	
	@FindBy(how=How.XPATH,using="")
    private WebElement Save_Button;
	
	
	
	
	
	
}
