package com.econ.lib;

public class O{
	private int a=10;  //O ���ο����� ��밡�� 
	protected int b=20; //O�� ����� ��ü�� ���� ��Ű�� ���ο��� ��� ����
	int c=30;	//(default)���� ��Ű�� �ȿ��� ��밡�� 
	public int d=40;	//��𼭵� ��밡��
	
	public O(int a){
		this.a=a;
	}
	public int getA() { //ĸ��ȭ�� a�� ��ȯ�ϴ� �Լ� =>Bean
		return a;
	}
}
