package edu.exam02.array15;

import java.util.Random;

public class TwoDim {
	public static void main(String[] args) {
		int[][] kor = new int[3][5];
		Random rd = new Random();
		
		System.out.println(kor + ", " + kor.length);
		System.out.println(kor[0] + ", " + kor[0].length);
		System.out.println(kor[1] + ", " + kor[1].length);
		System.out.println(kor[2] + ", " + kor[2].length);
		
		// 3 -> kor.length
		// 5 -> kor[i].length
		for(int i=0;i<kor.length;i++) {
			for(int j=0;j<kor[i].length;j++) {
				kor[i][j] = rd.nextInt(100);
			}
		}
		
		for(int i=0;i<kor.length;i++) {
			for(int j=0;j<kor[i].length;j++) {
				System.out.print(kor[i][j]+",");
			}
			System.out.println();
		}
		
//		for(int[] scores : kor) {
//			for(int score : scores) {
//				System.out.print(score + ",");
//			}
//			System.out.println();
//		}
	
	}
}