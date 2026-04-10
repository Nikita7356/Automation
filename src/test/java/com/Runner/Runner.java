package com.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/",glue="StepDefinations")

public class Runner extends AbstractTestNGCucumberTests {
	
	
	

}
