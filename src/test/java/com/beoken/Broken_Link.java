package com.beoken;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Link {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		List<WebElement> all_links = driver.findElements(By.tagName("a"));
		for (WebElement links : all_links) {
			String link = links.getAttribute("href");
			URL url = new URL("link");
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			if (connection.getResponseCode()>400) {
				System.out.println("Broken Link");
			}
			
		}
		
	}

}
