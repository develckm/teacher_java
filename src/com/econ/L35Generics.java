package com.econ;
class Abc{
	@Override
	public String toString() {
		return this.getClass()+"�Դϴ�.";
	}
}
class PrintObj{
	PrintObj(Object a){
		System.out.println(a.getClass()+":"+a);
	}
//	PrintObj(int a){
//		System.out.println("����:"+a);
//	}	
//	PrintObj(String a){
//		System.out.println("���ڿ� :"+a);
//	}
//	PrintObj(double a){
//		System.out.println("�Ǽ�(double) :"+a);
//	}
//	PrintObj(float a){
//		System.out.println("�Ǽ�(float) :"+a);
//	}
//	PrintObj(Abc a){
//		System.out.println("�Ǽ�(float) :"+a);
//	}
}
public class L35Generics {
	public static void main(String[]args) {
		new PrintObj(10);
		new PrintObj("�ȳ�");
		new PrintObj(10.001);
		new PrintObj(10.00f);
		new PrintObj(new Abc());
	}
}
