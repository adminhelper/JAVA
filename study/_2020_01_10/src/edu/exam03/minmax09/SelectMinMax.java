package edu.exam03.minmax09;

public class SelectMinMax {
	public static void viewMin(int[] _arr) {
		int min = _arr[0];
		for(int i=1;i<_arr.length;i++) {
			if(_arr[i] < min)
				min = _arr[i];
		}
		System.out.println("가장 작은 값은 " + min);
	}
	public static void viewMax(int[] _arr) {
		int max = _arr[0];
		for(int i=1;i<_arr.length;i++) {
			if(_arr[i] > max)
				max = _arr[i];
		}
		System.out.println("가장 큰 값은 " + max);
	}
	public static void main(String[] args) {
		int[] arr = {99, 23, 55, 21, 10, 9, 86};
		viewMin(arr);
		viewMax(arr);
	}
}




