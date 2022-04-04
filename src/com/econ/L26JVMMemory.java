package com.econ;

public class L26JVMMemory {	
	int a=10; //객체로 생성되었을 때만 객체의 필드로 저장 
	static final String RED_COLOR="#FF0000"; //	메소드 영역에 클래스 데이터로 저장
	public L26JVMMemory() {
		this.a=a;
	}
	//main() 은 실제로 구동하는 어플리케이션이다
	public static void main(String args) {
		int a=10;
		L26JVMMemory obj= new L26JVMMemory();
		System.out.println(10+20);
		//JVM 자바가상머신 
		//os가 관리하는 메모리를 접근 및 관리 (os 소통) 
		//메모리 영역을 3가지 나눈다 메소드, 스택, 힙 
		//스택 : 스택 메모리 구조를 갖고 main에서 실행할 변수와 메소드 연산을 스케줄링해서 참조
		//메소드 : 작성한 코드(타입)를 분석 저장하면서 static 으로 선언된 class 변수(상수)가 있으면 생성
		//힙 : 참형데이터(객체)를 저장하고 가비지컬랙션이 객체를 정리 
		
		//jvm은 컴파일된 class 파일을 os에서 해석할 수 있는 코드로 다시 컴파일 => 모든 어플에서 java로 작성한 어플이 동작
		//멀티쓰레드가 구현되도록 프로세스를 스케줄링한다.  (java는 멀티쓰레드 구현이 좋은 편)
	}
}
