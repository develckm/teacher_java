package com.econ;

public class L08Float {//float: 둥둥 떠있는 실수 , double : float의 두
	public static void main(String[]args) {
		float f=123456789012345678901234567789012345678.0f; //float는 무조건 f를 붙인다.
		System.out.println(f);
		//123456789012345678901234567789012345678.0f => 1.2345679E38
		//1. float가 지수부와 가수를 나눠서 저장하기 때문에 부동소수점 형태로 변형
		//2. 가수부로 표현할 수 있는 길이가 23bit로 int보다 작기 때문에 나머지는 표현하지 못한다.
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);

		System.out.println(Float.MAX_EXPONENT);
		System.out.println(Float.MIN_EXPONENT);
		System.out.println(1.1*1.1); //1.21=>1.2100000000000002
		//실수의 저장방식과 연산이 정확도를 떨어뜨린다. 지수부의 최대 크기가 127이지만 38만 사용한다.
		//float 보다 큰수는 double 뿐이다.
		f=12345678912345689l; //long은 형변환이 필요없다.
		System.out.println("12345678912345689l=>"+f);
		f=(float)123456789.0e200; //double을 float로 형변
		System.out.println(f);
		//실수부터 Infinity로 형변환한다.(정수는 Infinity가 없다)
		System.out.println(Float.isInfinite(f));//무한대 검사하는 함수
		
		double d = 123.1; //그냥 소수를 작성하면 더블 타입이 된다.
		d=10/0.0; //0에 가까운 수를 나누면 무한대다.
		System.out.println(d);
		d=10%0.0; //=???NaN 0과 가까운 수를 나눈 나머지는 알수 없다.
		System.out.println(d);
		System.out.println(Double.isNaN(d));

		d=10/0; //java에서 0을 나누면 오류다

		
		
	}
}





