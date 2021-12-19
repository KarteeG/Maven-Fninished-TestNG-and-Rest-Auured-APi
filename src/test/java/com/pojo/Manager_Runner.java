package com.pojo;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import com.BaseClass.Base_Class;
import com.pom.Page_Object_Manager;

public class Manager_Runner extends Base_Class {
	
	public static WebDriver driver = getBrowser("chrome");
	
	static Logger log = Logger.getLogger(Manager_Runner.class);

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static void main(String[] args) throws Throwable {
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("Browser Open");
		
		getUrl("http://automationpractice.com/index.php");
		
		log.info("WebSite Launch Succesfully");

		maximize();
		
		log.warn("Maximize the window");

		wait1(30, TimeUnit.SECONDS);
		
		
		clickOnElement(pom.getInsanceHp().getT_Shirts());
		
		clickOnElement(pom.getInsanceHp().getImage_Click());
		
		thread(5000);
		
		clickOnElement(pom.getInsanceFc().getAdd_To());

		clickOnElement(pom.getInstanceSc().getPr_C());

		clickOnElement(pom.getInstancetc().getPro());
		
		String username = particularData("E:\\Work Based\\Project Based Folder\\My Own Test Cases\\Automation test cases.xlsx", 22, 5);

		inputValue(pom.getInstanceSp().getEmail() ,username);
		
		String password = particularData("E:\\Work Based\\Project Based Folder\\My Own Test Cases\\Automation test cases.xlsx", 23, 5);

		inputValue(pom.getInstanceSp().getPassword(), password);

		clickOnElement(pom.getInstanceSp().getSubmit());
		
		log.error("After Click Login Page Succesully Lauch");

		clickOnElement(pom.getInstanceFt().getPtc());
		
		thread(5000);
		
		clickOnElement(pom.getInstanceSt().getButton());
		
		clickOnElement(pom.getInstanceSt().getSpc());
		

		clickOnElement(pom.getInstanceSv().getBank());

		clickOnElement(pom.getInsanceFi().getFi());
		
		scrollDown();
		
		close();

	}

}



