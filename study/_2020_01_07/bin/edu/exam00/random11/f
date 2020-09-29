package edu.exam00.random11;

import java.util.Random;
import java.util.Scanner;

/*
1) 1 ~ 6사이의 숫자를 입력받는다
2) 컴퓨터의 1 ~ 6사이의 난수를 생성한다
3) 두 수를 비교해서 
4) User Win/Com Win/Draw을 출력한다
* 조건 연산자 사용
* 
* 그림 : 순서도
*/

public class DiceGame {
	public static void main(String[] args) {
		int userNum = 0, comNum = 0;
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 1. 사용자 숫자 입력
		System.out.print("1~6사이의 숫자 입력 : ");
		userNum = sc.nextInt();
		// 2. 컴퓨터 난수 생성
		comNum = rd.nextInt(6)+1;
		// 3. 대소 비교
		String result = userNum > comNum ? "User Win" :
					(userNum < comNum ? "Com Win" : "Draw");
		// 4. 결과출력
		System.out.printf("UserNum: %d, ComNum: %d\n", userNum, comNum);
		System.out.println(result);
		
		sc.close();
	}
}
