package utilities;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import generic.RestAssuredExtension;

@CucumberOptions(features = { "src/test/resources/features" }, glue = "stepdefinition", plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" })

public class Runner extends AbstractTestNGCucumberTests {

	@Before
	public void TestSetup() {
		RestAssuredExtension restAssuredExtension = new RestAssuredExtension(null, null, null);
	}

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig("src/test/java/utilities/extent-config.xml");
	}
}