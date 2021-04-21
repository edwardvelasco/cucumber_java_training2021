package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"D://Cucumber_Java_Training//src//test//java//Features/LoginToFB.feature"},
        glue = {"StepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports/","junit:target/cucumber-reportsJunit/CucumberJunit.xml"},
        monochrome = false, // Display from Console will be more readable
        //strict = true, //
        dryRun = false // to verify Mapping or Feature files and StepDefinition

)
public class TestRunner {

}
