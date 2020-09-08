package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IssueWithoutAssertion {
	
	public static WebDriver driver;

	@Test
	public void openBrowser() {
		String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(url);

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		String welcomeText = driver.findElement(By.id("welcome")).getText();

		if (welcomeText.contains("welcome")) {
			System.out.println("Admin is login. Test passed");
		} else {
			System.out.println("Admin is NOT logged in. Test fail");
		}
	}
}


