package edu.exam05.stringbuilder06;

//StringBuilder와
//StringBuffer는 용법이 동일하다.
//단, 멀티스레드 환경에서는 
//StringBuffer를 사용해야만 한다.
//StringBuilder는 멀티스레드에서
//안전하지 않다.

public class MutableStringBuilder {
	public static void main(String[] args) {
		StringBuilder sbBuf = new StringBuilder("AB");
		sbBuf.append(25);
		sbBuf.append('Y').append(true);	
		System.out.println(sbBuf);
		
		sbBuf.insert(2, false);
		sbBuf.insert(sbBuf.length(), 'Z');
		System.out.println(sbBuf);
	}
}







