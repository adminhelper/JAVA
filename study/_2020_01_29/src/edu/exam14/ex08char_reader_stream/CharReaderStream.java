package edu.exam14.ex08char_reader_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharReaderStream {
	public static void main(String[] args) throws IOException {
		// 1단계 문자 읽기 스트림
		Reader in = new FileReader("My.txt");
		
		// 2단계 읽기
		char[] cBuf = new char[10];	// 읽은 데이터 저장 공간
		int readCnt = 0;	// 실제 읽은 크기 저장
		
		readCnt = in.read(cBuf, 0, cBuf.length);
		String str = new String(cBuf);
		System.out.println(str);	
		System.out.println("읽은 글자 " + readCnt);
		
		// 3단계 닫기
		in.close();
	}
}







