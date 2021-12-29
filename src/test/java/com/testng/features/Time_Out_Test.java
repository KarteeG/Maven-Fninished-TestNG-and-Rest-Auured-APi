package com.testng.features;

import org.testng.annotations.Test;

public class Time_Out_Test {

	
	@Test(timeOut = 6000)
	private void demo() throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println("Browser Launch");
		
		Thread.sleep(2000);
		System.out.println("URL Succesfull");
		
		Thread.sleep(1000);
		System.out.println("Credentials Means Uanme,Pass,LoginButton");
		
		System.out.println("Navigate Next Page");

	}
	@Test(timeOut = 4000)
	private void demoone() throws InterruptedException {
		
		Thread.sleep(2000);
		System.out.println("Browser Launch");
		
		Thread.sleep(2000);
		System.out.println("URL Succesfull");
		
		Thread.sleep(1000);
		System.out.println("Credentials Means Uanme,Pass,LoginButton");
		
		System.out.println("Navigate Next Page");

	}
}
