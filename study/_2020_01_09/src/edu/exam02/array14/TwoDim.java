package edu.exam02.array14;

import java.util.Random;

//2차원 배열
//; 1차원 배열 => 학생 5명의 국어 점수 
//  2차원 배열 => 3개반 각각 5명씩 국어점수

public class TwoDim {
	public static void main(String[] args) {
		int[][] kor = new int[3][5];
		Random rd = new Random();
		
		System.out.println(kor + ", " + kor.length);
		System.out.println(kor[0] + ", " + kor[0].length);
		System.out.println(kor[1] + ", " + kor[1].length);
		System.out.println(kor[2] + ", " + kor[2].length);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				kor[i][j] = rd.nextInt(100);
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(kor[i][j]+",");
			}
			System.out.println();
		}
	
	}
}





