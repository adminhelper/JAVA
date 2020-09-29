package edu.exam14.ex06data_buffer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
1. bridge 역할 (스트림 open/close) 
   InputStream
   OutputStream
2. 창고 역할        - 속도향상을 위한 Filter
   BufferedInputStream
   BufferedOutputStream
3. int, double, ... 데이터 입출력 Filter
   DataInputStream
   DataOutputStream
   
위 3가지를 결합하겠다
  write시
  OutputStream in
  BufferedOutputStream bOut(in)
  DataOutputStream(bOut)
  
  User -> DataOutputStream -> BufferedOutputStream
       -> OutputStream -> data.bin 파일
*/  
/*
C언어 : 바이너리 스트림
자바  : 바이트 스트림 I/O

메모리의 데이터를 있는 그대로 파일로 저장하고 복원하는 것

실행파일, 이미지, 음악, 영화 ...
*/   

public class DataBufferFilterStream {
	public static void main(String[] args) throws IOException {		
		//User -> dOut -> bOut -> out -> MyData.bin
		OutputStream out = new FileOutputStream("MyData.bin");
		BufferedOutputStream bOut = 
							new BufferedOutputStream(out);
		DataOutputStream dOut = 
							new DataOutputStream(bOut);
		
		dOut.writeInt(9999);
		dOut.writeDouble(1.125);
		
		dOut.close();
		
		// 읽어보자
		InputStream in = new FileInputStream("MyData.bin");
		BufferedInputStream bIn = new BufferedInputStream(in);
		DataInputStream dIn = new DataInputStream(bIn);
		
		int num = dIn.readInt();
		double dNum = dIn.readDouble();
		
		dIn.close();
		System.out.println(num);
		System.out.println(dNum);
	}
}












