package edu.exam14.ex09buffer_writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/*
중간 창고 역할 Filter 클래스
I/O 속도 향상
BufferedInputStream
BufferedOutputStream
<->
BufferedReader
BufferedWriter
*/

public class StringBufferWriter {
	public static void main(String[] args) throws IOException {
		// 1단계 스트림 열기
		Writer out = new FileWriter("String.txt");	// bridge
		BufferedWriter bOut = new BufferedWriter(out); // 창고
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("입력 >> ");
			String str = sc.next();
			if(str.equals("exit"))
				break;
			bOut.write(str);	// 2단계 기록하기
			bOut.newLine(); 	// 파일에서 한칸 아래로 개행할 때
		}
		
		bOut.close(); 	// 3단계 스트림 닫기
		sc.close();
	}
}











