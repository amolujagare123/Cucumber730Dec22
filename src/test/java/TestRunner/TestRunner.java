package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",
glue = "stepdefinition" ,
/*plugin = {"pretty","html:target/cucumber.html"
        ,"json:target/cucumber.json"
        ,"junit:target/cucumber.xml"},*/
   tags = "@subscription",
        dryRun = true
 )
public class TestRunner {
}
