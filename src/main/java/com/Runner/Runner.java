package com.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features= "C:/Users/jyotij/Connect/MavConnect/src/main/resources/Features/ConnectLogin.feature",
				  glue= {"com.StepDef"} )
public class Runner {
	


}
