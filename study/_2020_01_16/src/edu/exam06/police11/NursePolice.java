package edu.exam06.police11;

public class NursePolice extends Police {
	int thermometer;
	NursePolice(String hat, String cloth, int tnum){
		super(hat, cloth);
		thermometer = tnum;
	}
	void calcThermometer() {
		System.out.println("Check Temperature!");
		thermometer--;
	}
}
