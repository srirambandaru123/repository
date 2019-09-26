package com.gcr.qa.testcases;

import java.lang.instrument.IllegalClassFormatException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gcr.qa.base.testbase;
import com.gcr.qa.pages.Homepage;
import com.gcr.qa.pages.loginpageclass;
import com.gcr.qa.pages.signuppage;
import com.gcr.qa.util.testutilclass;

public class signuptest extends testbase{
	loginpageclass loginpage;
	Homepage homepage;
	signuppage signup;
	testutilclass testutil;
	String sheetName="Sheet1";
    public signuptest(){
	super();
     }

    @BeforeMethod
	public void setup(){
		initialisation();
	    homepage=new Homepage();
	    loginpage=new loginpageclass();
	    loginpage.continueforsignupbtn();
	     signup=new signuppage();
	      testutil=new testutilclass();
        }
    @DataProvider
    public Object[][] gettestdataexcel(){
    	Object data[][]=testutil.getTestData(sheetName);
    	
    	return data;
    	
    }
    
    
    
    
    @Test(dataProvider="gettestdataexcel")
    public void creatingaccount(String firstname,String lastname, String dateofbirth,String email,String streetaddress,String postcode,String city,String state,String country,String telenumber,String password){
    	
    	//signup.creatingaccount("sri", "ram", "01-01-1985", "hsghshhs@gmail.com", "hsgbshbjb", "874784", "76373", "andhrapradesh", "India", "8478747884", "sriram@123");
    	
    	signup.creatingaccount(firstname, lastname, dateofbirth, email, streetaddress, postcode, city, state, country, telenumber, password);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    /*@AfterMethod
	public void teardown(){
		driver.quit();
	}*/




    }
