package com.Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.Base_Class;

public class Alertss_Runner extends Base_Class {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = getBrowser("chrome");
		
		getUrl("http://demo.automationtesting.in/Alerts.html");
		maximize();
		
		WebElement simple = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickOnElement(simple);
		
		alert("accept");
		
		alert("default");
		
		
		WebElement confirm = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		clickOnElement(confirm);
		WebElement con = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		clickOnElement(con);
		
		alert("dismiss");
		alert("default");
		
		
		WebElement Prompt = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		clickOnElement(Prompt);
		WebElement Pro = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		clickOnElement(Pro);
		
		alert("text");
		
		driver.switchTo().alert().sendKeys("Harsh Ajith");
		
		alert("accept");
		
	}

}
