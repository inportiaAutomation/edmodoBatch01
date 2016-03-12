package com.inportia.stepDefinitions;


import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.inportia.utils.BrowserManager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks {

	
	public static WebDriver driver;
	
	@BeforeClass 
	public static void beforeClass()
	{
		System.out.println("BeforeClass called...");
	}
	
	
	@Before
	public void setUp()
	{
		System.out.println("Hooks setUp called...");
		driver = BrowserManager.getBrowser();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	}
	
	@After
	public void scenario_wait(Scenario scenario)
	{
		System.out.println("Scenario end...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(scenario.isFailed())
		{
			try {
	        	 scenario.write("Current Page URL is " + driver.getCurrentUrl());
//	            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
	            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	            scenario.embed(screenshot, "image/png");
	        } catch (WebDriverException somePlatformsDontSupportScreenshots) {
	            System.err.println(somePlatformsDontSupportScreenshots.getMessage());
	        }
		}
	}
	  
	@AfterClass
	public static void afterClass()
	{
		System.out.println("Hooks tearDown called...");
		BrowserManager.closeBrowser();
	}
}
