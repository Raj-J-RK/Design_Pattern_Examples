package com.rk.dp.structural.decorator;

public class ChineseFood extends FoodDecorator{

	public ChineseFood(Food food) {
		super(food);
	}
	
	@Override
	public String getFood() {
		return super.getFood() + "Chinese ingredients";
	}
	
	@Override
	public Double getPrice() {
		System.out.println(String.valueOf(super.getPrice()) + " + " + "60");
		return super.getPrice()+60.00;
	}
}
