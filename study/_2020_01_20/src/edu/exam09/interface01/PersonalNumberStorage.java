package edu.exam09.interface01;

// 모든 메서드가 추상 메서드인 클래스

public abstract class PersonalNumberStorage {
	public abstract void addPersonalInfo(String name, 
										String perNum);
	public abstract String searchName(String perNum);
}
