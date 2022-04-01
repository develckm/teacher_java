package com.econ;
//import java.lang.*; //모든 클래스가 자동으로 import 된다.
import java.lang.Object;
import java.util.Scanner;

class Person{
	int a=10;
	int b; //필드는 undefined일 수 없어 선언 시 값을 준다.int : 0;
	boolean c; //false
	double d;
	String s; //참조형은 null을 대입
	Scanner sc; 
	Person(){
		//부모의 class 필드를 접근한는 접근자는 super
		//부모의 자원(필드)를 상속받으면 내것이 되기 때문에 this기도 하다. 
		System.out.println("생성한 클래스:"+super.getClass());
	}
}
public class L23Field {
	public static void main(String[]args) {
		System.out.println(Person.class); //필드가 아니다.
		System.out.println(new Person().toString()); //toString은 new Person()의 필드(속성,프로퍼티)다
		//객체지향 언어에서 객체의 필드와 같은 말 : 멤버(변수,메소드), 상태, 특성
		//모든 객체는 필드를 정의하고 생성자를 호출 할 수 있는 최상위 설계도를 상속(위임)받는다.
		//최상위 설계도의 type(이름)은 java.lang.Object (Object)이고 Objecgt 필드를 사용할 수 있다(상속).
		Person p=new Person();
		System.out.println("p.b(int)="+p.b);
		System.out.println("p.c(boolean)="+p.c);
		System.out.println("p.d(double)="+p.d);
		System.out.println("p.s(String)="+p.s);
		System.out.println("p.s(Scanner)="+p.sc);
	}
}
