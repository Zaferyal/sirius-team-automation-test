package com.cydeo.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html" },    //especially for reports
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        tags = "",
        dryRun = false,     //in order to get snippets by making true or in order to run codes make it false
        publish = true    //in order to generate public link for reports

)


public class CukesRunner {
}