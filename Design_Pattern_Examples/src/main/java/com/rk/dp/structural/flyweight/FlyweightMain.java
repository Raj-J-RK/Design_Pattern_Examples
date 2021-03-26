package com.rk.dp.structural.flyweight;

public class FlyweightMain {

	// Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint.
	// Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object 
	// when no matching object is found.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory sf = new ShapeFactory();
		Circle circle1 =  sf.getCircle("Red");
		circle1.draw();
		Circle circle2 =  sf.getCircle("Red");
		circle2.draw();
		Circle circle3 =  sf.getCircle("Green");
		circle3.draw();
		Circle circle4 =  sf.getCircle("Blue");
		circle4.draw();
		Circle circle5 =  sf.getCircle("Brown");
		circle5.draw();
	}
}
