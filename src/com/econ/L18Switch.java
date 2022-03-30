package com.econ;

import java.util.Scanner;

class GradeApp{ //getter setter or Bean
	private int score;
	private String grade;
	public GradeApp(int score){
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
		Scanner sc=new Scanner(System.in);
		String str_score=sc.nextLine();
		int score2=Integer.parseInt(str_score);
		GradeApp gradeApp=new GradeApp(score2);
		System.out.println("당신의 성적은 "+gradeApp.getGrade()+" 입니다.");
		////////////
		
//		 gradeApp=new GradeApp(77);
//		 gradeApp=new GradeApp(99);
//		 gradeApp=new GradeApp(59); 
//		gradeApp.setScore(77);
//		gradeApp.setScore(99);
//		gradeApp.setScore(59);

		//GradeApp.setScore()를 구현해서 사용하세요! (생성자와 거의 비슷하다) 
		int[] score_arr=new int[7]; //7번 성적을 입력 받으 후 grade_arr 를 완성하세고 grade_arr 를 출력하세요!
		String[] grade_arr=new String[7];
	}
}




