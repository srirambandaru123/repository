package com.gcr.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.gcr.qa.util.testutilclass;
import com.gcr.qa.util.webeventlistenerclass;

public class testbase {
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static webeventlistenerclass eventlistener;
	
	
	
	
	
	public testbase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\Kiran\\workspace\\GCRshop\\src\\main\\java\\com\\gcr\\qa\\configurtion\\config.properties");
			
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialisation(){
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		 e_driver=new EventFiringWebDriver(driver);
		  eventlistener=new webeventlistenerclass();
		  e_driver.register(eventlistener);
		  driver=e_driver;
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(testutilclass.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(testutilclass.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
		
	
		
	
	}
}


	
	


			
		
	
		
		
		
		
	

