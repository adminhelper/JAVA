package edu.exam06.police08;

public class NursePolice extends Police {
	int thermometer;		 // 체온계 개수
	
	NursePolice(int bnum, int cnum, int tnum){
		super(bnum, cnum);
		thermometer = tnum;
	}
	
	void calcThermometer() {
		System.out.println("36.5℃");
		thermometer--;
	}
}
