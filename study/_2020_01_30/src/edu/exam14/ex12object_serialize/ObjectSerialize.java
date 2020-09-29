package edu.exam14.ex12object_serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/*
<파일 입출력>
클래스 == 우리가 정의한 자료형
클래스의 변수 == 객체 == 오브젝트 == 인스턴스
객체를 통째로 저장하고 싶다
그리고 다시 통째로 객체에 읽어들이고 싶다
직렬화(Serialize)		: 저장
역직렬화(DeSerialize)	: 로딩
*/

// 저장하고 싶은 객체의 클래스
// 저장하고 싶은 클래스는 Serializable를 상속해라(implements)
class Circle implements Serializable{
	int xPos;
	int yPos;
	double rad;
	
	Circle(int x, int y, double r){
		xPos=x;
		yPos=y;
		rad=r;
	}
	void showCircleInfo() {
		System.out.printf("[%d, %d]\n", xPos, yPos);
		System.out.println("rad : " + rad);
	}
}

public class ObjectSerialize {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 1단계 스트림 open
		OutputStream os = new FileOutputStream("circle.ser");// bridge
		ObjectOutputStream out = new ObjectOutputStream(os); // filter
		
		// 2단계 write
		Circle cir0 = new Circle(1, 1, 2.4);
		Circle cir1 = new Circle(2, 2, 4.8);
		out.writeObject(cir0);
		out.writeObject(cir1);
		out.writeObject(new Circle(3, 3, 7.2));
		out.writeObject(new String("홍길동 율도국"));
		
		// 3단계 close
		out.close();
		
		// 읽기
		// 1단계 
		InputStream is = new FileInputStream("circle.ser");
		ObjectInputStream in = new ObjectInputStream(is);
		
		// 2단계
		Circle c0 = (Circle)in.readObject();
		Circle c1 = (Circle)in.readObject();
		Circle c2 = (Circle)in.readObject();
		String str = (String)in.readObject();
		
		// 3단계
		in.close();
		
		// 확인
		c0.showCircleInfo();
		c1.showCircleInfo();
		c2.showCircleInfo();
		System.out.println(str);
	}
}









