package edu.exam.condition13;

import java.util.Scanner;

/* 1) 온도를 입력받는다
 * 2) 300도면 빵굽기 start
 * 3) 300도보다 적으면 300-입력숫자 계산해서
 *    계산된 숫자만큼 온도를 올려라
 * 4) 300도보다 크면 입력숫자-300 계산해서
 *    계산된 숫자만큼 온도를 내려라
 * */
public class IfElseIfElseSentense {
	public static void main(String[] args) {
		System.out.println("온도 입력");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == 300)
			System.out.println("num은 300이므로 빵굽기 Start!");
		else if(num < 300)
			System.out.println("num은 300보다 적으므로 " + (300-num) + "을 올려라");
		else if(num > 300)  // 300보다 큰 경우에 해당한다
			System.out.println("num은 300보다 크므로 " + (num-300) + "을 내려라");
		sc.close();
	}

}
