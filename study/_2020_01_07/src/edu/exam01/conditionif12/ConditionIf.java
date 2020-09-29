package edu.exam01.conditionif12;

import java.util.Random;
import java.util.Scanner;

public class ConditionIf {

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
		String result;
		if(userNum > comNum)
			result ="User Win";
		else if(userNum < comNum)
			result = "Com Win";
		else
			result = "Draw";

		// 4. 결과출력
		System.out.printf("UserNum: %d, ComNum: %d\n", userNum, comNum);
		System.out.println(result);
		
		sc.close();
	}

}
