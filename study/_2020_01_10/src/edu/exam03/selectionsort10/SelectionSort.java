package edu.exam03.selectionsort10;

import java.util.Arrays;

public class SelectionSort {
	public static void selectionSort(int[] _arr, int o) {
		// 마지막 값은 비교대상이 없으므로
		// 배열길이-1 까지만 비교가 이루어진다.
		for(int i=0;i<_arr.length-1;i++) {
			int minIdx = i;
			// 아래 for문이 끝나면
			// 현재 기준공간에 들어갈 위치가 결정된다.
			for(int j=i+1;j<_arr.length;j++) {
				if(o*_arr[j] < o*_arr[minIdx])
					minIdx = j;
			}
			// _arr배열의 i의 값과 minIdx값을 교체한다
			swap(_arr, i, minIdx);
		}
	}
	
	public static void swap(int[] _a, int base, int mIdx) {
		int temp = _a[base];
		_a[base] = _a[mIdx];
		_a[mIdx] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {77, 99, 25, 2, 10};
		System.out.println(Arrays.toString(arr));
		selectionSort(arr, 1);
		System.out.println(Arrays.toString(arr));
		
		int[] arr1 = {77, 99, 25, 34, 22, 53, 12, 100, 2, 10};
		System.out.println(Arrays.toString(arr1));
		selectionSort(arr1, -1);
		System.out.println(Arrays.toString(arr1));
	}
}



