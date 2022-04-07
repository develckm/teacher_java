package com.econ.thread;

import java.util.Date;

//Thread는 실행이기 때문에 기본 패기지인 java.lang에 있다. 
class DigiClock extends Thread{
	//run에 독점할 thread를 구현  
	@Override
	public void run() {
		while(true) {
			Date d=new Date();
			String time=d.getHours()+":"+d.getMinutes()+":"+d.getSeconds();
			System.out.println(time);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class L02ThreadStart {
	public static void main(String[] args) {
		new DigiClock().start();
		System.out.println("쓰레드가 2개면 독점당해도 나도 실행된다.");
	}
}
