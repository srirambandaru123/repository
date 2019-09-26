package com.gcr.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gcr.qa.base.testbase;
import com.gcr.qa.pages.Homepage;
import com.gcr.qa.pages.checkoutpage;
import com.gcr.qa.pages.loginpageclass;
import com.gcr.qa.pages.myaccountpage;

public class myaccounttest extends testbase{
	loginpageclass loginpage;
	Homepage homepage;
	myaccountpage myaccount;
	checkoutpage checkout;
	
	public myaccounttest(){
		super();
	}
	
	
	
	@BeforeMethod
	public void setup(){
		initialisation();
		loginpage=new loginpageclass();
		loginpage.logingcr(prop.getProperty("emailaddress"), prop.getProperty("password"));
		 homepage=new Homepage();
		 myaccount=new myaccountpage();
		 homepage.myaccountb();
	}
	
	@Test(priority=1)
	public void verifubodytitleofmyaccountpage(){
		String body=myaccount.accountb();
		Assert.assertEquals(body, body);
		
		
	}
	@Test(priority=2)
	public void clickoncatalogbtn() throws InterruptedException{
		//Thread.sleep(80000);
		myaccount.catalogbtn();
	}
	
	
	
	
	
	
		 
		 @AfterMethod
			public void teardown(){
				driver.quit();
			} 
		 
		
	}


