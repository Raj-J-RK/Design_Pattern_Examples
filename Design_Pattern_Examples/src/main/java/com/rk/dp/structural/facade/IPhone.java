package com.rk.dp.structural.facade;

public class IPhone implements MobilePhone{

	@Override
	public String getMobileMake() {
		// TODO Auto-generated method stub
		return "I Phone";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 80000.00;
	}

}
