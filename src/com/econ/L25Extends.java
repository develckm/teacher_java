package com.econ;
class A{
	int a=10;
	@Override
	public String toString() {
		return "a="+this.a;
	}
}
class B extends A{
	String b="20";
	@Override
	public String toString() {
		return super.toString()+",b="+this.b;
	}
}
class B2{
	int a=100;
	String b="200";
	byte b2=127;
}
//자바는 다중상속을 지원하지 않는다 : 동시에 상속받는 (다중상속) 부모의 필드가 중복될 수 있기 때문에  
//class C extends B extends B2{
class C extends B{
	float c=30.0f;
	@Override
	public String toString() {
		return super.toString()+",c="+this.c;
	}
}
public class L25Extends {
	public static void main(String[]args) {
		B b=new B();
		System.out.println(b.toString());
		C c=new C();
		System.out.println(c.toString());
		System.out.println(c.a);
		///////////////////////////////////
		A a=(A)new C();
		System.out.println(a.a);
		System.out.println(a.toString());
		
		byte z= (byte)300;
		
		int i=new Integer(10);
	}
}
