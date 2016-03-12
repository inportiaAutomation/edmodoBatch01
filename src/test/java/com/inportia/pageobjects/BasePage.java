package com.inportia.pageobjects;


import org.openqa.selenium.WebDriver;

import com.inportia.utils.BrowserManager;


public class BasePage {

	public WebDriver globalBrowser;
   

	protected BasePage(WebDriver driver)
	{
		System.out.println("Base page initialized....");
		globalBrowser = BrowserManager.getBrowser();
	
	}
	
	public WebDriver getBrowser()
	{
		return globalBrowser;
	}
    
	
	
}
