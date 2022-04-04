package com.econ;

import com.econ.lib.*;

public class L27Private {
	public static void main(String []args) {
		O o =new O(100);
		//System.out.println("o.a:"+o.a); //외부에서 참조 불가
		System.out.println(o.getA());
		//System.out.println(o.b); //protected 는 같은 패키지와 상속한 클래스에서 사용가능한 필드 
		//System.out.println(o.c); //(default)같은 패키지 내부에서만 사용 가능
		System.out.println(o.d); //public 어디서든 사용가능
		
		P p =new P(111);
		//System.out.println(p.a); //private
		//System.out.println(p.b); //protected
		//System.out.println(p.c); //default
		System.out.println(p.d); //public
		/*  멤버 변수의 접근지정자(캠슐화)
		 * 				class내부	같은패키지	다른패키지+상속	다른패키지
		 *	private			o			x			x				x
		 *  (default)		o			o			x				x
		 *  protected		o			o			o				x					
		 *  public			o			o			o				o
		 * */
	}
}
