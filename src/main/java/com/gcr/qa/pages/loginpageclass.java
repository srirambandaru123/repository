package com.gcr.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gcr.qa.base.testbase;

public class loginpageclass extends testbase{
	//page factory or object repository
	@FindBy(name="email_address")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(id="tdb5")
	WebElement signinbtn;
	
	@FindBy(id="tdb4")
	WebElement registrationcontinuebtn;
	@FindBy(id="tdb1")
	WebElement addcarbtn;
	@FindBy(id="storeLogo")
	WebElement gcrimage;
	
	//now initialising pagefactory 
	//to initialise pagefactory we need to create constructor and use the method initelements
	//driver means all the pagefactory will be initialised and this means current class
	
	public loginpageclass(){
		PageFactory.initElements(driver, this);
		
	}
	//actions
	public String validateloginpagetitle(){
		return driver.getTitle();
	}
	public boolean validategcrimage(){
		return gcrimage.isDisplayed();
		
	}
	public Homepage logingcr(String mailid,String pwd){
		username.sendKeys(mailid);
		password.sendKeys(pwd);
		signinbtn.click();
		return new Homepage();
		
	}
	public void continueforsignupbtn(){
		driver.findElement(By.id("tdb4")).click();
	}
	
	
	
	
	

}
