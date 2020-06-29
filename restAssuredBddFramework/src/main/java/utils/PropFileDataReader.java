package utils;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropFileDataReader {

	public static Map<String ,String> propfiledatareader = new HashMap<String ,String>();

	public static Properties prop= new Properties();

	
	//Method to read environment files
	public static Map<String ,String> envReader()

	{  String environment =System.getProperty("env");

	try {

		if(environment.equalsIgnoreCase("dev")) 

		{
			FileInputStream fisDev= new FileInputStream(System.getProperty("user.dir")+"/testData/dev.properties");
			prop.load(fisDev);
			propfiledatareader.put("Serverurl",prop.getProperty("ServerURL") );
			propfiledatareader.put("portNo", prop.getProperty("portNo"));
			propfiledatareader.put("username", prop.getProperty("username"));
			propfiledatareader.put("password", "password");

		} 


		else if(environment.equalsIgnoreCase("qa")) 

		{
			FileInputStream fisQa= new FileInputStream(System.getProperty("user.dir")+"/testData/qa.properties");
			prop.load(fisQa);
			propfiledatareader.put("Serverurl",prop.getProperty("ServerURL") );
			propfiledatareader.put("portNo", prop.getProperty("portNo"));
			propfiledatareader.put("username", prop.getProperty("username"));
			propfiledatareader.put("password", "password");


		} 

		else if(environment.equalsIgnoreCase("stage")) 

		{
			FileInputStream fisStage= new FileInputStream(System.getProperty("user.dir")+"/testData/stage.properties");
			prop.load(fisStage);
			propfiledatareader.put("Serverurl",prop.getProperty("ServerURL") );
			propfiledatareader.put("portNo", prop.getProperty("portNo"));
			propfiledatareader.put("username", prop.getProperty("username"));
			propfiledatareader.put("password", "password");


		} 
	} catch (Exception e) {
		//TODO : Handle exception 
	}
	return propfiledatareader;

	}




}
