package edu.exam17.ex03_file_server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//1) 클라이언트가 요청하는 파일명을 받는다
//2) 파일을 읽는다
//3) 클라이언트에 전송한다

public class FileServer {
	public static void main(String[] args) {
		try {
			// 1) 클라이언트와 연결
			//    내부적으로는 송수신 stream이 생성되어있다.
			ServerSocket serverSocket = new ServerSocket(9000);
			System.out.println("파일 클라이언트 대기...");
			Socket socket = serverSocket.accept();
			System.out.println("파일 클라이언트 접속 완료!");
			
			// 2) 통신을 위해 stream을 얻자
			//   수신 stream
			InputStream in = socket.getInputStream();
			DataInputStream din = new DataInputStream(in);
			
			//   송신 stream
			OutputStream out = socket.getOutputStream();
			DataOutputStream dout = new DataOutputStream(out);
			
			// 1) 클라이언트의 파일명을 수신 대기한다
			String fileName = din.readUTF();
			System.out.println("사용자 요청 파일: " + fileName);
			
			// 2) 파일을 연결한다
			FileInputStream fin = 
					new FileInputStream(fileName);
			
			// 3) 파일을 읽어서 데이터를 전송한다
			while(true) {
				// int는 4byte이지만 실제로는 1byte만 읽어서 채운다
				int data = fin.read();
				if(data == -1) {
					System.out.println("---모두 전송했습니다---");
					break;
				}
				// 실제 읽은 1byte만 전송한다
				dout.write(data);
			}
			fin.close();
			dout.close();
			out.close();
			din.close();
			in.close();
			serverSocket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}





