package com.Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.Base_Class;

public class Actions_Runner extends Base_Class {
	
	public static WebDriver driver;
	
	public static void main (String[] args) throws InterruptedException {
	
		driver = getBrowser("chrome");
		
		getUrl("http://www.leafground.com/pages/drop.html");
		
		maximize();
		
		WebElement From = driver.findElement(By.id("draggable"));
		actionClass("clickandhold", From);
		
		WebElement To = driver.findElement(By.id("droppable"));
		actionClass("movetoeelement", To);
		actionClass("Release", To);
		
		thread(5000);
		
		//WebElement From1 = driver.findElement(By.id("draggable"));
		
		//WebElement To1 = driver.findElement(By.id("droppable"));
		
		//actionClass("draganddrop", From1);
		
		driver.get("https://www.google.co.in/");
		
		navigateTo("https://www.google.co.in/");
		
		
		WebElement Click = driver.findElement(By.xpath("//a[text()='Gmail']"));
		actionClass("click", Click);
		
		WebElement con = driver.findElement(By.xpath("/html/body/header/div/div/div/a[1]"));
		actionClass("contextClick", con);
		
		
	}

}
