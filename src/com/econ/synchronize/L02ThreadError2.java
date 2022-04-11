package com.econ.synchronize;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L02ThreadError2 {
	static String str="";
	static StringBuffer sb=new StringBuffer(""); 
	
	public static void main(String[] args) throws InterruptedException {
		Thread[] t_arr=new Thread[10000];
		for(int k=0; k<10000; k++) {
			Thread t=new Thread() {
				@Override
				public void run() {
					for(int i=0; i<100; i++) {
						str+="a";
						sb.append("a");
					}
				}
			};
			t.start();
			t_arr[k]=t;
		}
		for(Thread t:t_arr) {
			t.join();
		}
		System.out.println(str.length());
		System.out.println(sb.length());

	}
}
