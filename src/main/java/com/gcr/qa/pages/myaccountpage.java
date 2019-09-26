package com.gcr.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.gcr.qa.base.testbase;

public class myaccountpage extends testbase {
	public myaccountpage(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="bodyContent")
	WebElement myaccountbody;
	@FindBy(className="headerNavigation")
	WebElement catalogb;
	
	public String accountb(){
		return myaccountbody.getText();
	}
	public void catalogbtn(){
		catalogb.click();
	}
	
	

}
