package org.stepdefinition;

import org.base.Base;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends Base{
	@Before
	public void before1() {
		launchBrowser();
		enterUrl("http://adactinhotelapp.com/");
	}
	
	@After
	public void after1(Scenario scenario) {
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		byte[] bs = screenshot.getScreenshotAs(OutputType.BYTES);
		scenario.embed(bs, "img");
		
       
	}

}
