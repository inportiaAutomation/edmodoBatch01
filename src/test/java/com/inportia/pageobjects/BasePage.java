package com.inportia.pageobjects;

import org.openqa.selenium.WebDriver;

import com.inportia.utils.BrowserManager;

public class BasePage {

	public WebDriver globalBrowser;
	
	public BasePage()
	{
		globalBrowser = BrowserManager.getBrowser();
	}
    
	public void finalize()
	{
		if(globalBrowser!=null)
		{
			globalBrowser.close();
			System.exit(0);
		}
	}
	
}
