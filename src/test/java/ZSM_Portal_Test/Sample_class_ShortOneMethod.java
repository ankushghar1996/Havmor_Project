package ZSM_Portal_Test;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Com_Utility_Havmor.BaseClass_ZSM;
import Com_Utility_Havmor.Liabrary_Havmor;
import Com_Utility_Havmor.ObjectRepo_Havmor;
import ZSM_Portal_Main.SalesMan_Approval_ZSM_Main;

import java.time.Duration;
import java.util.List;

public class Sample_class_ShortOneMethod extends BaseClass_ZSM {

    @Test
    public void SalesMan_Approval_Short() throws Exception {
        SalesMan_Approval_ZSM_Main app = PageFactory.initElements(driver, SalesMan_Approval_ZSM_Main.class);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
        Actions actions = new Actions(driver);

        // navigation
        Liabrary_Havmor.custom_click(app.getMaster_Menu(), "Click On Master Menu");
        Thread.sleep(300);
        Liabrary_Havmor.custom_click(app.getSalesman_SubMenu(), "Click On Salesman Master SubMenu");
        Thread.sleep(300);
        Liabrary_Havmor.custom_click(app.getSalesman_Approval(), "Click On Salesman Approval");
        Thread.sleep(600);

        // inline search + paging + click (single method body)
        String nameToFind = "Mukesh SING";
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
                Thread.sleep(1000); // small stabilization
            }
        }

        if (!clicked) throw new RuntimeException("Salesman not found or action not clickable: " + nameToFind);

        // proceed + yes
        Liabrary_Havmor.custom_click(app.getBtnProceedForApproval(), "Click On Proceed to Approval button");
        Thread.sleep(300);
        Liabrary_Havmor.custom_click(app.getYES_Button(), "Click On Yes button");
        Thread.sleep(300);
    }
}
