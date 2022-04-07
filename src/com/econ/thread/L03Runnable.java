package com.econ.thread;

import java.util.Date;

//�����带 �����ϴ� 2��° ���!
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
		//Thread ��ü�� start�� �����߱� ������ Runnable�� �̿��� �����Ѵٸ� 
		//�� Thread ��ü�� �Ű������� ����ؾ��Ѵ�. 
		new Thread(new DClock()).start();
		System.out.println("�ð� ����");
	}
}
