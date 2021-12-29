package com.testng.features;

import org.testng.annotations.Test;

public class Expected_Exceptions {
	
	@Test(priority = 1,expectedExceptions = ArithmeticException.class)
	private void demo() {
		int a =10;
		
		System.out.println(a/0);
	}

	@Test(priority = 2,expectedExceptions = Exception.class)
	private void demoone() {
		int a =10;
		
		System.out.println(a/0);
	}
	@Test(priority = 3,expectedExceptions = Error.class)
	private void demotwo() {
		int a =10;
		
		System.out.println(a/0);
	}
	@Test(priority = 4,expectedExceptions = NullPointerException.class)
	private void demothree() {
		int a =10;
		
		System.out.println(a/0);
	}


}
