package com.qa.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\dhiva\\eclipse-workspace\\AmazonBDDwithPOM\\src\\main\\java\\com\\qa\\features\\amazon.feature",
		glue={"com\\qa\\StepDefinition"},
		format= {"pretty","html:test-outout","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome=true,
		strict=true,
		dryRun=false
		)
 	
public class TestRunner {

	
	
	
}
