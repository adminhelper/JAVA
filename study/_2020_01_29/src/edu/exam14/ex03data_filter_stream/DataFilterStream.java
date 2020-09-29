package edu.exam14.ex03data_filter_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
InputStream
OutputStream
은 스트림을 여는 용도

int, double 데이터를 저장하고 싶다
스트림 여는 클래서와 결합해서 사용하는 Filter클래스를 사용한다
Filter클래스는 데이터를 저장하기 위한 쉬운 메서드를 제공한다
*/

public class DataFilterStream {
	public static void main(String[] args) throws IOException {
		// 1단계 출력 스트림 open
		OutputStream out = new FileOutputStream("MyData.bin");
		// 출력 스트림과 결합하는 필터 스트림 생성
		// User -> filterOut -> out -> MyData.bin
		DataOutputStream filterOut = 
				new DataOutputStream(out);
		
		// 2단계 데이터 저장
		filterOut.writeInt(365);
		filterOut.writeDouble(3.14);
		
		// 3단계 필터 클래스에서 close하면 out도 내부에서 close
		filterOut.close();
		
		// 읽어보자
		// 1단계
		InputStream in = new FileInputStream("MyData.bin");
		DataInputStream filterIn = new DataInputStream(in);
		
		// 2단계
		int num0 = filterIn.readInt();
		double dnum1 = filterIn.readDouble();
		
		// 3단계
		filterIn.close();
		
		System.out.println("int " + num0);
		System.out.println("double " + dnum1);
	}
}










