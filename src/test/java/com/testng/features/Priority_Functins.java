package com.testng.features;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority_Functins {

	@BeforeMethod
	private void login() {
		System.out.println("login");
	}
	@AfterMethod
	private void logout() {
		System.out.println("Logout");
	}
	@Test(priority = -2)
	private void womens() {
		System.out.println("Purchase Womens");
	}
	@Test(priority = 0)
	private void kids() {
		System.out.println("Kids");
	}
	@Test(priority = -1)
	private void men() {
		System.out.println("Men");
	}
}
