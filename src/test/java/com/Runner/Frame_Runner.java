package com.Runner;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.Base_Class;


public class Frame_Runner extends Base_Class {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver = getBrowser("chrome");
		getUrl("http://demo.automationtesting.in/Frames.html");
		maximize();
	
		WebElement Single = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(Single);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Harsh Ajith");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		WebElement Multiple = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(Multiple);
		
		WebElement Sing = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(Sing);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Harsh Ajith");
		driver.switchTo().defaultContent();

}
}