package baseTest;

import org.testng.annotations.*;
import org.testng.annotations.Test;

import apiConfigurations.ApiPath;
import io.restassured.RestAssured;
import utils.ExtentReportListener;
import utils.PropFileDataReader;
@Listeners(ExtentReportListener.class)
public class BaseTest extends ExtentReportListener{
	
	
	@BeforeClass
	
	public void baseTest() {
		/*System.out.println(PropFileDataReader.envReader().get("Serverurl"));
		System.out.println(PropFileDataReader.envReader().get("username"));
		System.out.println(PropFileDataReader.envReader().get("password"));
		System.out.println(PropFileDataReader.envReader().get("portNo"));*/
	RestAssured.baseURI=PropFileDataReader.envReader().get("Serverurl");
	
	}
}
