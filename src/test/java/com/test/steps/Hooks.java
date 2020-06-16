package com.test.steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.test.base.BaseTest;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {
	public WebDriver driver;
	@Before
	public void startup() {
		System.out.println("This is start up Before method from Hooks");
	}
	
	@After
	public void teardown() {
		System.out.println("This is teardonw After method from Hooks");
		
	}
	
	
	@AfterStep(value = "@smoke")
	public void afterSite(Scenario scenario) {
		System.out.println("AFTER SITE");
		
		try {
			
			if(scenario.isFailed()) {
				scenario.write("this is my failure message");
				TakesScreenshot ts = ((TakesScreenshot)driver);
				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
				
				scenario.embed(screenshot, "image/png");
			}
		}
		catch(Exception e) {

			e.printStackTrace();
		}			
	}
}
