package com.econ;
//class Calc{} //com.econ.Calc �ߺ��� �� ����. 
public class L20MethodReturn {
	//�Լ��� ���ϰ� ����
	int b=20; //b�� L20MethodReturn�� ��ü�� �Ǿ��� �� �ʵ�� ���� �ʵ� ������ (this)�� ����
	static int a=10;
	L20MethodReturn(int para_b){
		this.b=para_b;
	}
	static String concat(char a,char b) {
		//a+b= ('a'+'b')=>"ab"(x),195(0)
		String str="";		
		if(a==' ') {
			str=a+""+b;
			return str;
		}
		str="a+b:\""+str+"\"";
		return str;
	}
	public static void main(String[]args) {
		System.out.println(L20MethodReturn.concat(' ','d'));
		Integer.parseInt("10");
		
	}
}
