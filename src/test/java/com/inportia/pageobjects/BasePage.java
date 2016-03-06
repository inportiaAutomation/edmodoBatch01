package com.inportia.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.inportia.utils.BrowserManager;

public class BasePage {

	public WebDriver globalBrowser;

	
	
	public BasePage()
	{
		globalBrowser = BrowserManager.getBrowser();
		globalBrowser.manage().window().maximize();
		globalBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		globalBrowser.manage().deleteAllCookies();
		globalBrowser.get(BrowserManager.getAUT_URL());
		
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
