package com.myTestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/moamin/eclipse-workspace02/CucumberBDD/src/test/resources/target.feature",
		glue= {"com.stepDef"},
		plugin= {"pretty", "html:HTML-output//report.html"}, 
		monochrome= true,
		dryRun= false,
		strict = false,
		tags= {("@SmokeTest") , ("@End2EndTest") }
		
		
		)
public class Target_TestRunner {

}
