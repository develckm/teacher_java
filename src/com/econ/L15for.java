package com.econ;

import java.util.Scanner;

public class L15for {
	public static void main(String[]args) {
		String [] a= {"a","b","c","d"};
		String msg="";
		//반복문 for 작성법 (선언부; 조건부; 증감부){ 반복실행되는 코드 }
		for(int i=0;i<a.length;i++) {
			msg+=(i==a.length-1)? a[i] : a[i]+"," ;
		}
		System.out.println("a[]={"+msg+"}");
		
		int i=1; //숫자 1부터 10까의 합 == 55
		int sum=0;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println("1부터10까지의 합:"+sum);
		boolean system_on=false;
		do{
			System.out.println("범위 지정하면 합을 구해주는 프로그램입니다");
			System.out.print("시작점: ");
			Scanner sc=new Scanner(System.in);
			String start=sc.nextLine();
			System.out.print("끝점: ");
			sc=new Scanner(System.in);
			String end=sc.nextLine();
			int start_i=Integer.parseInt(start);
			int end_i=Integer.parseInt(end);
			int total=0;
			while(start_i<=end_i){
				total+=start_i;
				start_i++;
			}
			System.out.println("입력한 범위의 합은 :"+total);
			System.out.print("시스템 종료(y/n) :");
			sc=new Scanner(System.in);
			String exit=sc.nextLine();
			if(exit.equals("y")){
				system_on=false;
			}else if(exit.equals("n")){
				system_on=true;
			}
		}while(system_on);
		//do{}while(조건부); 조건에 맞지 않아도 무조건 최초 1회 실행
		int z=10;
		do {
			System.out.println(z);
			z++;
		}while(z<10);
		
	}
}
