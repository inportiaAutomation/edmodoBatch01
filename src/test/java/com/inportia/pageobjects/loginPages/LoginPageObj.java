package com.inportia.pageobjects.loginPages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inportia.pageobjects.BasePage;


@Test
public class LoginPageObj extends BasePage
{
	
	WebElement login_link;
	WebElement username_textBox;
	WebElement password_textBox;
	WebElement login_submit;
	
	
	
    public LoginPageObj() {
		super();
		System.out.println(this.browser.getCurrentUrl());
    }

    
    public void goToUrl(String url)
    {
    	this.browser.get(url);
    }
	
	public void click_login_link()
	{
		this.login_link = browser.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div[2]/div[1]/div[2]/a"));
		System.out.println("clicking login...");
		this.login_link.click();
	}
	
	public void enclassNameter_userName_password(String un , String pwd)
	{
		this.username_textBox = browser.findElement( By.xpath(".//*[@id='facebox']/div/table/tbody/tr/td/div[2]/form/div[1]/input") );   
		this.password_textBox = browser.findElement(By.name("password")) ;
        this.username_textBox.sendKeys(un);
        this.password_textBox.sendKeys(pwd);
	}
	
	public void click_login_submit_button()
	{
		this.login_submit = browser.findElement(By.xpath(".//*[@id='facebox']/div/table/tbody/tr/td/div[2]/form/a") );
        this.login_submit.click();
	}
	
	public void verify_if_login_successfull()
	{
	     
	}
}
