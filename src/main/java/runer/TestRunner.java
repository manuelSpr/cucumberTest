package runer;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/java/MainTest"}, glue = "steps")
public class TestRunner  extends AbstractTestNGCucumberTests {
}
