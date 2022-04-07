package com.econ;

public class L43Math {
	public static void main(String[]args){
		//반올림 내림 버림
		//double d=10.6;
		System.out.println("Math.round() 반올림");
		System.out.println(Math.round(10.3));
		System.out.println(Math.round(10.6));
		System.out.println(Math.round(-10.6));
		System.out.println(Math.round(-10.2));
		System.out.println("Math.floor() 내림");
		System.out.println(Math.floor(10.3));
		System.out.println(Math.floor(10.6));
		System.out.println(Math.floor(-10.6));
		System.out.println(Math.floor(-10.2));
		System.out.println("Math.ceil() 올림");
		System.out.println(Math.ceil(10.3));
		System.out.println(Math.ceil(10.6));
		System.out.println(Math.ceil(-10.6));
		System.out.println(Math.ceil(-10.2));
		System.out.println("(int)10.3 버림");
		System.out.println((int)(10.3));
		System.out.println((int)(10.6));
		System.out.println((int)(-10.6));
		System.out.println((int)(-10.2));
		System.out.println("Math.ceil() 소수로 반환하는 반올림");
		System.out.println(Math.rint(10.3));
		System.out.println(Math.rint(10.6));
		System.out.println(Math.rint(-10.6));
		System.out.println(Math.rint(-10.2));
		System.out.println("Math.pow() 거듭제곱");
		System.out.println(Math.pow(2, 10));

		System.out.println("//////////Math.random()//////////////");
		System.out.println(Math.random());//0~1사이 실수
		System.out.println((int)(Math.random()*3)+1);//(int)(Math.random()*(원하는 수))+1  
	}
}
