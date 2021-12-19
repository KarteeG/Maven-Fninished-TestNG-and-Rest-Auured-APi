package com.demo;

public class Pojo_B {
	
	public static void main(String[] args) {
		Pojo_A a=new Pojo_A(); // POJO = Plain Old Java Object
		String s = a.getS();
		System.out.println("Get Setter:" +s);
		
		a.setS("Harsh Ajith");
		
		String s2 = a.getS();
		System.out.println("After Setter: "+s2);
		
	}

}
