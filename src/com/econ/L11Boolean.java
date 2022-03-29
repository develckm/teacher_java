package com.econ;

public class L11Boolean {
	public static void main(String[]args) {
		boolean b=true;//(0과 1로만 이루어진 1bit 데이터지만 1byte 크기의 메모리를 참조한다.=>자바가 사용하는 최소단위의 메모리크기 1byte)
		//b=1;
		//b=0;
		//b=null;
		b=(1<0);
		//비교연산의 결과로 boolean을 반환한다.
		System.out.println(b);
		int age=37;
		String msg="";
		if(age>35) {
			msg="아저씨";
		}else{
			msg="총각";
		}
		System.out.println(msg);
		
		msg=(age>35)?"A":"C";
		System.out.println(msg);
		
		//b=(boolean)1;
		//b=(boolean)0;
		String test;
		//System.out.println(test); //오류
		//if(test!=undefined){}
		test=null; //js null은 기본데이터 타입이었지만 java에서는 비어있다는 의미 그 이상이 아니다.
		System.out.println(test);
		 if(test==null) {
			 System.out.println("test는 null입니다.");
		 }
		 //if(null) if(undefined) if(0) if("") if(NaN) (x)
		 //if(10%0.0==NaN)
		 System.out.println(Float.isNaN(10%0.0f));
		 if(Float.isNaN(10%0.0f)) {
			 System.out.println("0과 가까운 수를 나눈 나머지는 수가 아닙니다.");
		 }
		 int pars_i=Integer.parseInt("10");
		 System.out.println(pars_i+11);
		 System.out.println(Integer.parseInt("t")); //NaN type도 존재하지 않는다.
	}
}






