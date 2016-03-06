package com.inportia.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserManager {

	static WebDriver browser;
	
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
	
	
}
