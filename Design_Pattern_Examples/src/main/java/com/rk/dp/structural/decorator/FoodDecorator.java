package com.rk.dp.structural.decorator;

public abstract class FoodDecorator implements Food{
	
	private Food food;
	
	public FoodDecorator(Food food) {
		this.food = food;
	}
	
	@Override
	public String getFood() {
		// TODO Auto-generated method stub
		return food.getFood();
	}

	@Override
	public Double getPrice() {
		// TODO Auto-generated method stub
		return food.getPrice();
	}
	

}
