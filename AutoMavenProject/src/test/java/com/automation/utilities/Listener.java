package com.automation.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Listener implements ITestListener{
	
	

	ExtentReports extent = ExtentReportGenerator.getReportObject();
	ExtentTest	test;
	Helper help  = new Helper();
	 
	
	@Override
	public void onTestStart(ITestResult result) {
		
		
			test = extent.createTest(result.getMethod().getMethodName());
	}
	
	
	
	public void onFinish(ITestContext context)
	{
		extent.flush();
	}



	@Override
	public void onTestFailure(ITestResult result) {
		help.getScreenshotPath(result.getMethod().getMethodName());
	}

	

	

}
