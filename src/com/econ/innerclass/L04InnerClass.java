package com.econ.innerclass;

public class L04InnerClass {
	int a=10;
	int b=20;
	public static void main(String[]args) {
		///���� Sum.result()�� ȣ���ؼ� a+b�� ���� ��������.
		L04InnerClass i=new L04InnerClass();
		System.out.println(new com.econ.innerclass.Sum(i.a,i.b).result());
		System.out.println(i.new Sum().result());
	}
	class Sum{ //com.econ.innerclass.L04InnerClass.Sum
		//�ڽ��� ǰ�� �ִ� Ŭ������ �ʵ带 �״�� ����� �� �ִ�.
		public int result(){
			return a+b;
		}
	}
}
class Sum{////com.econ.innerclass.Sum
	int a,b;
	Sum(int a,int b){
		this.a=a;
		this.b=b;
	}
	public int result() {
		return this.a+b;
	}
}