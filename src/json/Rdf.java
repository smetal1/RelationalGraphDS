package json;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;

import javax.activation.MailcapCommandMap;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

public class Rdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		ParentNode parentNode;
		ArrayList<ResourceNode> resourceNodes=new ArrayList<ResourceNode>();
		try {
			JsonReader jsonReader=new JsonReader(new FileReader("/Users/Shared/Jenkins/eclipse-workspace/json/src/json/test.json"));
		 Map<String, Object> map=gson.fromJson(jsonReader,Map.class );
		 
		 System.out.println(map.get("resourceNodeq"));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
