package automationSeleniumScript;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumScript_forAutomationFramework {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("http://automationpractice.com/index.php");
	    driver.findElement(By.xpath("//a[@class=\"login\"]")).click();
	    driver.findElement(By.id("email")).sendKeys("mohammadamin2019@aol.com");
		driver.findElement(By.xpath("//input[@id=\"passwd\"]")).sendKeys("Yoyoyo2021");
	    driver.findElement(By.id("SubmitLogin")).click();
	    
	     String title = driver.getTitle();
		 Assert.assertEquals(title, "My account - My Store");
		 Thread.sleep(5000);
		 WebElement  name =driver.findElement(By.xpath("//span[text()= \"Mohammad Amin\"]"));
		 if (name.isDisplayed()) {
			 System.out.println("********login Successful**********");
		 }
		 Actions act = new Actions(driver);
		 WebElement women = driver.findElement(By.xpath("//a[@title=\"Women\"]"));
		 act.moveToElement(women).build().perform();
		 driver.findElement(By.xpath("(//a[@title=\"Summer Dresses\"])[1]")).click();
		 
		 
		 
		 //slider : for price range 
		 
		// WebElement priceRange = driver.findElement(By.xpath("(//a[@class=\"ui-slider-handle ui-state-default ui-corner-all\"])[2]"));
		// act.dragAndDropBy(priceRange, 26, 0).build().perform();
		 
//		 WebDriverWait wait = new WebDriverWait(driver, 30);
//		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@title=\\\"Printed Chiffon Dress\\\"])[2]")));
		 
		 driver.findElement(By.xpath("(//a[@title=\"Printed Chiffon Dress\"])[2]")).click();
		 
		 
		 Select slt = new Select(driver.findElement(By.xpath("//select[@id=\"group_1\"]")));
		 slt.selectByIndex(1);
		 driver.findElement(By.xpath("//a[@title=\"Green\"]")).click();
		 
		 driver.findElement(By.xpath("//span[text()= \"Add to cart\"]")).click();
		 
		 
		 driver.findElement(By.xpath("(//i[@class=\"icon-chevron-right right\"])[2]")).click();
		 
		 WebElement quantity= driver.findElement(By.xpath("//input[@class=\"cart_quantity_input form-control grey\"]"));
		 
		 quantity.clear();
		 
		 quantity.sendKeys("4");
		 
		//Proceed to checkout :
		 
		 driver.findElement(By.xpath("(//a[@title=\"Proceed to checkout\"])[2]")).click();
		
		 //login if its not logged in before
		 
//		 driver.findElement(By.id("email")).sendKeys("mohammadamin2019@aol.com");
//		 driver.findElement(By.xpath("//input[@id=\"passwd\"]")).sendKeys("Yoyoyo2021");
//		 driver.findElement(By.id("SubmitLogin")).click();
		 
		 
		driver.findElement(By.xpath("(//a[@title=\"Update\"])[2]")).click();
		 
		WebElement mobilePhone=  driver.findElement(By.xpath("//input[@id=\"phone_mobile\"]"));
		
		mobilePhone.clear();
		mobilePhone.sendKeys("212-777-7777");
		
		driver.findElement(By.xpath("//button[@id=\"submitAddress\"]")).click();
		
		//for validation of the mobile number after changing it: 
		
//		WebElement mobile = driver.findElement(By.xpath("(//li[@class=\"address_phone_mobile\"])[2]"));
//		
//		String exp_mob= "212-777-7777";
//		
//		Assert.assertEquals(mobile, exp_mob);
		
		//Proceed to checkout :
		
		driver.findElement(By.xpath("//button[@name=\"processAddress\"]")).click();
		
		//Carriar checkbox :
		
		driver.findElement(By.xpath("//input[@id=\"cgv\"]")).click();
		
		//read terms of service :
		
		driver.findElement(By.xpath("//a[@class=\"iframe\"]")).click();
		
		//close the reading :
		
		driver.findElement(By.xpath("//a[@title=\"Close\"]")).click();
		
		//Proceed to checkout 
		
		driver.findElement(By.xpath("//button[@name=\"processCarrier\"]")).click();
		
		//pay by bank wire:
		
		driver.findElement(By.xpath("//a[@title=\"Pay by bank wire\"]")).click();
		
		driver.findElement(By.xpath("//*[text()=\"I confirm my order\"]")).click();
		
		driver.findElement(By.xpath("//*[text()=\"Back to orders\"]")).click();
		
		//orderReference :
	    	
			//driver.findElement(By.xpath("//a[@title=\"My orders\"]")).click();
		
		
		//open the order reference :
		
		driver.findElement(By.xpath("//a[contains(text(), 'MEKKWCHOH')]")).click();
		
		//pdf download :
		
		driver.findElement(By.xpath("(//a[@title=\"Invoice\"])[1]")).click();
		
		driver.findElement(By.xpath("//*[text()=\" Home\"]")).click();
		
		driver.findElement(By.xpath("//a[@title=\"Log me out\"]")).click();
		
		driver.quit();
		 
		 }

}
