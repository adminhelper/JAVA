package edu.exam14.ex02buffer_file_copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
1단계 스트림 열기
2단계 읽기/쓰기
3단계 스트림 닫기

읽을때 많이 읽고
많이 저장하기
*/
public class BufferFileCopy {
	public static void main(String[] args) throws IOException {
		// 1단계 open
		InputStream in = new FileInputStream("putty.exe");
		OutputStream out = new FileOutputStream("푸우우우우우우티.exe");
		int copyByte = 0;
		int readLen = 0;
		byte[] buf = new byte[1024];
		long sTime = System.currentTimeMillis();
		while(true) {
			// buf크기만큼 읽어라
			// 그런데 I/O상태나 혹은 파일 크기에 따라
			// 시도한 크기보다 적게 읽히는 경우가 있다
			// 그래서 readLen은 실제 읽은 크기
			readLen = in.read(buf);	// 2단계 read
			if(readLen == -1)	// 더 이상 읽을 것이 없다
				break;
			// buf배열에서 index0부터 readLen크기까지 저장해라
			out.write(buf, 0, readLen);	// 2단계 write
			copyByte += readLen;
			//System.out.println(copyByte + ":" + readLen);
		}
		long eTime = System.currentTimeMillis();
		
		// 3단계
		in.close();
		out.close();
		
		System.out.println("복사된 바이트 크기: " + copyByte);
		System.out.println("복사에 소요된 시간: " + (eTime-sTime));
	}
}











