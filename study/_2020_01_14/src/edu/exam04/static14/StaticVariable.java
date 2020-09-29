package edu.exam04.static14;

public class StaticVariable {
	public static void main(String[] args) {
		Academy bitSinchon = new Academy("비트신촌");
		Academy bitRoot = new Academy("비트본원");
		Academy bitJongro = new Academy("비트종로");
		Academy bitGangNam = new Academy("비트강남");
		bitSinchon.register(180);
		bitRoot.register(400);
		bitJongro.register(60);
		bitGangNam.register(120);
		
		bitSinchon.printStudentNum();
		bitRoot.printStudentNum();
		bitJongro.printStudentNum();
		bitGangNam.printStudentNum();
	}
}




