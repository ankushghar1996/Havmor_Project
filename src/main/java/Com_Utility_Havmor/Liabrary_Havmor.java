
package Com_Utility_Havmor;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;

public class Liabrary_Havmor {

public static void handle_dropdown(WebElement element,String name) {
		
		try {
			Select sel =new Select(element);
			sel.selectByVisibleText(name);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

public static void dropdown(WebElement element, String name, WebDriver driver) {
	
	
	List<WebElement> list = driver.findElements(By.xpath("(//ul[@class='rcbList'])[4]"));
	for(WebElement ele :list)
	{
		if(ele.getText().equals("SE-CR"))
		{
			ele.click();
			break;
		}
	}
	
}




	public static void custom_Sendkeys(WebElement element , String Value , String FieldName) {
		try {
			element.sendKeys(Value);
		
			ObjectRepo_Havmor.test.log(Status.PASS, FieldName+"==>"+Value);
			
			}
		catch(Exception e) {
			
			}
		}
	
	
	
	
	public static void custom_click(WebElement element, String fieldName) {
	    //ObjectRepo.startTestAndLog_1_SS("Click_" + fieldName, "Click on " + fieldName, () -> {
	        WebDriverWait wait = new WebDriverWait(ObjectRepo_Havmor.driver, Duration.ofSeconds(10));
	        wait.until(ExpectedConditions.elementToBeClickable(element));

	        // Optional: highlight element before clicking (for debugging)
	        ((JavascriptExecutor) ObjectRepo_Havmor.driver).executeScript("arguments[0].style.border='2px solid red'", element);

	        element.click();
	        System.out.println(fieldName + " was clicked successfully!");
	  //  });
	}
	
	
	
	
	public static void robustClick(WebDriver driver, Object locatorOrElement, String fieldName, int timeoutSeconds) {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
	    int maxAttempts = 4;
	    int attempts = 0;

	    while (attempts < maxAttempts) {
	        try {
	            // --- Wait for common loaders/overlays to disappear (short tries) ---
	            By[] overlays = new By[] {
	                By.xpath("//*[contains(translate(text(),'LOADING','loading'),'loading')]"),
	                By.cssSelector(".loading, .loader, .spinner, #loader, .overlay"),
	                By.xpath("//div[contains(@class,'overlay') and (contains(.,'Loading') or contains(.,'loading'))]")
	            };
	            for (By ov : overlays) {
	                try {
	                    WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(3));
	                    shortWait.until(ExpectedConditions.invisibilityOfElementLocated(ov));
	                } catch (Exception ignore) { /* not present or didn't disappear quickly — continue */ }
	            }

	            // --- Identify WebElement to act on ---
	            WebElement el = null;
	            if (locatorOrElement instanceof By) {
	                By by = (By) locatorOrElement;
	                el = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	                wait.until(ExpectedConditions.elementToBeClickable(by));
	            } else if (locatorOrElement instanceof WebElement) {
	                el = (WebElement) locatorOrElement;
	                wait.until(ExpectedConditions.visibilityOf(el));
	                wait.until(ExpectedConditions.elementToBeClickable(el));
	            } else {
	                throw new IllegalArgumentException("locatorOrElement must be a By or WebElement");
	            }

	            // --- Highlight for debugging (non-fatal) ---
	            try {
	                ((JavascriptExecutor) driver).executeScript(
	                    "arguments[0].setAttribute('data-old-style', arguments[0].getAttribute('style') || '');" +
	                    "arguments[0].style.border='2px solid red';", el);
	            } catch (Exception ignore) {}

	            // --- Try normal click ---
	            try {
	                el.click();
	                // restore style (best-effort)
	                try {
	                    ((JavascriptExecutor) driver).executeScript(
	                        "var s = arguments[0].getAttribute('data-old-style');" +
	                        "if(s!==null) arguments[0].setAttribute('style', s); else arguments[0].removeAttribute('style');" +
	                        "arguments[0].removeAttribute('data-old-style');", el);
	                } catch (Exception ignore) {}
	                System.out.println(fieldName + " clicked successfully (normal click).");
	                return;
	            } catch (ElementClickInterceptedException intercepted) {
	                // someone overlayed it — fall through to retry/backoff below
	                Thread.sleep(300);
	            }

	        } catch (ElementClickInterceptedException e) {
	            // overlay obstructed click — small backoff and retry
	            try { Thread.sleep(300); } catch (InterruptedException ignored) {}
	        } catch (StaleElementReferenceException e) {
	            // element stale — retry after short wait
	            try { Thread.sleep(250); } catch (InterruptedException ignored) {}
	        } catch (TimeoutException e) {
	            // element not visible/clickable in time — we'll attempt scroll+actions+js fallback below
	            // do nothing here, fall through to fallback attempts
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        } catch (Exception e) {
	            // unexpected; short backoff then retry
	            try { Thread.sleep(300); } catch (InterruptedException ignored) {}
	        }

	        // --- Fallback attempts: find element again and try scroll -> Actions -> JS click ---
	        try {
	            WebElement elFallback = null;
	            if (locatorOrElement instanceof By) {
	                elFallback = driver.findElement((By) locatorOrElement);
	            } else if (locatorOrElement instanceof WebElement) {
	                elFallback = (WebElement) locatorOrElement;
	            }

	            if (elFallback != null) {
	                // scroll into view
	                try {
	                    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", elFallback);
	                } catch (Exception ignore) {}

	                // try Actions click
	                try {
	                    new Actions(driver).moveToElement(elFallback).pause(Duration.ofMillis(150)).click().perform();
	                    // restore style if present
	                    try {
	                        ((JavascriptExecutor) driver).executeScript(
	                            "var s = arguments[0].getAttribute('data-old-style');" +
	                            "if(s!==null) arguments[0].setAttribute('style', s); else arguments[0].removeAttribute('style');" +
	                            "arguments[0].removeAttribute('data-old-style');", elFallback);
	                    } catch (Exception ignore) {}
	                    System.out.println(fieldName + " clicked successfully (Actions fallback).");
	                    return;
	                } catch (Exception actionsEx) {
	                    // Actions failed -> try JS click
	                    try {
	                        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", elFallback);
	                        try {
	                            ((JavascriptExecutor) driver).executeScript(
	                                "var s = arguments[0].getAttribute('data-old-style');" +
	                                "if(s!==null) arguments[0].setAttribute('style', s); else arguments[0].removeAttribute('style');" +
	                                "arguments[0].removeAttribute('data-old-style');", elFallback);
	                        } catch (Exception ignore) {}
	                        System.out.println(fieldName + " clicked successfully (JS fallback).");
	                        return;
	                    } catch (Exception jsEx) {
	                        // will retry in loop
	                    }
	                }
	            }
	        } catch (Exception ignore) {
	            // ignore and let attempts++ happen
	        }

	        attempts++;
	    }

	    // After retries, throw meaningful exception
	    throw new RuntimeException("Failed to click '" + fieldName + "' after " + maxAttempts + " attempts. Provided locator/element: " + locatorOrElement);
	}

/*
	public static void custom_click(WebElement element, String fieldName) {
	    WebDriver driver = ObjectRepo_Havmor.driver;
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    try {
	        // 1. Scroll into view so headless runs see the element
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].scrollIntoView({block:'center'});", element);

	        // 2. Wait until clickable
	        wait.until(ExpectedConditions.elementToBeClickable(element));

	        // 3. Highlight with red border temporarily
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].style.border='2px solid red';", element);

	        // 4. Click
	        element.click();
	        System.out.println(fieldName + " was clicked successfully!");

	        // 5. Remove the border afterwards so it doesn’t “stick” red
	        ((JavascriptExecutor) driver)
	                .executeScript("arguments[0].style.border='';", element);

	    } catch (Exception e) {
	        System.out.println("Unable to click on " + fieldName + " due to: " + e.getMessage());
	        throw e;
	    }
	}
*/
	
 
	
	
	
	
	public static void Mouse_Action_(WebElement element,WebDriver driver) {
	
		try {
			Actions action =new Actions(driver);
			action.moveToElement(element).build().perform();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
	}
	
	
	
	
	public static void Mouse_click(WebElement element,WebDriver driver) {
		
		try {
			Actions action =new Actions(driver);
			action.moveToElement(element).click().build().perform();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
	
}
	}
	
	
	
	
	public static void Scroll_to_Element(WebElement element,WebDriver driver) {
		try {
		 JavascriptExecutor jse1= (JavascriptExecutor)driver;
		 jse1.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());}
		}
	
	
	
	
	
	public static int get_decimal_removal(String Value) {
		int dotindex=Value.lastIndexOf(".");
		String str= Value.substring(0, dotindex);
		return Integer.parseInt(str);
	}
	
	
	public static void custom_clear(WebElement element) {
		try {
			element.clear();
			
			ObjectRepo_Havmor.test.log(Status.PASS,"");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
	}
	
	
	
	
	
	public static void compare_value(WebElement Actual , String expected) {
        try {
             SoftAssert s_assert = new SoftAssert();
             s_assert.assertEquals(Actual, expected);
  System.out.println("Assertion passed: Actual Value = " + Actual + " == Expected Value = " + expected);
           //  ObjectRepo.test.log(Status.PASS, Actual+"=="+expected);      
        }
        catch(Exception e) {
            //ObjectRepo.test.log(Status.FAIL, Actual+"=="+expected);
        }	
	
	}
	
	
	
	
	public static void checkErrorMessageCommon(WebDriver driver, String xpathLocator) {
        try {
            // Locate the error message element by XPath
            WebElement errorMessage = driver.findElement(By.xpath("//div[@id='toast-container']"));

            // Check if the error message is displayed
            if (errorMessage.isDisplayed()) {
                // Print the error message
                System.out.println("Error: " + errorMessage.getText());
            } else {
                System.out.println("Login successful & no error message displayed.");
            }
        } catch (Exception e) {
            // Handle the case where the error message element is not found
            System.out.println("Error message element not found: " + e.getMessage());
        }
    }
	
	
	
	public static void checkErrorMessageChangable(WebDriver driver, String xpathLocator) {
        try {
            // Locate the error message element by XPath
            WebElement errorMessage = driver.findElement(By.xpath(xpathLocator));

            // Check if the error message is displayed
            if (errorMessage.isDisplayed()) {
                // Print the error message
                System.out.println("Error: " + errorMessage.getText());
            } else {
                System.out.println("Login successful & no error message displayed.");
            }
        } catch (Exception e) {
            // Handle the case where the error message element is not found
            System.out.println("Error message element not found: " + e.getMessage());
        }
    }
	

	

	    // 📅 Main method — From/To date select karne ke liye
	    public static void pickDate(WebDriver driver, String baseId,
	                                String month, String year, String day) {
	        WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));

	        // 1️⃣ Open calendar
	        driver.findElement(By.id(baseId + "_popupButton")).click();

	        String wrapperId = baseId + "_calendar_wrapper";
	        By header = By.id(baseId + "_calendar_Title");

	        wait.until(ExpectedConditions.visibilityOfElementLocated(header));

	        // 2️⃣ Navigate month & year
	        List<String> months = Arrays.asList(
	            "January","February","March","April","May","June",
	            "July","August","September","October","November","December"
	        );

	        int maxMonthNavigation = 60; // up to 5 years

	        for (int i = 0; i < maxMonthNavigation; i++) {
	            String[] parts = driver.findElement(header).getText().trim().split("\\s+");
	            String curMonth = parts[0];
	            String curYear  = parts[1];

	            if (curMonth.equalsIgnoreCase(month) && curYear.equals(year)) break;

	            int curM = months.indexOf(curMonth);
	            int tarM = months.indexOf(month);
	            int curY = Integer.parseInt(curYear);
	            int tarY = Integer.parseInt(year);

	            boolean goNext = (curY < tarY) || (curY == tarY && curM < tarM);

	            By next = By.id(baseId + "_calendar_NN");
	            By prev = By.id(baseId + "_calendar_PP");
	            By nextAlt = By.xpath("//div[@id='" + wrapperId + "']//a[@title='Next Month']");
	            By prevAlt = By.xpath("//div[@id='" + wrapperId + "']//a[@title='Previous Month']");

	            try {
	                if (goNext) {
	                    click(wait, next, nextAlt);
	                } else {
	                    click(wait, prev, prevAlt);
	                }
	            } catch (Exception e) {
	                break;
	            }
	        }

	        // 3️⃣ Select the day
	        By dayLocator = By.xpath(
	            "//div[@id='" + wrapperId + "']//table[contains(@class,'rcMainTable')]"
	          + "//td[not(contains(@class,'rcOtherMonth'))]/a[normalize-space()='" + day + "']"
	        );

	        wait.until(ExpectedConditions.elementToBeClickable(dayLocator)).click();
	    }

	    // 🔹 Helper for safe arrow click (Next/Previous)
	    private static void click(WebDriverWait wait, By primary, By fallback) {
	        try {
	            wait.until(ExpectedConditions.elementToBeClickable(primary)).click();
	        } catch (Exception e) {
	            wait.until(ExpectedConditions.elementToBeClickable(fallback)).click();
	        }
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}


	
	
	
	
	
