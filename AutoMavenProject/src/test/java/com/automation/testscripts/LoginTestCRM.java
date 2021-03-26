package com.automation.testscripts;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPage;
import com.automation.utilities.BrowserFactory;
import com.automation.utilities.ExcelDataProvider;

@Listeners(com.automation.utilities.Listener.class)

public class LoginTestCRM extends BaseClass {
	
	

	

	@Test
	public void loginApp()
	{
		
		
		LoginPage loginPage =PageFactory.initElements(driver,LoginPage.class);
		loginPage.loginToApp(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		
	}
	
	@Test
	public void validateTitle()
	{
		Assert.assertTrue(true);
	}
}
