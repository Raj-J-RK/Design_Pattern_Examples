package com.rk.dp.structural.adapter;

public class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		System.out.println("playing vlc file : " + fileName);
		
	}

	@Override
	public void playMp4(String fileName) {
		
	}

}