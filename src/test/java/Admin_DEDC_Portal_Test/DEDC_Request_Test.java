package Admin_DEDC_Portal_Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Admin_DEDC_Request.DEDC_Request_Main;
import Com_Utility_Havmor.BaseClass_otp;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class DEDC_Request_Test extends BaseClass_otp{
	
	
	@Test
	public void Add_DEDC_Request() throws Exception {
	
	
	DEDC_Request_Main ass = PageFactory.initElements(driver , DEDC_Request_Main.class);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_01", "Verify that user Click On Scheme Menu", () ->{
	Liabrary_Havmor.custom_click(ass.getScheme_Menu(), "Click On Scheme Menu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_02", "Verify that user Click On DEDC SubMenu", () ->{
	Liabrary_Havmor.custom_click(ass.getDEDC_Menu(), "Click On DEDC SubMenu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_03", "Verify that user Click On DEDC Request SubMenu", () ->{
	Liabrary_Havmor.custom_click(ass.getDEDCRequest_SubMenu(), "Click On DEDC Request SubMenu");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_04", "Verify that user Click On Add btn", () ->{
	Liabrary_Havmor.custom_click(ass.getAdd_btn(), "Click On Add btn");      
	});
	Thread.sleep(1000);
	
	
//	ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_05", "Verify that user Click on Distributor code dropdown", () ->{
//	Liabrary_Havmor.custom_click(ass.getDistributor_dropdown(), "Click on Distributor code dropdown");      
//	});
//	Thread.sleep(1000);
//	
//	
//	ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_06", "Verify that user Click on Distributor code dropdown value", () ->{
//	Liabrary_Havmor.custom_click(ass.getDistributor_dropdownValue(), "Click on Distributor code dropdown value");      
//	});
//	Thread.sleep(1000);
//	
//	
//	ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_07", "Verify that user Click on Retailer dropdown", () ->{
//	Liabrary_Havmor.custom_click(ass.getOutlet_dropdown(), "Click on Retailer dropdown");      
//	});
//	Thread.sleep(1000);
//		
//		
//	ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_08", "Verify that user Click on Retailer dropdown value", () ->{
//	Liabrary_Havmor.custom_click(ass.getOutlet_dropdownValue(), "Click on Retailer dropdown value");      
//	});
//	Thread.sleep(1000);
	
	
	// ===== Copy from here =====
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
	boolean retailerSelected = false;

	// 1) Distributor dropdown खोलो
	ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_05", "Open Distributor dropdown", () -> {
	    Liabrary_Havmor.custom_click(ass.getDistributor_dropdown(), "Click Distributor dropdown");
	});
	Thread.sleep(700);

	// 2) Distributors को एक stable list में ले लो (strings), ताकि DOM refresh se StaleElement ना आये
	List<String> distributors = new ArrayList<>();
	for (WebElement li : ass.getDistributor_options()) {
	    String txt = li.getText().trim();
	    if (!txt.isEmpty() && !txt.toLowerCase().contains("select")) {
	        distributors.add(txt);
	    }
	}
	if (distributors.isEmpty()) throw new RuntimeException("No distributors found in dropdown.");

	// 3) हर distributor के लिए try करो जब तक retailer मिल न जाए
	for (int i = 0; i < distributors.size(); i++) {

	    String distToSelect = distributors.get(i);

	    // dropdown दुबारा खोलो (custom menus click पर बंद हो जाते हैं)
	    ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_06", "Re-open Distributor dropdown", () -> {
	        Liabrary_Havmor.custom_click(ass.getDistributor_dropdown(), "Re-open Distributor dropdown");
	    });

	    // options visible होने का wait
	    wait.until(d -> ass.getDistributor_options().size() > 0);

	    // current distributor option re-fetch करके click करो
	    WebElement currentDist =
	        ass.getDistributor_options()
	           .stream()
	           .filter(op -> op.getText().trim().equals(distToSelect))
	           .findFirst()
	           .orElseThrow(() -> new RuntimeException("Distributor option not visible: " + distToSelect));

	    ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_07",
	            "Select Distributor → " + distToSelect, () -> {
	        Liabrary_Havmor.custom_click(currentDist, "Distributor -> " + distToSelect);
	    });

	    // थोड़ा रुककर retailer को load होने दो
	    Thread.sleep(800);

	    // 4) Retailer dropdown खोलो
	    ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_08", "Open Retailer dropdown", () -> {
	        Liabrary_Havmor.custom_click(ass.getOutlet_dropdown(), "Click Retailer dropdown");
	    });

	    try {
	        // Retailer options आने का wait (कम से कम 1 valid option)
	        wait.until(d -> {
	            List<WebElement> ops = ass.getOutlet_options();
	            return ops != null && ops.size() > 0;
	        });

	        // options पढ़ो और placeholder/no-record को हटा दो (सुरक्षा के लिए)
	        List<WebElement> validRetailers = new ArrayList<>();
	        for (WebElement li : ass.getOutlet_options()) {
	            String t = li.getText().trim();
	            if (!t.isEmpty()
	                && !t.toLowerCase().contains("select")
	                && !t.toLowerCase().contains("no record")
	                && !t.toLowerCase().contains("no data")) {
	                validRetailers.add(li);
	            }
	        }

	        if (!validRetailers.isEmpty()) {
	            WebElement firstRetailer = validRetailers.get(0);
	            String retailerName = firstRetailer.getText().trim();

	            ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_09",
	                    "Select Retailer → " + retailerName, () -> {
	                Liabrary_Havmor.custom_click(firstRetailer, "Retailer -> " + retailerName);
	            });

	            retailerSelected = true;
	            break; // ✅ success — loop खत्म
	        } else {
	            System.out.println("No retailer for: " + distToSelect + " — trying next distributor…");
	        }

	    } catch (Exception e) { // यहाँ generic catch रखो (TimeoutException की ज़रूरत नहीं)
	        System.out.println("Retailer list did not load for: " + distToSelect + " — trying next distributor…");
	    }

	    // अगला distributor try करने से पहले छोटा pause
	    Thread.sleep(600);
	}

	// 5) Final check
	if (!retailerSelected) {
	    throw new RuntimeException("No retailer available for any distributor tried.");
	}
	// ===== Copy till here =====

	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_09", "Verify that user send Etimated Sales", () ->{
	Liabrary_Havmor.custom_Sendkeys(ass.getEstimatedSales_TextBox(), excel.getStringdata2("DECD_Request_Add", 1, 0), "send Etimated Sales");
	});
	Thread.sleep(1000);	
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_10", "Verify that user click on CompitativeOutlet dropdown", () ->{
	Liabrary_Havmor.custom_click(ass.getCompitativeOutlet_dropdown(), "click on CompitativeOutlet dropdown");
	});
	Thread.sleep(1000);	
		
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_11", "Verify that user click on CompitativeOutlet dropdown value", () ->{
	Liabrary_Havmor.custom_click(ass.getCompitativeOutlet_dropdownValue(), "click on CompitativeOutlet dropdown value");
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_12", "Verify that user send value in Tentative Competition Sales TextBox", () ->{
	Liabrary_Havmor.custom_Sendkeys(ass.getTCS_TextBox(), excel.getStringdata2("DECD_Request_Add", 1, 1), "send Tentative Competition Sales TextBox");
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_13", "Verify that user send value in DEDC % TextBox", () ->{
	Liabrary_Havmor.custom_Sendkeys(ass.getDEDC_TextBox(), excel.getStringdata2("DECD_Request_Add", 1, 2), "send DEDC % TextBox");
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_14", "Verify that user send value in Company Contribution TextBox", () ->{
	Liabrary_Havmor.custom_Sendkeys(ass.getCompanyContribution_TextBox(), excel.getStringdata2("DECD_Request_Add", 1, 3), "send value in Company Contribution TextBox");
	});
	Thread.sleep(1000);
	
	
	
	
	  ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_15", "From Date To Date", () ->{     
	        
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

	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

	        By toTitle = By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_dtpToDate_calendar_wrapper']//tbody//td[@id='ctl00_ParentMasterContentPlaceHolder1_dtpToDate_calendar_Title']");

	        wait1.until(ExpectedConditions.visibilityOfElementLocated(toTitle));
	         
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
	
	
	
	  ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_16", "Verify that user click on Scheme Applicable dropdown", () ->{
	  Liabrary_Havmor.custom_click(ass.getSchemeApplicable_dropdown(), "click on Scheme Applicable dropdown");
	  });
	  Thread.sleep(1000);	
				
				
	  ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_17", "Verify that user click on Scheme Applicable dropdown value", () ->{
	  Liabrary_Havmor.custom_click(ass.getSchemeApplicable_dropdown_Value(), "click on Scheme Applicable dropdown value");
	  });
	  Thread.sleep(1000);
	
	
	  ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_18", "Verify that user click on PayoutFrequency dropdown", () ->{
	  Liabrary_Havmor.custom_click(ass.getPayoutFrequency_dropdown(), "click on PayoutFrequency dropdown");
	  });
	  Thread.sleep(1000);	
					
					
	  ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_19", "Verify that user click on PayoutFrequency dropdown value", () ->{
	  Liabrary_Havmor.custom_click(ass.getPayoutFrequency_dropdownValue(), "click on PayoutFrequency dropdown value");
	  });
	  Thread.sleep(1000);
	
	
	  ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_20", "Verify that user click on DiscountAppOn dropdown", () ->{
	  Liabrary_Havmor.custom_click(ass.getDiscountAppOn_dropdown(), "click on DiscountAppOn dropdown");
	  });
	  Thread.sleep(1000);	
						
						
	  ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_21", "Verify that user click on DiscountAppOn dropdown value", () ->{
	  Liabrary_Havmor.custom_click(ass.getDiscountAppOn_dropdownValue(), "click on DiscountAppOn dropdown value");
	  });
	  Thread.sleep(1000);
	
	
	  ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_22", "Verify that user click on DiscountAppOn dropdown", () ->{
	  Liabrary_Havmor.custom_click(ass.getPayoutType_dropdown(), "click on DiscountAppOn dropdown");
	  });
	  Thread.sleep(1000);	
							
							
	  ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_23", "Verify that user click on DiscountAppOn dropdown value", () ->{
	  Liabrary_Havmor.custom_click(ass.getPayoutType_dropdownValue(), "click on DiscountAppOn dropdown value");
	  });
	  Thread.sleep(1000);
	
	
	  ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_24", "Verify that user click on ProductWise dropdown", () ->{
	  Liabrary_Havmor.custom_click(ass.getProductWise_dropdown(), "click on ProductWise dropdown");
	  });
	  Thread.sleep(1000);	
								
								
	  ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_25", "Verify that user click on ProductWise dropdown value", () ->{
	  Liabrary_Havmor.custom_click(ass.getProductWise_dropdownValue(), "click on ProductWise dropdown value");
	  });
	  Thread.sleep(1000);
	
	
	  ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_26", "Verify that user click on Product Hierarchy dropdown", () ->{
	  Liabrary_Havmor.custom_click(ass.getProductHierarchy_dropdown(), "click on Product Hierarchy dropdown");
	  });
	  Thread.sleep(1000);	
									
									
	  ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_27", "Verify that user click on Product Hierarchy dropdown value", () ->{
	  Liabrary_Havmor.custom_click(ass.getProductHierarchy_dropdownValue(), "click on Product Hierarchy dropdown value");
	  });
	  Thread.sleep(1000);
	
	
	  ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_28", "Verify that user click on CategoryWise dropdown", () ->{
	  Liabrary_Havmor.custom_click(ass.getCategoryWise_dropdown(), "click on CategoryWise dropdown");
	  });
	  Thread.sleep(1000);	
										
										
	  ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_29", "Verify that user click on ICECREAM_CheckBox", () ->{
	  Liabrary_Havmor.custom_click(ass.getICECREAM_CheckBox(), "click on ICECREAM_CheckBox");
	  });
	  Thread.sleep(1000);
	
	
	  ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_30", "Verify that user click on Send Request btn", () ->{
	  Liabrary_Havmor.custom_click(ass.getBtnSendRequest(), "click on Send Request btn");
	  });
	  Thread.sleep(1000);
	
	
//	  ObjectRepo_Havmor.startTestAndLog_1_SS("Add_DEDC_Request_Test_30", "Verify that user click on Close btn", () ->{
//	  Liabrary_Havmor.custom_click(ass.getBtnModalClose(), "click on Close btn");
//	  });
	  Thread.sleep(1000);
	
//	
	
	
	
	
	
	
	
	
	
	
	}
	

}
