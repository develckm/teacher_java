package com.econ.test;

public class T03StringBuffer {
	public static void main(String[]args) {
		
		long start=System.nanoTime();
		String msg="";
		for(int i=0; i<100000; i++) {
			msg+=i;
		}
		long end=System.nanoTime();
		//System.out.println(msg);
		System.out.println("string+(100000)"+(end-start));
		
		start=System.nanoTime();
		StringBuffer sb=new StringBuffer("");
		for(int i=0; i<1000000; i++) {
			sb.append(i);
		}
		end=System.nanoTime();
		//System.out.println(sb);
		System.out.println("string+(100000)"+(end-start));
		//자바의 문자열은 기본형인가요??
		//=>참조형입니다. 
		//1.인덱스가 있는 배열이기 때문이고 문자열을 지원하는 필드가 존재하기 때문입니다.
		//2.그리고 StringBuffer라는 문자열의 더하기 연산을 효율적으로 해주는 타입도 존재합니다. 
		//자바의 문자열의 더하기 연산을 하는 것 보다 좋은 것이 있나요?
		
	}	
}
