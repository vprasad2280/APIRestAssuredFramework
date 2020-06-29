package xyzApiTests;

import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import apiConfigurations.ApiPath;
import apiVerifications.APIVerification;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetTests extends BaseTest {

	@Test

	public void getSingleUserTest() {
		Response response = RestAssured.given().when().get(ApiPath.GET_SINGLE_USER);
		System.out.println(response.getBody().asString());
		APIVerification.responseCodeValidation(response, 200);
		System.out.println(response.statusLine());
		System.out.println(response.getContentType());

	}

	@Test
	public void getMultipleUserTest() {
		ValidatableResponse response = RestAssured.given().when().get(ApiPath.GET_LIST_OF_USERS).then();
		int total=response.extract().path("total");
		/*System.out.println(response.getBody().asString());
		APIVerification.responseCodeValidation(response, 200); 
		System.out.println(response.statusLine());
		System.out.println(response.getContentType());
		response.prettyPrint();*/
		System.out.println(total);

	}
}
