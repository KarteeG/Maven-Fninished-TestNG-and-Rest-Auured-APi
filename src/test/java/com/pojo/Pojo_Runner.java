package com.pojo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import com.BaseClass.Base_Class;

public class Pojo_Runner extends Base_Class {

	public static WebDriver driver = getBrowser("chrome");

	public static Home_Page hp = new Home_Page(driver);

	public static First_Cart fc = new First_Cart(driver);

	public static Second_Cart sc = new Second_Cart(driver);

	public static Third_Cart tc = new Third_Cart(driver);

	public static Signin_Page sp = new Signin_Page(driver);

	public static Fifth_Cart ft = new Fifth_Cart(driver);

	public static Sixth_Cart st = new Sixth_Cart(driver);

	public static Seven_Page sv = new Seven_Page(driver);

	public static Final_Submit fi = new Final_Submit(driver);

	public static void main(String[] args) throws InterruptedException {

		getUrl("http://automationpractice.com/index.php");

		maximize();

		wait1(30, TimeUnit.SECONDS);

		clickOnElement(hp.getT_Shirts());

		clickOnElement(hp.getImage_Click());
		
		thread(5000);
		
		clickOnElement(fc.getAdd_To());

		clickOnElement(sc.getPr_C());

		clickOnElement(tc.getPro());

		inputValue(sp.getEmail(), "kartee.sri@gmail.com");

		inputValue(sp.getPassword(), "password");

		clickOnElement(sp.getSubmit());

		clickOnElement(ft.getPtc());
		
		thread(5000);
		
		System.out.println("Before");

		clickOnElement(st.getButton());
		
		clickOnElement(st.getSpc());
		
		System.out.println("After");

		clickOnElement(sv.getBank());

		clickOnElement(fi.getFi());

	}

}
