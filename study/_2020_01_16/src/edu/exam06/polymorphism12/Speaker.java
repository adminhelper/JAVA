package edu.exam06.polymorphism12;

public class Speaker {
	private int volumeRate;
	
	void showCurrentState() {
		System.out.println("볼륨 크기: " + volumeRate);
	}
	
	void setVolume(int vol) {
		volumeRate = vol;
	}
}
