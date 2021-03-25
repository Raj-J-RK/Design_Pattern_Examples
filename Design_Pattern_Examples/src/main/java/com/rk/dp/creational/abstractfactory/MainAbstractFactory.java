package com.rk.dp.creational.abstractfactory;

public class MainAbstractFactory {
	// Abstract Factory patterns work around a super-factory which creates and returns factories. 
	// This factory is also called as factory of factories.
	// In Abstract Factory pattern an interface is responsible for creating a factory of related objects
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc = ComputerFactory.getComputer(new PersonalComputerFactory("8 GB", "1 TB", "8"));
		System.out.println(pc);
		Computer server = ComputerFactory.getComputer(new ServerFactory("64 GB", "5 TB", "64"));
		System.out.println(server);
	}

}
