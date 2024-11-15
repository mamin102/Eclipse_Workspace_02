package com.seleniumScriptForAutoPract;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumScriptForWomenPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");

		//WebDriverManager.chromedriver().setup();

		WebDriver driver= new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com");

		//			driver.findElement(By.xpath("//a[@class=\"login\"]")).click();
		//			driver.findElement(By.id("email")).sendKeys("mohammadamin2019@aol.com");
		//			driver.findElement(By.xpath("//input[@id=\"passwd\"]")).sendKeys("YoYoYo2021");
		//			driver.findElement(By.id("SubmitLogin")).click();

		Actions act = new Actions(driver);

		WebElement dresses = driver.findElement(By.xpath("(//a[text()= \"Dresses\"])[2]"));

		Thread.sleep(5000);

		act.moveToElement(dresses).build().perform();

		driver.findElement(By.xpath("(//a[@title=\"Evening Dresses\"])[2]")).click();

		System.out.println(driver.getTitle());

		Thread.sleep(5000);
		driver.quit();




	}

}
