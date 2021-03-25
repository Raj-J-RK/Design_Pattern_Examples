package com.rk.dp.structural.bridge;

public abstract class Shape {
	
	Color color;
	
	public Shape(Color color) {
		this.color = color;
	}
	
	abstract public void getColor();

}
