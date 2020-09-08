package com.syntax.class4;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	
	//invoked when we start every @Test method
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started");
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed");
	}
	
	//invoked when we start <test> based on xml file
	public void onStart(ITestContext context) {
		System.out.println("Starting test inside xml");
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("Ending test inside xml");
	

}
