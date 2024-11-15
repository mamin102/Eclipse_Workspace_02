package com.gmail;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAutomate {
	
	static String pass = "YoYoYo2021" ;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/moamin/Downloads//ChromeDriver");
		WebDriver driver= new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
			Scanner sc = new Scanner(System.in);
			
			String firstName = sc.nextLine();
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys(firstName);
			
			String lastName = sc.nextLine();
			
			driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys(lastName);
			
			String userName = sc.nextLine();
			
			driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys(firstName+lastName);
			
			driver.findElement(By.xpath("//div[text()=\"Password\"]")).sendKeys(pass);
			
			driver.findElement(By.xpath("//div[text()=\"Confirm\"]")).sendKeys(pass);
	}

}
