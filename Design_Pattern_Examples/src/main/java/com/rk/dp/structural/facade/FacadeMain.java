package com.rk.dp.structural.facade;

public class FacadeMain {

	// Facade provides a unified and simplified interface to a set of interfaces in a subsystem, 
	// therefore it hides the complexities of the subsystem from the client.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileShop shop = new MobileShop();
		shop.getMiPhone();
		shop.getSamsung();
		shop.getIPhone();
	}

}
