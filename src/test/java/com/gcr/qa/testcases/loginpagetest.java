package com.gcr.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gcr.qa.base.testbase;
import com.gcr.qa.pages.Homepage;
import com.gcr.qa.pages.loginpageclass;

public class loginpagetest extends testbase{
	loginpageclass loginpage;
	Homepage homepage;
	
	public loginpagetest(){
		super();
		
	}
	
	
	@BeforeMethod
	public void setup(){
		initialisation();
		loginpage=new loginpageclass();
	
			
			
		}
	@Test(priority=1)
	public void loginpagetest(){
		String title=loginpage.validateloginpagetitle();
		Assert.assertEquals(title, "GR Shop");
	}
	@Test(priority=2)
	public void gcrshopimage(){
		boolean flag=loginpage.validategcrimage();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void logintest(){
		homepage=loginpage.logingcr(prop.getProperty("emailaddress"), prop.getProperty("password"));
	}
		
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}

}
