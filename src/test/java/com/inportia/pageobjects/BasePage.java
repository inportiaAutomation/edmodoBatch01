package com.inportia.pageobjects;



import org.openqa.selenium.WebDriver;

import com.inportia.stepDefinitions.Hooks;


public abstract class BasePage {

	public WebDriver browser;
    
	

	protected BasePage()
	{
		System.out.println("Base page initialized....");
		this.browser = Hooks.driver;
	}
	
}
