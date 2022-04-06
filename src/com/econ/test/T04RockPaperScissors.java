package com.econ.test;

import java.util.Random;
import java.util.Scanner;

public class T04RockPaperScissors {
	public static void main(String[] args) {
		String[] rps= {"가위","바위","보"};
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0),바위(1),보(2) :");
		String input=sc.nextLine();
		int parse_input=Integer.parseInt(input);
		//랜덤을 이용해서 컴퓨터가 가위 바위 보 중에 한개를 낸다.
		int random=(int)(new Random().nextDouble()*3);
		
		System.out.println(rps[parse_input]+"vs"+rps[random] );
		int result=parse_input-random;
		if(result==1 || result==-2) {
			System.out.println("승리");			
		}else if(result==0) {
			System.out.println("비겼다");			
		}else {
			System.out.println("졌다");
		}	
		// 승리    
		// 0 2  
		// 1 0  
		// 2 1
		//  (a-b)==0 비김 
		//  (a-b)==1 or -2 이김
		//  (a-b)==-1 or 2  짐
		
		
		
		
	
	}
}
