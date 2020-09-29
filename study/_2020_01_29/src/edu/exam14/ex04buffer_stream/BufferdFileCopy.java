package edu.exam14.ex04buffer_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/*
파일 복사
1) 1byte 읽고 -> 1byte 저장
   : 택배아저씨가 물류센터에서 1개택배를 가져와서
     집에 배송하고, 다시 물류센터 가서 1개 가져오고 배송하고
2) 1024byte 읽고 -> 1024byte 저장
   : 택배아저씨가 트럭에 잔뜩 싣고 한번에 배송한다
3) 1byte 읽고 -> 1byte 저장
   중간에 Buffer클래스 사용
   : 택배아저씨를 위해 아파트에 창고를 마련해 택배를 넣어둔다
     아저씨는 1개씩 꺼내 배송한다
4) 제일 빠른 방법은
   중간에 Buffer 클래스를 사용하고
  1024byte 읽고 -> 1024byte 저장
  
위에서 3번을 실행하고 시간을 비교해서
Buffer 클래스의 장점을 이해한다
*/

public class BufferdFileCopy {
	public static void main(String[] args) throws IOException {
		// 1단계 스트림 생성(open)
		// bridge(다리)생성
		InputStream in = new FileInputStream("putty.exe");
		OutputStream out = new FileOutputStream("퍼__티.exe");
		
		// 버퍼 필터를 연결한다
		// 택배 아저씨를 위해 아파트 입구에 창고를 마련한다
		// 하드디스크 데이터 -> 메모리 데이터
		// 저장 창고
		BufferedInputStream bIn = 
							new BufferedInputStream(in);
		BufferedOutputStream bOut =
							new BufferedOutputStream(out);
		
		// 1byte씩 읽고 쓰더라도 속도 차이가 발생하게 된다
		int copyByte = 0;
		int bData;
		long sTime = System.currentTimeMillis();
		while(true) {
			bData = bIn.read();
			if(bData == -1)
				break;
			bOut.write(bData);
			copyByte++;
		}
		long eTime = System.currentTimeMillis();
		// 3단계 bridge 닫기
		bIn.close();
		bOut.close();
		
		System.out.println("복사된 바이트 크기: " + copyByte);
		System.out.println("복사에 소요된 시간: " + (eTime-sTime));
	}
}









