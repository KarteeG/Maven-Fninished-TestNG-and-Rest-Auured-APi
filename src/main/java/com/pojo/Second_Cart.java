package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Second_Cart {

	private WebDriver driver;
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium']")
	private WebElement pr_C;

	public Second_Cart(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPr_C() {
		return pr_C;
	}

}
