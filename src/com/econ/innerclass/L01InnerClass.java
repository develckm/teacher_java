package com.econ.innerclass;

public class L01InnerClass {
	//L03InnerClass$A.class 인너클래스의 컴파일 
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
	 	//이너클래스는 타입 내부의 타입이다. 객체에서 다시 생성자 호출해야 이너클래스 객체를 만들 수 있다.
	 	
	 	System.out.println(cal.sum());
	}
}
