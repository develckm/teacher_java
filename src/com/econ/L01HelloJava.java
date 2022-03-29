package com.econ;
//package 를 작성하면 java 문서를 컴파일 할 때 bin폴더 하위에 동일한 위치에 class를 생성 => 컴파일된 class가 배포된다.
//장점1 : 컴파일 시 오류를 잡기 때문에 오류없는 어플을 배포
//장점2 : 컴파일된 문서는 컴퓨터가 해석하기 쉬운 언어기(바이너리코드) 때문에 실행이 빠르다.
//장점3 : 실제 소스코드가 배포되지 않기 때문에 보안이 강하다.
//단점  : 매번 컴파일을 하고 배포해야하기 때문에 개발 속도가 조금 느리다. 

//public class : 배포되는 class 문서를 발행한다는 의미 (java 문서와 동일한 이름을 사용해야한다)
public class L01HelloJava {
	//main() 약속된 함수 => public static void main (String[]args) ->규칙 => 다른 main 함수 작성 금지
	//main은 jre(Java Runtime Environment)->JAVA를 실행하는 가상머신 ->java로 작성된 코드를 실행시키는 어플
	//JDK(Java Development kit) : jre를 포함하는 개발자 도구 (jre의 라이브러리 명세서가 포함된 도구)
	public static void main(String[] args) {
		System.out.println("안녕 자바!"); //console.log(문자열)와 동일한 기능
		//주석 프로그램에 영향을 끼치지 않는 소스 코드에 대한 설명
		//java는 OS의 자원(System)을 사용할수 있는 가상 머신 (OS 위에서 동작한다)
		
	}

}
