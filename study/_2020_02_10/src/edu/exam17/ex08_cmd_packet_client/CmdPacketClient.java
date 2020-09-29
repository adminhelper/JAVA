package edu.exam17.ex08_cmd_packet_client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

//클라이언트 프로그램
//1) 서버의 주소(ip, port)를 가지고 서버에 접속(connect)
//2) 접속 후에 통신이 가능
//3) 접속중단은 close
public class CmdPacketClient {
	public static void main(String[] args) {
		try {
			// 127.0.0.1 : 현재 나의 Host의 주소, loop 주소
			// Socket sock = new Socket("192.168.0.13", 9000);
			// Socket생성자에서 내부적으로 connect를 진행
			// 객체가 만들어지면 서버와 이미 연결 상태
			Socket sock = new Socket("127.0.0.1", 9000);
			// 키보드 데이터 입력 객체 생성
			InputStreamReader inK = 
					new InputStreamReader(System.in);
			BufferedReader keyboard = 
					new BufferedReader(inK);
			
			// 통신 스트림 객체
			OutputStream out = sock.getOutputStream();
			OutputStreamWriter outW = 
					new OutputStreamWriter(out);
			PrintWriter pw = new PrintWriter(outW);
			
			InputStream in = sock.getInputStream();
			InputStreamReader inR = 
					new InputStreamReader(in);
			BufferedReader br = new BufferedReader(inR);
			
			while(true) {
				System.out.print("연산자 입력(+ - * / quit) >> ");
				String cmd = keyboard.readLine();
				if(cmd.equals("quit")) {
					System.out.println("클라이언트 종료");
					break;
				}
				System.out.print("첫번째 숫자 입력 >> ");
				int num0 = Integer.parseInt(keyboard.readLine());
				System.out.print("두번째 숫자 입력 >> ");
				int num1 = Integer.parseInt(keyboard.readLine());

				String line = String.format("%s|%d|%d",
									cmd, num0, num1);
				System.out.println("서버로 패킷 전송 : " + line);
				pw.println(line);
				pw.flush();
				// 서버가 echo하는 것을 받아서 출력
				String echo = br.readLine();
				System.out.println("서버로부터 수신 : " + echo);
			}
			pw.close();
			outW.close();
			out.close();
			br.close();
			inR.close();
			in.close();
			sock.close();	
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}





