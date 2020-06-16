package com.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"./com.features"},
		glue= {"com.test.steps"},
		monochrome = true,
		plugin = {"pretty","html:target/cucumber-html-report",
				"json:target/cucumber-reports/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun = false
		
		
		
		)
public class TestRunner {

}
