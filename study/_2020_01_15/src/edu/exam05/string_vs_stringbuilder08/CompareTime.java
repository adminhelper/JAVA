package edu.exam05.string_vs_stringbuilder08;

public class CompareTime {
	
	public static long getStringSpeed() {
		long result = 0;
		
		String str = "A";
		String target = "B";
		long start = System.currentTimeMillis();
		for(int i=0;i<100000;i++)
			str += target;
		long end = System.currentTimeMillis();
		
		result = end - start;		
		return result;
	}
	
	public static long getStringBuilderSpeed() {
		long result = 0;
		
		long start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("A");
		String target = "B";
		for(int i=0;i<100000;i++)
			sb.append(target);
		long end = System.currentTimeMillis();
		
		result = end - start;
		return result;
	}
	
	public static void main(String[] args) {
		long lStrTime = getStringSpeed();
		long lSBTime = getStringBuilderSpeed();
		
		System.out.println("String 시간: " + lStrTime);
		System.out.println("StringBuilder 시간: " + lSBTime);
	}
}




