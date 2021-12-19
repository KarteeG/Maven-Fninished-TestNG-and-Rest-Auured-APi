package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sixth_Cart {

	public WebDriver driver;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement spc;

	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement button;

	public Sixth_Cart(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSpc() {
		return spc;
	}

	public WebElement getButton() {
		return button;
	}

	
}
