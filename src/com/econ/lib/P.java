package com.econ.lib;

public class P extends O{ 
	//�θ� ������ ��Ģ�� �ִٸ� ������Ѵ�. 
	public P(int a) {
		//this.a=a;
		super(a);
		//System.out.println("private a:"+this.a);
		System.out.println("protected b:"+this.b);
		System.out.println("default c:"+this.c);
		System.out.println("public d:"+this.d);
		System.out.println("public getA():"+this.getA());
	}
	
}