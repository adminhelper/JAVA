package edu.exam04.static14;

//비트학원의 총 학생수
public class Academy {
	String name;
	int numOfStudent;
	
	Academy(String name){
		this.name = name;
		numOfStudent = 0;
	}
	
	void register(int stNum) {
		numOfStudent += stNum;
	}
	
	void printStudentNum() {
		System.out.println(name + " 학생수: " + numOfStudent);
	}
}





