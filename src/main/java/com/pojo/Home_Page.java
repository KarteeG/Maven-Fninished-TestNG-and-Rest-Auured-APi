package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public WebDriver driver;
	@FindBy(xpath = "//a[text()='Women']")
	private WebElement t_Shirts;

	@FindBy(xpath = "(//a[@class='product-name'])[4]")
	private WebElement image_Click;

	public Home_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getT_Shirts() {
		return t_Shirts;
	}

	public WebElement getImage_Click() {
		return image_Click;
	}

}
