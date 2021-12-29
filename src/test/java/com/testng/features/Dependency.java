package com.testng.features;

import org.testng.annotations.Test;

public class Dependency {
	
	@Test
	private void mobile() {
		System.out.println("Mobiles");
	}
	@Test
	private void watch() {
		System.out.println("Watch");
	}
	@Test(dependsOnMethods = "watch")
	private void offer() {
		System.out.println("Offer");
	}

}
