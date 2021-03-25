package com.rk.dp.creational.builder;

// Builder pattern solves the issue with large number of optional parameters and inconsistent state by providing a way to build the 
// object step-by-step and provide a method that will actually return the final Object.
public class BuilderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Computer.ComputerBuilder("64", "1 TB", "8").build();
		System.out.println("computer:"+computer);
		
		Computer advancedComputer = new Computer.ComputerBuilder("64", "1 TB", "8").setWifiEnabled(true).build();
		System.out.println("advancedComputer:"+advancedComputer);
		
		Computer proComputer = new Computer.ComputerBuilder("64", "1 TB", "8").setWifiEnabled(true).setGraphicsEnabled(true).build();
		System.out.println("proComputer:"+proComputer);
	}

}
