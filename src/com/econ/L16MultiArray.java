package com.econ;

import java.util.Iterator;

public class L16MultiArray {
	public static void main(String[]args) {
		//String[][] multi=new String[4][3]; //고정 크기의 2차원 배열 선언 
		String[][] multi =new String[4][]; //2차원 배열을 가변길이로 선언 (가변배열)
		multi[0]=new String[3];
		multi[1]=new String[1];
		multi[2]=new String[4];
		multi[3]=new String[5];
			
		String[][] multi_arr= {	
								{"고구마","감자","연근"},
								{"사과","배","감","체리"},
								{"토마토","고추","파프리카"},
								{"배추","무","파"}
							};
		//반복문 > 반복문 사용해서 배열형상으로 출력하기
		System.out.println("{");
		for(int i=0; i<multi_arr.length; i++) {
			System.out.print("{");
			for(int j=0; j<multi_arr[i].length; j++) {
				System.out.print(multi_arr[i][j]+",");
			}
			System.out.print("}");
			System.out.print(",\n");// \\n은 라인개행의 특수문자
		}
		System.out.println("}");
		
		String [][] stars= {
				{"*"},
				{"*","*"},
				{"*","*","*"},
				{"*","*","*","*"},
				{"*","*","*","*","*"},
				{"*","*","*","*","*","*"}};
		System.out.println("별찍기!");
		System.out.println("배열 없이 별찍기(삼각형 모양으로 바꾸기");
		for(int i=6; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		int[] nums= {-200,10,300,30,-5}; //버블 정렬 해보세요!!	
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i]<nums[i+1]) {
				int temp=nums[i];
				nums[i]=nums[i+1];
				nums[i+1]=temp;
			}
		}
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+",");
		}
		//10,300,30,-5,  -200,
		//10,300,30,  -5,-200,
		//300,30,  10,-5,-200,
		//300,  30,10,-5,-200,ß
	}
}













