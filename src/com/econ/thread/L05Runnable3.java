package com.econ.thread;

import java.awt.GridLayout;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class L05Runnable3 {
	public static void main(String[]args) {
		JFrame f= new JFrame("디지털시계");
		JPanel p=new JPanel();
		JLabel l=new JLabel();
		p.add(l);
		f.add(p);
		boolean clock_b=true;
		new Thread(new Runnable() {
			public void run() {		
				while(clock_b) {
					Date d=new Date();
					l.setText(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		//runnable로 스레드 생성후 가위바위보 게임이 화면에 뜨도록 하세요.
		JPanel p2=new JPanel();
		JLabel l2=new JLabel("가위 바위 보 게임");
		p2.add(l2);
		f.add(p2);
		f.setLayout(new GridLayout(2,1));
		f.setBounds(500, 100, 300, 300);
		f.setVisible(true);
	}
}
