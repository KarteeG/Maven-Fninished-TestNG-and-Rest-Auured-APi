package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Third_Cart {
	
	private WebDriver driver;
	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement pro;

	public Third_Cart(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPro() {
		return pro;
	}
	
	

}
