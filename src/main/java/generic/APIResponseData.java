package generic;

import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseOptions;

public class APIResponseData {

	public ResponseOptions<Response> response;

	public ResponseBody getResponseBody() {
		return response.getBody();
	}
	
	public void verifyResponseContains(String val) {
		
	}

}
