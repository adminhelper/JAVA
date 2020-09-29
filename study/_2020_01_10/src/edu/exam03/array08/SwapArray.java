package edu.exam03.array08;

import java.util.Arrays;

public class SwapArray {
	public static void swapArr(int[] _arr) {
		int temp = _arr[0];
		_arr[0] = _arr[1];
		_arr[1] = temp;
	}
	public static void main(String[] args) {
		int[] arr = {10, 20};
		System.out.println(Arrays.toString(arr));
		swapArr(arr);	// int[] _arr = arr;
		System.out.println(Arrays.toString(arr));
	}
}



