package com.testng.features;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Asset {
	
	@Test 
	private void username() {
		String expexted_Username = "Smith" ;
		String actual_Username = "Smith1" ;
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual_Username, expexted_Username);
		System.out.println("Username Validataion Succesfull");
	}
	@Test(priority = 1)
	private void password() {
		String expexted_Password = "Smith@123" ;
		String actual_Password = "Smith" ;
		SoftAssert soft = new SoftAssert();
		soft.assertAll();
		System.out.println("Password Validataion Succesfull");
		
	}		
}
	

