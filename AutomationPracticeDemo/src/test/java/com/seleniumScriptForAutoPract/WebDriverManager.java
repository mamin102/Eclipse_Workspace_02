package com.seleniumScriptForAutoPract;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

	public static void main(String[] args) {
		
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		//System.setProperty("Webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("amin_rifat@ymail.com");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("WhatUP102");
		
		driver.findElement(By.xpath("//button[@value=\"1\"]")).sendKeys(Keys.ENTER);
				
		driver.quit();
		
		
		
	}

}
