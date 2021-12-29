package com.testng.features;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test(priority = -1)
	private void bowserLaunch() {
		System.out.println("Browser Launch");
	}
	@Test(priority = 0)
	private void url() {
		System.out.println("url");
	}
	@Test(priority = 1,invocationCount = 5)
	private void refresh() {
		System.out.println("refresh");
	}

}
