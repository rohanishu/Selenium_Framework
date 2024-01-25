package com.test.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {

	WebDriver driver;
	WebDriverWait wait;
	
	public Page(WebDriver driver)
	{
		this.driver=driver;
		this.wait= new WebDriverWait(this.driver,15);
		
	}
	
	//abstract methods means every page should have the testing of these functionalities(generic)
	
	public abstract String getPageTitle();
	
	public abstract String getPageHeader(By locator);
	
	// return the webelement in run time
	public abstract WebElement getElement(By locator);
	
	// explicit wait generic function
	public abstract void waitForElementPresent(By locator);
	
	public abstract void waitForPageTitle(String title);
	
	// generics class used to create instance of the class instead of creating object of the Page class we use generics
	
	public <TPage extends Base> TPage getInstance(Class<TPage> pageClass) {
		
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}	
	 
		
		
	
	

