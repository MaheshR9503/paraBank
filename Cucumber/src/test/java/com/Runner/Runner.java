package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/FeatureFile"},
				 glue= {"com.webPage"},
				dryRun=true)
public class Runner {
	
	
	

}
