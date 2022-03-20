package com.memberweb.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com/memberweb/stepDefinitions","com.memberweb.utilities"},
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/CucumberTestReport.json"
                },
        monochrome = true
)
public class TestRunner {

}
