package com.inportia.pageobjects.postPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.inportia.pageobjects.BasePage;

@Test
public class HomePagePostObj extends BasePage {
	
	
	// note-tab
	WebElement note_tab;
	WebElement message_tb;
	WebElement recipients_tb;
	WebElement group_name;
	WebElement send_bt;
	
	public HomePagePostObj()
	{
		super();
	}
	
	public void click_note_tab()
	{
		this.note_tab = browser.findElement(By.xpath(".//*[@id='postbox-note']/a"));
		this.note_tab.click();
	}
	
	public void enter_message()
	{
	   System.out.println("user is entering message....");
	   this.message_tb = browser.findElement(By.xpath(".//*[@id='postbox-note-content']/div[3]/textarea"));
	   this.message_tb.sendKeys("Sample message - inportia");
	}
	
	public void select_reciepients()
	{
		System.out.println("user is selecting recipients....");
		this.recipients_tb = browser.findElement(By.xpath(".//*[@id='postbox-note-input']"));
		this.recipients_tb.sendKeys("TestGroup-01");
		
		// select the populated group
		this.group_name = browser.findElements(By.linkText("TestGroup-01")).get(1);
		this.group_name.click();
	}
	
	
	public void send_note()
	{
		 System.out.println("Clicking the send button...");
		 this.send_bt = browser.findElement(By.xpath(".//*[@id='postbox-note-content']/form/div[1]/a[2]"));
		 this.send_bt.click();
	} 
	
	public void verify_note_send()
	{
		System.out.println("Verifing the message is posted");
		 
	}

}
