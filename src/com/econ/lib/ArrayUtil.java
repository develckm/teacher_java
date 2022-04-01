package com.econ.lib;

public class ArrayUtil {
	public String toString( int [] arr,int start) {
		String msg="";
		if(start==0) {
			msg+="{"+arr[start]+","+this.toString(arr, start+1);
		}else if(start<arr.length-1) {
			msg+= arr[start]+","+this.toString(arr, start+1);
		}else  if(start==arr.length-1){
			msg+= arr[start]+"}";
		}
		return msg; 
	}
	public String toString( String [] arr,int start) {
		String msg=(start==0)?"{":"";
		if(start<arr.length-1) {
			msg+="\""+arr[start]+"\","+this.toString(arr, start+1);
		}else  if(start==arr.length-1){
			msg+="\""+arr[start]+"\"}";
		}
		return msg; 
	}
	public static void main(String[]args) {
		int [] nums= {10,20,30};
		ArrayUtil au=new ArrayUtil();
		System.out.println(au.toString(nums,0));
		String [] strs= {"a","b","c"};
		System.out.println(au.toString(strs,0));
	}
}
