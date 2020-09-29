package edu.exam12.ex08genericarray;

public class GenericArray {
	public static <T> void showArrayData(T[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	public static void main(String[] args) {
		String[] strArr = new String[] {
			"Hi~",
			"I'm so happy~",
			"Java Generic"
		};
		Integer[] nArr = {10, 20, 30, 40, 50};
		showArrayData(strArr);
		showArrayData(nArr);
	}
}
