package com.inportia.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.inportia.utils.BrowserManager;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class BasePage {

	public static WebDriver globalBrowser;
   

	public BasePage()
	{
		System.out.println("Base page initialized....");
		globalBrowser = BrowserManager.getBrowser();
		globalBrowser.manage().window().maximize();
		globalBrowser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		globalBrowser.manage().deleteAllCookies();
		globalBrowser.get(BrowserManager.getAUT_URL());
		
	}
    
	
	@After
	public void  tearDown()
	{
		BrowserManager.closeBrowser();
	}
}
