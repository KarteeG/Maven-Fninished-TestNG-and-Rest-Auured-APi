package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Assert_Concepts {
	
	
	@Test 
	private void username() {
		String expexted_Username = "Smith" ;
		String actual_Username = "Smith" ;
		
		Assert.assertEquals(actual_Username, expexted_Username);
		System.out.println("Username Validataion Succesfull");
	}
	@Test(priority = 1)
	private void password() {
		String expexted_Password = "Smith@123" ;
		String actual_Password = "Smith" ;
		
		Assert.assertEquals(actual_Password, expexted_Password);
		
		System.out.println("Mismatch Occur");
	}
	@Test(priority = 2)
	private void Fname() {
		String expexted_Fname = "Smith@123" ;
		String actual_Fname = "Smith";
		
		Assert.assertNotEquals(actual_Fname, expexted_Fname);
		System.out.println("Fname Succesfull");
	}
	

}
