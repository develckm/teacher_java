package com.econ;

public class L43Math {
	public static void main(String[]args){
		//�ݿø� ���� ����
		//double d=10.6;
		System.out.println("Math.round() �ݿø�");
		System.out.println(Math.round(10.3));
		System.out.println(Math.round(10.6));
		System.out.println(Math.round(-10.6));
		System.out.println(Math.round(-10.2));
		System.out.println("Math.floor() ����");
		System.out.println(Math.floor(10.3));
		System.out.println(Math.floor(10.6));
		System.out.println(Math.floor(-10.6));
		System.out.println(Math.floor(-10.2));
		System.out.println("Math.ceil() �ø�");
		System.out.println(Math.ceil(10.3));
		System.out.println(Math.ceil(10.6));
		System.out.println(Math.ceil(-10.6));
		System.out.println(Math.ceil(-10.2));
		System.out.println("(int)10.3 ����");
		System.out.println((int)(10.3));
		System.out.println((int)(10.6));
		System.out.println((int)(-10.6));
		System.out.println((int)(-10.2));
		System.out.println("Math.ceil() �Ҽ��� ��ȯ�ϴ� �ݿø�");
		System.out.println(Math.rint(10.3));
		System.out.println(Math.rint(10.6));
		System.out.println(Math.rint(-10.6));
		System.out.println(Math.rint(-10.2));
		System.out.println("Math.pow() �ŵ�����");
		System.out.println(Math.pow(2, 10));

		System.out.println("//////////Math.random()//////////////");
		System.out.println(Math.random());//0~1���� �Ǽ�
		System.out.println((int)(Math.random()*3)+1);//(int)(Math.random()*(���ϴ� ��))+1  
	}
}
