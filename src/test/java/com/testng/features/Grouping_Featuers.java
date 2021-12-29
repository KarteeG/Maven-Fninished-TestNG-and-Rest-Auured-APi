package com.testng.features;

import org.testng.annotations.Test;

public class Grouping_Featuers {

	@Test(groups = "Social Media")
	private void facebook() {
		System.out.println("Facebook");
	}
	@Test(groups = "Social Media")
	private void whatsapp() {
		System.out.println("Whatsapp");
	}
	@Test(groups = "Music")
	private void spotify() {
		System.out.println("Spotify");
	}
	@Test(groups = "Music")
	private void wynkMusic() {
		System.out.println("WynkMusic");
	}
	@Test(groups = "Book")
	private void Book() {
		System.out.println("Book");
	}

}
