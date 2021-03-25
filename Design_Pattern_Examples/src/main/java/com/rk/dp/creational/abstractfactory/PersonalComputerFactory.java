package com.rk.dp.creational.abstractfactory;

public class PersonalComputerFactory implements ComputerAbstractFactory{
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public PersonalComputerFactory(String ram, String hdd, String cpu) {
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	
	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		return new PersonalComputer(ram,hdd,cpu);
	}

}
