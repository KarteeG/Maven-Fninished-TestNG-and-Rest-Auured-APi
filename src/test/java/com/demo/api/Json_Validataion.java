package com.demo.api;
import java.io.File;
import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Json_Validataion {

	public static void main(String[] args) throws Throwable {

		File f = new File("C:\\Users\\u\\eclipse-workspace\\Maven_Projec\\src\\test\\java\\com\\payload\\Payload.json");
		FileReader reader = new FileReader(f);
		JSONParser parser = new JSONParser();
		Object parse = parser.parse(reader);
		JSONObject jsonobj = (JSONObject) parse;
		Object object = jsonobj.get("Team");
		String string = object.toString();
		System.out.println("Team: " + string);
		System.out.println("Json Validaton Succesfull");
		String re = "Australia" == string ? "Error":"Correct";
		System.out.println("True Or Falsse :" +re); 
	}

}
