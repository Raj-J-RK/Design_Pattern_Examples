package com.rk.dp.creational.factorypattern;

public class FactoryPatternMain {

	public static void main(String[] args) {
		//In factory pattern subclasses are responsible to create the instance of the class.
		//Appropriate object will be instantiated based on the condition
		Computer cp1 = ComputerFactory.getComputerType("PC", "8 GB", "1 TB", "8");
		System.out.println(cp1);
		Computer cp2 = ComputerFactory.getComputerType("Server", "64 GB", "5 TB", "64");
		System.out.println(cp2);
	}
}
