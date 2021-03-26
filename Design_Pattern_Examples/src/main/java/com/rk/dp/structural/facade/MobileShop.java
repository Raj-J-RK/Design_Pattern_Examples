package com.rk.dp.structural.facade;

public class MobileShop {
	
	private IPhone iphone;
	private Samsung samsung;
	private MiPhone miPhone;
	
	public MobileShop() {
		iphone = new IPhone();
		samsung = new Samsung();
		miPhone = new MiPhone();
	}
	
	public void getIPhone() {
		System.out.println(iphone.getMobileMake());
		System.out.println(iphone.getCost());
	}
	
	public void getSamsung() {
		System.out.println(samsung.getMobileMake());
		System.out.println(samsung.getCost());
	}
	
	public void getMiPhone() {
		System.out.println(miPhone.getMobileMake());
		System.out.println(miPhone.getCost());
	}

}
