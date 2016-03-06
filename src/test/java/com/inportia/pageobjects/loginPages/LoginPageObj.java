package com.inportia.pageobjects.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.inportia.pageobjects.BasePage;


public class LoginPageObj extends BasePage
{
	
	WebElement login_link;
	WebElement username_textBox;
	WebElement password_textBox;
	WebElement login_submit;
	
    public LoginPageObj() {
		super();
        globalBrowser.findElement(By.className("pull-right show-login-modal btn green-btn"));
	    globalBrowser.findElement(By.name("username"));   
	    globalBrowser.findElement(By.name("password")) ;
	    globalBrowser.findElement(By.className("btn green-btn submit-btn"));
	    
	}


	
	public void click_login_link()
	{
		System.out.println("clicking login...");
		this.login_link.click();
	}
	
	public void enclassNameter_userName_password(String un , String pwd)
	{
        this.username_textBox.sendKeys(un);
        this.password_textBox.sendKeys(pwd);
	}
	
	public void click_login_submit_button()
	{
        this.login_submit.click();
	}
	
	public void verify_if_login_successfull()
	{
	     
	}
}
