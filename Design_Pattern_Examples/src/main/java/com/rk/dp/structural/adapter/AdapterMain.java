package com.rk.dp.structural.adapter;

// Adapter pattern works as a bridge between two incompatible interfaces. This pattern involves a single class (Adapter)
// which is responsible to join functionalities of independent or incompatible interfaces
public class AdapterMain {

	public static void main(String[] args) {
		AudioPlayer ap = new AudioPlayer();
		ap.play("mp3", "mp3 file");
		ap.play("mp4", "mp4 file");
		ap.play("vlc", "vlc file");
		ap.play("mkv", "mkv file");
	}

}
