package com.econ;

import java.util.Iterator;

public class L16MultiArray {
	public static void main(String[]args) {
		//String[][] multi=new String[4][3]; //���� ũ���� 2���� �迭 ���� 
		String[][] multi =new String[4][]; //2���� �迭�� �������̷� ���� (�����迭)
		multi[0]=new String[3];
		multi[1]=new String[1];
		multi[2]=new String[4];
		multi[3]=new String[5];
			
		String[][] multi_arr= {	
								{"����","����","����"},
								{"���","��","��","ü��"},
								{"�丶��","����","������ī"},
								{"����","��","��"}
							};
		//�ݺ��� > �ݺ��� ����ؼ� �迭�������� ����ϱ�
		System.out.println("{");
		for(int i=0; i<multi_arr.length; i++) {
			System.out.print("{");
			for(int j=0; j<multi_arr[i].length; j++) {
				System.out.print(multi_arr[i][j]+",");
			}
			System.out.print("}");
			System.out.print(",\n");// \\n�� ���ΰ����� Ư������
		}
		System.out.println("}");
		
		String [][] stars= {
				{"*"},
				{"*","*"},
				{"*","*","*"},
				{"*","*","*","*"},
				{"*","*","*","*","*"},
				{"*","*","*","*","*","*"}};
		System.out.println("�����!");
		System.out.println("�迭 ���� �����(�ﰢ�� ������� �ٲٱ�");
		for(int i=6; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		int[] nums= {-200,10,300,30,-5}; //���� ���� �غ�����!!	
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
		//300,  30,10,-5,-200,��
	}
}













