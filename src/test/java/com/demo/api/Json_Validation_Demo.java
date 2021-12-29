package com.demo.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.Assert;
import org.junit.Test;

public class Json_Validation_Demo {
	
	@Test
	public void Vaidate_Data() throws Throwable {
		
		File f = new File("C:\\Users\\u\\eclipse-workspace\\Maven_Projec\\src\\test\\java\\com\\payload\\Pay.json");
		FileReader reader = new FileReader(f);
		
		JSONParser parser = new JSONParser();
		Object parse = parser.parse(reader);
		
		JSONObject jobj = (JSONObject) parse;
		Object object = jobj.get("Home");
		
		String string = object.toString();
		System.out.println("Home:"+string);
		
		Assert.assertEquals("OWN",string);
		System.out.println("Data Validation Succesfull");
		

	}

}
