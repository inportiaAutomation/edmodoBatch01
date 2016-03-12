package com.inportia.edmodo;

import org.junit.runner.RunWith;

import com.inportia.utils.BrowserManager;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		dryRun = false,
		features = "features",
		glue = "com.inportia.stepDefinitions",
		tags = {"@wip"},
	    format = { "pretty", "html:target/cucumber", "json:target_json/cucumber.json"}, 
		strict = false
		)
public class TestRunner {
     
}
