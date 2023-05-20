package com.common;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListeners implements ITestListener  
{
	public void onFinish(ITestContext context)
	{
		Reporter.log("Test finish successfull");
		System.out.println("Test finish");
	}
	public void onStart(ITestContext context)
	{
		Reporter.log("Test started successfully");
		System.out.println("Test start");
	}
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("Test failed");
		System.out.println("On test failure");
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test passed");
	}
	

}
