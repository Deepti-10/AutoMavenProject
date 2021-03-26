package com.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties prop;
	
	public ConfigDataProvider()
	{
    File src = new File("./Config/Config.properties");
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);

            this.prop= new Properties();
            prop.load(fis);
            
		} catch (Exception e) {
			
			System.out.println("Unable to load properties file"+e.getMessage());
		}
	}
	
	
	public String getDataFromConfig(String keyToSearch)
	{
		return prop.getProperty(keyToSearch);
	}
	
	public String getBrowser()
	{
		return prop.getProperty("Browser");
	}
	
	public String getAppUrl()
	{
		return prop.getProperty("qaURL");
	}
}
