package com.syntax.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class classWork {
	
	public static WebDriver driver;
	@Test
	public void openBrowser() throws InterruptedException {
		String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

	    driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		Thread.sleep(3000);
		driver.findElement(By.id("btnLogin")).click();
	

}
}