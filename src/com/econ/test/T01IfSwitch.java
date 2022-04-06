package com.econ.test;

public class T01IfSwitch {
	
	public static void main(String[]args) {
				
		
		long start,end;
		
		int score2=54;
		String grade2="";
		int score=54;
		String grade="";
		String A1 ="A+";
		String A ="A";
		String B ="B";
		String C ="C";
		String D ="D";
		String F ="F";
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		start=System.nanoTime();
		if(score>=95) {
			grade=A1;
		}else if(score>=90) {
			grade=A;
		}else if(score>=85) {
			grade=B+"+";
		}else if(score>=80) {
			grade=B;
		}else if(score>=75) {
			grade=C+"+";
		}else if(score>=70) {
			grade=C;
		}else if(score>=65) {
			grade=D+"+";
		}else if(score>=60) {
			grade=D;
		}else {
			grade=F;
		}
		System.out.println("당신의 성적은 "+grade+"입니다.");
		end=System.nanoTime();
		System.out.println("성적 if :"+(end-start));


		start=System.nanoTime();
		if(score>=95) {
			grade=A1;
		}else if(score>=90) {
			grade=A;
		}else if(score>=85) {
			grade=B+"+";
		}else if(score>=80) {
			grade=B;
		}else if(score>=75) {
			grade=C+"+";
		}else if(score>=70) {
			grade=C;
		}else if(score>=65) {
			grade=D+"+";
		}else if(score>=60) {
			grade=D;
		}else {
			grade=F;
		}
		System.out.println("당신의 성적은 "+grade+"입니다.");
		end=System.nanoTime();
		System.out.println("성적 if :"+(end-start));
		start=System.nanoTime();
		switch(score2/10) {
			case 10: grade2=A1; break;
			case 9: grade2=A; break;
			case 8: grade2=B; break;
			case 7: grade2=C; break;
			case 6: grade2=D; break;
			default: grade2=F; break;
		}
		if(score2%10>=5 && score2>=65) grade2=grade2+"+";
		System.out.println("당신의 성적은 "+grade2+"입니다.");
		end=System.nanoTime();
		System.out.println("성적 switch :"+(end-start));
	}
}
