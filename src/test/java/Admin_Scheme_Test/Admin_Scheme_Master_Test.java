package Admin_Scheme_Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import Admin_Scheme_Main.Admin_Scheme_Master_Main;
import Admin_Target_Upload_Main.Program_Target_Upload_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Admin_Scheme_Master_Test extends BaseClass{

	@Test
    public void Scheme_Creation() throws Exception {

		Admin_Scheme_Master_Main ASMM = PageFactory.initElements(driver, Admin_Scheme_Master_Main.class);
        HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
    
        
           ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_01", "Verify that user click on Scheme Menu ", () ->{
            Liabrary_Havmor.custom_click(home.getScheme_Menu(), "Scheme Menu");      
        	});
        	Thread.sleep(1000);
        	
        	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_02", "Verify that user click on Scheme 	Setup Submenu", () ->{
         	Liabrary_Havmor.custom_click(home.getScheme_Setup_Submenu(), "Scheme Setup Submenu");      
           	});
           	Thread.sleep(1000);
        	 	
        	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_03", "Verify that user Click on Program_Target_Upload ", () ->{
        	Liabrary_Havmor.custom_click(ASMM.getScheme_Creation(), "Scheme Creation");
        	});
        	Thread.sleep(1000);
	
        	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_04", "Verify that user Click on Add Button", () ->{
            Liabrary_Havmor.custom_click(ASMM.getAdd_Button(), "Add Button");
           	});
           	Thread.sleep(1000);
           	
            ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_05", "Verify that user Send Scheme Name", () ->{
            Liabrary_Havmor.custom_Sendkeys(ASMM.getScheme_Name_Textbox(), excel.getStringdata2("Scheme", 1, 0), "Scheme Name");
             });
            Thread.sleep(1000);
           	        
            ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_06", "Verify that user Send Scheme Short Name", () ->{
            Liabrary_Havmor.custom_Sendkeys(ASMM.getScheme_Short_Name_Textbox_EXCEL(), excel.getStringdata2("Scheme", 1, 1), "Scheme Short Name");
            });
            Thread.sleep(1000);
            
            ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_06", "Verify that user Send Scheme Short Name", () ->{
            Liabrary_Havmor.custom_Sendkeys(ASMM.getScheme_Short_Name_Textbox_EXCEL(), excel.getStringdata2("Scheme", 1, 1), "Scheme Short Name");
             });
            Thread.sleep(1000);
	
    
         // From Date
            selectDate(driver, 
              By.id("ctl00_ParentMasterContentPlaceHolder1_dtpFromDate_dateInput"), 
              "26", "September", "2025");

            // To Date
            selectDate(driver, 
              By.id("ctl00_ParentMasterContentPlaceHolder1_dtpToDate_dateInput"), 
              "28", "December", "2025");

            
            
            
            // Example usage of date picker:
        
	}         
        

	public void selectDate(WebDriver driver, By calendarInput, String expDay, String expMonth, String expYear) throws Exception {
	    // 1️⃣ Click the date input to open the calendar
	    driver.findElement(calendarInput).click();
	    Thread.sleep(500); // tiny wait

	    // 2️⃣ Loop until correct month/year appears in header
	    while (true) {
	        String monthYear = driver.findElement(
	                By.xpath("(//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpFromDate_calendar_wrapper']//table//*[contains(@class,'rcTitle')])[1]")).getText(); 
	        // e.g. "September 2025"

	        if (monthYear.contains(expMonth) && monthYear.contains(expYear)) {
	            break; // we’re on the right month/year
	        } else {
	            // click next arrow
	            driver.findElement(
	                By.xpath("//a[contains(@class,'rcNext')]")).click();
	            Thread.sleep(300);
	        }
	    }

	    // 3️⃣ Now click the correct day
	    List<WebElement> allDays = driver.findElements(
	        By.xpath("//table[contains(@class,'rcMainTable')]//td[not(contains(@class,'rcOutOfRange'))]/a"));
	    // this ignores disabled/out-of-range cells

	    for (WebElement day : allDays) {
	        if (day.getText().equals(expDay)) {
	            day.click();
	            break;
	        }
	    }
	}

            









            
            
               	
           	
	
	
}
