package com.test.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Base{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// Page locators using encapsulation
	//.click and .sendkeys happens not in by locators but in WebElement
	
	
	
	
	private By emailid= By.id("username");
	private By pwd=By.id("password");
	private By loginbutn=By.id("loginbtn");
	private By header= By.xpath("tag[@key='value']");
	
	public WebElement getEmailid() {
		// returning the generic getElement method from BasePage class
		// this method will return the Webelement for that particular field
		return getElement(emailid);
	}
	
	public WebElement getPassword() {
		return getElement(pwd);
	}
	
	public WebElement getLoginbutn() {
		return getElement(loginbutn);
	}
	
	public WebElement getHeader() {
		return getElement(header);
	}
	
  // basic methods or action methods for title and header
	public String getLoginPageTitle() {
		return getPageTitle();
	}
	
	public String getLoginPageHeader()
	{
		 return getPageHeader(header);
	}
	
	// Action methods:-
	
	// parameter we are passing which is to be send in the textfield using sendkeys
	public HomePage doLogin(String username, String pass)
	{
		getEmailid().sendKeys(username);
		getPassword().sendKeys(pass);
		getLoginbutn().click();
		
		return getInstance(HomePage.class);
		
	    
		// after click we are landing on HomePage so we will return the Page object of the Landing Pages HomePage
		//return getInstance(HomePage.class); 
	}
	
	// using method overloading we can do some negative testing
	/*
	public void doLogin()
	{
		getEmailid().sendKeys("");
		getPassword().sendKeys("");
		getLoginbutn();
	}
	*/
	
	
}
	
	
	
	
	
	
	
	
	
	
