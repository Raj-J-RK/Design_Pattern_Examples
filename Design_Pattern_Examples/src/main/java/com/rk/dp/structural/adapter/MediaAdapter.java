package com.rk.dp.structural.adapter;

public class MediaAdapter implements MediaPlayer{

	AdvancedMediaPlayer advancedMediaPlayer;
	public MediaAdapter(String type) {
		if("vlc".equalsIgnoreCase(type)) {
			advancedMediaPlayer = new VlcPlayer();
		}
		else if("mp4".equalsIgnoreCase(type)) {
			advancedMediaPlayer = new Mp4Player();
		}
	}
	@Override
	public void play(String type, String filename) {
		if("vlc".equalsIgnoreCase(type)) {
			advancedMediaPlayer.playVlc(filename);
		}
		else if("mp4".equalsIgnoreCase(type)) {
			advancedMediaPlayer.playMp4(filename);
		}
		
	}

}
