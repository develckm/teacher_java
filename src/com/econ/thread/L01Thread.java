package com.econ.thread;

import java.util.Date;

public class L01Thread {
	//�޼ҵ� ��ü�� ������ �߻��ϸ� ����ó���ϴ� �ڵ�(������ �߻��ϸ� �����) => try catch�� ����ó���� �ϴ� ���� ����.
	public static void main(String[]args) throws Exception {
		System.out.println("��� ���μ����� ������� �����Ѵ�.");
		System.out.println("1���μ����� �⺻ �����尡 1�� �ֱ� �����̴�.");
		boolean clock_b=true;
		while(clock_b) {
			Date d=new Date();
			String time=d.getHours()+":"+d.getMinutes()+":"+d.getSeconds(); //12:50:50
			System.out.println(time);
			Thread.sleep(1000);
		}
		//�����带(������ [�и���]��� �����.)
		System.out.println("1000�и��� �� ����");
		//���� �ݺ����� 1�����带 �����ϰ� �־ �� ���� �ڵ尡 ������� �ʴ´�. 
	}
}
