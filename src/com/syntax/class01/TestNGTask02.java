package com.syntax.class01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTask02 {
	
	@BeforeClass
	public void running () {
		System.out.println("--------Animals are running-----------");
		
	}
	
	@AfterClass
	public void eating() {
		System.out.println("-----------Animals are eating-----------");
	}
	
	@BeforeMethod
	public void speaking() {
		System.out.println("babies are speaking");
	}
	
	@AfterMethod
	public void talking() {
		System.out.println("Animals can talk");
	}
	
	@Test
	public void playing() {
		System.out.println("I am playing cricket");
	}
	
	@Test
	public void playing2() {
		System.out.println("My son is playing cricket");
	}

}
