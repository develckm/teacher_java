package com.econ.lib;

public class O{
	private int a=10;  //O 내부에서만 사용가능 
	protected int b=20; //O를 상속한 객체와 같은 패키지 내부에서 사용 가능
	int c=30;	//(default)같은 패키지 안에서 사용가능 
	public int d=40;	//어디서든 사용가능
	
	public O(int a){
		this.a=a;
	}
	public int getA() { //캡슐화된 a를 반환하는 함수 =>Bean
		return a;
	}
}
