package edu.exam00.transtype06;

//강제 형변환
//자동으로 형변환이 이루어지지 않을 때
//우리의 의도하에 강제로 변환시키는 것
// 사이즈가 큰 것 or 범위가 큰 것을 
// => 작은 것으로 변환하려고 할 때
public class ForceTransType {
	public static void main(String[] args) {
		// 1byte를 제외한 3byte가 사라짐
		// byte범위를 넘는 숫자는 값이 왜곡됨
		int num = 130;
		byte b = (byte) num;
		System.out.println(b);
		
//		char(2byte)  0x0000 ~ 0xFFFF
//		short(2byte) -7FFF ~ -7FFE
//		short는 음수가 있으므로 왜곡될 수 있음
		char ch = 'A';
		short s = (short)ch;
		System.out.println(s);
		
//		같은 4byte라 할지라도 float가 표현범위가 
//		넓기 때문에
//		소수점이 없어진다
		float f = 13.3F;
		int i = (int)f;
		System.out.println(i);
		
		// long은 8byte이고 float는 4byte지만
		// float가 표현범위가 무한대이므로
		// lval은 float로 자동 변환된다
		long lval = 1234L;
		float fNum = lval;
		System.out.println(fNum);
	}
}






