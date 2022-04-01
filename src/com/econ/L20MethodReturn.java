package com.econ;
//class Calc{} //com.econ.Calc 중복될 수 없다. 
public class L20MethodReturn {
	//함수의 리턴과 종료
	int b=20; //b는 L20MethodReturn가 객체가 되었을 때 필드로 정의 필드 접근자 (this)로 접근
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
