package com.propertyrunnner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.Base_Class;
import com.helper.File_Reader_Manager;

public class Poperty_File_Runner extends Base_Class {

	public static WebDriver driver = getBrowser("chrome");

	public static void main(String[] args) throws Throwable {

		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL();

		getUrl(url);

		thread(5000);

		maximize();

		wait1(30, TimeUnit.SECONDS);

		WebElement user = driver.findElement(By.id("username"));
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();

		inputValue(user, username);

		WebElement pass = driver.findElement(By.id("password"));
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		inputValue(pass, password);

		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		clickOnElement(login);

		thread(4000);

		WebElement location = driver.findElement(By.id("location"));
		String location2 = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLocation();
		dropDown("visible", location, location2);

		WebElement hotels = driver.findElement(By.id("hotels"));
		dropDown("value", hotels, "Hotel Sunshine");

		WebElement room = driver.findElement(By.id("room_type"));
		dropDown("visible", room, "Double");

		WebElement nor = driver.findElement(By.id("room_nos"));
		dropDown("index", nor, "3");

		WebElement cid = driver.findElement(By.id("datepick_in"));
		inputValue(cid, "02/12/2021");

		WebElement cod = driver.findElement(By.id("datepick_out"));
		inputValue(cod, "03/12/2021");

		WebElement adults = driver.findElement(By.id("adult_room"));
		dropDown("index", adults, "3");

		WebElement cpr = driver.findElement(By.id("child_room"));
		dropDown("index", cpr, "3");

		WebElement submit = driver.findElement(By.id("Submit"));
		clickOnElement(submit);
		thread(5000);

		WebElement btn = driver.findElement(By.id("radiobutton_0"));
		actionClass("click", btn);

		WebElement con = driver.findElement(By.id("continue"));
		actionClass("click", con);
		thread(4000);

		WebElement fname = driver.findElement(By.name("first_name"));
		inputValue(fname, "Harsh Ajith");

		WebElement lname = driver.findElement(By.name("last_name"));
		inputValue(lname, "K");

		WebElement BD = driver.findElement(By.name("address"));
		inputValue(BD, "DGL");

		WebElement ccn = driver.findElement(By.id("cc_num"));
		inputValue(ccn, "00004597545557546");

		WebElement ctype = driver.findElement(By.id("cc_type"));
		dropDown("index", ctype, "3");

		WebElement date = driver.findElement(By.id("cc_exp_month"));
		dropDown("index", date, "12");

		WebElement year = driver.findElement(By.id("cc_exp_year"));
		dropDown("index", year, "12");

		WebElement ed = driver.findElement(By.name("cc_cvv"));
		inputValue(ed, "000");

		WebElement bv = driver.findElement(By.id("book_now"));
		clickOnElement(bv);
		thread(4000);
		screenShot();

		scrollDown();

		WebElement my = driver.findElement(By.id("my_itinerary"));
		clickOnElement(my);

		WebElement check = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		clickOnElement(check);
		thread(4000);

		WebElement logout = driver.findElement(By.id("logout"));
		clickOnElement(logout);
		thread(4000);

		close();
	}
}
