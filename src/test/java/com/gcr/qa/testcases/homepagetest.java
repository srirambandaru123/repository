package com.gcr.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Assert.ThrowingRunnable;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.gcr.qa.base.testbase;
import com.gcr.qa.pages.Homepage;
import com.gcr.qa.pages.checkoutpage;
import com.gcr.qa.pages.loginpageclass;
import com.gcr.qa.pages.myaccountpage;

public class homepagetest extends testbase {
	loginpageclass loginpage;
	Homepage homepage;
	myaccountpage myaccount;
	checkoutpage checkout;

	
	public homepagetest(){
		super();
	}
	
	
	
	@BeforeMethod
	public void setup(){
		initialisation();
		loginpage=new loginpageclass();
		loginpage.logingcr(prop.getProperty("emailaddress"), prop.getProperty("password"));
		 homepage=new Homepage();
		 
	}
	@Test(priority=1)
	public void gcrshoptitle(){
		homepage.gcrlogo();
		Assert.assertEquals(homepage.gcrlogo(), homepage.gcrlogo());
	}
	@Test(priority=2)
	public void clickonmyaccountbtn(){
		myaccount=homepage.myaccountb();
		
	}
	@Test(priority=3)
	public void checkoutbtn(){
		checkout=homepage.checkoutb();
	}
	@Test(priority=4)

    public void logoffbtn(){
    	homepage.logffb();
    }
	@Test(priority=5)
	public void gcrshopptitle(){
		String pagetitle=homepage.gcrshopt();
		Assert.assertEquals(pagetitle, "GCR Shop");
		
	}
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
}
	
	
	
	


