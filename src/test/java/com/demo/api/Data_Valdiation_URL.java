package com.demo.api;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Data_Valdiation_URL {

	private static void get() {

		RestAssured.baseURI = "https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		Response response = request.get("api/users?page=2");
		String respone_Body = response.asString();
		System.out.println("Response Body:" + respone_Body);
		int statusCode = response.getStatusCode();
		System.out.println("Status Code:" + statusCode);
		Assert.assertEquals(200, statusCode);
		System.out.println("Data Validation Succesfull");

	}
	private static void deleted() {
		RestAssured.basePath="https://reqres.in/";
		RequestSpecification request = RestAssured.given();
		Response delete = request.delete("api/users");
		String asString = delete.asString();
		System.out.println(asString);
		int statusCode = delete.getStatusCode();
		System.out.println(statusCode);
		System.out.println("Delete Succesfully");
		
		
		
		

	}
	
	public static void main(String[] args) {
		get();
		deleted();
		
	}

}
