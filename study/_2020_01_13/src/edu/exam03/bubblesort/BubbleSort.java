package edu.exam03.bubblesort;

import java.util.Arrays;

public class BubbleSort {
	public static void swap(int[] arr, int idx0, int idx1) {
		int temp = arr[idx0];
		arr[idx0] = arr[idx1];
		arr[idx1] = temp;
	}
	
	public static void bubbleSort(int[] arr, int o) {
		// 배열길이-1 만큼만 공간확정을 하면 된다
		int len = arr.length-1;
		for(int i=0;i<arr.length-1;i++) {
			// 처음부터 뒤로 나가면서 자리교환
			for(int j=0;j<len;j++) {
				if(o*arr[j] > o*arr[j+1])
					swap(arr, j, j+1);
			}
			len--;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {99, 10, 22, 53, 29, 55, 12};
		
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr, 1);
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr, -1);
		System.out.println(Arrays.toString(arr));
	}
}



