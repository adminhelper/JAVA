package edu.exam11.ex02clone;

// 클래스의 객체를 복제(새롭게 생성해서 값을 복사)하고 싶으면
// Cloneable 인터페이스를 상속받아라

class Point implements Cloneable{
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	private int x;
	private int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void showPoint() {
		System.out.printf("[%d, %d]\n", x, y);
	}
}

// 객체자체가 복제되지 않고
// 가리키는 참조값만 복사되므로
// 같은 객체를 2개의 변수가 가리키게 된다.
public class PointClone {
	public static void main(String[] args) {
		Point org = new Point(10, 20);
		Point cpy;
		try {
			cpy = (Point)org.clone();  // 깊은 복사
			System.out.println(org);
			System.out.println(cpy);
			org.showPoint();
			cpy.showPoint();
			cpy.setPoint(100, 200);
			org.showPoint();
			cpy.showPoint();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}





