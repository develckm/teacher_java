package com.econ;

//�߻� Ŭ������ Clock�� �����.
//run���� �ٴ��� 1�ʿ� ��� ������ ���� ���ϰ�(����)
//start�� �����ϸ� �ð谡 �����δ�. 
abstract class Clock{
	int count=0;
	String name="�Ƴ��α� �ð�";
	abstract void run(int count);
	public void start() {
		System.out.println(name+" 1�ʿ� "+count+"�� �����δ�.");
	}
}
class AClock extends Clock{
	void run(int count) {
		this.count=count;
	}	
}

public class L31AbstractCalss2 {
	public static void main(String []args) {
		Clock c2=new Clock() { //�͸�Ŭ������ �����ȴ�,AClock�� ������ ������ Ŭ�������� �̸��� ���� ���´�.
			void run(int count) {
				this.count=count;
			}
		}; //�߻� Ŭ������ ��ü�� �����Ϸ��� �� �ٵ� �������Ѵ�. 
		c2.run(2);
		c2.start();

		Clock c=new AClock();
		c.run(1);
		c.start();
	}
}





