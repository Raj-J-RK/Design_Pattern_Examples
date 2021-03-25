package com.rk.dp.structural.bridge;

public class Triangle extends Shape{

	public Triangle(Color color) {
		super(color);
	}

	@Override
	public void getColor() {
		System.out.println("Triangle shape with");
		color.getColor();
	}

}
