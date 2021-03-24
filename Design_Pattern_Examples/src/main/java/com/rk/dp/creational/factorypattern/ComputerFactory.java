package com.rk.dp.creational.factorypattern;

public class ComputerFactory {
	
	public static Computer getComputerType(String type, String ram, String hdd, String cpu) {
		if("PC".equalsIgnoreCase(type)) {
			return new PersonalComputer(ram, hdd, cpu);
		}
		else if("Server".equalsIgnoreCase(type)) {
			return new Server(ram, hdd, cpu);
		}
		else {
			return null;	
		}
	}
}
