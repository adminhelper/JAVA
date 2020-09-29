package edu.exam06.police11;

//<상속성>
//extends
//overriding
//부모자 생성자 초기화(super)
//상속과 포함

public class PoliceMain {
	public static void main(String[] args) {
		ForcePolice fman =
				new ForcePolice("No Hat", "Black Jacket", 10, 3);
		fman.putOnCloth();
		fman.shot();
		fman.putHandcuff();
		
		NursePolice nurse = 
				new NursePolice("White Hat", "White Uniform", 3);
		nurse.putOnCloth();
		nurse.calcThermometer();
	}
}
