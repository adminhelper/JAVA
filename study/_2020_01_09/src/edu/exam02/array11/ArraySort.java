package edu.exam02.array11;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int[] scores = {98, 12, 99, 9, 25};
		System.out.println(Arrays.toString(scores));
		
		// 오름차순 정렬
		Arrays.sort(scores);	// 데이터가 적을 때
		//Arrays.parallelSort(scores); // 데이터가 많을 때
		System.out.println(Arrays.toString(scores));
	}
}
