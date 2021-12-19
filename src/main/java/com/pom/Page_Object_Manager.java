package com.pom;

import org.openqa.selenium.WebDriver;

import com.pojo.Fifth_Cart;
import com.pojo.Final_Submit;
import com.pojo.First_Cart;
import com.pojo.Home_Page;
import com.pojo.Second_Cart;
import com.pojo.Seven_Page;
import com.pojo.Signin_Page;
import com.pojo.Sixth_Cart;
import com.pojo.Third_Cart;

public class Page_Object_Manager {

	private WebDriver driver;
	private Home_Page hp;
	private First_Cart fc;
	private Second_Cart sc;
	private Third_Cart tc;
	private Signin_Page sp;
	private Fifth_Cart ft;
	private Sixth_Cart st;
	private Seven_Page sv;
	private Final_Submit fi;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}


	public Home_Page getInsanceHp() {
		if (hp == null) {
			hp = new Home_Page(driver);
		}
		return hp;
	}

	public First_Cart getInsanceFc() {
		if (fc == null) {
			fc = new First_Cart(driver);
		}
		return fc;
	}

	public Second_Cart getInstanceSc() {
		if (sc == null) {
			sc = new Second_Cart(driver);
		}
		return sc;
	}

	public Third_Cart getInstancetc() {
		if (tc == null) {
			tc = new Third_Cart(driver);
		}
		return tc;
	}
	public Signin_Page getInstanceSp() {
		if (sp == null) {
			sp = new Signin_Page(driver);
		}
		return sp;
	}

	public Fifth_Cart getInstanceFt() {
		if (ft == null) {
		}
		ft = new Fifth_Cart(driver);
		return ft;
	}

	public Sixth_Cart getInstanceSt() {
		if (st == null) {
			st = new Sixth_Cart(driver);
		}
		return st;
	}

	public Seven_Page getInstanceSv() {
		if (sv == null) {
			sv = new Seven_Page(driver);
		}
		return sv;
	}
	public Final_Submit getInsanceFi() {
		if (fi == null) {
			fi = new Final_Submit(driver);
		}
		return fi;
	}

}
