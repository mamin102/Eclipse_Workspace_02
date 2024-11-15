package com.stepDef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AutoPrac_StepDef {
	WebDriver driver;
	

	@Given("^enter the url$")
	public void enter_the_url()  {
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");
	driver= new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	    driver.get("http://automationpractice.com");
	  
	}

	@When("^user is on the home page$")
	public void user_is_on_the_home_page()  { 
		 String title = driver.getTitle();
		   Assert.assertEquals(title, "My Store");
	}

	@Then("^user clicks on the signIn$")
	public void user_clicks_on_the_signIn()  {
	    driver.findElement(By.xpath("//a[@class=\"login\"]")).click();
	   
	}

	@And("^user enter's vaild email to create an account$")
	public void user_enter_s_vaild_email_to_create_an_account()  {
	    driver.findElement(By.xpath("//input[@id=\"email_create\"]")).sendKeys("mohammadamin2019@aol.com");
	}

	@And("^user clicks on the create an account button$")
	public void user_clicks_on_the_create_an_account_button()  {
	    driver.findElement(By.xpath("//button[@id=\"SubmitCreate\"]")).click();
	   
	}

	@Then("^user fill up the personal information Form$")
	public void user_fill_up_the_personal_information_Form() throws InterruptedException  {
		
		Thread.sleep(5000);
		
		// radio  button
	   driver.findElement(By.id("id_gender1")).click(); 
	   // Customer FirstName and LastName
	   driver.findElement(By.id("customer_firstname")).sendKeys("Mohammad");
	   driver.findElement(By.id("customer_lastname")).sendKeys("Amin");
	   // Password
	   driver.findElement(By.id("passwd")).sendKeys("YoYoYo2021");
	   //Date of birth 
	   Select s = new Select ( driver.findElement(By.id("days")));
	   s.selectByValue("22");
	   Select s2 = new Select ( driver.findElement(By.id("months")));
	   s2.selectByVisibleText("December ");
	   Select s3 = new Select ( driver.findElement(By.xpath("//select[@id=\"years\"]")));
	   s3.selectByIndex(27);
	   // checkBox
	   driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
	   //firstName and lastName
	   driver.findElement(By.xpath("//input[@id=\"firstname\"]")).sendKeys("Mohammad");
	   driver.findElement(By.xpath("//input[@id=\"lastname\"]")).sendKeys("Amin");
	   //Company
	   driver.findElement(By.id("company")).sendKeys("Path to Glory");
	   //Street address
	   driver.findElement(By.id("address1")).sendKeys("7915 woodside st, apt 300332");
	   driver.findElement(By.id("address2")).sendKeys("N/A");
	   //city
	   driver.findElement(By.id("city")).sendKeys("Jackson heights");
	   //State
	   Select s4 = new Select (driver.findElement(By.id("id_state")));
	   s4.selectByValue("32");
	   //Post code
	   driver.findElement(By.id("postcode")).sendKeys("11102");
	   //country
	   Select s5= new Select(driver.findElement(By.id("id_country")));
	   s5.selectByValue("21");
	   //additional info
	   driver.findElement(By.tagName("textarea")).sendKeys("This is just for test purpose.");
	   //Phone
	   driver.findElement(By.id("phone")).sendKeys("718-777-7777");
	  //mobile
	   driver.findElement(By.id("phone_mobile")).sendKeys("347-567-7890");
	   //alias
	  WebElement ele=  driver.findElement(By.id("alias"));
	  ele.clear();
	  ele.sendKeys("My Address");
	   
	}

	@And("^user clicks on the register button$")
	public void user_clicks_on_the_register_button()  {
	    
	   driver.findElement(By.xpath("//button[@id=\"submitAccount\"]")).click();
	}

	@When("^user enter's valid email and password$")
	public void user_enter_s_valid_email_and_password()  {
	    
	   driver.findElement(By.id("email")).sendKeys("mohammadamin2019@aol.com");
	   driver.findElement(By.xpath("//input[@id=\"passwd\"]")).sendKeys("YoYoYo2021");
	}

	@And("^user clicks on the sign in button$")
	public void user_clicks_on_the_sign_in_button()  {
	    driver.findElement(By.id("SubmitLogin")).click();
	   
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws InterruptedException  {
		 Thread.sleep(5000);
		String title = driver.getTitle();
		 Assert.assertEquals(title, "My account - My Store");
		 Thread.sleep(5000);
		 WebElement  name =driver.findElement(By.xpath("//span[text()= \"Mohammad Amin\"]"));
		 if (name.isDisplayed()) {
			 System.out.println("********login Successful**********");
		 }
		
	    
	}
}
