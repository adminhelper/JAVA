package edu.exam02.array13;

import java.util.Arrays;
import java.util.Scanner;

//5개의 점수를 입력받고
//최소값과 최대값을 구해서 출력하세요

public class MinMax {
	public static void main(String[] args) {
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<score.length;i++) {
			System.out.print(i + " 점수 입력 : ");
			score[i] = sc.nextInt();
		}
		
		Arrays.sort(score);
		
		System.out.println("최대값 " + score[score.length-1]);
		System.out.println("최소값 " + score[0]);
		
		sc.close();
	}
}
