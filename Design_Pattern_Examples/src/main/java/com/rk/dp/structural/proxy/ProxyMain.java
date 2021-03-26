package com.rk.dp.structural.proxy;

public class ProxyMain {

	// In proxy pattern, a class represents functionality of another class
	// We create object having original object to interface its functionality to outer world.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Image image = new ProxyImage("File1");
		image.displayImage();
		image.displayImage();
	}

}
