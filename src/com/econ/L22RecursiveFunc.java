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
	 * �迭�� ����� �� �ִ� ���ڿ��� ��ȯ�ϴ� �Լ� 
	 *(int[]arr,int length)  
	 *arr: ����� �迭
	 *length : 0���� ����� ����
	 * */
	public static String arrayToString(int[] arr,int start) { //0 , 1 ,2, 3
		String msg="";
		if(start<arr.length) {
			msg+=arr[start]+","+ L22RecursiveFunc.arrayToString(arr, start+1);			
		}
		return msg;
	}
	public static int searchMax(int[] arr,int start) { //����Լ��� �ִ밪 ã �Լ�
		int max=arr[0];
		return max;
	}
	//����Լ��� �������� 
	
	
	public static void main(String [] args) {
		int [] nums= {1,112,33,-34,15,66}; //������ ����Լ��� ���ϼ���.
		int total=arraySum(nums ,0);
		System.out.println("total="+total);
		//������ �迭�� ����� �� �ִ� ���ڿ��� ��ȯ�ϴ� ����Լ��� ���弼��	
		System.out.println(new ArrayUtil().toString(nums,0));
		String msg2=arrayToString(nums,0);
		System.out.println("nums="+msg2);
	}
}
