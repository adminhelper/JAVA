package edu.exam14.ex07char_writer_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
자바의 입출력(I/O)
 1) File I/O
   1-1) 바이트 스트림
       : 실행파일 같은 기계가 사용하는 데이터
               메모장으로 열면 깨져보이는 데이터가 존재
               메모리 데이터 -> 그대로 파일로 저장
   1-2) 문자 스트림
       : 문자를 주로 저장/읽기
               파일을 열면 문자/숫자가 잘 보이는 데이터
         OS에 따라 개행문자 처리가 달라
               메모장을 열었을 때
         Windows 10 13 Enter로 인식
         Linux   10    Enter로 인식
         Mac     13    Enter로 인식
 2) Network I/O
 3) H/W I/O
 */
/*
1단계 문자 스트림을 생성
     InputStream
     OutputStream
     <->
	 Writer
	 Reader
2단계 저장
3단계 닫기
*/

public class CharWriterStream {
	public static void main(String[] args) throws IOException {
		// 1단계 스트림 생성(open)
		Writer out = new FileWriter("My.txt");
		
		// 2단계 저장
		out.write('A');
		out.write('B');
		out.write("홍길동");
		
		// 3단계 닫기
		out.close();
	}
}










