package edu.exam02.array12;

public class Foreach {
	public static void main(String[] args) {
		int[] scores = {89, 99, 100, 21, 10};
		
		// for문으로 접근
		for(int i=0;i<scores.length;i++)
			System.out.print(scores[i]+",");
		System.out.println();
		
		// foreach문을 이용한 접근
		for(int score : scores)
			System.out.print(score + ",");
	}
}
