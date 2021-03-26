package com.rk.dp.structural.proxy;

public class ProxyImage implements Image{
	
	private RealImage realImage;
	private String file;
	
	public ProxyImage(String file) {
		this.file = file;
	}

	@Override
	public void displayImage() {
		// TODO Auto-generated method stub
		//System.out.println("Loading image from proxy");
		if(realImage == null) {
			realImage = new RealImage(file);
		}
		realImage.displayImage();
	}
}
