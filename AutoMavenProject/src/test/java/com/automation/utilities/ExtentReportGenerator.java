package com.automation.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportGenerator {
	
	public static ExtentReports extent;
	
	
	public static ExtentReports getReportObject()
	{
		
		System.out.println("Inside extent report class");
		
	    //configure report
		String path = System.getProperty("user.dir")+"\\Reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path); 
		reporter.config().setReportName("Web Automation report");
		reporter.config().setDocumentTitle("Test Results");
		
		extent = new ExtentReports(); //actually create reports
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Deepti Sahani");
		
		
		return extent;
		
	}
	
	
}
