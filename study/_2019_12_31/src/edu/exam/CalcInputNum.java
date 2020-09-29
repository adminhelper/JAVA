package edu.exam.method34;

import java.util.Scanner;

import edu.exam.method33.num0;

public class CalcInputNum {
	public static void calc(int num0,int num1,String op) {
		int result=0;
		switch(op) 
		{
		case "+" :
			result = num0+num1;
			break;
		case "-" :
			result = num0-num1;
			break;
		case "*" :
			result = num0*num1;
			break;
		case "/" :
			result = num0/num1;
			break;
		default :
			break;
		
			int num0=0, num1=0;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("<사칙 연산을 합니다>");
			System.out.print("첫번째 숫자 입력:");
			num0=sc.nextInt();
			System.out.print("두번째 숫자 입력:");
			num1=sc.nextInt();
			System.out.print("연산자입력(+-*/):");
			
			String op=sc.next();
			
			calc(num0,num1,op);
			
			System.out.print(",,");
			sc.close();
		}
	}

}
