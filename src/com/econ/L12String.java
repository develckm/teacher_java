package com.econ;

public class L12String {
	public static void main(String[]args) {
		String s="text";
		System.out.println("s:"+s);
		System.out.println('t'+""+'e'+""+'x'+""+'t'); //??
		System.out.println("a"+"b"); //문자열은 더하기 연산을 할 수 있다.
		System.out.println("a".concat("b")); //concat(문자열) 문자열을 더하는 연산 
		//const c_arr=['t','e','x','t'];
		//배열 선언 
		char [] c_arr= {'t','e','x','t'}; // "text"와 가장 비슷한 형태
		//String t=c_arr[0]+""+c_arr[1]+""+c_arr[2]+""+c_arr[3]+"";
		String t="";
		System.out.println(c_arr.length);
		//for로 t를 "text" 완성하세요.
		for(int i=0; i<c_arr.length; i++) {
			t+=c_arr[i];
		}
		System.out.println("t:"+t);
		String t2=new String(c_arr); 
		System.out.println("t2:"+t2);
		
		String t3="ABCDEFGHIGKLMNOPQRS"; //=>문자의 집합으로 바꾸세요.['A','B','C'....]
		char[] t3_arr= new char[t3.length()]; //자바의 배열은 꼭 길이를 명시해야한다.		
		for(int i=0; i<t3.length(); i++) {
			t3_arr[i]=t3.charAt(i);
		}
		for(int i=0; i<t3_arr.length; i++) {
			System.out.print(t3_arr[i]+",");
		}
		System.out.println("");
		
		char[] t3_arr2= {}; //자바스크립트의 Array는 고정길이다.
		t3_arr2[0]='A';
		
		//자바의 기본형 byte short int long float double char(2byte) boolean 
		//기본형 외의 모든 data는 참조형이다.		
		//문자열은 왜 참조형일까?? 
		//1.문자열은 인덱스를 참조하는 배열이기 때문
		//2.자바스크립트는 문자열도 기본형인데?? 왜 자바의 문자열은 참조형이죠?? 
		//=>자바스크립트의 문자열은 순서대로 문자를 참조하는 인덱스와 길이만 참조하고 정적 메모리에서 관리하기 때문에 기본형처럼 사용하는 것이지 
		//=>인덱스를 참조한다는 관점에서는 자바스크립트의 문자열도 참조형이다. 
		//=>자바의 문자열은 문자열 객체를 참조하고 있어 유용한 필드가 함께 존재하기 때문에 자바의 문자열은 절대 기본형이 될 수 없다.
		
		//문자열 배열은 저장하는 방식(순서가 있고 길이가 있다.)이 같다.
		//저장하는 방식은 같지만 필드 즉 타입이 다르다.
		//자바스크립트의 문자열과 자바의 문자열의 저장하는 방식은 같다.
		//자바스크립트는 문자열에 인덱스와 길이만 저장하고 자바에는 인덱스와 길이 그리고 유용한 필드를 같이 생성한다.
		//let a=new String("안녕"); //참조형 
		//let a="안녕";	//기본형
		
		String a="안녕"; //참조형 
		String a2=new String("안녕");//참조형
		/*
		 * 문자열은 배열과 동일한 저장방식/
			자바스크립트는 기본형과 참조형/
			자바는 참조형/
			
			그이유는 
			자바는 문자열 객체를 참조하는 오브젝트로구성/
			
			자바스크립트의 경우 참조형은 자바와 동일하나/
			
			기본형의경우는 순서와길이,인덱스등만 참조하여 리터럴화해서 사용하게되어있는형태구성 
			프론트엔드개발환경에서 효율적인 메모리 사용이 장점
		 * */
		
	}
}
