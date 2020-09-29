package edu.exam10.ex02exception;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bitcamp1 앞의 if문 예외처리는 일반처리->예외처리의 반복이지만 Exception 이용한 예외처리는 처리, 예외처리
 *         영역을 분리한다
 */
public class UseException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i=0;i<arr.length;i++) {
			
			// 로직 처리 영역
			try {
				System.out.println("피제수 숫자 입력");
				int num0 = sc.nextInt();
				System.out.println("제수 숫자 입력");
				int num1 = sc.nextInt();
				System.out.println("연산의 결과 저장 인덱스 입력");
				int idx = sc.nextInt();
				arr[idx] = num0 / num1;			
				System.out.println("나눗셈 결과는 " + arr[idx]);
			}
			// 로직 처리 영역에서 발생한 예외를 받아서
			// 처리하는 영역
			catch(Exception e) {
				System.out.println("error : " + e.getMessage());	// 원인
				e.printStackTrace();								// 위치
				i--;
				continue;
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		sc.close();
	}
}