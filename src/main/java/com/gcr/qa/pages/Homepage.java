package com.gcr.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gcr.qa.base.testbase;

public class Homepage extends testbase{
	
	@FindBy(id="storeLogo")
	WebElement gcrshoplogo;
	
	@FindBy(id="tdb3")
	WebElement myaccountbtn;
	
	@FindBy(id="tdb4")
	WebElement logoffbtn;
	
	@FindBy(id="tdb2")
	WebElement checkoutbtn;
	
	
	
	
	public Homepage(){
		PageFactory.initElements(driver, this);
	}
	public boolean gcrlogo(){
		return gcrshoplogo.isDisplayed();
	}
	public myaccountpage myaccountb(){
		myaccountbtn.click();
		return new myaccountpage();
	}
	public void logffb(){
		logoffbtn.click();
	}
	public checkoutpage checkoutb(){
		checkoutbtn.click();
		return new checkoutpage();
	}
	public String gcrshopt(){
		return driver.getTitle();
		 
	}
	
	
	
	

}
