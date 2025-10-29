package HO_HR_Portal_Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com_Utility_Havmor.BaseClass_HOHR;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;
import HO_HR_Portal_Main.Saleman_App_HOHR_Main;

public class Saleman_App_HOHR_Test extends BaseClass_HOHR{
	
	
	
	
	@Test
	public void SalesMan_Approval() throws Exception {
	
	
	Saleman_App_HOHR_Main app = PageFactory.initElements(driver , Saleman_App_HOHR_Main.class);
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
    Actions actions = new Actions(driver);
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("SalesMan_Approval_HOHR_Test_01", "Verify that user Click On Master Menu", () ->{
	Liabrary_Havmor.custom_click(app.getMaster_Menu(), "Click On Master Menu");      
	});
	Thread.sleep(300);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("SalesMan_Approval_HOHR_Test_02", "Verify that user Click On Salesman Master SubMenu", () ->{
	Liabrary_Havmor.custom_click(app.getSalesman_SubMenu(), "Click On Salesman Master SubMenu");      
	});
	Thread.sleep(300);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("SalesMan_Approval_HOHR_Test_03", "Verify that user Click On Salesman Approval", () ->{
	Liabrary_Havmor.custom_click(app.getSalesman_Approval(), "Click On Salesman Approval");      
	});
	Thread.sleep(300);
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("SalesMan_Approval_HOHR_Test_04", "Verify that user Click On Grid data", () ->{
		 // inline search + paging + click (single method body)
        String nameToFind = "Ravi Singh Thakur";
        
        By rowsBy = By.xpath("//table[contains(@class,'rgMasterTable')]//tbody/tr");
        By nextBy = By.xpath("//button[contains(@class,'rgPageNext')] | //a[contains(@class,'rgPageNext')]");
        By actionRel = By.xpath(".//td[last()]//a[contains(@id,'BtnApproval') or contains(@id,'BtnApprove') or contains(@title,'Approve')]");

        boolean clicked = false;
        for (int p = 0; p < 12 && !clicked; p++) {                // max 12 pages safety
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(rowsBy));
            List<WebElement> rows = driver.findElements(rowsBy);

            for (WebElement row : rows) {
                try {
                    if (row.getText().toLowerCase().contains(nameToFind.toLowerCase())) {
                        actions.moveToElement(row).perform();
                        WebElement icon = row.findElement(actionRel);
                        wait.until(ExpectedConditions.elementToBeClickable(icon));
                        actions.moveToElement(icon).click().perform();
                        clicked = true;
                        break;
                    }
                } catch (StaleElementReferenceException | NoSuchElementException ignore) { /* try next row */ }
            }

            if (!clicked) {
                // try next page
                List<WebElement> nexts = driver.findElements(nextBy);
                if (nexts.isEmpty()) break;
                WebElement next = nexts.get(0);
                String cls = next.getAttribute("class");
                String aria = next.getAttribute("aria-disabled");
                String disabled = next.getAttribute("disabled");
                boolean isDisabled = (cls != null && cls.toLowerCase().contains("disabled"))
                        || ("true".equalsIgnoreCase(aria))
                        || (disabled != null && (disabled.equals("true") || disabled.equals("disabled")));
                if (isDisabled) break;
                wait.until(ExpectedConditions.elementToBeClickable(next));
                actions.moveToElement(next).click().perform();
                try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} // small stabilization
            }
        }

        if (!clicked) throw new RuntimeException("Salesman not found or action not clickable: " + nameToFind);
	});
	Thread.sleep(300);
	
	
//	ObjectRepo_Havmor.startTestAndLog_1_SS("SalesMan_Approval_HOHR_Test_05", "Verify that user Click On Approval button", () ->{
//		Liabrary_Havmor.custom_click(app.getBtnApproval(), "Click On Approval button");      
//		});
//		Thread.sleep(1000);
	
	
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("SalesMan_Approval_HOHR_Test_05", "Verify that user Click On Proceed for Approval button", () ->{
	Liabrary_Havmor.custom_click(app.getBtnProceedForApproval(), "Click On Proceed for Approval button");      
	});
	Thread.sleep(300);
	
	
//	ObjectRepo_Havmor.startTestAndLog_1_SS("SalesMan_Approval_HOHR_Test_07", "Verify that user Click On Proceed for Approval Yes Button", () ->{
//	Liabrary_Havmor.custom_click(app.getBtnProceedForApproval(), "Click On Proceed for Approval button");      
//	});
//	Thread.sleep(1000);
			
	
	ObjectRepo_Havmor.startTestAndLog_1_SS("SalesMan_Approval_HOHR_Test_06", "Verify that user Click On Yes Button", () ->{
	Liabrary_Havmor.custom_click(app.getBtnYes(), "Click On Yes button");      
	});
	Thread.sleep(300);
	
	
	
	
	
	
	
	
	
	}

}
