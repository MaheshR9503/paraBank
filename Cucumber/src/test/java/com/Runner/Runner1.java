package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Feature"},
					 glue = {"com.MT.webpage"},
					 tags = "@MT_Login or @MT_register or @MT_Flight_booking"  ,
					 plugin= {"pretty","html:target/cucumberReport.html"}, monochrome=true)
public class Runner1 {

}
