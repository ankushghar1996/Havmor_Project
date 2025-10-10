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
        String expectedMonth = "October";
        String expectedYear = "2025";
        String expectedDate = "20";
         
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

        String toDay   = "30";
         
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
        	
        	Liabrary_Havmor.custom_clear(ASMM.getTo_MRP_Textbox_EXCEL());
        	
        	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
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
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_29", "Click on Save AND Continue basic info", () ->{
            Liabrary_Havmor.custom_click(ASMM.getSave_And_ContinueBTN(), "Save AND Continue basic info"); 
        });
        Thread.sleep(1000);
        
        
     //Page 2 Product Info
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_30", "Click on Product Hierarchy Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getProduct_Hierarchy_Dropdown(), "Product Hierarchy Dropdown"); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_31", "Click on Product Hierarchy Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getProduct_Hierarchy_Dropdown_Value1(), "Product Hierarchy Dropdown Value"); 
        });
        Thread.sleep(1000);
        

        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_32", "Click on Category Checkbox", () ->{
            Liabrary_Havmor.custom_click(ASMM.getCategory_Checkbox1(), "Category Checkbox"); 
        });
        Thread.sleep(1000);
        

        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_33", "Increase Quantity by 5", () -> {
            WebElement qtyBox = driver.findElement(By.xpath("//input[@class='txtQty form-control text-center']"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].stepUp(5);", qtyBox);
        });
        Thread.sleep(1000);

        

        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_34", "Click on Product Hierarchy Dropdown", () ->{
            // Locate the toggle element using an appropriate selector
            WebElement toggle = driver.findElement(By.xpath("//label[@class='switch ml-3']//span[@class='slider round']"));
            
            // First click on the toggle
            toggle.click();
            
            // Second click on the toggle
            toggle.click();
        });


        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_35", "Click on Save AND Continue Product info", () ->{
            Liabrary_Havmor.custom_click(ASMM.getSave_And_ContinueProductInfo_BTN(), "Save AND Continue Product info"); 
        });
        Thread.sleep(1000);
        
// Page 3 Slab Details
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_36", "Click on Slab Type Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getSlab_Type_Dropdown(), "Slab Type Dropdown"); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_37", "Click on Slab Type Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getSlab_Type_Dropdown_Value(), "Slab Type Dropdown Value"); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_38", "Enter To CAP on Discount ",() ->{
            Liabrary_Havmor.custom_Sendkeys(ASMM.getCAP_on_Discount_Amt_Textbox_Excel(), excel.getStringdata2("Scheme_Add", 1, 8), "CAP on Discount");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_39", "Click on Is purchase limit applicable ", () ->{
            Liabrary_Havmor.custom_click(ASMM.getIs_purchase_limit_applicable_Dropdown(), "Is purchase limit applicable "); 
        });
        Thread.sleep(1000);  
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_40", "Click on Is purchase limit applicable Value ", () ->{
            Liabrary_Havmor.custom_click(ASMM.getIs_purchase_limit_applicable_Dropdown_Value(), "Is purchase limit applicable Value "); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_41", "Click on Discount Calculated On Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getDiscount_Calculated_on_Dropdown(), "Is purchase limit applicable "); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_42", "Click on Discount Calculated On Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getDiscount_Calculated_On_Dropdown_Value(), "Discount Calculated On Dropdown Value "); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_43", "Click on Slab Calculation On Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getSlab_Calculation_On_Dropdown(), "Slab Calculation On Dropdown"); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_44", "Click on Slab Calculation On Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getDiscount_Calculated_On_Dropdown_Value(), "Slab Calculation On Dropdown Value "); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_45", "Click on Basis for Scheme Bifurcation Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getBasis_for_Scheme_Bifurcation_Dropdown(), "Basis for Scheme Bifurcation Dropdown"); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_46", "Click on Basis for Scheme Bifurcation Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getBasis_for_Scheme_Bifurcation_Dropdown_Value(), "Basis for Scheme Bifurcation Dropdown Value "); 
        });
        Thread.sleep(1000);
        
        //Add Slab Link1
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_47", "Click on Add Slab Link1", () ->{
            Liabrary_Havmor.custom_click(ASMM.getSlab_Add_Link1_BTN(), "Click on Add Slab Link1"); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_48", "Enter On QTY Textbox value", () ->{
            Liabrary_Havmor.custom_Sendkeys(ASMM.getOn_QTY__Textbox_EXCEL(), excel.getStringdata2("Scheme_Add", 1, 9), "On QTY Value");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_49", "Enter From Discount", () ->{
            Liabrary_Havmor.custom_Sendkeys(ASMM.getFrom_Discount__Textbox_EXCEL(), excel.getStringdata2("Scheme_Add", 1, 10), "From Discount");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_50", "Enter To Discount", () ->{
            Liabrary_Havmor.custom_Sendkeys(ASMM.getTo_Discount__Textbox_EXCEL(), excel.getStringdata2("Scheme_Add", 1, 11), "From Discount");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_51", "Click on Add Slab Button", () ->{
            Liabrary_Havmor.custom_click(ASMM.getAdd_Slab_Button(), "Add Slab Button"); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_52", "Click on Save Button Slab", () ->{
            Liabrary_Havmor.custom_click(ASMM.getSave_And_Continue_Slab_BTN(), "Save Button slab"); 
        });
        Thread.sleep(1000);
        
        //Applicable For page..
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_53", "Click on Distributor Selection Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getDistributor_Selection_Dropdown(), "Click on Distributor Selection Dropdown "); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_54", "Click on Distributor Selection Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getDistributor_Selection_Dropdown_Value(), "Click on Distributor Selection Dropdown Value"); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_53", "Click on Distributor Selection Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getDistributor_Selection_Dropdown(), "Click on Distributor Selection Dropdown "); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_54", "Click on Distributor Selection Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getDistributor_Selection_Dropdown_Value(), "Click on Distributor Selection Dropdown Value"); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_55", "Click on Distributor Type Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getDistributor_Type_Dropdown(), "Click on Distributor Type Dropdown "); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_56", "Click on Distributor Type Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getDistributor_Type_Dropdown_Value1(), "Click on Distributor Type Dropdown Value"); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_57", "Click on State Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getState_Applicable_For_Dropdown(), "Click on State Dropdown "); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_58", "Click on State Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getState_Applicable_For_Dropdown_Value(), "Click on State Dropdown Value"); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_59", "Click on Town Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getTown_Applicable_For_Dropdown(), "Click on Town Dropdown "); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_60", "Click on Town Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getTown_Applicable_For_Dropdown_Value(), "Click on Town Dropdown Value"); 
       });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_61", "Click on Sales Hierarchy Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getSales_Heirarchy_Applicable_For_Dropdown(), "Click on Sales Hierarchy Dropdown "); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_62", "Click on Sales Hierarchy Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getSales_Heirarchy_Applicable_For_Dropdown_Value(), "Click on Sales Hierarchy Dropdown Value"); 
       });
        Thread.sleep(1000);
        
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_63", "Click on Select Sales Hierarchy Name Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getSelect_Sales_Hierarchy_Name_Dropdown(), "Click on Select Sales Hierarchy Name Dropdown "); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_64", "Click on Select Sales Hierarchy Name Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getSelect_Sales_Hierarchy_Name_Dropdown_Value(), "Click on Select Sales Hierarchy Name Dropdown Value"); 
       });
        Thread.sleep(1000);
        
        
        //Retailer Selection ATTRIBUTE 
        
       
        WebElement qtyBox = driver.findElement(By.xpath("//input[@id='ddl_VicinityName_4_Input']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", qtyBox);
        Thread.sleep(1000);

        
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_65", "Click on Retailer Selection Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getRetailer_Selection_Dropdown(), "Click on Retailer Selection Dropdown "); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_66", "Click on Retailer Selection Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getRetailer_Selection_Dropdown_Value(), "Click on Retailer Selection Dropdown Value"); 
       });
        Thread.sleep(1000);
        
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_67", "Click on Branding Status Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getBranding_Status_ApplicableFor_Dropdown(), "Click on Branding Status Dropdown "); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_68", "Click on Branding Status Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getBranding_Status_ApplicableFor_Dropdown_Value(), "Click on Branding Status Dropdown Value"); 
       });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_69", "Click on DF Status Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getDF_Status_ApplicableFor_Dropdown(), "Click on DF Status Dropdown "); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_70", "Click on DF Status Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getDF_Status_ApplicableFor_Dropdown_ValueDF(), "Click on DF Status Dropdown Value"); 
       });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_71", "Click on Type 2 Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getType2_ApplicableFor_Dropdown(), "Click on Type 2 Dropdown "); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_72", "Click on Type 2 Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getType2_ApplicableFor_Dropdown_Value(), "Click on Type 2 Dropdown Value"); 
       });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_73", "Click on Urban Retailer Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getUrban_Retailer_ApplicableFor_Dropdown(), "Click on Urban Retailer Dropdown "); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_74", "Click on Urban Retailer Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getUrban_Retailer_ApplicableFor_Dropdown_Value1(), "Click on Urban Retailer Dropdown Value"); 
       });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_75", "Click on Vicinity Name Dropdown", () ->{
            Liabrary_Havmor.custom_click(ASMM.getVicinity_Name_ApplicableFor_Dropdown(), "Click on Vicinity Name Dropdown "); 
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_76", "Click on Vicinity Name Dropdown Value", () ->{
            Liabrary_Havmor.custom_click(ASMM.getVicinity_Name_ApplicableFor_Dropdown_Value(), "Click on Vicinity Name Dropdown Value"); 
       });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_77", "Click on Save Button For Applicable For", () ->{
            Liabrary_Havmor.custom_click(ASMM.getSave_And_Continue_Applicable_For_BTN(), "Save Button For Applicable For"); 
       });
        Thread.sleep(1000);
        
        
        //Budget Upload Page
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_78", "Enter National Budget", () ->{
            Liabrary_Havmor.custom_Sendkeys(ASMM.getNational_Budget__Textbox_EXCEL(), excel.getStringdata2("Scheme_Add", 1, 13), "Enter National Budget");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_79", "Enter Allocated Budget Per Distributor", () ->{
            Liabrary_Havmor.custom_Sendkeys(ASMM.getAllocated_Budget_Per_Distributor_Textbox_EXCEL(), excel.getStringdata2("Scheme_Add", 1, 14 ), "Enter Allocated Budget Per Distributor");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_80", "Enter Allocated Budget Per Retailer", () ->{
            Liabrary_Havmor.custom_Sendkeys(ASMM.getAllocated_Budget_Per_Retailer_Textbox_EXCEL(), excel.getStringdata2("Scheme_Add", 1, 15 ), "Enter Allocated Budget Per Retailer");
        });
        Thread.sleep(1000);
        
      //Retailer Upload
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_81", "Click on Retailer Toggle switch Budget Info", () ->{
            // Locate the toggle element using an appropriate selector
            WebElement toggle = driver.findElement(By.xpath("//input[@id='chkToggleOutlet']/following-sibling::span[@class='slider round']"));
            
            // First click on the toggle
            toggle.click(); });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_82", "Verify that user Click on Select File to upload Retailer", () ->{
       		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        // Wait for the file input to be present in the DOM
	        WebElement uploadInput = wait.until(
	            ExpectedConditions.presenceOfElementLocated(
	                By.id("ParentMasterContentPlaceHolder1_FileUpload7"))
	        );
	        // Build an absolute path to your file
	        String filePath = System.getProperty("user.dir") + "\\test-output\\Image_Upload\\Retailer_List_Scheme_Budget_Upload.csv";
	        System.out.println("Uploading file: " + filePath);
	        
	        // Send the file path directly to the hidden file input
	        uploadInput.sendKeys(filePath);
       	});
       	Thread.sleep(5000);
        
       	
       	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_83", "Verify that user Click on Upload Button Retailer", () ->{
            Liabrary_Havmor.custom_click(ASMM.getUpload_Button_Retailer_Budget_Info(), "Upload_Button Retailer");
            });
            Thread.sleep(1000);
            
            //Distributor Upload
        
            ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_84", "Click on Distributor Toggle switch Budget Info", () ->{
                // Locate the toggle element using an appropriate selector
                WebElement toggle = driver.findElement(By.xpath("//input[@id='chkSpecificDistributor']/following-sibling::span[@class='slider round']"));    
                // First click on the toggle
                toggle.click();  });
            
            Thread.sleep(1000);
            
            ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_85", "Verify that user Click on Select File to upload Distributor", () ->{
           		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	        // Wait for the file input to be present in the DOM
    	        WebElement uploadInput = wait.until(
    	            ExpectedConditions.presenceOfElementLocated(
    	                By.id("ParentMasterContentPlaceHolder1_FileUpload9"))
    	        );
    	        // Build an absolute path to your file
    	        String filePath = System.getProperty("user.dir") + "\\test-output\\Image_Upload\\Distributor_List_Scheme_Budget_Upload.csv";
    	        System.out.println("Uploading file: " + filePath);
    	        
    	        // Send the file path directly to the hidden file input
    	        uploadInput.sendKeys(filePath);
           	});
           	Thread.sleep(5000);
            
           	
           	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_86", "Verify that user Click on Upload Button Distributor", () ->{
                Liabrary_Havmor.custom_click(ASMM.getUpload_Button_Distributor_Budget_Info(), "Upload_Button Distributor");
                });
                Thread.sleep(1000);
        
       
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_87", "Click on Save Button For Budget Upload Page", () ->{
            Liabrary_Havmor.custom_click(ASMM.getSave_And_Continue_Budget_Upload_Page(), "Save Button For Budget Upload Page"); 
       });
        Thread.sleep(1000);
        
//        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_85", "Click on Final Close Button Budget Upload", () ->{
//            Liabrary_Havmor.custom_click(ASMM.getFinal_Close_Button_Budget_INFO(), "Final Close Button Budget Upload"); 
//       });
//        Thread.sleep(1000);
        
        
    
}
}