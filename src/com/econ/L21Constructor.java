package com.econ;

class Flower{
	//자바스크립트 constructor(){}
	//필드 정의할때 undefined를 허용하지 않는다.
	int 수술=1;
	int 암술=1;
	int 꽃잎;
	//생성자를 선언하면 default 생성자가 사라지면서 생성자 규칙이 생긴다.
	Flower(int 꽃잎){
		//전역과 지역에 선언한 변수의 이름이 같을 때 지역이 우선이다.
		this.꽃잎=꽃잎;
	}
	Flower(int 꽃잎,int 암술,int 수술){//생성자를 오버로드
		this.꽃잎=꽃잎;
		this.암술=암술;
		this.수술=수술;
	}
	int sum() {
		return 10;
	}
}


public class L21Constructor {
	//생성자 
	public static void main(String[]args) {
		Flower 수선화 =new Flower(6);
		System.out.println(수선화.꽃잎);
		Flower 수선화2 = new Flower(6,8,1);
		//생성자는 new로만 호출할 수 있다.
	}
}
