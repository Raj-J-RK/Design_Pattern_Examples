package com.rk.dp.structural.proxy;

public class RealImage implements Image{

	private String file;
	
	public RealImage(String file) {
		this.file = file;
		loadFromDisk(file);
	}
	
	@Override
	public void displayImage() {
		System.out.println("Displaying image : " + file);
	}
	
	public void loadFromDisk(String file) {
		System.out.println("Loading from disk: " + file);
	}

}
