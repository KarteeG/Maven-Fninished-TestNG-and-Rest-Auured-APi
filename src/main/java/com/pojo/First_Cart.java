package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class First_Cart {

	private WebDriver driver;
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement add_To;

	public First_Cart(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdd_To() {
		return add_To;
	}

}
