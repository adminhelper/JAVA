package edu.exam02.array06;

public class ArrayReference {
	public static void main(String[] args) {
		int num = 0;
		//int[] arr = {10, 20, 30};
		// 스택에는 참조변수, 힙에는 실제 배열객체
		int[] arr = new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		System.out.println(arr);// 배열참조값(레퍼런스값)
		
		// 참조변수(얕은 복사)
		int[] arr1 = arr;
		int[] arr2 = arr;
		System.out.println(arr1);
		System.out.println(arr2);
		
		arr1[1] = 100;
		System.out.println(arr[1]);
		System.out.println(arr2[1]);		
	}
}
