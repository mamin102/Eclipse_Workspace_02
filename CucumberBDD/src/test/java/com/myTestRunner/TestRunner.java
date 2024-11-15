package com.myTestRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/moamin/eclipse-workspace02/CucumberBDD/src/test/resources/login.feature",
		glue= {"com.stepDef"},
		plugin= {"pretty"}, //"html:HTML-output"
		monochrome= true,
		dryRun= false,
		strict = false	
		)
public class TestRunner {

}
