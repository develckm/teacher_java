package com.econ;
//����
//�����ڿ� ������ ���� �Է��ϰ�
//abstract calc()���� ���ϴ� ���·� ������ �����ϰ� 
//enter()�� ȣ���ϸ� �ֿܼ� sum�� ����� ��� 
abstract class Calculator{
	int a,b;
	public Calculator(int a,int b){
		this.a=a;
		this.b=b;
	}
	abstract int calc(); //������ ����� ��ȯ
	public void enter() {
		System.out.println("������ ����� "+this.calc()+"�Դϴ�.");
	}
}
public class L32AbstractClass3 {
	public static void main(String[]args) {
		//�߻�Ŭ������ ������ ���� ���� �ֱ� ������ ������ �ٵ� �ۼ��Ѵ�.
		Calculator cal=new Calculator(10,20) {
			public int calc() {
				return this.a*this.b;
			}
		};
		cal.enter();
		// a/b ����� ����ϼ���.
		//////////////////////////////
		Calculator cal2 =new Calculator(100,7) {
			int calc() {
				return this.a/this.b;
			}
		};
		cal2.enter();
		
	}
}
