package com.econ;

import com.econ.lib.*;

public class L27Private {
	public static void main(String []args) {
		O o =new O(100);
		//System.out.println("o.a:"+o.a); //�ܺο��� ���� �Ұ�
		System.out.println(o.getA());
		//System.out.println(o.b); //protected �� ���� ��Ű���� ����� Ŭ�������� ��밡���� �ʵ� 
		//System.out.println(o.c); //(default)���� ��Ű�� ���ο����� ��� ����
		System.out.println(o.d); //public ��𼭵� ��밡��
		
		P p =new P(111);
		//System.out.println(p.a); //private
		//System.out.println(p.b); //protected
		//System.out.println(p.c); //default
		System.out.println(p.d); //public
		/*  ��� ������ ����������(ķ��ȭ)
		 * 				class����	������Ű��	�ٸ���Ű��+���	�ٸ���Ű��
		 *	private			o			x			x				x
		 *  (default)		o			o			x				x
		 *  protected		o			o			o				x					
		 *  public			o			o			o				o
		 * */
	}
}
