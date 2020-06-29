package xyzApiTests;

import apiBuilders.PostAPIBuilder;
import apiConfigurations.ApiPath;
import apiConfigurations.HeadersConfig;
import apiVerifications.APIVerification;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.JavaUtils;

public class POSTTest extends BaseTest {
	
	@Test
	public void validpostTest() {
	
	HeadersConfig  header=new HeadersConfig();	
	PostAPIBuilder postobj=new PostAPIBuilder();
	
	Response response = RestAssured.given().when().headers(header.defaultHeaders())
			.body(postobj.postRequestBody(JavaUtils.randomString(), JavaUtils.randomString())).post(ApiPath.CREATE_USER);
	APIVerification.responseKeyValidationJsonObject(response, "name");
	APIVerification.responseKeyValidationJsonObject(response, "job");
	System.out.println(response.asString());
	
	}
}
