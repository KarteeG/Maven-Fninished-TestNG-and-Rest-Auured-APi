package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Seven_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath ="//a[@class='bankwire']")
	private WebElement bank;

	public Seven_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getBank() {
		return bank;
	}
	
	

}
