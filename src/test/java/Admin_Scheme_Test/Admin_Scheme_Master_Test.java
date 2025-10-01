package Admin_Scheme_Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Admin_Scheme_Main.Admin_Scheme_Master_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass_otp;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Admin_Scheme_Master_Test extends BaseClass_otp {

    @Test
    public void Scheme_Creation() throws Exception {

        Admin_Scheme_Master_Main ASMM = PageFactory.initElements(driver, Admin_Scheme_Master_Main.class);
        HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
        
      //Page 1 Basic Info
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_01", "Click on Scheme Menu", () ->{
            Liabrary_Havmor.custom_click(home.getScheme_Menu(), "Scheme Menu");
        });
        Thread.sleep(1000);

        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_02", "Click on Scheme Setup Submenu", () ->{
            Liabrary_Havmor.custom_click(home.getScheme_Setup_Submenu(), "Scheme Setup Submenu");
        });
        Thread.sleep(1000);

        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_03", "Click on Scheme Creation", () ->{
            Liabrary_Havmor.custom_click(ASMM.getScheme_Creation(), "Scheme Creation");
        });
        Thread.sleep(1000);

        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_04", "Click on Add Button", () ->{
            Liabrary_Havmor.custom_click(ASMM.getAdd_Button(), "Add Button");
        });
        Thread.sleep(1000);

        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_05", "Enter Scheme Name", () ->{
            Liabrary_Havmor.custom_Sendkeys(ASMM.getScheme_Name_Textbox(), excel.getStringdata2("Scheme_Add", 1, 0), "Scheme Name");
        });
        Thread.sleep(1000);

        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_06", "Enter Scheme Short Name", () ->{
            Liabrary_Havmor.custom_Sendkeys(ASMM.getScheme_Short_Name_Textbox_EXCEL(), excel.getStringdata2("Scheme_Add", 1, 1), "Scheme Short Name");
        });
        Thread.sleep(1000);

        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_07", "Enter Scheme Description", () ->{
            Liabrary_Havmor.custom_Sendkeys(ASMM.getScheme_Description_Textbox_EXCEL(), excel.getStringdata2("Scheme_Add", 1, 2), "Scheme Description");
        });
        Thread.sleep(1000);

        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_08", "From Date To Date", () ->{     
        
        //From Date
        	
     // Define expected values
        String expectedMonth = "September";
        String expectedYear = "2025";
        String expectedDate = "29";
         
        // Step 1: Click on calendar icon to open the calendar

        driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpFromDate_popupButton']")).click();
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} // Optional small wait to let calendar load
         
        // Step 2: Loop until expected month and year appear

        while (true) {

            // Get month and year text from the calendar header

            String monthYearText = driver.findElement(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpFromDate_calendar_wrapper']//tbody//td[@id='ctl00_ParentMasterContentPlaceHolder1_dtpFromDate_calendar_Title']")).getText().trim();
            System.out.println("Current Month-Year: " + monthYearText);
         
            // Example format -> "September 2025"

            String[] parts = monthYearText.split(" ");
            String currentMonth = parts[0].trim();
           String currentYear = parts[1].trim();
         
            // If month & year match expected, break

            if (currentMonth.equalsIgnoreCase(expectedMonth) && currentYear.equals(expectedYear)) {

                break;
            } else {

                // Click next arrow → to move to next month

                driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpFromDate_calendar_NN']")).click();
                try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

            }

        }
         
        // Step 3: Select the date

        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='rcMainTable']//td/a"));
        for (WebElement ele : allDates) {
            String dateText = ele.getText().trim();
            if (dateText.equals(expectedDate)) {
                ele.click();
                System.out.println("Selected Date: " + expectedDate + " " + expectedMonth + " " + expectedYear);
                break;
            }
        }  
       
        
     // ===== Expected To Date =====

        String toMonth = "October";

        String toYear  = "2025";

        String toDay   = "10";
         
        // Open the To Date calendar

        driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpToDate_popupButton']")).click();
         
        // Wait for the calendar header (Month Year) to be visible

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        By toTitle = By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpToDate_calendar_wrapper']//tbody//td[@id='ctl00_ParentMasterContentPlaceHolder1_dtpToDate_calendar_Title']");

        wait.until(ExpectedConditions.visibilityOfElementLocated(toTitle));
         
        // Keep clicking Next until desired Month & Year appear

        while (true) {

            String monthYear = driver.findElement(toTitle).getText().trim(); // e.g. "September 2025"

            String[] parts = monthYear.split("\\s+");

            String curMonth = parts[0].trim();

            String curYear  = parts[1].trim();
         
            if (curMonth.equalsIgnoreCase(toMonth) && curYear.equals(toYear)) {

                break;

            }

            // Next month arrow

            driver.findElement(By.xpath("//a[@id='ctl00_ParentMasterContentPlaceHolder1_dtpToDate_calendar_NN']")).click();

            wait.until(ExpectedConditions.textToBePresentInElementLocated(toTitle, " ")); // small sync

        }
         
        // Pick the day

        List<WebElement> days = driver.findElements(By.xpath("//table[@class='rcMainTable']//td/a"));

        for (WebElement d : days) {

            if (d.getText().trim().equals(toDay)) {

                d.click();

                break;

            }

        }

        });
         
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_09", "Click on Scheme Type Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getScheme_Type_Dropdown(), "Scheme Type");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_10", "Click on Scheme Type Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getScheme_Type_Dropdown_Value(), "Scheme Type Value");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_11", "Click on Scheme Mechanics Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getScheme_Mechanics_Dropdown(), "Scheme Mechanics");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_12", "Click on Scheme Mechanics Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getScheme_Mechanics_Dropdown_Value(), "Scheme Mechanics Value");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_13", "Click on Scheme Method Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getScheme_Method_Dropdown(), "Scheme Method");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_14", "Click on Scheme Method Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getScheme_Method_Dropdown_Value1_In_bill_scheme(), "Scheme Method Value");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_15", "Enter Apply in bill Number in textbox", () ->{
            Liabrary_Havmor.custom_Sendkeys(ASMM.getApply_in_No_of_Bills_Textbox_EXCEL(), excel.getStringdata2("Scheme_Add", 1, 3), "Apply_in_No_of_Bills");
        });
        Thread.sleep(1000);
        
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_16", "Click on Claimable Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getClaimable_Dropdown(), "Claimable Dropdown");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_17", "Click on Claimable Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getClaimable_Dropdown_Value(), "Claimable Dropdown Value");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_18", "Click on GL Code Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getGL_Code_Dropdown(), "GL Code Dropdown");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_19", "Click on GL Code Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getGL_Code_Dropdown_Value(), "GL Code Dropdown Value");
        });
        Thread.sleep(1000);        
     
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_20", "Click on Order Source Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getOrder_Source_Dropdown(), "Order Source Dropdown"); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_21", "Click on Order Source Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getOrder_Source_Value(), "Order Source Dropdown Value");
        });
        Thread.sleep(1000);
        
        
     // scroll to the bottom of the page
        ((JavascriptExecutor)driver)
            .executeScript("window.scrollTo(0, document.body.scrollHeight);");

        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_22", "Click on Minimum or Skus Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getMinimum_or_Skus_Dropdown(), "Minimum or Skus Dropdown"); 
        });
        Thread.sleep(1000);
          
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_23", "Click on Minimum or Skus Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getMinimum_or_Skus_Dropdown_Value(), "Minimum or Skus Dropdown Value"); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_24", "Enter From Price", () ->{
            Liabrary_Havmor.custom_Sendkeys(ASMM.getFrom_MRP_Textbox_EXCEL(), excel.getStringdata2("Scheme_Add", 1, 5), "From Price");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_25", "Enter To Price", () ->{
            Liabrary_Havmor.custom_Sendkeys(ASMM.getTo_MRP_Textbox_EXCEL(), excel.getStringdata2("Scheme_Add", 1, 6), "To Price");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_26", "Enter Activity Code", () ->{
            Liabrary_Havmor.custom_Sendkeys(ASMM.getActivity_Code_Textbox_Excel(), excel.getStringdata2("Scheme_Add", 1, 7), "Activity Code");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_27", "Click on Free Qty Treatment Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getFree_Qty_Treatment_Dropdown(), "Free Qty Treatment Dropdown"); 
        });
        Thread.sleep(1000);
          
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_28", "Click on Free Qty Treatment Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getFree_Qty_Treatment_Dropdown_Value(), "Free Qty Treatment Dropdown Value"); 
        });
        Thread.sleep(1000);
        
        
     //Page 2 Product Info
        
        
        
    
   
    }
}
