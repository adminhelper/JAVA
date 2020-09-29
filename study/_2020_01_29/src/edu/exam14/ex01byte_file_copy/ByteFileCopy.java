package edu.exam14.ex01byte_file_copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//1단계 입출력 스트림을 열고 open
//2단계 읽어서 저장하고 read, write
//3단계 닫는다 close

public class ByteFileCopy {
	public static void main(String[] args) throws IOException {
		// 1단계 생성자 내부에서 open 과정이 일어난다
		InputStream in = new FileInputStream("putty.exe");
		OutputStream out = new FileOutputStream("푸푸푸푸푸푸푸푸푸티.exe");
		int copyByte = 0;
		// byte는 1바이트 자료형이지만
		// 표현범위가 0 ~ 255이므로 -1을 표현할 수 없다. 
		// 그래서 int받고 대신 int내부에 하위 1바이트만 읽어들이고
		// 1바이트만 저장한다.
		int bData;
		long sTime = System.currentTimeMillis();
		while(true) {
			// 1byte씩 읽어들인다.
			bData = in.read();	// 2단계 read
			if(bData == -1)	// 더이상 읽을 것이 없을 때
				break;
			out.write(bData);	// 2단계 write
			copyByte++;			// 몇바이트 읽었다(저장했다)
			//System.out.println(copyByte);
		}
		long eTime = System.currentTimeMillis();
		
		// 3단계
		in.close();
		out.close();
		
		System.out.println("복사된 바이트 크기: " + copyByte);
		System.out.println("복사에 소요된 시간: " + (eTime-sTime));
	}
}








