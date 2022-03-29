package com.econ;

public class L10Char {
	public static void main(String[]args) {
		//아스키코드는 컴퓨터가 등장할 때 같이 등장한 문자(8bit)
	    //아스키코드 표는 0~127까지의 정수를 사용하면 참조할 수 있다.
		char c='A';
		//c="a";
		System.out.println((int)c);
		for(int i=0; i<=127; i++) {
			System.out.print(((char)i)+",");
		}
		System.out.println();
		//유니코드 문자표는 16bit 문자표로 한글이 포함되어 있다.
		//char 16bit 짜리 문자표를 참조하는 기본형이다. 
		char u=0x41; //유니코드표 참조 
		System.out.println("0x41="+u);
		System.out.println("0xAC00="+(char)0xAC00);
		u='\u0042';
		// \\u 를 사용하면 유니코드 문자가 출
		System.out.println("\u0042="+u);
		
		System.out.println('A'+'B'); //"AB"(x) 131(o)
		//char 연산을 하면 수로 바뀐다.
		
		
	}
}
