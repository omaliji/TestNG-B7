package com.syntax.class01;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG001 {
	
	@Test(priority = 2)
	public void test1() {
		System.out.println("I am test Omar");
	}
	
	@Test(priority = 1)
	public void test2() {
		System.out.println("I am test Maaliji");
	}
	
	@BeforeTest
	public void method1() {
		System.out.println("------------I am method 1----------------");
	}
	
	@AfterTest
	public void method2() {
		System.out.println("----------I am method 2----------");
	}

}
