package com.Runner;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.Base_Class;

public class Multiple_Runner extends Base_Class {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = getBrowser("chrome");
		getUrl("http://www.leafground.com/pages/Dropdown.html");
		maximize();
		
		WebElement Multi = driver.findElement(By.xpath("//select[@multiple]"));
		Select s= new Select(Multi);
		s.selectByIndex(1);
		s.selectByValue("3");
		s.selectByVisibleText("Loadrunner");
		
		
		List<WebElement> options = s.getOptions();
		System.out.println("GET OPTIONS");
		for (WebElement all : options) {
			String text = all.getText();
			System.out.println(text);
		}
		
		int size = options.size();
		System.out.println("Size: "+size);
		
		s.deselectAll();
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		System.out.println("GET ALL SELECTED OPTIONS");
		for (WebElement all : allSelectedOptions) {
			String text = all.getText();
			System.out.println(text);
		}
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("FIRST SELECTED OPTIONS");
		String t = firstSelectedOption.getText();
		System.out.println(t);
		
		s.deselectByIndex(1);
		s.deselectByValue("2");
		s.deselectByVisibleText("Loadrunner");
		
	}
	




	}


