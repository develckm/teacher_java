package com.econ.test;

public class T03StringBuffer {
	public static void main(String[]args) {
		
		long start=System.nanoTime();
		String msg="";
		for(int i=0; i<100000; i++) {
			msg+=i;
		}
		long end=System.nanoTime();
		//System.out.println(msg);
		System.out.println("string+(100000)"+(end-start));
		
		start=System.nanoTime();
		StringBuffer sb=new StringBuffer("");
		for(int i=0; i<1000000; i++) {
			sb.append(i);
		}
		end=System.nanoTime();
		//System.out.println(sb);
		System.out.println("string+(100000)"+(end-start));
		//�ڹ��� ���ڿ��� �⺻���ΰ���??
		//=>�������Դϴ�. 
		//1.�ε����� �ִ� �迭�̱� �����̰� ���ڿ��� �����ϴ� �ʵ尡 �����ϱ� �����Դϴ�.
		//2.�׸��� StringBuffer��� ���ڿ��� ���ϱ� ������ ȿ�������� ���ִ� Ÿ�Ե� �����մϴ�. 
		//�ڹ��� ���ڿ��� ���ϱ� ������ �ϴ� �� ���� ���� ���� �ֳ���?
		
	}	
}
