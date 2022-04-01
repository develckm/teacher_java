package com.econ;

public class L22RecursiveFunc {
	public static int arraySum(int[]nums, int i) {
		int total=0;
		if(i<nums.length-1) {
			total=L22RecursiveFunc.arraySum(nums,i+1);
			System.out.println("total:"+total);
		}
		return total+nums[i];
	}
	public static String ArrayToString(int[] arr) {
		return "";
	}
	public static void main(String [] args) {
		int [] nums= {1,2,3}; //총합을 재귀함수로 구하세요.
		int total=arraySum(nums ,0);
		System.out.println("total="+total);
		//정수의 배열을 출력할 수 있는 문자열을 반환하는 재귀함수를 만드세요	
		String msg="{";
		for(int i=0; i<nums.length; i++) {
			msg+=nums[i];
			if(i!=nums.length-1)msg+=",";
		}
		msg+="}";
		System.out.println(msg);
		String msg2=ArrayToString(nums);		
	}
}
