package com.econ.exception;

public class L02TryCatch2 {
	
	public static void main(String[]args) {
		int[] arr= {1,2,3};
		try {
			System.out.println(arr[3]/0);			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}catch (ArithmeticException e) {
			System.out.println(e.toString());
		}
		//1���� Ĺġ�� ������ ������ try ���� ������.
		
		System.out.println("���� ó�� �Ϸ�!!");
	}
	
}
