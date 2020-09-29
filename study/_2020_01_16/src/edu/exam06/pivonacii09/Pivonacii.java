package edu.exam06.pivonacii09;

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55

public class Pivonacii {
	
	public static void fibonacii(int stopCnt, int cnt, 
								long pre, long next) {
		if(cnt == 0)
			System.out.print(pre + ", " + next);
		else
			System.out.print(", " + next);
		
		if(stopCnt == cnt)
			return;
		else
			fibonacii(stopCnt, ++cnt, next, pre+next);
	}
	
	public static void main(String[] args) {
		fibonacii(50, 0, 0, 1);
	}
}
