package stepdefinition;

import java.util.HashMap;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import generic.APIConstant;
import generic.RestAssuredExtension;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;
import io.restassured.response.ResponseOptions;

public class Demo {

	public ResponseOptions<Response> response;

	@Given("^Get Users From Page \"([^\"]*)\"$")
	public void get_Users_From_Page(String uri) throws Throwable {
		
		RestAssuredExtension rse = new RestAssuredExtension(null, APIConstant.ApiMethods.GET, null);
		
		Map<String, String> val = new HashMap<String, String>();
		val.put("page", "2");
		
		response = rse.ExecuteWithQueryParams(val);
		
		//System.out.println("vaasd"+response.getBody().asString());

	}

	@Then("^verify count$")
	public void verify_count() throws Throwable {
		JsonPath jsonPathEvaluator = ((ResponseBodyExtractionOptions) response).jsonPath();
		// Get specific element from JSON document 
		int val = jsonPathEvaluator.get("total");
		System.out.println("Value"+val);
	}

}
