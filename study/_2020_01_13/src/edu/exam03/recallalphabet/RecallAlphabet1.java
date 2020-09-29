package edu.exam03.recallalphabet;

import java.util.Scanner;

public class RecallAlphabet1 {
	public static void recallAlphabet(char ch) {
		for(int i = (int)'a';i<=(int)ch;i++) {
			System.out.print((char)i);
		}
		System.out.println();
		
		if(ch == 'a')
			return;
		else
			recallAlphabet((char)(((int)ch)-1));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 문자 입력 : ");
		char ch = sc.next().charAt(0);
		recallAlphabet(ch);
		sc.close();
	}

}
