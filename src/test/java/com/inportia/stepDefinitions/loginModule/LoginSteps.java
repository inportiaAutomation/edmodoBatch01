package com.inportia.stepDefinitions.loginModule;

import com.inportia.pageobjects.loginPages.LoginPageObj;

import cucumber.api.java.en.Given;

public class LoginSteps {

	LoginPageObj login_page = new LoginPageObj();
	
	@Given("^User is on login page$")
	public void User_is_on_login_page() throws Throwable {
	  
	}

	@Given("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_enters_and(String arg1, String arg2) throws Throwable {
		login_page.click_login_link();
		login_page.enclassNameter_userName_password(arg1, arg2);
		Thread.sleep(2000);
		login_page.click_login_submit_button();
	}

	
	@Given("^Verify that user is on homepage$")
	public void Verify_that_user_is_on_homepage() throws Throwable {
		System.out.println("Verify test.....");
	}

	
}
