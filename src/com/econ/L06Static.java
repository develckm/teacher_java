package com.econ;
//com.enon.WIDTH (X) 대명사가 빠진 이름은 존재하지 않는다.
//public static final double WIDTH= 250.01; 

class Car{ //com.econ.Car
	public static final double WIDTH= 250.01; 
	//상수는 보통 정보 전달 목적으로 자주 사용되기 때문에 static 필드에 선언되고 어디서든 공유가능하다는 의미로 public을 선언한다.	
	final double HEIGHT= 500.01;
	private static final String ENGEIGN="N013123G123"; //class 내부에서만 사용가
	
}

public class L06Static {
	public static void main(String[]args) {
		//static 필드와 인스턴스 객체와의 차이
		//static 필드는 class를 해석할때 객체로 만든다.
		//인스턴트 객체는 new 연산자로 생성자를 호출할 때 만들어진다.
		System.out.println(Car.WIDTH);
		System.out.println(Car.WIDTH);
		System.out.println(Car.WIDTH);

		System.out.println(new Car().HEIGHT);
		System.out.println(new Car().HEIGHT);
		System.out.println(new Car().HEIGHT);

		//static 필드는 new Car()의 객체가 아니나.
		//static 필드는 class 의 이름만 빌려온다. (정적 메모리라 부르는 곳에 저장됨, jre 즉 main과 기본데이터타입이 저장되는 메모리)
		//객체는 (동적 메모리 heap이라고 부르는 곳에 저장됨=>가비지컬렉션에 의해 메모리가 자동 정리되는 영역)
		
		//자바는 class 밖에서 할 수 있는 것이 아무 것도 없다.
		//System.out.println(new Car().ENGIGN);
		//System.out.println(Car.ENGEIGN);
	}
}
