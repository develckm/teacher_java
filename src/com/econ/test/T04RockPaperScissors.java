package com.econ.test;

import java.util.Random;
import java.util.Scanner;

public class T04RockPaperScissors {
	public static void main(String[] args) {
		String[] rps= {"����","����","��"};
		Scanner sc = new Scanner(System.in);
		System.out.print("����(0),����(1),��(2) :");
		String input=sc.nextLine();
		int parse_input=Integer.parseInt(input);
		//������ �̿��ؼ� ��ǻ�Ͱ� ���� ���� �� �߿� �Ѱ��� ����.
		int random=(int)(new Random().nextDouble()*3);
		
		System.out.println(rps[parse_input]+"vs"+rps[random] );
		int result=parse_input-random;
		if(result==1 || result==-2) {
			System.out.println("�¸�");			
		}else if(result==0) {
			System.out.println("����");			
		}else {
			System.out.println("����");
		}	
		// �¸�    
		// 0 2  
		// 1 0  
		// 2 1
		//  (a-b)==0 ��� 
		//  (a-b)==1 or -2 �̱�
		//  (a-b)==-1 or 2  ��
		
		
		
		
	
	}
}
