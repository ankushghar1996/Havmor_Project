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

public class Sample_class extends BaseClass_ZSM {

    // Grid and pagination XPaths (tight to your grid class + fallback to id contains)
    private final String TABLE_XPATH = "//table[@class='rgMasterTable rgClipCells' or contains(@id,'radGridSalesmanMaster')]";
    private final By ROWS = By.xpath(TABLE_XPATH + "//tbody/tr");

    // UPDATED: accept button or anchor next controls (rgPageNext / title contains Next / button text '>' etc)
    private final By NEXT_BTN = By.xpath(
            "//button[contains(@class,'rgPageNext') or contains(@title,'Next') or normalize-space(.)='>' ]"
            + " | //a[contains(@class,'rgPageNext') or contains(@title,'Next') or normalize-space(.)='>']");

    // ROW-RELATIVE action icon (handles dynamic ctlNN in id by contains 'BtnApproval')
    private final By ROW_ACTION_ICON = By.xpath(".//td[last()]//a[contains(@id,'BtnApproval') or contains(@id,'BtnApprove') or contains(@title,'Approve')]");

    /**
     * Search salesman by name across grid pages and click the row-specific Action (Approve) icon.
     * @param salesmanName full or partial name (case-insensitive)
     * @param maxPages safety cap for paging (e.g. 10)
     * @return true if found and clicked, false otherwise
     */
    private boolean searchAndClickActionIconBySalesmanName(String salesmanName, int maxPages) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            Actions actions = new Actions(driver);
            String searchLower = salesmanName.toLowerCase().trim();

            // wait for at least one visible row
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(ROWS));

            for (int page = 0; page < maxPages; page++) {
                List<WebElement> rows = driver.findElements(ROWS);
                System.out.println("Scanning page " + (page + 1) + " rows: " + rows.size());

                for (WebElement row : rows) {
                    try {
                        // check row visible text for salesman name (case-insensitive)
                        String rowText = row.getText();
                        if (rowText == null) rowText = "";

                        if (rowText.toLowerCase().contains(searchLower)) {
                            System.out.println("Matched row text: " + rowText);

                            // ensure visible
                            actions.moveToElement(row).perform();

                            // find action element relative to the matched row
                            try {
                                WebElement actionEl = row.findElement(ROW_ACTION_ICON);
                                wait.until(ExpectedConditions.elementToBeClickable(actionEl));
                                actions.moveToElement(actionEl).click().perform();

                                // wait for modal or page navigation after click
                                wait.until(ExpectedConditions.or(
                                        ExpectedConditions.urlContains("Salesman"),
                                        ExpectedConditions.presenceOfElementLocated(By.cssSelector(".modal-content, .salesman-detail, .edit-salesman"))
                                ));

                                System.out.println("✅ Clicked action icon for salesman: " + salesmanName);
                                return true;
                            } catch (NoSuchElementException ne) {
                                System.out.println("Action icon not found inside the matched row. Row structure may differ.");
                                return false;
                            }
                        }
                    } catch (StaleElementReferenceException sere) {
                        // row got refreshed; skip it
                        continue;
                    }
                }

                // move to next page if not found on current page
                try {
                    WebElement next = wait.until(ExpectedConditions.presenceOfElementLocated(NEXT_BTN));

                    // check disabled state by class or aria-disabled or disabled attribute
                    String cls = "";
                    try { cls = next.getAttribute("class"); } catch (Exception ignored) {}
                    String ariaDisabled = next.getAttribute("aria-disabled");
                    String disabledAttr = next.getAttribute("disabled");

                    boolean isDisabled = (cls != null && cls.toLowerCase().contains("disabled"))
                            || ("true".equalsIgnoreCase(ariaDisabled))
                            || (disabledAttr != null && (disabledAttr.equals("true") || disabledAttr.equals("disabled")));

                    if (isDisabled) {
                        System.out.println("Next button is disabled -> reached last page");
                        break;
                    }

                    // ensure visible & clickable then click via Actions
                    wait.until(ExpectedConditions.elementToBeClickable(next));
                    actions.moveToElement(next).click().perform();

                    // ensure new page rows loaded before next iteration
                    wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(ROWS));
                    Thread.sleep(700);
                } catch (TimeoutException te) {
                    System.out.println("Pagination next control not found or not visible; stopping paging.");
                    break;
                } catch (NoSuchElementException ne) {
                    System.out.println("Pagination next button not found, stopping paging.");
                    break;
                } catch (InterruptedException ie) {
                    // ignore
                }
            }

            System.out.println("❌ Salesman not found in any page: " + salesmanName);
            return false;

        } catch (TimeoutException te) {
            System.out.println("Grid rows not loaded in time.");
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    // ---------------------------------------------------------------------
    // Actual Test Case
    // ---------------------------------------------------------------------
    @Test
    public void SalesMan_Approval() throws Exception {

        SalesMan_Approval_ZSM_Main app = PageFactory.initElements(driver, SalesMan_Approval_ZSM_Main.class);

        ObjectRepo_Havmor.startTestAndLog_1_SS("SalesMan_Approval_ZSM_Test_01", "Verify that user Click On Master Menu", () -> {
            Liabrary_Havmor.custom_click(app.getMaster_Menu(), "Click On Master Menu");
        });
        Thread.sleep(1000);

        ObjectRepo_Havmor.startTestAndLog_1_SS("SalesMan_Approval_ZSM_Test_02", "Verify that user Click On Salesman Master SubMenu", () -> {
            Liabrary_Havmor.custom_click(app.getSalesman_SubMenu(), "Click On Salesman Master SubMenu");
        });
        Thread.sleep(1000);

        ObjectRepo_Havmor.startTestAndLog_1_SS("SalesMan_Approval_ZSM_Test_03", "Verify that user Click On Salesman Approval", () -> {
            Liabrary_Havmor.custom_click(app.getSalesman_Approval(), "Click On Salesman Approval");
        });
        Thread.sleep(1000);

        // ---------- UPDATED Test Case #04: Search by name & click right Action icon ----------
        ObjectRepo_Havmor.startTestAndLog_1_SS("SalesMan_Approval_ZSM_Test_04",
                "Verify that user can search salesman by name and click Action icon", () -> {

                    String salesmanNameToSearch = "Amit Singh Thakur"; // change as per data
                    boolean opened = searchAndClickActionIconBySalesmanName(salesmanNameToSearch, 10);
                    if (!opened) {
                        throw new RuntimeException("Failed to find or click Action icon for: " + salesmanNameToSearch);
                    }
                });
        Thread.sleep(1000);
        // -----------------------------------------------------------------------------------------

        ObjectRepo_Havmor.startTestAndLog_1_SS("SalesMan_Approval_ZSM_Test_05", "Verify that user Click On Proceed to Approval button", () -> {
            Liabrary_Havmor.custom_click(app.getBtnProceedForApproval(), "Click On Proceed to Approval button");
        });
        Thread.sleep(1000);

        ObjectRepo_Havmor.startTestAndLog_1_SS("SalesMan_Approval_ZSM_Test_06", "Verify that user Click On Yes button", () -> {
            Liabrary_Havmor.custom_click(app.getYES_Button(), "Click On Yes button");
        });
        Thread.sleep(1000);
    }
}
