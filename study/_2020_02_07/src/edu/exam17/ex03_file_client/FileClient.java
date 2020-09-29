package edu.exam17.ex03_file_client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//1) 받고 싶은 파일명을 서버에 전송한다
//2) 서버고 보내주는 데이터를 파일에 저장한다
//3) 연결이 끊어지면 파일전송도 완료된 것으로 판단한다
//4) 모든 연결을 끊는다

public class FileClient {
	public static void main(String[] args) {
		try {
			// "127.0.0.1", localhost : 자기자신 Host IP
			// 1) 생성자에서 자동으로 서버에 Connect 이루어짐
			Socket socket = new Socket("localhost", 9000);
			Scanner sc = new Scanner(System.in);
			
			// 2) 송수신 stream을 얻는다
			// 수신 stream
			InputStream in = socket.getInputStream();
			DataInputStream din = new DataInputStream(in);
			
			// 송신 stream
			OutputStream out = socket.getOutputStream();
			DataOutputStream dout = new DataOutputStream(out);
			
			// 3-1) 유저로부터 다운로드할 파일명을 입력
			System.out.print("받고 싶은 파일명을 입력 >> ");
			String fileName = sc.nextLine();
			
			// 3-2) 파일명을 서버로 전송
			dout.writeUTF(fileName);
			System.out.println("서버에 파일명을 보냈습니다~");
			System.out.println("서버로부터 파일데이터를 수신합니다!");
			
			// 3-3) 파일을 연결
			String newFileName = "new_" + fileName;
			FileOutputStream fos = 
					new FileOutputStream(newFileName);
			
			// 3-4) 데이터 수신 후 파일에 저장
			while(true) {
				int data = din.read();
				// 서버와의 스트림 종료
				if(data == -1) {
					System.out.println("서버로부터 모두 수신!");
					break;
				}
				fos.write(data);
			}
			System.out.println("전송 작업 완료!");
			fos.close();
			dout.close();
			out.close();
			
			din.close();
			in.close();
			socket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}






