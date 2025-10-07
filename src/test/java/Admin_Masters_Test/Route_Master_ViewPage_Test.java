package Admin_Masters_Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

public class Route_Master_ViewPage_Test extends BaseClass {

	
	@Test
    public void RM_View_Page() throws Exception {

        Route_Master_Add_BTN_Main RMADD = PageFactory.initElements(driver, Route_Master_Add_BTN_Main.class);
        HomePage_Havmor home = PageFactory.initElements(driver , HomePage_Havmor.class);
    	
    	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_Master_View_TC_01", "Verify that user Click On Master Menu ", () ->{
    	Liabrary_Havmor.custom_click(home.getMaster_Menu(), "Click On Master Menu");      
    	});
    	Thread.sleep(1000);
    	
	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_Master_View_TC_02", "Verify that user click on Route Master Sub Menu ", () ->{
        Liabrary_Havmor.custom_click(home.getRoute_Master_Submenu(), "Route Master Submenu");    });  
    	Thread.sleep(1000);
    	
    	 	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_Master_View_TC_03", "Verify that user Click on Route Master ", () ->{
    	Liabrary_Havmor.custom_click(RMADD.getRoute_Master(),"Route Master");
    	});
    	Thread.sleep(1000);
	
	
    	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_Master_View_TC_04",
    		    "Verify that user Click on Action View Icon", () -> {

    		    By viewBy = By.xpath("(//div[contains(@id,'radGridRouteMaster_GridData')]//table//tr//td//a)[1]");
    		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    		    // wait until element is present and clickable
    		    WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(viewBy));
    		    wait.until(ExpectedConditions.elementToBeClickable(viewBy));

    		    // scroll into view and click using JS
    		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", ele);
    		    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);

    		    System.out.println("✅ Action View button clicked (JS click).");
    		});


	
	
       	ObjectRepo_Havmor.startTestAndLog_1_SS("ADMIN_Route_Master_View_TC_05", "Verify that user Click on Action Close Icon", () ->{
        Liabrary_Havmor.custom_click(RMADD.getAction_Close_btn(),"Click on Action Close Icon");
       	});
       	Thread.sleep(1000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
