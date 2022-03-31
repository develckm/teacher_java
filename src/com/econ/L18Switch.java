package com.econ;
import com.econ.lib.StringParseInt;
import java.util.Scanner;

class GradeApp{ //getter setter or Bean
	private int score;
	private String grade;
	//�����ε� : �̸��� �Ȱ����� �Ű������� �޶� �ٸ��� ȣ��Ǵ� �Լ��� �����ڸ� �ǹ� =>������(������ �����ϰ� �ϴ�)
	//�ڹٽ�ũ��Ʈ�� �����ε尡 �Ұ����̴�. (default ���� ��ü�Ѵ�.) : constructor(sore=10) {}  
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
		//score%10 �� ������ �̿��� +��������
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
		System.out.println("����� ������ "+grade);
		System.out.println("���� �Է� ���α׷��Դϴ�.");
		System.out.println("���� �Է�:");
		////////////
//		Scanner sc=new Scanner(System.in);
//		String str_score=sc.nextLine();
//		int score2=Integer.parseInt(str_score);
//		GradeApp gradeApp=new GradeApp(score2);
//		System.out.println("����� ������ "+gradeApp.getGrade()+" �Դϴ�.");
		////////////
		
		//GradeApp.setScore()�� �����ؼ� ����ϼ���! (�����ڿ� ���� ����ϴ�) 
		int count=7;
		int[] score_arr=new int[count]; //7�� ������ �Է� ���� �� grade_arr �� �ϼ��ϼ��� grade_arr �� ����ϼ���!
		String[] grade_arr=new String[count];
		System.out.println("7���� ������ ����ϴ� ���α׷��Դϴ�.(����,����,����,��ȸ,����,�̼�,����) ������ �Է��ϼ���.");
		GradeApp ga=new GradeApp();
		int i=0;
		do {
			System.out.print("����:");
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
				System.out.println("�Է��Ͻ� ������ �³���?(y/n)");
				sc= new Scanner(System.in);
				String msg=sc.nextLine();
				if(msg.equals("n")) {
					i=0;
				}else if(msg.equals("y")) {
					System.out.println("�Է��Ͻ� ������ ����Դϴ�.");
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


