package com.gcr.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.gcr.qa.base.testbase;

public class signuppage extends testbase{
	@FindBy(xpath="//h1[contains(text(),'My Account Information')]")
	WebElement text;
	public signuppage(){
		PageFactory.initElements(driver, this);
		
	}
	public String verifymessage(){
		String message=text.getText();
		return message;
	}
	
public void creatingaccount(String fname,String lname,String dob,String mail,String saddress,String pcode,String city,String stte,String title,String tnum,String pwd){
	driver.findElement(By.name("gender")).click();
	driver.findElement(By.name("firstname")).sendKeys(fname);
	driver.findElement(By.name("lastname")).sendKeys(lname);
	driver.findElement(By.name("dob")).sendKeys(dob);
	driver.findElement(By.name("email_address")).sendKeys(mail);
	driver.findElement(By.name("street_address")).sendKeys(saddress);
	driver.findElement(By.name("postcode")).sendKeys(pcode);
	driver.findElement(By.name("city")).sendKeys(city);
	driver.findElement(By.name("state")).sendKeys(stte);
	Select select=new Select(driver.findElement(By.name("country")));
	select.selectByVisibleText(title);
	
	driver.findElement(By.name("telephone")).sendKeys(tnum);
	driver.findElement(By.name("password")).sendKeys(pwd);
	driver.findElement(By.name("confirmation")).sendKeys(pwd);
	driver.findElement(By.id("tdb4")).click();
	
	
	
	
	
	
}
	
	
	
	
	
}
