package com.rk.dp.creational.singleton;

public class Singleton {
	
	private static Singleton singleton;
	
	public String str;
	
	private Singleton() {
		str = "Value of str has been initialized";
	}
	
	public static Singleton getInstance() {
		return singleton == null ? singleton=new Singleton() : singleton;
	}

}
