package com.inportia.stepDefinitions.postStepsDefs;


import com.inportia.pageobjects.postModules.HomePagePostObj;

import cucumber.api.java.en.Given;

public class PostSteps {

	HomePagePostObj home = new HomePagePostObj();
	
	@Given("^Click on the NOTE tab$")
	public void Click_on_the_NOTE_tab() throws Throwable {
		home.click_note_tab();
	}

	@Given("^Enter your message in textbox$")
	public void Enter_your_message_in_textbox() throws Throwable {
        home.enter_message();
	}

	@Given("^Select the recipients from dropdown list$")
	public void Select_the_recipients_from_dropdown_list() throws Throwable {
		home.select_reciepients();
	}

	@Given("^Send the note$")
	public void Send_the_note() throws Throwable {
		home.send_note();
	}

	@Given("^Verify if note is seen$")
	public void Verify_if_note_is_seen() throws Throwable {
	  
	}


}
