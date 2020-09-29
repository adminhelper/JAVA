package edu.exam04.static16;

//비트학원의 총 학생수

// static이 붙은 필드/메서드는 클래스 소속
// 일반 필드/메서드는 객체 소속

public class Academy {
	String name;
	int numOfStudent;
	
	// 객체 모두에 공용되는 필드
	static int totalStNum = 0;
	
	static void printTotalStNum() {
		System.out.println("비트캠프 총학생수 : " + totalStNum);
	}
	
	Academy(String name){
		this.name = name;
		numOfStudent = 0;
	}
	
	void register(int stNum) {
		numOfStudent += stNum;
		totalStNum += stNum;
	}
	
	void printStudentNum() {
		System.out.println(name + " 학생수: " + numOfStudent);
	}
}





