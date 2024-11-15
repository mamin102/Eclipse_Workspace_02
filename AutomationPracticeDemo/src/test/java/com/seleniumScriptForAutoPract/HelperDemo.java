package com.seleniumScriptForAutoPract;

import java.io.File;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperDemo {
	WebDriver driver; 
	
	WebDriverWait wait ;
	
	private WebElement element=null;
	private String old_win = null;
	private String lastWinHandle;
	
	
	
	public void navigateTo(String url) 
	{
		driver.get(url);
	}
	
	public void navigate(String direction)
	{
		if (direction.equals("back"))
			driver.navigate().back();
		else
			driver.navigate().forward();
	}
	
	public void closeDriver()
	{
		driver.close();
	}
	
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
	}
	
	public void hoverOverElement(String accessType, String accessName)
	{
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
	
	
	public void scrollToElement(String accessType, String accessName)
	{
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView();", element);
	}
	
	
	  public void switchToNewWindow()
	    {
	    	 old_win = driver.getWindowHandle();
	    	for(String winHandle : driver.getWindowHandles())
	    		lastWinHandle = winHandle;
	    	driver.switchTo().window(lastWinHandle);
	    }
	  
	  public void switchToOldWindow()
	    {
	    	driver.switchTo().window(old_win);
	    }
	  
	  
	  public void closeNewWindow()
	    {
	    	driver.close();
	    }
	  
	  public void switchFrame(String accessType, String accessName)
	    {
	    	if(accessType.equalsIgnoreCase("index"))
	    		driver.switchTo().frame(accessName);
	    	else
	    	{
	    	//	element = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
	    		driver.switchTo().frame(element);
	    	}
	    }
	  
	  public void switchToDefaultContent()
	    {
	    	driver.switchTo().defaultContent();
	    }
	  
	  
	  /** Method to Double click on an element
		@param accessType : String : Locator type (id, name, class, xpath, css)
		@param accessName : String : Locator value
		*/
	  public void doubleClick(String accessType, String accessValue)
		{
			Actions action = new Actions(driver);
			action.moveToElement(element).doubleClick().perform();
		}
	  
	  /** Method to get page title
		 * @return String
		 * */
		public String getPageTitle()
		{
			return driver.getTitle();
		}
		
		public void checkTitle(String title,boolean testCase) throws Exception
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
		
		/** Method to get element text
		 * @param accessType : String : Locator type (id, name, class, xpath, css)
		 * @param accessName : String : Locator value
		 * @return String
		 */
		public String getElementText(String accessType, String accessName)
		{
			return element.getText();
			
		}
		
		public boolean isElementEnabled(String accessType, String accessName)
		{
			return element.isEnabled();
		}
		
		public boolean isElementDisplayed(String accessType,String accessName)
		{
			return element.isDisplayed();
		}
		
		/** method to get javascript pop-up alert text
		 * @return String
		 */
		public String getAlertText()
		{
			return driver.switchTo().alert().getText();
		}
		
		/**method to check javascript pop-up alert text
		 * @param text : String : Text to verify in Alert
		 * @throws Exception 
		 * @throws TestCaseFailed
		 */
		public void checkAlertText(String text) throws Exception 
		{
			if(!getAlertText().equals(text))
				throw new Exception ("Text on alert pop up not matched");
		}

		/** Method to verify if the particular option is Selected from Dropdown
		 * @param accessType : String : Locator type (id, name, class, xpath, css)
		 * @param by : String : Select element from dropdown by text or value
		 * @param option : String : Element to select from dropdown  
		 * @param accessName : String : Locator value
		 * @param shouldBeSelected : Boolean : test case [true or false]
		 * @throws TestCaseFailed
		 */
		public void isOptionFromDropdownSelected(String accessType,String by,String option,String accessName,boolean shouldBeSelected)
		{
			Select selectList=null;
		//	WebElement dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
			//selectList = new Select(dropdown);
			
			String actualValue="";
			if(by.equals("text"))
				actualValue = selectList.getFirstSelectedOption().getText();
			else
				actualValue = selectList.getFirstSelectedOption().getAttribute("value");
			
			//if((!actualValue.equals(option))&&(shouldBeSelected))
			//	throw new TestCaseFailed("Option Not Selected From Dropwdown");
		//	else if ((actualValue.equals(option))&&(!shouldBeSelected))
			//	throw new TestCaseFailed("Option Selected From Dropwdown");
		}
		
		

		/** Method to select element from Dropdown by type
		 * @param select_list : Select : Select variable
		 * @param bytype : String : Name of by type
		 * @param option : String : Option to select
		 */
		public void selectelementfromdropdownbytype (Select select_list, String bytype, String option)
		{
			if(bytype.equals("selectByIndex"))
			{
				int index = Integer.parseInt(option);
				select_list.selectByIndex(index-1);
			}
			else if (bytype.equals("value"))
				select_list.selectByValue(option);
			else if (bytype.equals("text"))
				select_list.selectByVisibleText(option);
		}
		
		/** Method to select option from dropdown list
		@param accessType : String : Locator type (id, name, class, xpath, css)
		@param by : String : Name of by type
		@param option : String : Option to select
		@param accessName : String : Locator value
		*/
		public void selectOptionFromDropdown(String accessType, String optionBy, String option, String accessName)
		{
			//dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
			//selectList = new Select(dropdown);
			
		//	if(optionBy.equals("selectByIndex"))
			//	selectList.selectByIndex(Integer.parseInt(option)-1);
//			else if (optionBy.equals("value"))
//				//selectList.selectByValue(option);
//			else if (optionBy.equals("text"))
//				selectList.selectByVisibleText(option);
		}
		
		//method to select all option from dropdwon list
//		public void select_all_option_from_multiselect_dropdown(String access_type, String access_name)
//		{
//			dropdown = driver.findElement(getelementbytype(access_type, access_name));
//			selectList = new Select(dropdown);
//			
//			//Select all method not present in JAVA
//		}
		
		/** Method to unselect all option from dropdwon list
		@param accessType : String : Locator type (id, name, class, xpath, css)
		@param accessName : String : Locator value
		*/
		public void unselectAllOptionFromMultiselectDropdown(String accessType, String accessName)
		{
//			selectList = new Select(dropdown);
//			selectList.deselectAll();
		}
		
		/** Method to unselect option from dropdwon list
		@param accessType : String : Locator type (id, name, class, xpath, css)
		@param accessName : String : Locator value
		*/
		public void deselectOptionFromDropdown(String accessType, String optionBy, String option, String accessName) 
		{
//			dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
//			selectList = new Select(dropdown);
//			
//			if(optionBy.equals("selectByIndex"))
//				selectList.deselectByIndex(Integer.parseInt(option)-1);
//			else if (optionBy.equals("value"))
//				selectList.deselectByValue(option);
//			else if (optionBy.equals("text"))
//				selectList.deselectByVisibleText(option);
		}
		
		/** Method to check check-box
		@param accessType : String : Locator type (id, name, class, xpath, css)
		@param accessName : String : Locator value
		*/
		public void checkCheckbox(String accessType, String accessName)
		{
//			if (!checkbox.isSelected())
//				checkbox.click();
		}
		
		/** Method to uncheck check-box
		@param accessType : String : Locator type (id, name, class, xpath, css)
		@param accessName : String : Locator value
		*/
		public void uncheckCheckbox(String accessType, String accessName)
		{
		//	WebElement checkbox= wait.until(ExpectedConditions.presenceOfElementLocated(getelementbytype(accessType, accessName)));
//			if (checkbox.isSelected())
//				checkbox.click();
		}
		
		public void takeScreenShot() throws IOException
		{
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
			Calendar cal = Calendar.getInstance();
			System.out.println(dateFormat.format(cal.getTime()));
			
			String scrFilepath = scrFile.getAbsolutePath();
			System.out.println("scrFilepath: " +scrFilepath);
			
			File currentDirFile = new File("Screenshots");
			String path = currentDirFile.getAbsolutePath();
			System.out.println("path: " +path+"+++");
			
			System.out.println("****\n"+path+"\\screenshot"+dateFormat.format(cal.getTime())+".png");
			
			//FileUtils.copyFile(scrFile, new File(path+"\\screenshot"+dateFormat.format(cal.getTime())+".png"));
			
			/*DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Calendar cal = Calendar.getInstance();
			System.out.println(dateFormat.format(cal.getTime()));*/
		}
		 /* cur_time = Time.now.strftime('%Y%m%d%H%M%S%L')
		  $driver.save_screenshot('./features/screenshots/screenshot' + cur_time + '.png')*/
		

		/** Method to wait 
		 * @param time : String : Time to wait
		 * @param method : String : wait by sleep or implicit method 
		 * @throws NumberFormatException
		 * @throws InterruptedException
		 */
		public void wait(String time) throws NumberFormatException, InterruptedException
		{
			//sleep method takes parameter in milliseconds
			Thread.sleep(Integer.parseInt(time)*1000);
		}
		
		/**Method to Explicitly wait for element to be displayed
		 * @param accessType : String : Locator type (id, name, class, xpath, css)
		 * @param accessName : String : Locator value
		 * @param duration : String : Time to wait for element to be displayed
		 */
		public void waitForElementToDisplay(String accessType,String accessName,String duration)
		{
		//	By byEle = getelementbytype(accessType, accessName);
			WebDriverWait wait = (new WebDriverWait(driver,Integer.parseInt(duration)*1000));
		//	wait.until(ExpectedConditions.visibilityOfElementLocated(byEle));
		}
			
		/** Method to Explicitly wait for element to be enabled=click
		 * @param accessType : String : Locator type (id, name, class, xpath, css)
		 * @param accessName : String : Locator value
		 * @param duration : String : Time to wait for element to be clickable
		 */
		public void waitForElementToClick(String accessType,String accessName,String duration)
		{
		//	By byEle = getelementbytype(accessType, accessName);
			WebDriverWait wait = (new WebDriverWait(driver,Integer.parseInt(duration)*1000));
		//	wait.until(ExpectedConditions.elementToBeClickable(byEle));
		}
		
	}

