package com.rk.dp.creational.abstractfactory;

public class ComputerFactory {
	
	public static Computer getComputer(ComputerAbstractFactory abstractFactory) {
		return abstractFactory.createComputer();
	}

}
