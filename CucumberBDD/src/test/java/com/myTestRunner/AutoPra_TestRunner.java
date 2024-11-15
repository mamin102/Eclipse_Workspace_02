package com.myTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"/Users/moamin/eclipse-workspace02/CucumberBDD/src/test/resources/AutoPrac.feature"},
		glue= {"com.stepDef"},
		plugin= {"pretty", "html:HTML-output//Auto_Prac.html"}, 
		monochrome= true,
		dryRun= false
		
		)
public class AutoPra_TestRunner {

}
