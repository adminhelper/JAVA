package edu.exam10.ex01ifexception;

import java.util.Arrays;
import java.util.Scanner;

/*
Exception(예외처리)
; 우리가 의도하지 않은 동작이 일어날 때
  대비해서 처리하는 것
  ex) 사용자의 잘못된 입력
          배열공간의 인덱스 잘못 위치...

1) 최초의 프로그램에서는 ??
   껐다 켰다
     다시 짰다
2) if문을 주로 사용(C)
3) C++ 예외처리 도입
4) Java/C# 예외처리 클래스 제공
*/
/*
프로그래밍을 많이 하게 되면
로직처리 -> 예외처리 -> 로직처리 -> 예외처리 ...... 
코딩을 해석할 때 로직에만 집중하기 어렵다
로직에만 집중하고 싶다
예외는 어떻게 할 것이냐?
한 군데에 모아서 처리하고 싶다
=> 그래서 나온 문법이 예외처리 문법이다
*/
public class ExceptionUseIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i=0;i<arr.length;i++) {
			System.out.println("피제수 숫자 입력");
			int num0 = sc.nextInt();
			System.out.println("제수 숫자 입력");
			int num1 = sc.nextInt();
			
			// 예외처리를 하기 위한 if구문
			if(num1 == 0) {
				System.out.println("제수는 0이 될 수 없습니다");
				i--;	// i값이 원상태 유지하기 위해
				continue;	// i++위치로 이동
			}
			
			System.out.println("연산의 결과 저장 인덱스 입력");
			int idx = sc.nextInt();
			
			// 예외처리를 하기 위한 if구문
			if(idx < 0 || idx >= arr.length) {
				System.out.println("유효하지 않은 인덱스입니다");
				i--;
				continue;
			}
			
			arr[idx] = num0 / num1;
			
			System.out.println("나눗셈 결과는 " + arr[idx]);
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		sc.close();
	}
}










