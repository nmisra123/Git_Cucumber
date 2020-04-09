package databaseToJson;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.commons.text.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import gherkin.deps.com.google.gson.Gson;

public class DatabaseToJson {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		
	//create object of PojoClass to set table values into Java object
	PojoClass pj=new PojoClass();
	
	
	//Connection to database; Update DB details & login details below
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn=null;
	conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Databasename", "user", "pwd");
	
	//Run query on database; Update query details below
	Statement st=conn.createStatement();
	ResultSet rs= st.executeQuery("select * from <tablename>");
	
	//Create single JSON file for all records in the db table
	// Need array list to create Json file
	ArrayList<PojoClass> arr=new ArrayList<PojoClass>();
	
	while(rs.next())
	{
		rs.next();
		//set values from database table to Pojo class variables
		pj.setName(rs.getString(1));
		pj.setAddress(rs.getString(2));
		pj.setPhNumber(rs.getInt(3));
		pj.setEmail(rs.getString(4));
		
		arr.add(pj); //adding individual record to array list
	}
	
	//pj.setName("neha");
	//pj.setAddress("saya");
	//pj.setPhNumber(99100);
	//pj.setEmail("abcd.gmail.com");
	//arr.add(pj);
	
	Gson g=new Gson();
	JSONObject j=new JSONObject();
	JSONArray ja=new JSONArray();
	
	for (int i=0;i<=arr.size();i++) {
	
	//If Convert Pojo Java Object to individual JSON file; no need to use FOR loop ; one file for each db record will be created; pass pj object
		
	//ObjectMapper obj=new ObjectMapper();
	//obj.writeValue(new File("D:\\MyFramework_Cucumber\\target\\JsonIndividual.json"), arr.get(i));
	
	
	
	//to create single JSON string, array is to be created 
		
	String jsonString=g.toJson(arr.get(i));
	ja.add(jsonString);
	j.put("data", ja);// this will put individual json inside final JSON String with format data[]=
		
	}
	
	System.out.println(j.toJSONString());// to print final JSON file on console
	
	// formatting the final JSON string
	String finalJSON =  StringEscapeUtils.unescapeJava(j.toJSONString());
	System.out.println(finalJSON);
	
	// If you need to remove \ from the final JSON
	finalJSON.replace("\"{", "{");
	finalJSON.replace("\"}", "}");
	
	// to write JSON string to a JSON file
	FileWriter JsonFile=new FileWriter("D:\\MyFramework_Cucumber\\target\\JsonIndividual.json");
	JsonFile.write(finalJSON);
	
	conn.close();
	
	}
}
