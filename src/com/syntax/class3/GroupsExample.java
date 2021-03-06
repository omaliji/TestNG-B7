package com.syntax.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupsExample {

	public static WebDriver driver;

	@Test
	public void openBrowser() {
		String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get(url);
		@Test(groups = "smoke")
		public void validLogin() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Humnhrm123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();
		String welcomeText = driver.findElement(By.id("welcome")).getText();
		if (welcomeText.contains("Admin")) {
			System.out.println("Admin is logged in. Test is passed");
		} else {
			System.out.println("Admin is NOT logged in. Test fail");
		}
	}
	
  @Test(groups = "regression")
  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("Humnhrm123");
}