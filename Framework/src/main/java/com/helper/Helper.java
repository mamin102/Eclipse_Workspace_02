package com.helper;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {
	static WebDriver driver;
	
	static WebElement element;
	
	
	public static void navigateTo(String url) 
	{
		driver.get(url);
	}
	public static void navigate(String direction)
	{
		if (direction.equals("back"))
			driver.navigate().back();
		else
			driver.navigate().forward();
	}
	
	public static void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}
	public static void pageLoadTimeOut() {
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	public static void hoverOverElement(String locatorName, String locatorValue)
	
	{
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	public static void scrollToElement(String locatorName, String locatorValue)
	{
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	public static void switchToNewWindow()
    {
		
		
    }
	
	 public static void switchToOldWindow()
	    {
		 
		 
	    }
	
	 
	 
	 public static void switchFrame(String accessType, String accessName)
	    {
		 
		 
		 
		 
		 
	    }
	 
	 
	 public static void switchToDefaultContent()
	    {
	    	driver.switchTo().defaultContent();
	    }
	  
	 public static void doubleClick(String locatorName, String locatorValue)
		{
			Actions action = new Actions(driver);
			action.moveToElement(element).doubleClick().perform();
		}
	 
	 public static String getPageTitle()
		{
			return driver.getTitle();
		}
	 
	 public static void checkTitle(String title,boolean testCase) throws Exception
		{
			String pageTitle = getPageTitle();
			
			if(testCase)
			{
				if(!pageTitle.equals(title))
					throw new Exception("Page Title Not Matched, Actual Page Title : "+pageTitle);
			}
			else
			{
				if(pageTitle.equals(title))
					throw new Exception("Page Title Matched, Actual Page Title : "+pageTitle);
			}
		}
	 
	 public static boolean isElementEnabled(String locatorName, String locatorValue)
		{
			return element.isEnabled();
		}
	 
	 
	 public static boolean isElementDisplayed(String locatorName, String locatorValue)
		{
			return element.isDisplayed();
		}
	 
	 public static String getAlertText()
		{
			return driver.switchTo().alert().getText();
		}
	 
	 public static void selectElementFromDropDownByType (Select select_list, String bytype, String option)
		{
		 
		 
		 
		}
	 
	 public static void unselectAllOptionFromMultiselectDropdown()
		{
		 
		 
		  
		}
	 
	 public static void takeScreenShot() throws IOException
		{
		 
		 
		 
		}
	 
	 
	public static void wait(String time) throws NumberFormatException, InterruptedException
		{
			Thread.sleep(Integer.parseInt(time)*1000);
		}
	public static void click() {
		element.click();
		
	}
	
	public static void sendKeys(String data) {
		element.sendKeys(data);
		
	}
	
	public static void clear() {
		element.clear();
	}
	
	public static void explicitlyWait(String xpath) {
	
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		
	}

	public static void closeDriver()
	{
		driver.close();
	}
	public static void closeAllWindows() {
		driver.quit();
	}
}
