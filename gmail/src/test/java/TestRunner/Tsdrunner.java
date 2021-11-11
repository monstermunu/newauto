package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = { "src/test/resources/FeaturesFiles" }, glue = { "Steps" },monochrome = true,plugin = { "pretty", "html:target/cucumber-reports" })


public class Tsdrunner  extends AbstractTestNGCucumberTests  {
	
	
}
