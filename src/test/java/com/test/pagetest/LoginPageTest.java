package com.test.pagetest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.PageObjects.HomePage;
import com.test.PageObjects.LoginPage;


public class LoginPageTest extends BasePageTest{

	
	@Test
	public void verifyLoginPageTitle()
	{
		//1. call the class of the required Page
		//2. call the required method using(.) operator
		String tit=page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("title");
		Assert.assertEquals(tit, "HubSpot Login");
	}
	@Test
	public void verifyLoginPageHeader()
	{
		
		String header=page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println("header");
		Assert.assertEquals(header, "Dont have an account?");
	}
	
	@Test
	public void doLoginTest()
	{
		// we can use the value from the property file
		HomePage hompage=page.getInstance(LoginPage.class).doLogin("rohan.anil@gmail.com","Test@1234");
		
		String headerhome=hompage.getHomePageHeader();
		Assert.assertEquals(headerhome,"Getting started with HubSpot");
		 	
	}
	
	
}