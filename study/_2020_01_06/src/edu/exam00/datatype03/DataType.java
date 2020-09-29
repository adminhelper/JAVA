package edu.exam00.datatype03;
/*
DataType(자료형)
변수를 선언할 때 어떤 종류의 변수인가를
자바 컴파일러한테 알려주는 약속
boolean 1byte  true, false     논리
char    2byte  유니코드               문자
byte    1byte  -128 ~ 127      정수
short   2byte  -32768 ~ 32768  정수
int     4byte  -21억 ~ 21억        정수
long    8byte  -900경 ~ 900경    정수
float   4byte  소수점 6자리유효   실수
double  8byte  소수점 15자리유효  실수
string                         문자열

범위는 외울 필요없고 bit와 byte의 관계를 알면
계산 가능(대략 알면 된다)

자주 사용하는 자료형
boolean, char, int, double, string
*/

public class DataType {
	public static void main(String[] args) {
		boolean isVal = true;
		char ch = '한';
		char ch1 = 'A';
		byte bNum = 100;
		short sNum = 10000;
		int iNum = 1000000000;
		long lNum = 1000000000000L;
		float fNum = 3.14F;
		double dNum = 3.14D;	// 3.14
		
		System.out.println(isVal);
		System.out.println(ch);
		System.out.println(ch1);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
	}
}






