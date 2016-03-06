package com.inportia.edmodo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		dryRun = false,
		features = "features",
		glue = "com.inportia.stepDefinitions",
		strict = false
		)
public class TestRunner {

}
