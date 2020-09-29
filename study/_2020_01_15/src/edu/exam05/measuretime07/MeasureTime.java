package edu.exam05.measuretime07;

public class MeasureTime {
	public static void main(String[] args) {
		//시작시간
		long start = System.currentTimeMillis();
		
		long sum = 0;
		for(int i=0;i<1000000;i++) {
			sum +=i;
			System.out.println(sum);
		}
		
		// 종료시간
		long end = System.currentTimeMillis();
		
		System.out.println("for문 시간 : " + (end-start));
	}
}
