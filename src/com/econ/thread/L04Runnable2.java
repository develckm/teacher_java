package com.econ.thread;

public class L04Runnable2 {
	public static void main(String[]args) {
		final int time=10;
		new Thread(new Runnable(){
			public void run() {
				//������ ȯ�濡�� ������ ����� �� ����. (�����)
				int t=time;
				while(t>=0) {
					System.out.println(t--);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		System.out.println("Ÿ�̸� ����!");
	}
}
