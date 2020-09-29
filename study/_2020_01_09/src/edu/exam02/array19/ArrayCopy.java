package edu.exam02.array19;

import java.util.Arrays;

// 배열의 일부만 복사

public class ArrayCopy {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int[] temp = {1, 2, 0, 0, 0};
		
		System.arraycopy(arr, 1, temp, 3, 2);
		System.out.println(Arrays.toString(temp));
	}
}




