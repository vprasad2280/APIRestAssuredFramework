package apiVerifications;

import io.restassured.response.Response;
import utils.ExtentReportListener;

import org.json.JSONObject;
import org.testng.*;

import com.relevantcodes.extentreports.LogStatus;

public class APIVerification extends ExtentReportListener  {

	
	public static void responseCodeValidation(Response response , int statuscode) {
		
		try
		{
		Assert.assertEquals(statuscode, response.getStatusCode());
		test.log(LogStatus.PASS, "Code is validated successfully , status code is ::"+response.getStatusCode() );
		
		} catch (AssertionError e) {
			test.log(LogStatus.FAIL, e.fillInStackTrace());
			test.log(LogStatus.FAIL, "Expected status code is ::" +statuscode +", but response code is "+ response.getStatusCode());
		}
		
		catch(Exception e) {
			e.fillInStackTrace();
			e.getMessage();
		}
		
		
	}
	
public static void responseKeyValidationJsonObject(Response response , String key) {
		
		try
		{
		JSONObject json =new JSONObject(response.getBody().asString());
		if(json.has(key) && json.get(key)!=null){
		test.log(LogStatus.PASS, " Successfully Validated value of  "+key+" , it is : " +json.get(key) );
		}
		else  {
			test.log(LogStatus.FAIL, "Key is not available in response ");
			
		}}
		
		catch(Exception e) {
			e.fillInStackTrace();
			e.getMessage();
		}
		
		
	}
}
