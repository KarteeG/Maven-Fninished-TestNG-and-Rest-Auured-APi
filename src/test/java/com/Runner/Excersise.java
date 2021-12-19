package com.Runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.Base_Class;

public class Excersise extends Base_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = getBrowser("chrome");

		getUrl("https://www.javatpoint.com/");

		maximize();

		wait1(30, TimeUnit.SECONDS);

		WebElement one = driver.findElement(By.xpath("(//a[@href])[7]"));
		clickOnElement(one);

		WebElement two = driver.findElement(By.xpath("//html/body/div/div/div[5]/div[2]/a[2]"));
		javaScriptClick(two);

		WebElement onee = driver.findElement(By.xpath("//html/body/div/div/div[3]/div/ul/li[4]/a"));
		clickOnElement(onee);


		thread(5000);

		//javaNavigateTo("https://www.facebook.com/");
		
		navigateTo("https://www.facebook.com");

		maximize();

		WebElement email = driver.findElement(By.id("email"));
		inputValue(email, "Karthick");

		WebElement password = driver.findElement(By.id("pass"));
		inputValue(password, "test@123");

		WebElement login = driver.findElement(By.name("login"));
		clickOnElement(login);

		navigateBack();

		navigateBack();

		WebElement role = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		clickOnElement(role);
		expilicitWait(30, role, "clickable");

		WebElement fname = driver.findElement(By.name("firstname"));
		inputValue(fname, "Karthick");
		expilicitWait(30, fname, "visibility");

		WebElement lname = driver.findElement(By.name("lastname"));
		inputValue(lname, "N.G");

		close();

	}

}
