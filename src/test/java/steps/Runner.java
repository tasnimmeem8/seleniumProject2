package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features="src/test/java/features",glue="steps",plugin={"html:reports"})
public class Runner extends AbstractTestNGCucumberTests {

}
