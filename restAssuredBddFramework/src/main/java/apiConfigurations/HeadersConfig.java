package apiConfigurations;

import java.util.HashMap;
import java.util.Map;

public class HeadersConfig {

	public Map<String ,String> defaultHeaders(){
		
		Map<String,String> headers=new HashMap<String,String>();
		headers.put("Content-type", "application/json");
		
		return headers;
		
		
	}
	
	
public Map<String ,String> headersWithTokens(){
		
		Map<String,String> headers=new HashMap<String,String>();
		headers.put("Content-type", "application/json");
		headers.put("Access_Token", "agdahgdj3575357");
		
		return headers;
		
		
	}
	
	
}
