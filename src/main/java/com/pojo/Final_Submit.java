package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Final_Submit {
	public WebDriver driver;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement fi;

	public Final_Submit(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFi() {
		return fi;
	}
	
	
	
}
