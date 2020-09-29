package edu.exam17.ex06_simple_web_server;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServer {
	public final static int PORT = 80; // http 포트

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(PORT);
			while (true) {
				System.out.println("[서버] 브라우저 접속 대기...");
				Socket sock = server.accept();
				System.out.println("[서버] 새로운 스레드 생성...");
				HttpThread ht = new HttpThread(sock);
				ht.start();
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

class HttpThread extends Thread {
	Socket sock;
	BufferedReader br;
	PrintWriter pw;

	public HttpThread(Socket sock) {
		this.sock = sock;
		try {
			br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

	public void run() {
		BufferedReader fbr = null;
		
		try {
			// 1. 브라우저가 보내는 데이터를 얻는다
			// 원하는 파일이름을 추출한다
			String line = br.readLine();
			System.out.println("-----<브라우저 데이터>-----");
			System.out.println(line);
			System.out.println("-------------------------");
			// 파일이름이 있으면 추출하자
			int start = line.indexOf(" ") + 2;
			int end = line.lastIndexOf("HTTP") - 1;
			String filename = line.substring(start, end);
			if(filename.equals(""))
				filename = "index.html";
			System.out.println("사용자가 " + filename + "을 요청");

			// 2. 파일에서 데이터를 읽는다
			// 파일을 읽기 위해 객체와 연결시키자
			fbr = new BufferedReader(new FileReader(filename));

			// 3. 브라우저에 전송한다
			// 파일을 읽어서 브라우저(클라이언트)에 전송하자
			System.out.println("-----<서버 전송>-----");
			while(true) {
				String fline = fbr.readLine();
				if(fline==null)
					break;
				System.out.println(fline);
				pw.println(fline);
				pw.flush();
			}
			System.out.println("------------------------");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			try {
				if(fbr!=null) fbr.close();
				if(br!=null) br.close();
				if(pw!=null) pw.close();
				if(sock!=null) sock.close();
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
}
