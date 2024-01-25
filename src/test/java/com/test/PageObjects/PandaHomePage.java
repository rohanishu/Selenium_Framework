package com.test.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PandaHomePage extends Base {

	public PandaHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// 1. locate the elements
	// 2. create an actions

	
	
	// 1. we located the element
	//2. we stored into a webelement
	private By mobno=By.id("mobile");
	private By subbtn=By.xpath("//button[@type='submit']");
	

	

	public WebElement getMobno() 
	{
		return getElement(mobno);
	}
	
	public WebElement getSubbtn() 
	{
		return getElement(subbtn);
	}
	
	// action methods:-
	//1. passing the mobile number
	//2. submitting
	
	public void providemob()
	{
		getMobno().sendKeys("567891234");		
	}
	
	public void submit()
	{
		getSubbtn().click();
	}

}
