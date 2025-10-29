package ZSM_Portal_Test;

import java.time.Duration;
import java.util.List;
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

public class abc_salesman extends BaseClass_ZSM {

    @Test
    public void SalesMan_Approval() throws Exception {

        SalesMan_Approval_ZSM_Main app = PageFactory.initElements(driver, SalesMan_Approval_ZSM_Main.class);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions actions = new Actions(driver);

        // Step 1: Navigate through menus
        Liabrary_Havmor.custom_click(app.getMaster_Menu(), "Click On Master Menu");
        Liabrary_Havmor.custom_click(app.getSalesman_SubMenu(), "Click On Salesman Master SubMenu");
        Liabrary_Havmor.custom_click(app.getSalesman_Approval(), "Click On Salesman Approval");

        // Step 2: Search & Click target salesman directly
        String nameToFind = "parag patel".toLowerCase();
        boolean found = false;
        int maxPages = 10;

        By nextBtn = By.xpath("//button[contains(@class,'rgPageNext')] | //a[contains(@class,'rgPageNext')]");
        By rows = By.xpath("//table[contains(@class,'rgMasterTable')]//tbody/tr");

        for (int p = 1; p <= maxPages; p++) {

            // Fast locate: find the Approve icon within the row containing the salesman name
            String fastXpath = "//table[contains(@class,'rgMasterTable')]//tr[contains(translate(.,'ABCDEFGHIJKLMNOPQRSTUVWXYZ','abcdefghijklmnopqrstuvwxyz'),'"
                    + nameToFind
                    + "')]//a[contains(@id,'BtnApproval') or contains(@id,'BtnApprove') or contains(@title,'Approve')]";

            List<WebElement> matches = driver.findElements(By.xpath(fastXpath));

            if (!matches.isEmpty()) {
                WebElement approveIcon = matches.get(0);
                wait.until(ExpectedConditions.elementToBeClickable(approveIcon));
                actions.moveToElement(approveIcon).click().perform();
                System.out.println("✅ Clicked approval icon for salesman: " + nameToFind);
                found = true;
                break;
            }

            // If not found, check for next page
            List<WebElement> nexts = driver.findElements(nextBtn);
            if (nexts.isEmpty()) {
                System.out.println("❌ No next page button found. Stopping search.");
                break;
            }

            WebElement next = nexts.get(0);
            String cls = next.getAttribute("class");
            String aria = next.getAttribute("aria-disabled");
            String dis = next.getAttribute("disabled");

            if ((cls != null && cls.toLowerCase().contains("disabled"))
                    || "true".equalsIgnoreCase(aria)
                    || dis != null && (dis.equals("true") || dis.equals("disabled"))) {
                System.out.println("Reached last page. Salesman not found.");
                break;
            }

            wait.until(ExpectedConditions.elementToBeClickable(next));
            next.click();
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(rows));
        }

        if (!found)
            throw new RuntimeException("Salesman not found or action not clickable: " + nameToFind);

        // Step 3: Proceed with approval flow
        wait.until(ExpectedConditions.elementToBeClickable(app.getBtnProceedForApproval())).click();
        wait.until(ExpectedConditions.elementToBeClickable(app.getYES_Button())).click();

        System.out.println("✅ Approval completed successfully!");
    }
}
