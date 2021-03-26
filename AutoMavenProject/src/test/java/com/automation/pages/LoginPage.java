package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	public static WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath = "//span[contains(text(),'Log In')]") WebElement loginBtn;	
	@FindBy(name = "email") WebElement email;
	@FindBy(name = "password") WebElement pswd;
	@FindBy(xpath= "//div[contains(text(),'Login')]") WebElement login;
	
	public void loginToApp(String username, String pass)
	{
		loginBtn.click();
		email.sendKeys(username);
		pswd.sendKeys(pass);
		login.click();
		
	}

}
