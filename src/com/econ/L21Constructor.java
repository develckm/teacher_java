package com.econ;

class Flower{
	//�ڹٽ�ũ��Ʈ constructor(){}
	//�ʵ� �����Ҷ� undefined�� ������� �ʴ´�.
	int ����=1;
	int �ϼ�=1;
	int ����;
	//�����ڸ� �����ϸ� default �����ڰ� ������鼭 ������ ��Ģ�� �����.
	Flower(int ����){
		//������ ������ ������ ������ �̸��� ���� �� ������ �켱�̴�.
		this.����=����;
	}
	Flower(int ����,int �ϼ�,int ����){//�����ڸ� �����ε�
		this.����=����;
		this.�ϼ�=�ϼ�;
		this.����=����;
	}
	int sum() {
		return 10;
	}
}


public class L21Constructor {
	//������ 
	public static void main(String[]args) {
		Flower ����ȭ =new Flower(6);
		System.out.println(����ȭ.����);
		Flower ����ȭ2 = new Flower(6,8,1);
		//�����ڴ� new�θ� ȣ���� �� �ִ�.
	}
}
