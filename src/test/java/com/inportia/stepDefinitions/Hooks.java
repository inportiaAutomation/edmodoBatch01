package com.inportia.stepDefinitions;


import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.inportia.utils.BrowserManager;



public class Hooks {

	
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		driver = BrowserManager.getBrowser();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	}
	  
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}
