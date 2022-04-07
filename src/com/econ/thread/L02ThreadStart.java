package com.econ.thread;

import java.util.Date;

//Thread�� �����̱� ������ �⺻ �б����� java.lang�� �ִ�. 
class DigiClock extends Thread{
	//run�� ������ thread�� ����  
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
		System.out.println("�����尡 2���� �������ص� ���� ����ȴ�.");
	}
}
