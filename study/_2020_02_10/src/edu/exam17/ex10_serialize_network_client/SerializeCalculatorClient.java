package edu.exam17.ex10_serialize_network_client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

import edu.exam17.ex11_serialize_share_data.CalcData;

public class SerializeCalculatorClient {
	public static void main(String[] args) {
		Socket sock = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		Scanner sc = new Scanner(System.in);
		try {
			sock = new Socket("127.0.0.1", 9000);	// Connect
			oos = new ObjectOutputStream(sock.getOutputStream());
			ois = new ObjectInputStream(sock.getInputStream());
			while(true) {
				System.out.print("연산자 입력(+ - * / quit) >> ");
				String opCode = sc.next();
				if(opCode.equals("quit")) 
					break;
				System.out.print("첫 번째 숫자 입력 >> ");
				int op0 = sc.nextInt();
				System.out.print("두 번째 숫자 입력 >> ");
				int op1 = sc.nextInt();
				CalcData cd = new CalcData(op0, op1, opCode);
				oos.writeObject(cd);
				cd = (CalcData)ois.readObject();
				System.out.println(cd);
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}finally {
			try {
				if(sc!=null) sc.close();
				if(oos!=null) oos.close();
				if(ois!=null) ois.close();
				if(sock!=null) sock.close();
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
}
