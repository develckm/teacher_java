package com.econ.thread;

import java.util.Date;

public class L01Thread {
	//메소드 전체에 오류가 발생하면 예외처리하는 코드(오류가 발생하면 멈춘다) => try catch로 예외처리를 하는 것이 좋다.
	public static void main(String[]args) throws Exception {
		System.out.println("모든 프로세스는 순서대로 동작한다.");
		System.out.println("1프로세스에 기본 스레드가 1개 있기 때문이다.");
		boolean clock_b=true;
		while(clock_b) {
			Date d=new Date();
			String time=d.getHours()+":"+d.getMinutes()+":"+d.getSeconds(); //12:50:50
			System.out.println(time);
			Thread.sleep(1000);
		}
		//스레드를(실행을 [밀리초]잠시 멈춘다.)
		System.out.println("1000밀리초 뒤 실행");
		//무한 반복문이 1스레드를 독점하고 있어서 그 다음 코드가 실행되지 않는다. 
	}
}
