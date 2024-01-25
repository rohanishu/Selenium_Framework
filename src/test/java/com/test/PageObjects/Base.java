package com.test.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.test.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base extends Page {
	
	

	public Base(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
    //ReadConfig rd=new ReadConfig();
    
	
	 
	
	
	/*
	@BeforeMethod
	@Parameters(value= {"browser"})
	
	public void setup(String br) 
	{
	
		if(br.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		/*
		else if(br.equals("firefox"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new FirefoxDriver();
		}
		

		
	
	
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}

	*/
	@Override
	public String getPageTitle() {
		// TODO Auto-generated method stub
		return   driver.getTitle();
	}
	
	@Override
	// wrapper method
	// e.printstacktrace() helps the programmer to understaand where the actual problem occured
	public WebElement getElement(By locator) {
		// TODO Auto-generated method stub
		
		WebElement element=null;
		
		element =driver.findElement(locator);
		return element; 
		
	}
     
	@Override
	public String getPageHeader(By locator) 
	{
		 return getElement(locator).getText();
	}
	

	

	@Override
	public void waitForElementPresent(By locator) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void waitForPageTitle(String title) {
		// TODO Auto-generated method stub
		
	}


   /*
	@Override
	public void waitForElementPresent(By locator) {
		// TODO Auto-generated method stub
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
   /
	@Override
	public void waitForPageTitle(String title) {
		// TODO Auto-generated method stub
		try {
			wait.until(ExpectedCondtions.titleContains(title));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	*/

}
