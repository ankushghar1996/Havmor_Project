package Admin_Masters_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Admin_Masters.Depot_Master_View_Page_Main;
import Admin_Masters.Depot_Select_Sales_Hierarchy_Main;
import Com_LoginPage_POM.HomePage_Havmor;
import Com_Utility_Havmor.BaseClass;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;

public class Depot_Select_Sales_Hierarchy_Test extends BaseClass {

	@Test
	public void Depot_View_Page() throws Exception {
	
	HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
	Depot_Select_Sales_Hierarchy_Main DM = PageFactory.initElements(driver , Depot_Select_Sales_Hierarchy_Main.class);

	
	ObjectRepo_Havmor.startTestAndLog_1_SS("DM_Select_Sales_Hierarchy_Test_01", "Verify that user Click On Master Menu ", () ->{
	Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Master Menu");      
	});
	Thread.sleep(1000);
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("DM_Select_Sales_Hierarchy_Test_02", "Verify that user Click On Depot Master Sub Menu ", () ->{
	Liabrary_Havmor.custom_click(home.getDepot_Master(), "Depot Master Menu");      
	});
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("DM_Select_Sales_Hierarchy_Test_03", "Verify that user Click On Depot Creation  ", () ->{
	Liabrary_Havmor.custom_click(DM.getDepot_Creation(), "Depot Creation");      
	});
	Thread.sleep(1000);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("DM_Select_Sales_Hierarchy_Test_04", "Verify that user Click On Depot Action Select_Sales_Hierarchy button", () ->{
	Liabrary_Havmor.custom_click(DM.getDepot_Creation_Sales_Hirarchy(), "Depot Action Select_Sales_Hierarchy button");      
	});
	Thread.sleep(1000);

	
		
 //sales hirarchy
		
	ObjectRepo_Havmor.startTestAndLog_1_SS("DM_Select_Sales_Hierarchy_Test_05", "Verify that user Click on Sales Hierarchy Steps", () ->{
		
		//India - Country
	
		driver.findElement(By.xpath("//span[@class='rtIn' and normalize-space(.)='India']/ancestor::label/preceding-sibling::span[contains(@class,'rtPlus')]")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// South India - Region
		
		driver.findElement(By.xpath("//span[@class='rtIn' and normalize-space(.)='South India']/ancestor::label/preceding-sibling::span[contains(@class,'rtPlus')]")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Karnataka - state
		
		driver.findElement(By.xpath("//span[@class='rtIn' and normalize-space(.)='Karnataka Zone']/ancestor::label/preceding-sibling::span[contains(@class,'rtPlus')]")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Manglore - Dist
		
         driver.findElement(By.xpath("//span[@class='rtIn' and normalize-space(.)='Manglore']/ancestor::label/preceding-sibling::span[contains(@class,'rtPlus')]")).click();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Bejai - Town
		
        driver.findElement(By.xpath("//span[@class='rtIn' and normalize-space(.)='Bejai']/ancestor::label/preceding-sibling::span[contains(@class,'rtPlus')]")).click();
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Ambuja Stock Distributor
		
		 driver.findElement(By.xpath("//span[@class='rtIn' and text()='Ambuja Stock (DB9001)']/preceding-sibling::input[@type='checkbox']")).click();
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Amit Distributor			
			 driver.findElement(By.xpath("//span[@class='rtIn' and text()='Amit_Distributor (DB6002)']/preceding-sibling::input[@type='checkbox']")).click();
				
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		

		});
	
	
		Thread.sleep(1000);
		
		ObjectRepo_Havmor.startTestAndLog_1_SS("DM_Select_Sales_Hierarchy_Test_06", "Verify that user Click On Depot Action Select_Sales_Hierarchy Save button", () ->{
			Liabrary_Havmor.custom_click(DM.getDepot_Creation_Save_Button(), "Depot Action Select_Sales_Hierarchy Save button");      
			});
			Thread.sleep(1000);
		
	

}
	
}
