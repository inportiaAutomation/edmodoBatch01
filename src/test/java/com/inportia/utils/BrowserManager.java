package com.inportia.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BrowserManager {

	static WebDriver browser;
    static String autUrl = "https://www.edmodo.com";
	
    
	private BrowserManager()
	{}
	
	
	/*
	 * Return the instance of the browser
	 * */
	
	@Before
	public static WebDriver getBrowser()
	{
		if( BrowserManager.browser==null)
		{
			BrowserManager.browser = new FirefoxDriver();
		}
	
		return BrowserManager.browser;
	}
	
	public static String getAUT_URL()
	{
		// logic
		return autUrl;
	}
	
	
	@After
	public static void closeBrowser()
	{
		BrowserManager.browser.close();
	}
	
	
}
