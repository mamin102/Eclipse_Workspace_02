package com.stepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_forFacebookLogin {
	
	WebDriver driver;
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");
		
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	   
	}

	@When("^titile of login page is Facebook$")
	public void titile_of_login_page_is_Facebook() throws Throwable {
		 String expTilte=  driver.getTitle();
		   System.out.println(expTilte);
		   Assert.assertEquals("Facebook - Log In or Sign Up", expTilte);  // Log In or Sign Up  
	}

	@Then("^user enters current UserName and password$")
	public void user_enters_current_UserName_and_password() throws Throwable {
		driver.findElement(By.name("email")).sendKeys("abul@gmail.com");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("1234");
	   
	}

	@Then("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
	    
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
	}

}