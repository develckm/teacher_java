package com.econ;

public class L07Integer {
	public static void main(String[]args) {
		long l=100l; //l을 포함하고 선언해야 long 의 수다.
		l=1; //l을 빼고 선언한 수의 type은 int
		//l=12345678901; //int로 표현할 수 있는 최대값을 넘어서 선언불가
		l=1234567890123456789l; 
		l=(long)10000000000000000000000000000000000.23;
		System.out.println(l);
		System.out.println(Long.MAX_VALUE);
		
		int i=1234567890;
		i=(int)Integer.MAX_VALUE+2; //불가능 
		System.out.println(i);
		System.out.println(Integer.MIN_VALUE);
		//큰 수를 작은 타입으로 형변환하는 3가지 방법(캐스팅)
		//1.나눠서 넣는다. -> 최대값을 넘으면 다시 최소값부터 센다.->처음부터 다시 센다. (int,short,byte)
		//2.최대값만 취하고 나머진 버린다. (long)
		//3.무한대로 표시한다.(float,double)
		
		byte b = 127; //8bit (-128~0~127);
		b=(byte)257;
		System.out.println(b);
		
	}
}
