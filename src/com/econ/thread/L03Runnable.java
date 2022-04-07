package com.econ.thread;

import java.util.Date;

//스레드를 구현하는 2번째 방법!
class DClock implements Runnable{
	public void run() {
		for(;;) {
			Date d=new Date();
			String time=d.getHours()+"_"+d.getMinutes()+"_"+d.getSeconds();
			System.out.println(time);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}
public class L03Runnable {
	public static void main(String[]args) {
		//Thread 객체가 start를 구현했기 때문에 Runnable을 이용해 구현한다면 
		//꼭 Thread 객체의 매개변수로 사용해야한다. 
		new Thread(new DClock()).start();
		System.out.println("시계 시작");
	}
}
