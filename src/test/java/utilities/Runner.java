package utilities;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import generic.RestAssuredExtension;

@CucumberOptions(features = {
		"src/test/resources/features" }, glue = "stepdefinition")

public class Runner extends AbstractTestNGCucumberTests {

	@Before
	public void TestSetup() {
		RestAssuredExtension restAssuredExtension = new RestAssuredExtension(null, null, null);
	}
}