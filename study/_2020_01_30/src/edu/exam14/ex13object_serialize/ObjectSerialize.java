package edu.exam14.ex13object_serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/*
1) 객체를 저장할 클래스는 Serializable을 상속받고
멤버 필드로 함께 저장할 클래스도 Serializable을 상속받으면
함께 잘 저장된다

2) Serialize는 속도가 빠르진 않다
   속도를 요구하는 서비스가 아니면 매우 편리하다는 장점이 있다
   
3) JDK의 수많은 클래스들이 Serialize를 지원한다
   String, 컬렉션(ArrayList, HashMap...)
*/
class Point implements Serializable{
	int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Circle implements Serializable{
	Point p;
	double rad;
	
	Circle(int x, int y, double r){
		p = new Point(x, y);
		rad=r;
	}
	void showCircleInfo() {
		System.out.printf("[%d, %d]\n", p.x, p.y);
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









