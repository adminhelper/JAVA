package edu.exam17.ex04_retry_server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//서버는 서비스를 제공하는 프로그램을 일컫는다.
//1) 고정된 주소를 가진다(주소를 부여)
//2) 접속 요청하는 클라이언트를 받아줘야 한다(accept)
//3) 요청을 받아들이면 내부에서는 2개 스트림이 형성된다
//4) 스트림이 형성되면 송수신이 가능하다
//5) 작업이 완료되면 close를 통해 스트림을 해제한다
//
//EchoServer : 클라이언트가 보내온 데이터를 그래도 돌려주는
//                    서버

public class RetryEchoServer {
	
	public final static int RETRY_NUM = 3;
	
	public static void echoServer() {
		try {
//			1) 소켓 객체 생성한다
//	          : tcp/udp와 연결하기 위한 소켓 객체 생성
//	          : 소켓에는 클라이언트가 찾아오기 위한 주소 부여

			// 소켓 객체 생성,
			// 주소 : ip, port
			// ip: Host(PC)를 찾기 위한 주소
			// port: 프로세스들이 상대방과 통신하려고 약속된
			// 번호
			// 192.168.0.13 9000이렇게 지정한 Client만
			// 이 서버와 통신 가능
			// ip는 따로 설정하지 않아도 Host의 주소를 사용
			// port : 9000
			ServerSocket server = new ServerSocket(9000);

			// 클라이언트가 접속하기를 대기(여기서 멈춰있음)
			// 클라이언트와 연결되면 연결 소켓을 반환
			// 이 연결소켓으로 통신을 할 수 있다

			// ex)VIPS를 방문하면 입구에 안내직원(server)
			// 이 대기하라고 하고 서비스 직원(sock)을 연결시켜준
			System.out.println("클라이언트 접속 대기...");
			Socket sock = server.accept();

			// 연결이 되면 상대방의 주소를 알 수 있다
			InetAddress inetAddr = sock.getInetAddress();
			System.out.println(inetAddr.getHostAddress() + "로부터 접속");

			// 연결이 되었으니까 통신을 하자
			// 통신하는 스트림객체를 얻어오자
			OutputStream out = sock.getOutputStream();
			OutputStreamWriter outW = new OutputStreamWriter(out);
			PrintWriter pw = new PrintWriter(outW);

			InputStream in = sock.getInputStream();
			InputStreamReader inR = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(inR);

			while (true) {
				// 클라이언트가 보내는 데이터를 기다리자
				String line = br.readLine();
				if (line == null) {
					System.out.println("클라이언트와 연결 X");
					break;
				}
				System.out.println("클라이언트로부터 수신 : " + line);
				pw.println(line); // 클라이언트에 전송
				pw.flush(); // 버퍼에 남기지 말고 즉시
			}
			System.out.println("클라이언트-서버 연결 종료");
			System.out.println();
			pw.close();
			br.close();
			sock.close();
			server.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<RETRY_NUM;i++) {
			echoServer();
			Thread.sleep(500);
		}
	}
}




