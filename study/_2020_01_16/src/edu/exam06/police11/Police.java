package edu.exam06.police11;

public class Police {
	String hat;
	String cloth;
	Police(String hat, String cloth){
		this.hat = hat;
		this.cloth = cloth;
	}
	void putOnCloth() {
		System.out.println(hat+"과"+cloth+"를 착용하다");
	}
}
