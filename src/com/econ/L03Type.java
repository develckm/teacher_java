package com.econ;
//import java.util.*;  String,Integer,Byte,System......
class Obj{ //객체X==오브젝트x,객체의 설계도 -> data==객체 ???
	int i=10; //객체의 필드,속성,프로퍼티가 될 i를 선언 
	Obj(){} //생성자 (생략가능)
}
class Text{
	String s="문자열 필드 s";
}
//타입 class 이름의 규칙 
//1.낙타표기법 권장
//2.시작을 대문자 필수 (시작을 숫자 x, 특수문자 시작 x )
//3.영어+숫자 필수 ("_"외의 특수문자와 다른 언어 금지)
//4.실제 이름은 패키지 이름 포함 (com.econ.Obj : class 명의 중복을 방지하기 위해=>패키지 이름 포함해서 중복된 이름 금지)
//예) com.econ.String (△), java.util.String(x)

//new Obj() : 객체
//class Obj : 타입
//int i : 변수이자 객체의 필드
//Obj o : 변수 
/*class obj = 설명서 이름
 * int i=재료 x, 상세치수 
 * obj o = 만들기위한 도구 X, 객체에 지어지 이름 
 * new 연산자, Obj() 생성자  = 객체를 만드는 도구
 * new Obj()  = 실존하는 DATA,건출물
 * */
public class L03Type {
	public static void main(String []args) {
		//type==class 
		Obj o=new Obj(); //객체 생성 규칙 : new 연산자로 생성자를 호출
		System.out.println(o.i); //new Obj() 객체의 필드 i를 출력하세요!
		//System.out.println(Obj.i) //타입은 설계도지 계체가 아니다.
		//o=new Text(); //변수를 처음 선언한 때 타입과 동일한 객체만 참조 가능
		Text t=new Text(); //생성자 생략 가능
		t.s+="/ 문자열은 더하기 연산 가능";
		System.out.println(t.s);
	}
}
