package com.test.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Base {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// using the By locators to identify & locate elements
	private By header= By.className("private-page__title");

	// using getters to return the webelements or anything
	public WebElement getHeader() {
		return getElement(header);
	}

	
	//page actions method 
	
	public String getHomePageTitle()
	{
		return getPageTitle();
	}
	
	public String getHomePageHeader()
	{
		return getPageHeader(header);
	}
	
	

}
