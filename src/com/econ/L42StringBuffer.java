package com.econ;

public class L42StringBuffer {
	public static void main(String[]args) {
		System.out.println("//////////////////////////StringBuffer////////////////////////////////");
		StringBuffer sb=new StringBuffer("�ȳ�");
		System.out.println("sb:"+sb);
		System.out.println(sb+"�ϼ���");
		//System.out.println(sb.concat("�ϼ���!"));
		String h="�ϼ���";
		System.out.println(sb.append(h));//���ڿ� �迭�� ���ۿ��� ���ϱ� �����Ѵ�. 
		System.out.println(sb);//���ڿ� �迭�� ���ۿ��� ���ϱ� �����Ѵ�. 

		System.out.println("//////////////////////////String////////////////////////////////");
		String s="�ȳ�";
		System.out.println(s+"�ϼ���");
		System.out.println(s.concat("�ϼ���!")); //���ڿ� ��ü 2���� ���ϱ� �����Ѵ�. 
		System.out.println(s); //���ڿ� ��ü 2���� ���ϱ� �����Ѵ�. 
		
		//StringBuffer�� equals ������ �Ǿ� �����ʴ�
		System.out.println(sb.equals(new StringBuffer("�ȳ��ϼ���")));
		//StringBuffer�� ���ڿ��� Ÿ������ �����ؼ� �񱳿����ؾ��Ѵ�.
		String sb_str=sb.toString();
		System.out.println(sb_str.equals("�ȳ��ϼ���"));
	}
}
