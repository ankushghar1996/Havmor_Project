package Admin_Masters_Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Admin_Masters.Route_Master_Add_BTN_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Route_Master_Add_BTN_Test  extends BaseClass {
	
	@Test
    public void RM_Add_Page() throws Exception {

        Route_Master_Add_BTN_Main RMADD = PageFactory.initElements(driver, Route_Master_Add_BTN_Main.class);
        HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
    	
    	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_01", "Verify that user Click On Master Menu ", () ->{
    	Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
    	});
    	Thread.sleep(1000);
	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_02", "Verify that user click on Route Master Sub Menu ", () ->{
        Liabrary_Havmor.custom_click(home.getRoute_Master_Submenu(), "Route Master Submenu");    });  
    	Thread.sleep(1000);
    	 	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_03", "Verify that user Click on Route Master ", () ->{
    	Liabrary_Havmor.custom_click(RMADD.getRoute_Master(),"Route Master");
    	});
    	Thread.sleep(1000);
    	
//    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_04", "Verify that user Click on Add Button", () ->{
//        Liabrary_Havmor.custom_click(RMADD.getAdd_Button(),"Add Button");
//        });
//        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_05", "Verify that user Click on Add Button",() -> {
        	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        	        
//        	        // Wait for overlay (modal) to disappear before clicking
//        	        wait.until(ExpectedConditions.invisibilityOfElementLocated(
//        	            By.id("myModal") // use the actual modal/overlay locator
//        	        ));
//        	        
        	        // Wait until Add Button is clickable
        	        WebElement addBtn = wait.until(
        	            ExpectedConditions.elementToBeClickable(RMADD.getAdd_Button())
        	        );

        	        // Click it
        	        Liabrary_Havmor.custom_click(addBtn, "Add Button");
        	    }
           	);

            
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_06", "Verify that user Click on Channel Type Dropdown", () ->{
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        	WebElement channelDropdown = wait.until(ExpectedConditions.elementToBeClickable(RMADD.getChannel_Type_Dropdown()));
        	channelDropdown.click();

        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_07", "Verify that user Click on Channel Type Dropdown Value", () ->{
        Liabrary_Havmor.custom_click(RMADD.getChannel_Type_Dropdown_Value(),"Channel Type Dropdown Value");
         });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_08", "Verify that user Click on Distributor Name Dropdown", () ->{
        Liabrary_Havmor.custom_click(RMADD.getDistributor_Name(),"Distributor Name Dropdown");
        });
        Thread.sleep(1000);
            
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_09", "Verify that user Click on Distributor Name Dropdown Value", () ->{
        Liabrary_Havmor.custom_click(RMADD.getDistributor_Name_Value(),"Distributor Name Dropdown Value");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_10", "Verify that user Click on Salesman Name Dropdown", () ->{
        Liabrary_Havmor.custom_click(RMADD.getSalesman_Name_Dropdown(),"Salesman Name Dropdown");
        });
        Thread.sleep(1000);
                
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_11", "Verify that user Click on Salesman Name Dropdown Value", () ->{
        Liabrary_Havmor.custom_click(RMADD.getSalesman_Name_Dropdown_Value(),"Salesman Name Dropdown Value");
        });
        Thread.sleep(1000);
        
        
     /*   
     // --- start inline flow (paste inside your test / @Test body) ---
     // --- start inline flow (paste inside your test / @Test body) ---
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
        boolean salesmanSelected = false;

        // 1) Open Distributor dropdown
        ObjectRepo_Havmor.startTestAndLog_1_SS("Route_Master_SelectSalesman_01", "Open Distributor dropdown", () -> {
            Liabrary_Havmor.custom_click(RMADD.getDistributor_Name(), "Click Distributor dropdown");
        });
        Thread.sleep(700);

        // 2) Get all distributors into a stable list
        List<String> distributors = new ArrayList<>();
        List<WebElement> distributorOptions = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddldistributor']//ul/li"));
        for (WebElement li : distributorOptions) {
            String txt = li.getText().trim();
            if (!txt.isEmpty() && !txt.toLowerCase().contains("select")) {
                distributors.add(txt);
            }
        }
        if (distributors.isEmpty()) {
            throw new RuntimeException("No distributors found in dropdown.");
        }

        // 3) Try each distributor until a salesman is selectable
        for (String distToSelect : distributors) {

            // Re-open Distributor dropdown
            ObjectRepo_Havmor.startTestAndLog_1_SS("Route_Master_SelectSalesman_02",
                    "Re-open Distributor dropdown", () -> {
                Liabrary_Havmor.custom_click(RMADD.getDistributor_Name(), "Re-open Distributor dropdown");
            });

            wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(
            	    By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddldistributor']//ul/li"),
            	    0));

            // Re-fetch and match distributor element by text
            List<WebElement> currentOptions = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddldistributor']//ul/li"));
            WebElement currentDist = currentOptions.stream()
                    .filter(op -> op.getText().trim().equals(distToSelect))
                    .findFirst()
                    .orElse(null);

            if (currentDist == null) {
                System.out.println("Distributor not visible right now: " + distToSelect + " — skipping.");
                Thread.sleep(300);
                continue;
            }

            // Select current distributor
            ObjectRepo_Havmor.startTestAndLog_1_SS("Route_Master_SelectSalesman_03",
                    "Select Distributor → " + distToSelect, () -> {
                Liabrary_Havmor.custom_click(currentDist, "Distributor -> " + distToSelect);
            });

            Thread.sleep(800); // wait for salesman dropdown to load

            // 4) Open Salesman dropdown
            ObjectRepo_Havmor.startTestAndLog_1_SS("Route_Master_SelectSalesman_04",
                    "Open Salesman dropdown", () -> {
                Liabrary_Havmor.custom_click(RMADD.getSalesman_Name_Dropdown(), "Click Salesman dropdown");
            });

            try {
                // Wait until salesman options appear
                wait.until(d -> driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlsalesman']//ul/li")).size() > 0);

                List<WebElement> salesmanOptions = driver.findElements(By.xpath("//div[@id='ctl00_ParentMasterContentPlaceHolder1_ddlsalesman']//ul/li"));
                List<WebElement> validSalesmen = new ArrayList<>();

                for (WebElement li : salesmanOptions) {
                    String t = li.getText().trim();
                    if (!t.isEmpty()
                            && !t.toLowerCase().contains("select")
                            && !t.toLowerCase().contains("no record")
                            && !t.toLowerCase().contains("no data")) {
                        validSalesmen.add(li);
                    }
                }

                if (!validSalesmen.isEmpty()) {
                    WebElement firstSalesman = validSalesmen.get(0);
                    String salesmanName = firstSalesman.getText().trim();

                    ObjectRepo_Havmor.startTestAndLog_1_SS("Route_Master_SelectSalesman_05",
                            "Select Salesman → " + salesmanName, () -> {
                        Liabrary_Havmor.custom_click(firstSalesman, "Salesman -> " + salesmanName);
                    });

                    salesmanSelected = true;
                    break;
                } else {
                    System.out.println("No salesman for distributor: " + distToSelect + " — trying next distributor…");
                }

            } catch (Exception e) {
                System.out.println("Salesman list not loaded for distributor: " + distToSelect + " — " + e.getMessage());
            }

            Thread.sleep(600); // short pause before next distributor
        }

        // 5) Final check
        if (!salesmanSelected) {
            throw new RuntimeException("No salesman available for any distributor tried.");
        }
        // --- end inline flow ---

*/
        
        

        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_12", "Verify that user Click on Salesman Name Dropdown Value", () ->{
        Liabrary_Havmor.custom_Sendkeys(RMADD.getRoute_Name_Excel(), excel.getStringdata2("Route_Add", 1, 0), "Route Name");
        });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_13", "Verify that user Enter ERP Code", () ->{
        Liabrary_Havmor.custom_Sendkeys(RMADD.getErp_Code_Textbox_Excel(), excel.getStringdata2("Route_Add", 1, 1), "ERP Code");
          });
       Thread.sleep(1000);
          
       ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_MasterADD_TC_14", "Verify that user Click on Save Button", () ->{
          Liabrary_Havmor.custom_click(RMADD.getSave_Button(),"Save Button");
            });
       Thread.sleep(1000);
                

}

}