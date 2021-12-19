package com.Runner;


import com.BaseClass.Base_Class;


public class FireFoxBrowserrun extends Base_Class {
	
	public static void main(String[] args) {
		
	 driver = getBrowser("firefox");
	 
	 getUrl("https://www.google.co.in/");
	 
	 maximize();
	 
	}

}
