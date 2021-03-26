package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.jvm.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources", glue= {"org.stepdefinition"},monochrome=true,plugin= {"json:C:\\Users\\Rajkumar\\eclipse-workspace\\CucumberDay7\\src\\test\\resources\\Report\\adactin.json","pretty"})

public class TestRunnerClass {
	@AfterClass
	public static void after() {
    JVMReport.generateReport("C:\\Users\\Rajkumar\\eclipse-workspace\\CucumberDay7\\src\\test\\resources\\Report\\adactin.json");
		
	}

}
