package com.stepDef;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Naukri_StepDef {
	WebDriver driver;
	
	@Given("^user is home page at naukri$")
	public void user_is_home_page_at_naukri() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
//		Set <String> handle = driver.getWindowHandles();
//		Iterator <String> it = handle.iterator();
//		Thread.sleep(5000);
//		driver.switchTo().window(it.next());
//		driver.close();

	}

	@When("^user is on login tab$")
	public void user_is_on_login_tab()  {
		driver.findElement(By.xpath("//div[text()=\"Login\"]")).click();    
	}
	@Then("^user enters currect userName and password$")
	public void user_enters_currect_userName_and_password()  {
	   driver.findElement(By.xpath("//input[@placeholder=\"Enter your active Email ID / Username\"]")).sendKeys("MohammadRifat.amin");
	   driver.findElement(By.xpath("//input[@placeholder=\"Enter your password\"]")).sendKeys("Naukri0162");
	}
	@Then("^user hit the login button$")
	public void user_hit_the_login_button()  {
	   driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	@Then("^user should be on the home page$")
	public void user_should_be_on_the_home_page()  {
	   String expTitle = driver.getTitle();
	   System.out.println(expTitle);
	   Assert.assertEquals("Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com", expTitle);   
	}
	@Then("^if wrong user should see a massage$")
	public void if_wrong_user_should_see_a_massage()  {
		WebElement text = driver.findElement(By.xpath("//div[text()=\"Invalid details. Please check the Email ID - Password combination.\"]"));
		if (text.isDisplayed()) {
			System.out.println("Please enter the userName and Password");
		}
	}
	@When("^user enters job title in the search box$")
	public void user_enters_job_title_in_the_search_box()  {
	   driver.findElement(By.xpath("//input[@id=\"qsb-keyword-sugg\"]")).sendKeys("automation testing");
	}
	@When("^user enters the location$")
	public void user_enters_the_location()  {
	   driver.findElement(By.xpath("//input[@id=\"qsb-location-sugg\"]")).sendKeys("USA");
	   driver.findElement(By.xpath("//div[text()= \"United States (USA\"]")).click();
	}
	@When("^user clicks on the search Button$")
	public void user_clicks_on_the_search_Button()  {
	   driver.findElement(By.xpath("//button[text()=\"Search\"]")).click();
	}

	@Then("^user should see the searched options$")
	public void user_should_see_the_searched_options() throws InterruptedException  {
		Thread.sleep(5000);
		String expTitle= driver.getTitle();
		System.out.println(expTitle);
		Assert.assertEquals("Automation Testing Jobs In United States (usa) - 7 Automation Testing Openings In United States (usa) - Naukri.com", expTitle);
	}

}