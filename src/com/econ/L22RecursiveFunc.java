package com.econ;

import com.econ.lib.ArrayUtil;

public class L22RecursiveFunc {
	public static int arraySum(int[]nums, int i) {
		int total=0;
		if(i<nums.length-1) {
			total=L22RecursiveFunc.arraySum(nums,i+1);
			System.out.println("total:"+total);
		}
		return total+nums[i];
	}
	/**
	 * 배열을 출력할 수 있는 문자열로 반환하는 함수 
	 *(int[]arr,int length)  
	 *arr: 출력할 배열
	 *length : 0부터 출력할 길이
	 * */
	public static String arrayToString(int[] arr,int start) { //0 , 1 ,2, 3
		String msg="";
		if(start<arr.length) {
			msg+=arr[start]+","+ L22RecursiveFunc.arrayToString(arr, start+1);			
		}
		return msg;
	}
	public static int searchMax(int[] arr,int start) { //재귀함수로 최대값 찾 함수
		int max=arr[0];
		return max;
	}
	//재귀함수로 선택정렬 
	
	
	public static void main(String [] args) {
		int [] nums= {1,112,33,-34,15,66}; //총합을 재귀함수로 구하세요.
		int total=arraySum(nums ,0);
		System.out.println("total="+total);
		//정수의 배열을 출력할 수 있는 문자열을 반환하는 재귀함수를 만드세요	
		System.out.println(new ArrayUtil().toString(nums,0));
		String msg2=arrayToString(nums,0);
		System.out.println("nums="+msg2);
	}
}
