package com.econ;

public class L09OperatorMath {
	public static void main(String[] args) {
		//수학 연산자 (우선순위가 가장높은 순서)
		//(증감)++,-- 
		//(부호)+,- 
		//(산술)*,/,%
		//(산술)+,-  
		//(비교) >,< ,>=,<=
		//(동등) ==,!=  //객체를 비교할때는 완전동등비교연산(주소)
		int i=20;
		System.out.println(++i*10);//201 ? 210
		System.out.println(i); //++i ==>i=i+1;
		System.out.println(-i);
		System.out.println(i-40.5); 
		
		//i-=10.6; //10.8  //대입연산을 사용하면 자동 형변환이 된다.
		i=(int)(i-10.6); 
		System.out.println(i); //실수를 정수로 형변환하면 소수점 버림이된다. 10.6->10, -0.7=>0
		i=(int)-0.7;
		System.out.println(i);
		
		System.out.println(i>0);
		System.out.println(i>=0);
		//동등비교는 주소를 비교하는 연산이지만 
		//산술 동등 비교(기본데이터 타입 수 비교)는 값을 비교한다.(캐스팅으로 형변환 후 비교)
		//(랩)객체와 기본데이터타입 수를 비교하면 객체를 캐스팅 형변환 한다.
		int z_i=0;
		double z_d=0.0;
		float z_f=0.0f;
		long z_l=0l;
		
		System.out.println(i==(int)z_d);
		System.out.println(i==z_f);
		System.out.println(i==z_l);
		System.out.println(i==(short)0);
		System.out.println(i==(byte)0);
		
		Integer obj_i1=new Integer(0);
		Integer obj_i2=new Integer(0);
		System.out.println(obj_i1==obj_i2);
		System.out.println(obj_i1==z_i);
		//랩퍼클래스는 캐스팅 형변환이 가능
		System.out.println((int)obj_i1==z_i);
		System.out.println(new Integer(0)==0);
		
		//System.out.println("10"==10);

	}
}






