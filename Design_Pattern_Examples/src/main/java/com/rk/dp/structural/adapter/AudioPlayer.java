package com.rk.dp.structural.adapter;

public class AudioPlayer implements MediaPlayer{
	
	MediaAdapter mediaAdapter;

	@Override
	public void play(String type, String filename) {
		// TODO Auto-generated method stub
		if("mp3".equalsIgnoreCase(type)) {
			System.out.println("playing mp3 file :" + filename);
		}
		else if(("mp4".equalsIgnoreCase(type)) || ("vlc".equalsIgnoreCase(type))) {
			mediaAdapter = new MediaAdapter(type);
			mediaAdapter.play(type, filename);
		}
		else {
			System.out.println(type+" Format not supported");
		}
	}

}
