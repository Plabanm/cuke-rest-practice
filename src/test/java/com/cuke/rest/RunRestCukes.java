package com.cuke.rest;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "html:target/cucumberHtmlReport", "json:target/cucumber-report.json" },
        features = "src/test/resources"
)
public class RunRestCukes{

}
