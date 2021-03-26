package com.rk.dp.structural.facade;

public class Samsung implements MobilePhone {

	@Override
	public String getMobileMake() {
		// TODO Auto-generated method stub
		return "Samsung Phone";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 60000.00;
	}
}
