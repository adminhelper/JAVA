package edu.exam00.transtype07;

// 가장 많이 사용되는 형변환
public class CalcAvr {
	public static void main(String[] args) {
		int score0 = 99, score1 = 80, score2=77;
		int sum = 0;
		double avg = 0;
		sum = score0 + score1 + score2;
		// 정수/정수 는 결과가 정수이다.
		avg = sum/3;
		System.out.println(sum);
		System.out.println(avg);
		avg = (double)sum/3;
		System.out.println(avg);
		System.out.format("%.2f\n", avg);
	}
}
