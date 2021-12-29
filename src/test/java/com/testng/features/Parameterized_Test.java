package com.testng.features;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test {
	
	@Test
	@Parameters({"username","password"})
	private void demoone(String username,String password) {
		
		System.out.println("Username :"+ username);
		System.out.println("Password :"+ password);
		
	}
	@Test(priority = 1)
	@Parameters({"Fname","Lname"})
	private void demptwo(@Optional("Karthick.N.G")String fname,@Optional String lname) {
		System.out.println("Fname :"+ fname);
		System.out.println("Lname :"+ lname);
		
	}
	

}
