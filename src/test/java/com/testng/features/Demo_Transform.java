package com.testng.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo_Transform {
	
	@Test(priority = 1)
	private void demo() {
		String actual_Name = "Karthick";
		String expected_Name= "Karthick";
		
		Assert.assertEquals(actual_Name, expected_Name);
	}
	@Test(priority = 2)
	private void demoone() {
		String actual_Password = "Karthick@123";
		String expected_Password = "Karthick@1";
		
		Assert.assertEquals(actual_Password, expected_Password);

}
}