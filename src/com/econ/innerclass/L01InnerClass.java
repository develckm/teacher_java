package com.econ.innerclass;

public class L01InnerClass {
	//L03InnerClass$A.class �γ�Ŭ������ ������ 
	class Cal{
		int a,b;
		Cal(int a,int b){
			this.a=a;
			this.b=b;
		}
		public int sum() {
			return this.a+this.b;
		}
	}
	public int sum(int a,int b) {
		return a+b;
	}
	public static void main(String []args) {
		L01InnerClass l=new L01InnerClass();
		System.out.println(l.sum(10, 20));
	 	L01InnerClass.Cal cal=new L01InnerClass().new Cal(100, 200); 
	 	//�̳�Ŭ������ Ÿ�� ������ Ÿ���̴�. ��ü���� �ٽ� ������ ȣ���ؾ� �̳�Ŭ���� ��ü�� ���� �� �ִ�.
	 	
	 	System.out.println(cal.sum());
	}
}
