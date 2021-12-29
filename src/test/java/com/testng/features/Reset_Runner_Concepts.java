package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Reset_Runner_Concepts {
	
	@Test(priority = 1,retryAnalyzer = test_Run.class)
	private void demo() {
		String actual_Name = "Karthick";
		String expected_Name= "KArthick";
		
		Assert.assertEquals(actual_Name, expected_Name);
	}
	@Test(priority = 2,retryAnalyzer = test_Run.class)
	private void demoone() {
		String actual_Password = "Karthick@123";
		String expected_Password = "Karthick@1";
		
		Assert.assertEquals(actual_Password, expected_Password);
		
	}

}
