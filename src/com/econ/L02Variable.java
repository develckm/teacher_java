package com.econ;

public class L02Variable {
	public static void main(String[] args) {
		//let s="안녕"; //let : 변수를 선언하겠다, s :변수의 이름, "안녕" : 문자열 타입의 객체 (리터럴 선언법)
		String s="안녕"; //자바의 문자열은 기본이 데이터 타입이 아니다.(기본데이터 타입이 아닌 참조형은 대문자로 시작)
		System.out.println(s.length()); 
		//"안녕"을 선언하면 js는 "안녕" data만 순서대로 참조해서 기본데이터 타입이르 부를 수 있었지만 
		//java에서 "안녕"==new String("안녕")과 동일한 필드(속성,프로퍼티)를 갖는다("안녕을 포함하는 많은 필드가 존재한다.")
		//리터럴하게 선언할 수 있는 data ???=>기본데이터 타입 
		//s=10;  변수는 처음 지정한 타입 외의 타입의 객체를 참조할 수 없다.
		s="10"; //변수는 처음 참조한 객체가 바뀔 수 있기 때문에 변수다.
		s=new String("10");
		System.out.println(s);
		byte b=127;
		short sh=32767;
		System.out.println(sh);//기본데이터 타입은 필드가 없다.
		//System.out.println("sh.MAX_VALUE:"+sh.MAX_VALUE);//기본데이터 타입은 필드가 없다.
		System.out.println("Short.MAX_VALUE:"+Short.MAX_VALUE);
		//기본데이터 타입은 랩퍼 클래스가 존재한다(기본데이터 타입을 지원하는 객체[형변환,타입에 대한 정보==상수,기본데이터를 처리])
		System.out.println("1+s="+(1+s));
		System.out.println("1+Integer.parseInt(s)="+(1+Integer.parseInt(s)));
		int i=1234567890;		
		double d=10.1234567890123456790123456790;
		float f=10.1234567890123456790123456790f;
		long l=1234567890123456789l;
	}

}
