package com.testng.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotation {
	
	@BeforeClass
	private void url() {
		System.out.println("url");
	}
	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser Launch");
	}
	@BeforeSuite 
	private void setProperty() {
		System.out.println("Set Property");
	}
	@BeforeMethod
	private void login() {
		System.out.println("login");
	}
	@AfterMethod
	private void logout() {
		System.out.println("Logout");
	}
	@Test
	private void womens() {
		System.out.println("Purchase Womens");
	}
	@Test
	private void kids() {
		System.out.println("Kids");
	}
	@Test
	private void men() {
		System.out.println("Men");
	}
	@AfterClass
	private void verifyHomePage() {
		System.out.println("Home P		age");
	}
	@AfterTest
	private void close() {
		System.out.println("Close");
	}
	@AfterSuite
	private void deleteAllCokkies() {
		System.out.println("Cokkies");
	}

}
