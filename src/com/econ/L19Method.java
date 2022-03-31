package com.econ;
class Calc{
	int a=0;
	int b=0;
	public Calc(){}
	public Calc(int a,int b){
		this.a=a;
		this.b=b;
	}
	public void sum() { //필드 a,b 2개를 연산 콘솔에 출력 		
		System.out.println("a+b="+(a+b));
	}
	public int sum(int a,int b) {
		return a+b;
	}
	public int sum(String a, String b) {
		return Integer.parseInt(a)+Integer.parseInt(b);
	}
	public int sum(int [] nums) {
		int sum=0;
		for(int i=0; i<nums.length; i++) {
			sum+=nums[i];
		}
		return sum;
	}
	// 매개변수의 개수와 타입으로만 오버로드 가능  
	//public int sum() {return a+b;}
}
public class L19Method {
	public static void main(String[]args) { //argr 어플리케이션 실행시 초기값
		Calc calc=new Calc();
		calc.a=10;
		calc.b=20;
		calc.sum();
		Calc calc2=new Calc(100,200);
		calc2.sum();
		Calc calc3=new Calc();
		System.out.println(calc3.sum(50, 60));
		System.out.println(calc.sum("10","120"));
		int[] nums= {11,12,13,14,15,16,17};
		System.out.println(calc.sum(nums));
	}
}
