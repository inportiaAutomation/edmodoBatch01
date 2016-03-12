package com.inportia.utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserManager {

	static WebDriver browser;
    static String autUrl = "https://www.edmodo.com";
	
    
	private BrowserManager()
	{}
	
	
	/*
	 * Return the instance of the browser
	 * */
	

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
	
	

	public static void closeBrowser()
	{
		System.out.println("Browser is closing....");
		BrowserManager.browser.quit();;
	}
	
	
}
