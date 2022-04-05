package com.econ;
class Abc{
	@Override
	public String toString() {
		return this.getClass()+"입니다.";
	}
}
class PrintObj{
	PrintObj(Object a){
		System.out.println(a.getClass()+":"+a);
	}
//	PrintObj(int a){
//		System.out.println("정수:"+a);
//	}	
//	PrintObj(String a){
//		System.out.println("문자열 :"+a);
//	}
//	PrintObj(double a){
//		System.out.println("실수(double) :"+a);
//	}
//	PrintObj(float a){
//		System.out.println("실수(float) :"+a);
//	}
//	PrintObj(Abc a){
//		System.out.println("실수(float) :"+a);
//	}
}
public class L35Generics {
	public static void main(String[]args) {
		new PrintObj(10);
		new PrintObj("안녕");
		new PrintObj(10.001);
		new PrintObj(10.00f);
		new PrintObj(new Abc());
	}
}
