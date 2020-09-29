package edu.exam17.ex09_serialize_network_server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import edu.exam17.ex11_serialize_share_data.CalcData;

public class SerializeCalculatorServer {
	
	// cmd에 따른 계산을 완료하고 다시 CalcData객체에 담아서 반환
	public static CalcData runCalc(CalcData cd) {
		int result = 0;
		switch(cd.opCode) {
		case "+": result = cd.op0 + cd.op1; break;
		case "-": result = cd.op0 - cd.op1; break;
		case "*": result = cd.op0 * cd.op1; break;
		case "/": result = cd.op0 / cd.op1; break;
		}
		cd.result = result;
		
		return cd;
	}
	
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket sock = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		try {
			server = new ServerSocket(9000);
			System.out.println("[서버] 접속 대기...");
			sock = server.accept();
			System.out.println("[서버] 클라이언트 접속!");
			oos = new ObjectOutputStream(sock.getOutputStream());
			ois = new ObjectInputStream(sock.getInputStream());
			while(true) {
				Object obj = ois.readObject();
				if(obj == null) break;
				CalcData cd = (CalcData)obj;
				cd = runCalc(cd);
				System.out.println(cd);
				oos.writeObject(cd);
				oos.flush();
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			try {
				if(oos != null) oos.close();
				if(ois != null) ois.close();
				if(sock != null) sock.close();
				if(server != null) server.close();
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
}
