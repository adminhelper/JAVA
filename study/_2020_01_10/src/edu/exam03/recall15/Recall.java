package edu.exam03.recall15;

//팩토리얼
//5! = 5x4x3x2x1
//3! = 3x2x1

public class Recall {
	public static int factorial(int num) {
		int result = 1; // 곱하기 할때는 초기값을 1로
		for (int i = num; i > 0; i--)
			result *= i;
		return result;
	}

	/*
	 * reFactorial(5) => 5 * reFactorial(4) => 5 * 4 * reFactorial(3) => 5 * 4 *
	 * reFactorial(3) => 5 * 4 * 3 * reFactorial(2) => 5 * 4 * 3 * 2 *
	 * reFactorial(1) => 5 * 4 * 3 * 2 * 1 --------------------------------------- 5
	 * * 4 * 3 * 2 * 1 * reFactorial(0) => 5 * 4 * 3 * 2 * 1 * 0 * reFactorial(-1)
	 * =>
	 */

	public static int reFactorial(int num) {
		if (num == 1)
			return 1;

		else {

			return num * reFactorial(num - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println("5! : " + factorial(5));
		System.out.println("3! : " + factorial(3));
		System.out.println("5! : " + reFactorial(5));
		System.out.println("3! : " + reFactorial(3));
	}
}
