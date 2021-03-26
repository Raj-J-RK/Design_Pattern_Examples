package com.rk.dp.structural.decorator;

public class NonvegFood extends FoodDecorator{

	public NonvegFood(Food food) {
		super(food);
	}
	
	@Override
	public String getFood() {
		return super.getFood() + "Non veg ingredients";
	}
	
	@Override
	public Double getPrice() {
		System.out.println(String.valueOf(super.getPrice()) + " + " + "50");
		return super.getPrice()+50.00;
	}

}
