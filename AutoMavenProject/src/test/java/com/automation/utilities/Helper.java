package com.automation.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.automation.pages.BaseClass;

public class Helper {
	
	public void getScreenshotPath(String methodName)
	{
		try {
				TakesScreenshot ts = ((TakesScreenshot)BaseClass.driver);
				File scr = ts.getScreenshotAs(OutputType.FILE);
				File dest = new File("./Screenshot/"+methodName+".png");	
				FileUtils.copyFile(scr,dest);
				
	} catch (IOException e) {
		

		System.out.println("Unable to capture screenshot...");
	}
	
	}
	
	
}
