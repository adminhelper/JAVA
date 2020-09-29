package edu.exam02.array18;

import java.util.Arrays;

// 가변 배열

public class TwoDim {
	public static void main(String[] args) {
		int[][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[4];
		arr[2] = new int[3];
		int cnt = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = ++cnt;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				System.out.print(arr[i][j]+", ");
//			}
//			System.out.println();
//		}
	}
}







