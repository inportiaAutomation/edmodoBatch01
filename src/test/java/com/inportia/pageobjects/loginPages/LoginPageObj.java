package com.inportia.pageobjects.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.inportia.pageobjects.BasePage;


public class LoginPageObj extends BasePage
{
    LoginPageObj() {
		super();
	}

	WebElement login_link =  globalBrowser.findElement(By.linkText("Login"));
    WebElement username_textBox = globalBrowser.findElement(By.name("username"));   
    WebElement password_textBox = globalBrowser.findElement(By.name("password")) ;
    WebElement login_submit =  globalBrowser.findElement(By.className("btn green-btn submit-btn"));
    
	
	public void click_login_link()
	{
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
