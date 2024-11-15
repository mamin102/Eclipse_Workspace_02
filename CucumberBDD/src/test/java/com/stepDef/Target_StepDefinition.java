package com.stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Target_StepDefinition {
	
	WebDriver driver;
	
	@Before("End2EndTest")
	public void user_opens_the_chrome_browser()  {
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");
		driver= new ChromeDriver();   
	}
	@After("@End2EndTest")
	public void close() {
		//  global hook = this is after hook, works like @AfterTest annotation in TestNG
		/* if you do like @After(@SmokeTest) = it will be dedicated to only for this particular 
		tags in feature file, so will only be applied to those scenarios that has this <@SmokeTest> tags. 
		this is LOCAL Hooks = tag hook */
		
		driver.close();
	}
	
/*	@Given("^user opens the chrome browser$")
	public void user_opens_the_chrome_browser()  {
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");
		driver= new ChromeDriver();
	    
	}   */

	@When("^user is on the homepage of target$")
	public void user_is_on_the_homepage_of_target()  {
		
		driver.manage().deleteAllCookies();
	    driver.get("https://www.target.com/");
	}

	@Given("^user enters the currect url$")
	public void user_enters_the_currect_url()  {
	   String expTitle= driver.getTitle();
	   System.out.println(expTitle);
	   Assert.assertEquals( expTitle , "Target : Expect More. Pay Less.");
	    
	}

	@Then("^search desire item on search box$")
	public void search_desire_item_on_search_box()  {
	   driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Laptops");
	    
	}

	@And("^user clicks on search button$")
	public void user_clicks_on_search_button()  {
	   
	    driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

	@Then("^user should be on the searched page$")
	public void user_should_be_on_the_searched_page() throws InterruptedException  {
		Thread.sleep(3000);
	  String searchedTitle = driver.getTitle();
	  Assert.assertEquals(searchedTitle, driver.getTitle());
	}

	@Then("^search men on search box$")
	public void search_men_on_search_box()  {
	   
		   driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Men");

	}

	@Then("^search women on search box$")
	public void search_women_on_search_box()  {
	   
		   driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Women");

	}

	@Then("^search young adult on search box$")
	public void search_young_adult_on_search_box()  {
		   driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Young");

	    
	}

	@Then("^search grocery on search box$")
	public void search_grocery_on_search_box()  {
		   driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Grocery");

	    
	}

	@Then("^search kids on search box$")
	public void search_kids_on_search_box()  {
		   driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("kids");

	    
	}

	@Then("^search baby on search box$")
	public void search_baby_on_search_box()  {
		   driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("baby");

	    
	}

	@Then("^search shoes on search box$")
	public void search_shoes_on_search_box()  {
	   
		   driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("shoes");

	}

	@Then("^search kitchen on search box$")
	public void search_kitchen_on_search_box()  {
		   driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Kitchen");

	    
	}

	@Then("^search toy on search box$")
	public void search_toy_on_search_box()  {
	   
		   driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Toy");
 
	}

	@Then("^search electronics on search box$")
	public void search_electronics_on_search_box()  {
	   
		   driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("electronics");

	}

	@Then("^search video game on search box$")
	public void search_video_game_on_search_box()  {
		   driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Video Game");

	    
	}

	@Then("^search furniture on search box$")
	public void search_furniture_on_search_box()  {
	   
		   driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Furniture");

	}

	@Then("^search sports on search box$")
	public void search_sports_on_search_box()  {
		   driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("sports");

	    
	}

	@Then("^search beauty on search box$")
	public void search_beauty_on_search_box()  {
	   
		   driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("Beauty");

	}

	@Then("^search health on search box$")
	public void search_health_on_search_box()  {
		   driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("health");

	    
	}

	@Then("^search pets on search box$")
	public void search_pets_on_search_box()  {
		   driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("pets");


	}

}
