package com.rk.dp.structural.bridge;

// Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary independently
// This pattern involves an interface which acts as a bridge which makes the functionality of concrete classes independent 
// from interface implementer classes

public class BridgeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rect = new Rectangle(new RedColor());
		rect.getColor();
		Shape tri = new Triangle(new GreenColor());
		tri.getColor();
	}
}
