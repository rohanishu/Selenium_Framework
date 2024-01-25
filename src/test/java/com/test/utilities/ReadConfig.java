package com.test.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	public static Properties prop;
	
	// it will load the config.properties
	public ReadConfig()
	{
		File src = new File("./Configuration/config.properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	
	public String getApplicationURL()
	{
		String base= prop.getProperty("baseURL");
		
		return base;
		
	}


	
	
	
}
