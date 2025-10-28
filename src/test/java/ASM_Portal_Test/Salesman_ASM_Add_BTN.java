package ASM_Portal_Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Admin_Masters.Salesman_Master_AddBTN_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass_ASM;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Salesman_ASM_Add_BTN extends BaseClass_ASM {

	  @Test
	  public void Salesman_Master_AddBTN() throws Exception {
		  
	        Salesman_Master_AddBTN_Main STMADD = PageFactory.initElements(driver, Salesman_Master_AddBTN_Main.class);
	        HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);

	    	ObjectRepo_Havmor.startTestAndLog_1_SS("ASM_Salesman_Master_Add_TC_01", "Verify that user Click On Master Menu ", () ->{
	    	Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");});
	    	Thread.sleep(1000);
		
	    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Add_TC_02", "Verify that user click on Salesman Master Sub Menu ", () ->{
	        Liabrary_Havmor.custom_click(home.getSalesman_Master_Submenu(), "Salesman Master Submenu");    });  
	    	Thread.sleep(1000);
		
	    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Add_TC_03", "Verify that user click on Salesman Master ", () ->{
	        Liabrary_Havmor.custom_click(STMADD.getSalesman_Master(), " Salesman Master "); });  
	    	Thread.sleep(1000);
	    	
	    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Add_TC_04", "Verify that user click on Add Button ", () ->{
	        Liabrary_Havmor.custom_click(STMADD.getAdd_Button(), " Add Button "); });  
		  	Thread.sleep(1000);
		    	
		   ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Add_TC_05", "Verify that user click on Creation Type Dropdown", () ->{
		   Liabrary_Havmor.custom_click(STMADD.getCreation_Type(), " Creation Type Dropdown"); });  
		   Thread.sleep(1000);
		   
		   ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Add_TC_06", "Verify that user click on Creation Type Dropdown Value", () ->{
		   Liabrary_Havmor.custom_click(STMADD.getCreation_Type_Value(), " Creation Type Dropdown Value"); });  
	       Thread.sleep(1000);
	
	       ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Add_TC_07", "Verify that user click on Channel Type Dropdown ", () ->{
		   Liabrary_Havmor.custom_click(STMADD.getChannel_Type(), " Channel Type Dropdown "); });  
		   Thread.sleep(1000);
		   
		   ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Add_TC_08", "Verify that user click on Channel Type Dropdown Value ", () ->{
		   Liabrary_Havmor.custom_click(STMADD.getChannel_Type_Value(), " Channel Type Dropdown Value "); });  
		   Thread.sleep(1000);
	
	
		 ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Add_TC_09", "Verify that user click on Channel Type Dropdown ", () ->{
	     Liabrary_Havmor.custom_click(STMADD.getSalesman_Type(), " Salesman Type Dropdown "); });  
	     Thread.sleep(1000);
	
	
	     ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Add_TC_10", "Verify that user click on Salesman Type Dropdown Value", () ->{
	     Liabrary_Havmor.custom_click(STMADD.getSalesman_Type_Value(), " Salesman Type Dropdown Value"); });  
         Thread.sleep(1000);
         
         ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Add_TC_11", "Verify that user click on Distributor Dropdown ", () ->{
    	 Liabrary_Havmor.custom_click(STMADD.getDistributor(), " Distributor Dropdown "); });  
         Thread.sleep(1000);
    	
    	
   	     ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Add_TC_12", "Verify that user click on Distributor Dropdown Value", () ->{
  	     Liabrary_Havmor.custom_click(STMADD.getDistributor_Value(), " Distributor Dropdown Value"); });  
   	     Thread.sleep(1000);
	
   	      ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_ADD_TC_13", "Verify that user Should Enter Employee Code/UserId in Textbox", () ->{
          Liabrary_Havmor.custom_Sendkeys(STMADD.getEmployee_Code_UserId_Textbox_EXCEL(), excel.getStringdata2("Salesman_Add", 1, 0), "Employee Code/UserId");
          });
          Thread.sleep(1000);
          

          //useer id
          ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_ADD_TC_14", "Verify that user Should Enter UserId in Textbox", () ->{
          Liabrary_Havmor.custom_Sendkeys(STMADD.getTxtUserId(), excel.getStringdata2("Salesman_Add", 1, 1), "Employee Code/UserId");
           });
         Thread.sleep(1000);
          
  
          ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_ADD_TC_14", "Verify that user Should Enter Salesman Name in Textbox", () ->{
          Liabrary_Havmor.custom_Sendkeys(STMADD.getSalesman_Name_Textbox_EXCEL(), excel.getStringdata2("Salesman_Add", 1, 2), "Salesman Name");
          });
          Thread.sleep(1000);
          
          ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_ADD_TC_15", "Verify that user Should Enter Address 1 in Textbox", () ->{
          Liabrary_Havmor.custom_Sendkeys(STMADD.getAddress1_Textbox_EXCEL(), excel.getStringdata2("Salesman_Add", 1, 3), "Address 1 ");
          });
          Thread.sleep(1000);
          
         
         ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Add_TC_16", "Verify that user click on State Dropdown ", () ->{
         Liabrary_Havmor.custom_click(STMADD.getState(), " State Dropdown "); });  
         Thread.sleep(1000);
        	
       	 ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Add_TC_17", "Verify that user click on State Dropdown Value", () ->{
      	 Liabrary_Havmor.custom_click(STMADD.getState_Value(), " State Dropdown Value"); });  
         Thread.sleep(1000);
         
         ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Add_TC_18", "Verify that user click on Town Dropdown ", () ->{
         Liabrary_Havmor.custom_click(STMADD.getTown(), " Town Dropdown "); });  
         Thread.sleep(1000);
            	
         ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Add_TC_19", "Verify that user click on Town Dropdown Value", () ->{
         Liabrary_Havmor.custom_click(STMADD.getTown_Value(), " Town Dropdown Value"); });  
         Thread.sleep(1000);
         
         ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_ADD_TC_20", "Verify that user Should Enter Pincode in Textbox", () ->{
         Liabrary_Havmor.custom_Sendkeys(STMADD.getPincode_Textbox_EXCEL(), excel.getStringdata2("Salesman_Add", 1, 4), "Pincode");
         });
         Thread.sleep(1000);
         
         ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_ADD_TC_21", "Verify that user Should Enter Email Id in Textbox", () ->{
         Liabrary_Havmor.custom_Sendkeys(STMADD.getEmail_ID_Textbox_EXCEL(), excel.getStringdata2("Salesman_Add", 1, 5), "Email Id");
         });
         Thread.sleep(1000);
             
          ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_ADD_TC_22", "Verify that user Should Enter Mobile  in Textbox", () ->{
          Liabrary_Havmor.custom_Sendkeys(STMADD.getMobile_Number_Textbox_EXCEL(), excel.getStringdata2("Salesman_Add", 1, 6), "Mobile ");
          });
          Thread.sleep(1000);
                 
         ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_ADD_TC_23", "Verify that user Should Enter Aadhaar No in Textbox", () ->{
          Liabrary_Havmor.custom_Sendkeys(STMADD.getAdhar_Number_Textbox_EXCEL(), excel.getStringdata2("Salesman_Add", 1, 7), "Aadhaar No");
            });
          Thread.sleep(1000);
                     
         ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_ADD_TC_24", "Verify that user Should Enter Pan No in Textbox", () ->{
          Liabrary_Havmor.custom_Sendkeys(STMADD.getPan_Number_Textbox_EXCEL(), excel.getStringdata2("Salesman_Add", 1, 8), "Pan No");
        });
          Thread.sleep(1000);
          
          
          WebElement scroll = driver.findElement(By.xpath("//span[@id='ParentMasterContentPlaceHolder1_lblBankName']"));
	    	JavascriptExecutor jse3= (JavascriptExecutor)driver;
	    	jse3.executeScript("arguments[0].scrollIntoView(true);", scroll);
	        Thread.sleep(1000);
         
	 /*       
	        //ABHYUDAYA CO-OP BANK LTD
	        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_ADD_TC_25 and 26", "Verify that user Should click bank dropdown and select the bank", () ->{
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	     // Locate the dropdown input box
	     WebElement bankDropdownInput = wait.until(ExpectedConditions.elementToBeClickable(
	         By.xpath("//input[contains(@id,'ddlBankName_Input')]")));

	     // Click to open the dropdown
	     bankDropdownInput.click();
	     try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // small wait to let options load

	     // Type part of the bank name (example: "HDFC")
	     bankDropdownInput.sendKeys("ABHYUDAYA CO-OP BANK LTD");

	     // Wait until the suggestion list appears
	     WebElement option = wait.until(ExpectedConditions.visibilityOfElementLocated(
	         By.xpath("//li[contains(text(),'ABHYUDAYA CO-OP BANK LTD')]")));

	     // Click on the desired option
	     option.click();

	        });
        */  
	        
	        
	        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_ADD_TC_25 and 26",
	        	    "Verify that user Should click bank dropdown and select the bank", () -> {

	        	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

	        	    // click input to open dropdown
	        	    WebElement bankDropdownInput = wait.until(
	        	        ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@id,'ddlBankName_Input')]")));
	        	    bankDropdownInput.click();

	        	    // small pause to let options render
	        	    try {
						Thread.sleep(800);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

	        	    // improved xpath: look for the listbox then a li with exact normalized text
	        	    By optionLocator = By.xpath("(//li[normalize-space()='ABHYUDAYA CO-OP BANK LTD'])[1]");

	        	    WebElement option = wait.until(ExpectedConditions.visibilityOfElementLocated(optionLocator));
	        	    // scroll into view then click
	        	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);
	        	    option.click();
	        	});

	        
          
       //   Account Holder Name         
          ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_ADD_TC_27", "Verify that user Should Enter Account Holder Name in Textbox", () ->{
          Liabrary_Havmor.custom_Sendkeys(STMADD.getAccount_Holder_Name_Textbox_EXCEL(), excel.getStringdata2("Salesman_Add", 1, 9), "Account Holder Name");
          });
          Thread.sleep(1000);
              
         ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_ADD_TC_28", "Verify that user Should Enter Bank Account Number in Textbox", () ->{
       Liabrary_Havmor.custom_Sendkeys(STMADD.getBank_Account_Number_Textbox_EXCEL(), excel.getStringdata2("Salesman_Add", 1, 10), "Bank Account Number");
        });
       Thread.sleep(1000);
                  
         ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_ADD_TC_29", "Verify that user Should Enter Bank IFSC Code in Textbox", () ->{
          Liabrary_Havmor.custom_Sendkeys(STMADD.getBank_IFSC_Code_Textbox_EXCEL(), excel.getStringdata2("Salesman_Add", 1, 11), "Bank IFSC Code");
        });
       Thread.sleep(1000);
       
       
       ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_ADD_TC_30", "Verify that user Should Enter Branch Name in Textbox", () ->{
       Liabrary_Havmor.custom_Sendkeys(STMADD.getBranch_Name_Textbox_EXCEL(), excel.getStringdata2("Salesman_Add", 1, 12), "Branch Name");
         });
        Thread.sleep(1000);
        
        ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_ADD_TC_31", "Verify that user Should Enter Salary Contribution in Textbox", () ->{
        Liabrary_Havmor.custom_Sendkeys(STMADD.getSalary_Contribution_Textbox_EXCEL(), excel.getStringdata2("Salesman_Add", 1, 13), "Salary Contribution");
         });
         Thread.sleep(1000);
                       
         ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_ADD_TC_32", "Verify that user Should Enter Distributor Contribution in Textbox", () ->{
          Liabrary_Havmor.custom_Sendkeys(STMADD.getDistributor_Contribution_Textbox_EXCEL(), excel.getStringdata2("Salesman_Add", 1, 14), "Distributor Contribution");
         });
        Thread.sleep(1000);
            
            
         ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_ADD_TC_33", "Verify that user Should Enter Company Contribution in Textbox", () ->{
        Liabrary_Havmor.custom_Sendkeys(STMADD.getCompany_Contribution_Textbox_EXCEL(), excel.getStringdata2("Salesman_Add", 1, 15), "Company Contribution");
         });
       Thread.sleep(1000);
             
       ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Add_TC_34", "Verify that user should check the field mobile checkbox ", () ->{
           Liabrary_Havmor.custom_click(STMADD.getMobile_Checkbox(), "mobile checkbox"); });  
          Thread.sleep(1000);
       
     ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Salesman_Master_Add_TC_35", "Verify that user click on Save Button ", () ->{
       Liabrary_Havmor.custom_click(STMADD.getSave_Button(), " Save Button "); });  
      Thread.sleep(1000);
	
	}
	
}
