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
		String a="�ȳ�";
		System.out.println(a instanceof String ); //��ü�� Ÿ���� Ȯ��
		System.out.println("�ȳ�" instanceof String);
		System.out.println(a instanceof Object); //��ü�� �θ��� Ÿ�Ե� true 
		///////////////////////////////////////////////////////////////////
		Child c=new Child();
		//System.out.println( c instanceof String);
		System.out.println( c instanceof Child);
		System.out.println( c instanceof Parent);
		System.out.println( c instanceof Object);
		System.out.println( c instanceof Personable);//type ��
		//"��ü" instaceof "type" �� ������ ��ü�� �񱳿����� 
		/////////!!!�ڹٿ��� �⺻������ Ÿ���� data�� Ÿ���� Ȯ���� ����� ����. 
		//System.out.println( 10 instanceof int);
		System.out.println(new Integer(10) instanceof Integer);
		
		
		Object obj_c=new Child();
		Object obj_str=new String("�ȳ�");
		Object obj_str2="�ȳ�";
		Object obj_int=10;
		Object obj_db=10.0;
		Object obj_f=10.0f;


		
	}
}
