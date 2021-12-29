package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fifth_Cart {
	
	private WebDriver driver;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement ptc;

	public Fifth_Cart(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPtc() {
		return ptc;
	}
	
	

}
