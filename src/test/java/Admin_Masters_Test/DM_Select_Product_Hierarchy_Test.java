package Admin_Masters_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.DM_Select_Product_Hierarchy_Main;
import Admin_Masters.Depot_Select_Sales_Hierarchy_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class DM_Select_Product_Hierarchy_Test extends BaseClass {

	@Test
	public void DM_Select_Product_Hierarchy() throws Exception {
	
	HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
	DM_Select_Product_Hierarchy_Main DM = PageFactory.initElements(driver , DM_Select_Product_Hierarchy_Main.class);

	
	ObjectRepo_Havmor.startTestAndLog_1_SS("DM_Select_Product_Hierarchy_Test_01", "Verify that user Click On Master Menu ", () ->{
	Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Master Menu");      
	});
	Thread.sleep(1000);
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("DM_Select_Product_Hierarchy_Test_02", "Verify that user Click On Depot Master Sub Menu ", () ->{
	Liabrary_Havmor.custom_click(home.getDepot_Master(), "Depot Master Menu");      
	});
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("DM_Select_Product_Hierarchy_Test_03", "Verify that user Click On Depot Creation ", () ->{
	Liabrary_Havmor.custom_click(DM.getDepot_Creation(), "Depot Creation");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("DM_Select_Product_Hierarchy_Test_04", "Verify that user Click On Depot Action Select_Product_Hierarchy button", () ->{
	Liabrary_Havmor.custom_click(DM.getDepot_Creation_Product_Hierarchy_Button(), "Depot Action Select_Product_Hierarchy button");      
	});
	Thread.sleep(1000);
	
	
	 //Product hirarchy - 1 
	
   ObjectRepo_Havmor.startTestAndLog_1_SS("DM_Select_Product_Hierarchy_Test_05", "Verify that user Click on Product Hierarchy Steps", () ->{
		
	   
//CATEGORY 1 
	driver.findElement(By.xpath("//span[@class='rtIn' and normalize-space(.)='CATEGORY 1']/ancestor::label/preceding-sibling::span[contains(@class,'rtPlus')]")).click();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
//SUB-CATEGORY 1 
driver.findElement(By.xpath("//span[@class='rtIn' and normalize-space(.)='SUBCATEGORY 1']/ancestor::label/preceding-sibling::span[contains(@class,'rtPlus')]")).click();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	//PRODUCT A DESCRIPTION
driver.findElement(By.xpath("//span[@class='rtIn' and normalize-space(.)='PRODUCT A DESCRIPTION']/ancestor::label/preceding-sibling::span[contains(@class,'rtPlus')]")).click();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	//PARENT PRODUCT A
driver.findElement(By.xpath("//span[@class='rtIn' and normalize-space(.)='PARENT PRODUCT A']/ancestor::label/preceding-sibling::span[contains(@class,'rtPlus')]")).click();
						
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
	//PRODUCT A UPDATED Checkbox 
	
driver.findElement(By.xpath("//span[@class='rtIn' and text()='PRODUCT A UPDATED']/preceding-sibling::input[@type='checkbox']")).click();
												
                      try {
						Thread.sleep(1000);
						} catch (InterruptedException e) {
					// TODO Auto-generated catch block
						
					e.printStackTrace();
												} });
	
	
   
   
   //Product hirarchy - 2
 //Ice Cream Hierarchy
	
   ObjectRepo_Havmor.startTestAndLog_1_SS("DM_Select_Product_Hierarchy_Test_06", "Verify that user Click on Product Hierarchy Steps ICE Cream", () ->{
		
	   
//ICE CREAM 
	driver.findElement(By.xpath("//span[@class='rtIn' and normalize-space(.)='ICECREAM']/ancestor::label/preceding-sibling::span[contains(@class,'rtPlus')]")).click();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
//Candies 
driver.findElement(By.xpath("//span[@class='rtIn' and normalize-space(.)='CANDIES']/ancestor::label/preceding-sibling::span[contains(@class,'rtPlus')]")).click();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
	//Kulfis
driver.findElement(By.xpath("//span[@class='rtIn' and normalize-space(.)='KULFIS']/ancestor::label/preceding-sibling::span[contains(@class,'rtPlus')]")).click();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
			
			 WebElement qtyBox = driver.findElement(By.xpath("//span[text()='ANJIR[KULFI] 50ML [1X20] #']"));
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].scrollIntoView(true);", qtyBox);
		 
		        
	//Anjir Kulfi
driver.findElement(By.xpath("//span[@class='rtIn' and normalize-space(.)='ANJIR[KULFI] 50ML [1X20] #']/ancestor::label/preceding-sibling::span[contains(@class,'rtPlus')]")).click();
						
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
	//Anjir Kulfi Product Checkbox 
	
driver.findElement(By.xpath("//span[@class='rtIn' and text()='ANJIR[KULFI] 50ML [1X20] #']/preceding-sibling::input[@type='checkbox']")).click();
												
                      try {
						Thread.sleep(1000);
						} catch (InterruptedException e) {
					// TODO Auto-generated catch block
						
					e.printStackTrace();
												} });
	
	
	
	
   ObjectRepo_Havmor.startTestAndLog_1_SS("DM_Select_Product_Hierarchy_Test_07", "Verify that user Click On Depot Action Select_Product_Hierarchy Save button", () ->{
		Liabrary_Havmor.custom_click(DM.getDepot_Creation_Save_Button(), "Depot Action Select_Product_Hierarchy Save button");      
		});
		Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	}	
}
