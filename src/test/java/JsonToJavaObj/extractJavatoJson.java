package JsonToJavaObj;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class extractJavatoJson {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		//to Read JSON response from API and set to PoJO class values for front end validation
		ObjectMapper o=new ObjectMapper();
		extractedPojoClass p = o.readValue("D:\\MyFramework_Cucumber\\target\\JsonIndividual0.json", extractedPojoClass.class);
		
		System.out.println(p.getName());
	}
}
