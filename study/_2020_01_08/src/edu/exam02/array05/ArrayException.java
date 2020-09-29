package edu.exam02.array05;

public class ArrayException {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		System.out.println("길이는 " + arr.length);
		//java.lang.ArrayIndexOutOfBoundsException
		// 배열은 시작은 0, 마지막은 배열길이-1
		System.out.println(arr[arr.length-1]);
		//System.out.println(arr[3]);	// Exception
	}
}
