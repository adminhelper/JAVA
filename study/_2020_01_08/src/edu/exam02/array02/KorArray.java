package edu.exam02.array02;

public class KorArray {
	public static void main(String[] args) {
		int[] kor = {99, 98, 80};
//		int[] kor = new int[3];
//		kor[0] = 99;
//		kor[1] = 98;
//		kor[2] = 80;
		int sum = 0;
		float ave = 0f;
		sum = kor[0] + kor[1] + kor[2];
		ave = (float)sum/3;
		System.out.printf("총합: %d, 평균: %.2f",
				sum, ave);
	}
}
