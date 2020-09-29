package edu.exam02.array03;

import java.util.Random;

// 700명의 점수를 난수로 입력받고
// 총합과 평균을 구하라

public class KorArray {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] kor = new int[700];
		int sum = 0;
		float ave = 0f;
		//for(int i=0;i<700;i++)
		for(int i=0;i<kor.length;i++)
			kor[i] = rd.nextInt(101);
		for(int i=0;i<kor.length;i++)
			sum += kor[i];
		ave = (float)sum/kor.length;
		System.out.printf("총합: %d, 평균: %.2f",
				sum, ave);
	}
}






