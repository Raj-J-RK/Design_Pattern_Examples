package com.rk.dp.structural.decorator;

public class DecoratorMain {

		// Decorator attaches a flexible additional responsibilities to an object dynamically
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food veg = new VegFood();
		System.out.println(veg.getFood());
		System.out.println("cost:"+veg.getPrice());
		
		Food nonveg = new NonvegFood(veg);
		System.out.println(nonveg.getFood());
		System.out.println("cost:"+nonveg.getPrice());
		
		Food chineseFood = new ChineseFood(veg);
		System.out.println(chineseFood.getFood());
		System.out.println("cost:"+chineseFood.getPrice());
	}

}
