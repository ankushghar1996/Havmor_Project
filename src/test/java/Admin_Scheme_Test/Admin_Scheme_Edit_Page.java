package Admin_Scheme_Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Admin_Scheme_Main.Admin_Scheme_Master_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Admin_Scheme_Edit_Page extends BaseClass {

	    @Test
	    public void Scheme_Edit() throws Exception {

	        Admin_Scheme_Master_Main ASMM = PageFactory.initElements(driver, Admin_Scheme_Master_Main.class);
	        HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
	        
	      //Page 1 Basic Info
	        
	        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_Edit_TC_01", "Click on Scheme Menu", () ->{
	            Liabrary_Havmor.custom_click(home.getScheme_Menu(), "Scheme Menu");
	        });
	        Thread.sleep(1000);

	        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_Edit_TC_02", "Click on Scheme Setup Submenu", () ->{
	            Liabrary_Havmor.custom_click(home.getScheme_Setup_Submenu(), "Scheme Setup Submenu");
	        });
	        Thread.sleep(1000);

	        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_Edit_TC_03", "Click on Scheme Creation", () ->{
	            Liabrary_Havmor.custom_click(ASMM.getScheme_Creation(), "Scheme Creation");
	        });
	        Thread.sleep(1000);

	        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_Edit_TC_04", "Click on Action Edit Icon", () ->{
	            Liabrary_Havmor.custom_click(ASMM.getAction_Edit_Scheme(), "Action Edit Icon");
	        });
	        Thread.sleep(1000);
	        
	        
	        //Basic Info Edit
	        
	        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_Edit_TC_05", "Click on Action Edit Button", () ->{
	            Liabrary_Havmor.custom_click(ASMM.getEdit_Scheme_Icon_Basic_Info(), "Edit Scheme Icon Basic Info");
	        });
	        Thread.sleep(1000);
	        
	        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_Edit_TC_06", "Click on Save AND Continue basic info", () ->{
	            Liabrary_Havmor.custom_click(ASMM.getSave_And_ContinueBTN(), "Save AND Continue basic info"); 
	        });
	        Thread.sleep(1000);

	        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_Edit_TC_07", "Click on Save AND Continue Product Info", () ->{
	            Liabrary_Havmor.custom_click(ASMM.getSave_And_ContinueProductInfo_BTN(), "Save AND Continue Product Info"); 
	        });
	        Thread.sleep(1000);
	        
	        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_Edit_TC_08", "Click on Save AND Continue Slab", () ->{
	            Liabrary_Havmor.custom_click(ASMM.getSave_And_Continue_Slab_BTN(), "Save AND Continue Slab"); 
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
		        String filePath = System.getProperty("user.dir") + "\\Image_Upload\\Retailer_List_Scheme_Budget_Upload.csv";
		        System.out.println("Uploading file: " + filePath);
		        
		        // Send the file path directly to the hidden file input
		        uploadInput.sendKeys(filePath);
	       	});
	       	Thread.sleep(5000);
	        
	       	
	       	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Program_Target_Upload_TC_83", "Verify that user Click on Upload Button Retailer", () ->{
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
	    	        String filePath = System.getProperty("user.dir") + "\\Image_Upload\\Distributor_List_Scheme_Budget_Upload.csv";
	    	        System.out.println("Uploading file: " + filePath);
	    	        
	    	        // Send the file path directly to the hidden file input
	    	        uploadInput.sendKeys(filePath);
	           	});
	           	Thread.sleep(5000);
	            
	           	
	           	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Program_Target_Upload_TC_86", "Verify that user Click on Upload Button Distributor", () ->{
	            Liabrary_Havmor.custom_click(ASMM.getUpload_Button_Distributor_Budget_Info(), "Upload_Button Distributor");
	            });
	             Thread.sleep(1000);
	        
	       
	        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_87", "Click on Save Button For Budget Upload Page", () ->{
	            Liabrary_Havmor.custom_click(ASMM.getSave_And_Continue_Budget_Upload_Page(), "Save Button For Budget Upload Page"); 
	       });
	        Thread.sleep(1000);
	        
//	        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Scheme_TC_85", "Click on Final Close Button Budget Upload", () ->{
//	            Liabrary_Havmor.custom_click(ASMM.getFinal_Close_Button_Budget_INFO(), "Final Close Button Budget Upload"); 
//	       });
//	        Thread.sleep(1000);
	        
	        
	    
	}
	}