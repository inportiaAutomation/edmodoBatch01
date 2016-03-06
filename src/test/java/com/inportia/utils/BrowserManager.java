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
		if(browser==null)
		{
			browser = new FirefoxDriver();
		}
	
		return browser;
	}
	
	public static String getAUT_URL()
	{
		// logic
		return autUrl;
	}
	
	
	
}
