package edu.exam17.ex12_debugging;

public class DebuggingTest {
	public static void add() {
		int num0 = 10, num1 = 20;
		int result = 0;
		result = num0 + num1;
		System.out.println(result);
	}
	public static void loop() {
		int sum = 0;
		for(int i=0;i<10;i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	public static int[] reverseArr(int[] arr) {
		int len = arr.length;
		int len1 = len/2;
		for(int i=0;i<len1;i++) {
			int temp = arr[i];
			arr[i] = arr[len-i-1];
			arr[len-i-1] = temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		add();
		loop();
		int[] arr = {10, 20, 30, 40, 50};
		int[] arr1 = reverseArr(arr);
		System.out.println(arr1.toString());
	}
}





