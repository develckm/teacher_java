package com.econ;
import com.econ.lib.StringParseInt;
import java.util.Scanner;

class GradeApp{ //getter setter or Bean
	private int score;
	private String grade;
	//오버로드 : 이름은 똑같은데 매개변수가 달라서 다르게 호출되는 함수나 생성자를 의미 =>다형성(개발을 용이하게 하는)
	//자바스크립트는 오버로드가 불가능이다. (default 값이 대체한다.) : constructor(sore=10) {}  
	public GradeApp(){}
	public GradeApp(int score){
		this.score=score;
		this.setGrade();
	}
	public void setScore(int score) {
		this.score=score;
		this.setGrade();
	}
	private void setGrade() {
		switch(this.score/10) { //88=>8
			case 10: 
				this.grade="A+";
				break;
			case 9:
				this.grade="A";
				break;
			case 8:
				this.grade="B";
				break;
			case 7:
				this.grade="C";
				break;
			case 6:
				this.grade="D";
				break;	
			default:
				this.grade="F";
				break;
		}
		//88%10 =>  8 >=5
		if(score%10>=5) {	grade="+"+grade;	}
		//score%10 의 조건을 이용해 +만들어보세요
 	}
	
	public int getScore() {
		return this.score;
	}
	public String getGrade() {
		return this.grade;
	}
}

public class L18Switch {
	public static void main(String[]args) {
		int score=88;
		String grade="F";
		if(score>=90 && score<=100) {
			grade="A";
		}else if(score>=80 && score<=90) {
			grade="B";
		}else if(score>=70 && score<=80) {
			grade="C";
		}else if(score>=60 && score<=70) {
			grade="D";
		}else {
			grade="F";
		}
		System.out.println("당신의 성적은 "+grade);
		System.out.println("성적 입력 프로그램입니다.");
		System.out.println("점수 입력:");
		////////////
//		Scanner sc=new Scanner(System.in);
//		String str_score=sc.nextLine();
//		int score2=Integer.parseInt(str_score);
//		GradeApp gradeApp=new GradeApp(score2);
//		System.out.println("당신의 성적은 "+gradeApp.getGrade()+" 입니다.");
		////////////
		
		//GradeApp.setScore()를 구현해서 사용하세요! (생성자와 거의 비슷하다) 
		int count=7;
		int[] score_arr=new int[count]; //7번 성적을 입력 받으 후 grade_arr 를 완성하세고 grade_arr 를 출력하세요!
		String[] grade_arr=new String[count];
		System.out.println("7개의 성적을 계산하는 프로그램입니다.(국어,영어,수학,사회,음악,미술,역사) 순으로 입력하세요.");
		GradeApp ga=new GradeApp();
		int i=0;
		do {
			System.out.print("성적:");
			Scanner sc= new Scanner(System.in);
			String str_str=sc.nextLine();
			StringParseInt spi=new StringParseInt(str_str);
			score_arr[i]=Integer.parseInt(spi.forceParseInt());
			ga.setScore(score_arr[i]);
			grade_arr[i]=ga.getGrade();
			i++;		
			if(i==count) {
				for(i=0; i<score_arr.length; i++) {
					System.out.print(score_arr[i]+",");
				}
				System.out.println("입력하신 성적이 맞나요?(y/n)");
				sc= new Scanner(System.in);
				String msg=sc.nextLine();
				if(msg.equals("n")) {
					i=0;
				}else if(msg.equals("y")) {
					System.out.println("입력하신 성적의 등급입니다.");
					System.out.print("{");
					for(int j=0; j<grade_arr.length; j++) {
						System.out.print(grade_arr[j]+",");
					}
					System.out.println("}");
				}
			}
		}while(i<count);
	}
}


