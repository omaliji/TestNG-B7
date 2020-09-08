package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NegativeLogin {

	public static WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test
	public void validLogin() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		WebElement message = driver.findElement(By.id("spanMessage"));
		String expectedMsg = "Password cannot be empty";
		String actualMsg = message.getText();
		
		if(expectedMsg.equals(actualMsg)) {
			System.out.println("Test is Passed");
		}else {
			System.out.println("Test is Failed");
		}
	}
	
	
		
	}

