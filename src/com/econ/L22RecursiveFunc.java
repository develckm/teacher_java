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
		int [] nums= {1,2,3}; //������ ����Լ��� ���ϼ���.
		int total=arraySum(nums ,0);
		System.out.println("total="+total);
		//������ �迭�� ����� �� �ִ� ���ڿ��� ��ȯ�ϴ� ����Լ��� ���弼��	
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
