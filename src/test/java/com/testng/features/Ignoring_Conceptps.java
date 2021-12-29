package com.testng.features;


import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignoring_Conceptps {
	
	@Test
	private void facebook() {
		System.out.println("Facebook");
	}
	@Test
	private void whatsapp() {
		System.out.println("Whatsapp");
	}
	@Test
	private void spotify() {
		System.out.println("Spotify");
	}
	@Test(enabled = false)
	private void wynkMusic() {
		System.out.println("WynkMusic");
	}
	@Ignore
	@Test
	private void Book() {
		System.out.println("Book");
	}
}	
