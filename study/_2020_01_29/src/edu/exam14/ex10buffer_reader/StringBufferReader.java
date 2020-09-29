package edu.exam14.ex10buffer_reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class StringBufferReader {
	public static void main(String[] args) throws IOException {
		Reader in = new FileReader("String.txt");		// 다리
		BufferedReader bIn = new BufferedReader(in);	// 창고
		
		while(true) {
			// 개행문자를 기준으로 개행전까지 읽는다
			// 한 라인씩 읽어들이기
			String str = bIn.readLine(); 
			if(str == null)
				break;
			System.out.println(str);
		}
		bIn.close();
	}
}








