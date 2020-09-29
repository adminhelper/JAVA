package edu.exam02.needsarray01;

//배열(配列)
//; 같은 자료형의 변수들을 나란히 줄세우다
//
//국어점수 3명
//int kor0, kor1, kor2;
//
//국어점수 700명
//한번에 700명의 국어점수 => 배열

//99 : literal 상수

public class WhatArray {
	public static void main(String[] args) {
		int kor0=99, kor1=98, kor2=80;
		int sum = 0;
		float ave = 0f;
		sum = kor0 + kor1 + kor2;
		ave = (float)sum/3;
		System.out.printf("총합: %d, 평균: %.2f",
				sum, ave);
	}
}




