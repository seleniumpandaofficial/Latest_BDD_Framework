package com.tutorialsninja.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    
        features = {"src/test/resources/feature_files" },
        glue     = {"com.tutorialaninja.StepDefinitions", "com.tutorialsninja.Hooks"},
        tags     = "@TutorialsNinjaLogin",
        plugin   = {"pretty", "html:target/CucumberReports/CucumberReport.html", 
        		    "json:target/cucumber1.json", 
        		    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        publish  = true

   )

public class Runner_TestNG extends AbstractTestNGCucumberTests {
	
	/*
	
	@Override
	@DataProvider(parallel = true)
	       public Object[][] scenarios(){
		        return super.scenarios();
	}
	
	*/

}
