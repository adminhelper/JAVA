package edu.exam06.polymorphism12;

public class SpeakerMain {
	public static void main(String[] args) {
		BaseEnSpeaker base = new BaseEnSpeaker();
		base.setVolume(10);		// 물려받은 것
		base.setBaseRate(20);	// 새로 추가한 것
		base.showCurrentState();// 재정의한 것
	}
}
