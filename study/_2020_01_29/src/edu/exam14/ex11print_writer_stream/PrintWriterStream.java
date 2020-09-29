package edu.exam14.ex11print_writer_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

/*
print
printf 포맷
println
을 화면에 출력하듯이 
파일에 출력하는 것처럼
편리하게 사용하도록 제공하는 클래스
*/

//사용자      편리한 메서드         속도향상 창고      연결(bridge)   파일
//User -> PrintWriter -> BufferedWriter -> Writer -> print.txt

public class PrintWriterStream {
	public static void main(String[] args) throws IOException {
		// 1단계
		Writer out = new FileWriter("print.txt");
		BufferedWriter bOut = new BufferedWriter(out);
		PrintWriter pOut = new PrintWriter(bOut);
		
		Scanner sc = new Scanner(System.in);
		
		// 2단계
		System.out.print("당신의 이름은? ");
		String name = sc.next();
		System.out.print("당신의 나이는? ");
		int age = sc.nextInt();
		System.out.print("당신의 키는? ");
		float height = sc.nextFloat();
		System.out.print("당신의 무게는? ");
		float weight = sc.nextFloat();
		
		pOut.print("나의 이름은 " + name + "입니다\n");
		pOut.println();
		pOut.println();
		pOut.printf("나의 키는 %03d살입니다\n", age);
		pOut.printf("나의 키는 %.2f 입니다\n", height);
		pOut.printf("나의 무게는 %.2f 입니다\n", weight);
		
		pOut.close();
		sc.close();
	}
}
















