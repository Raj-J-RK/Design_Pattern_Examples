package com.rk.dp.structural.flyweight;

import java.util.HashMap;

public class ShapeFactory {
	
	private static HashMap<String, Circle> map = new HashMap<String, Circle>();
	
	public Circle getCircle(String color) {
		Circle circle = map.get(color);
		if (circle == null) {
			circle = new Circle(color);
			map.put(color, circle);
			System.out.println("Created a new color :" + color);
		}
		return circle;
	}
}
