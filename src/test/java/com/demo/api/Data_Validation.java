package com.demo.api;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Data_Validation {

	@Test
	public void validate_Data() {

		RestAssured.baseURI = "https://reqres.in";

		RequestSpecification request = RestAssured.given();

		Response response = request.get("/api/users/2");

		String respones_Body = response.asString();

		System.out.println("Respone Body :" + respones_Body);

		int statusCode = response.getStatusCode();

		System.out.println("Status Code:" + statusCode);

		Assert.assertEquals(200, statusCode);

		System.out.println("Data Validate Succesfull");

	}

}
