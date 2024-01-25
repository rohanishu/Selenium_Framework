
package com.test.pagetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.test.PageObjects.Base;
import com.test.PageObjects.Page;
import com.test.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePageTest {

	WebDriver driver; 
	public Page page;
	
	//ReadConfig rd=new ReadConfig();
	
	//public String baseurl=rd.getURL(); 
	
	// we have to pass the driver into the Page class which is the main generic class 
	
	@BeforeMethod
	@Parameters(value= {"browser"})
	
	public void setup(String br) 
	{
	
		if(br.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(br.equals("firefox"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
		}
		
		page=new Base(driver);
		
 	
	}
	/*
	public void openURL()
	{
		String url=rd.getApplicationURL();
	}
	*/
	
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}
	
	
}
