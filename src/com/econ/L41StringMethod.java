package com.econ;

public class L41StringMethod {
	public static void main(String[]args) {
		String a="a";
		String b="a";
		String c=new String("a");
		System.out.println(a==b);	
		System.out.println(a==c);	
		//���ڿ��� ������ equals�� ���ؾ��Ѵ�.
		System.out.println(a.equals(c));
		//������ ��� �����ʹ� ���ڿ��� �Ǿ��ֱ� ������ ���ڿ� �ʵ尡 ������ϰ� ����.
		
		char[]c_arr= {'H','e','l','l','o','!',' ','M','y'};
		String str=new String(c_arr);
		System.out.println(str);
		System.out.println(str.charAt(2));
		//���ڿ��� �迭 �޼ҵ�� ������ ���� ����.
		System.out.println(str.contains("e"));
		System.out.println(str.contains("a"));
		String[]str_split=str.split("!");
		for(String s:str_split) {
			System.out.println(s);
		}
		String str2=str.concat(" friend");
		System.out.println(str2);
		
		String str_num="   155 ";
		int num=Integer.parseInt(str_num.trim());
		System.out.println(num+10);
		String str3=str2.replaceAll("friend", "enemy");
		System.out.println(str3);
		System.out.println(str3.replace('!', '?'));
		System.out.println(str3.startsWith("Hel"));
		System.out.println(str3.endsWith("my"));
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase());
		System.out.println(str3.length());
		String p=str3.substring(str3.indexOf('M'));
		System.out.println(p);
		String p2=str3.substring(str3.indexOf('M'),str3.indexOf('M')+2);
		System.out.println(p2);
		
		//////////////////////////////////////////
		String[]str_p=str3.split("");
		String str_join=String.join("-", str_p);
		System.out.println(str_join);
	
	}
}







