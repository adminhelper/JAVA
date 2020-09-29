package edu.exam17.ex05_multithread_echo_server;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/*
스레드를 사용해서 역할을 나눈다
1. main 스레드
 1) accept() : 클라이언트 접속시 스트림 연결 담당
 2) 자식 스레드 생성 : 1클라이언트 당 1개 스레드
2. 자식 스레드
 1) 송신
 2) 수신

멀티스레드 동기 서버
장점 : 동시에 여러 클라이언트에 대응할 수 있다
단점 : 접속자가 많아지면 스레드가 많아진다
          컨텍스트 스위칭이 많이 발생한다
          반응 속도가 느려진다
*/
public class EchoThreadServer {
	final static int PORT = 9000;
	
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(PORT);
			while(true) {
				// 1. 클라이언트 접속 대기
				System.out.println("클라이언트 접속 대기...");
				Socket sock = server.accept();
				// 2. 클라이언트 (송수신) 담당 스레드 생성하여 전담
				EchoThread echoThread = new EchoThread(sock);
				echoThread.start();
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

class EchoThread extends Thread{
	private Socket sock;	// 클라이언트와 연결된 소켓 객체
	
	public EchoThread(Socket sock) {
		this.sock = sock;
	}
	
	public void run() {
		try {
			// 1. 클라이언트 주소 얻기
			InetAddress inetAddr = sock.getInetAddress();
			System.out.println(inetAddr.getHostAddress() +
								"로부터 접속했습니다.");
			// 2. 송신 stream 얻기
			OutputStream out = sock.getOutputStream();
			OutputStreamWriter outW = new OutputStreamWriter(out);
			PrintWriter pw = new PrintWriter(outW);
			
			// 3. 수신 stream 얻기
			InputStream in = sock.getInputStream();
			InputStreamReader inR = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(inR);
			
			// 4. 수신 후 송신 (echo)
			while(true) {
				String line = br.readLine();
				if(line == null)
					break;
				System.out.println(inetAddr.getHostAddress() +
						" 클라이언트로부터 수신: " + line);
				pw.println(line);
				pw.flush();	// 버퍼에 기다리지 말고 즉시 전송
			}
			System.out.println(inetAddr.getHostAddress() +
						" 클라이언트 접속 종료!");
			pw.close(); outW.close(); out.close();
			br.close(); inR.close(); in.close();
			sock.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}










