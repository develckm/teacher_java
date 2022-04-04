package com.econ;
interface Personable{}
class Child extends Parent implements Personable{
	int b=20;
}
class Parent{
	int a=10;
}

public class L33Instanceof {
	public static void main(String []args) {
		String a="안녕";
		System.out.println(a instanceof String ); //객체의 타입을 확인
		System.out.println("안녕" instanceof String);
		System.out.println(a instanceof Object); //객체의 부모의 타입도 true 
		///////////////////////////////////////////////////////////////////
		Child c=new Child();
		//System.out.println( c instanceof String);
		System.out.println( c instanceof Child);
		System.out.println( c instanceof Parent);
		System.out.println( c instanceof Object);
		System.out.println( c instanceof Personable);//type 비교
		//"객체" instaceof "type" 는 참조형 객체의 비교연산자 
		/////////!!!자바에서 기본데이터 타입의 data의 타입을 확인할 방법이 없다. 
		//System.out.println( 10 instanceof int);
		System.out.println(new Integer(10) instanceof Integer);
		
		
		Object obj_c=new Child();
		Object obj_str=new String("안녕");
		Object obj_str2="안녕";
		Object obj_int=10;
		Object obj_db=10.0;
		Object obj_f=10.0f;


		
	}
}
