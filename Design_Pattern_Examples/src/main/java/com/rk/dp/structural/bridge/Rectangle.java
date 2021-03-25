package com.rk.dp.structural.bridge;

public class Rectangle extends Shape{

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	public void getColor() {
		System.out.println("Rectangle shape with");
		color.getColor();
	}

}
