package edu.exam06.police08;

public class PoliceMain {
	public static void main(String[] args) {
		Police forceMan = new Police(5, 3);
		System.out.println("범인을 만났다!!!");
		forceMan.shot();
		forceMan.putHandcuff();
		
		NursePolice angelNurse = new NursePolice(9, 5, 3);
		System.out.println("환자가 아파한다~ 억");
		angelNurse.calcThermometer();
		angelNurse.putHandcuff();
		angelNurse.shot();
	}

	
}
