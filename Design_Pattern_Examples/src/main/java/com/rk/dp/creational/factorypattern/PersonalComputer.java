package com.rk.dp.creational.factorypattern;

public class PersonalComputer extends Computer{
	
	private String ram;
	private String hdd;
	private String cpu;
	
	public PersonalComputer(String ram, String hdd, String cpu) {
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}

	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getHdd() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getCpu() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

	@Override
	public String toString() {
		return "PersonalComputer [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}

}
