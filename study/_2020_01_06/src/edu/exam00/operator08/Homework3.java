package edu.exam00.operator08;
//package edu.exam.operator08;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int money=sc.nextInt();
		
		int a=money/50000;
		money=money%50000;
		System.out.print("오만원"+a+"매");
		
		int b=money/10000;
		money=money%10000;
		System.out.print("만원"+b+"매");
		
		int c=money/5000;
		money=money%5000;
		System.out.print("오천원"+c+"매");
		
		int d=money/1000;
		money=money%1000;
		System.out.print("천원"+d+"매");
		
		int e=money/500;
		money=money%500;
		System.out.print("오백원"+e+"개");
		
		int f=money/100;
		money=money%100;
		System.out.print("백원"+f+"개");
			
		int g=money/50;
		money=money%50;
		System.out.println("오십원"+g+"개");
		
		int h=money/10;
		money=money%10;
		System.out.println("십원"+h+"개");
		}
		
		
		
	}

	
