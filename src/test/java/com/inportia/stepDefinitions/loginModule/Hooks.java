package com.inportia.stepDefinitions.loginModule;

import com.inportia.utils.BrowserManager;

import cucumber.api.java.After;

public class Hooks {

	  
	@After
	public void closeBrowser()
	{
		BrowserManager.closeBrowser();
	}
}
