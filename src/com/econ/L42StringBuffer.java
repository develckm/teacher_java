package com.econ;

public class L42StringBuffer {
	public static void main(String[]args) {
		System.out.println("//////////////////////////StringBuffer////////////////////////////////");
		StringBuffer sb=new StringBuffer("안녕");
		System.out.println("sb:"+sb);
		System.out.println(sb+"하세요");
		//System.out.println(sb.concat("하세요!"));
		String h="하세요";
		System.out.println(sb.append(h));//문자열 배열을 버퍼에서 더하기 연산한다. 
		System.out.println(sb);//문자열 배열을 버퍼에서 더하기 연산한다. 

		System.out.println("//////////////////////////String////////////////////////////////");
		String s="안녕";
		System.out.println(s+"하세요");
		System.out.println(s.concat("하세요!")); //문자열 객체 2개를 더하기 연산한다. 
		System.out.println(s); //문자열 객체 2개를 더하기 연산한다. 
		
		//StringBuffer는 equals 구현이 되어 있지않다
		System.out.println(sb.equals(new StringBuffer("안녕하세요")));
		//StringBuffer를 문자열로 타입으로 변형해서 비교연산해야한다.
		String sb_str=sb.toString();
		System.out.println(sb_str.equals("안녕하세요"));
	}
}
