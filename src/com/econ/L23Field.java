package com.econ;
//import java.lang.*; //��� Ŭ������ �ڵ����� import �ȴ�.
import java.lang.Object;
import java.util.Scanner;

class Person{
	int a=10;
	int b; //�ʵ�� undefined�� �� ���� ���� �� ���� �ش�.int : 0;
	boolean c; //false
	double d;
	String s; //�������� null�� ����
	Scanner sc; 
	Person(){
		//�θ��� class �ʵ带 �����Ѵ� �����ڴ� super
		//�θ��� �ڿ�(�ʵ�)�� ��ӹ����� ������ �Ǳ� ������ this�⵵ �ϴ�. 
		System.out.println("������ Ŭ����:"+super.getClass());
	}
}
public class L23Field {
	public static void main(String[]args) {
		System.out.println(Person.class); //�ʵ尡 �ƴϴ�.
		System.out.println(new Person().toString()); //toString�� new Person()�� �ʵ�(�Ӽ�,������Ƽ)��
		//��ü���� ���� ��ü�� �ʵ�� ���� �� : ���(����,�޼ҵ�), ����, Ư��
		//��� ��ü�� �ʵ带 �����ϰ� �����ڸ� ȣ�� �� �� �ִ� �ֻ��� ���赵�� ���(����)�޴´�.
		//�ֻ��� ���赵�� type(�̸�)�� java.lang.Object (Object)�̰� Objecgt �ʵ带 ����� �� �ִ�(���).
		Person p=new Person();
		System.out.println("p.b(int)="+p.b);
		System.out.println("p.c(boolean)="+p.c);
		System.out.println("p.d(double)="+p.d);
		System.out.println("p.s(String)="+p.s);
		System.out.println("p.s(Scanner)="+p.sc);
	}
}
