package xyzApiTests;

import org.testng.annotations.Test;

import apiBuilders.PostAPIBuilder;
import apiConfigurations.ApiPath;
import apiConfigurations.HeadersConfig;
import apiVerifications.APIVerification;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pojo.PojoPostRequest;
import utils.JavaUtils;

public class PostTestPojo extends BaseTest{
	
	@Test	
	public void pojoTest() 
	{
	HeadersConfig  header=new HeadersConfig();	
	PojoPostRequest pojoobj= new	PojoPostRequest("15318","Appu");
	Response response = RestAssured.given().when().headers(header.defaultHeaders())
			.body(pojoobj).post(ApiPath.CREATE_USER);
	APIVerification.responseKeyValidationJsonObject(response, "name");
	APIVerification.responseKeyValidationJsonObject(response, "job");
	System.out.println(response.asString());
	
	}
}
