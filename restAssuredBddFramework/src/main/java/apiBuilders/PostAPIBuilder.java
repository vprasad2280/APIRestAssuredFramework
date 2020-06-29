package apiBuilders;

import java.util.HashMap;
import java.util.Map;

public class PostAPIBuilder {
	
	public Map<String ,String> postRequestBody(String name , String job){
	
	 Map<String ,String> postbody= new HashMap<String ,String>();
	 postbody.put("name", name);
	 postbody.put("job", job);
	 return postbody;

}}

