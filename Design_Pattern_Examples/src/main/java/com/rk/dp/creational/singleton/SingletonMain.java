package com.rk.dp.creational.singleton;

public class SingletonMain {

	//Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the 
	//java virtual machine.
	public static void main(String[] args) {
		//Singleton pattern restricts the instantiation of a class
		//Singleton s = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		System.out.println("Value of s1,s2,s3:");
		System.out.println(s1.str);
		System.out.println(s2.str);
		System.out.println(s3.str);
		System.out.println("Modifyinf s1 value");
		s1.str = "Value of str has been updated";
		System.out.println("Now value of s1,s2,s3:");
		System.out.println(s1.str);
		System.out.println(s2.str);
		System.out.println(s3.str);
		System.out.println("Modifyinf s3 value");
		s3.str="Value of str has been updated again";
		System.out.println("Now value of s1,s2,s3:");
		System.out.println(s1.str);
		System.out.println(s2.str);
		System.out.println(s3.str);
	}

}
