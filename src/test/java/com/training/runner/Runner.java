package com.training.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature\\",
				glue={"com.training.steps"},
				tags="@wipTC01a",
				plugin= {"pretty", "html:target/cucumber-reports/cucumber.html",
									"json:target/cucumber-reports/cucumber.json"}
)


public class Runner {

}
