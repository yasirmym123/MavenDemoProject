package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoTest {
	WebDriver driver;
	
	
	@Test
	public void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
		
		ChromeOptions options= new ChromeOptions();
		options.setHeadless(true);
		driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Automation Step By Step");
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
		System.out.println(driver.getTitle());
		
	}

}
