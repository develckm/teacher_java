package com.econ.innerclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Timer extends JFrame{
	JFrame f=this;
	AtomicInteger i=new AtomicInteger(10);
	JButton startBtn=new JButton("시작");
	JButton endBtn=new JButton("멈춤");
	JLabel screen=new JLabel(i.get()+" 초");
	JPanel btnP=new JPanel();
	JPanel screenP=new JPanel();
	boolean time_b=true;
	Thread timeThread;
	
	public Timer() {
		screenP.add(screen);
		startBtn.addActionListener(new StartBtnHandler());
		//ActionListener 인터페이스=>추상메소드(구현이되어있지않다.바디가없다)
		//이때 innerClass로 익명클래스가 만들어진다. 
		endBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				time_b=false;
				timeThread.stop();
				timeThread=null;
			}
		});//익명 클래스로 구현하세요!11시까지 쉬었다가 오셔요 
		
		btnP.add(startBtn);
		btnP.add(endBtn);
		this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		this.add(screenP);
		this.add(btnP);
		this.setBounds(0,0,300,300);
		this.setVisible(true);
	}
	class StartBtnHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
				//Timer$StartBtnHandler$1.class
				//익명클래스 : 추상클래스 등을 그대로 구현했을 때 만들어지는 클래스로 1부터 이름을 만든다.
			time_b=true;
			if(timeThread !=null) return; //함수가 종료된다.
			timeThread=new Thread(){
					//강제로 thread를 멈추는방법 
					//1.강제로 InterruptedException을 발생시켜서 종료
					//2.stop() 으로 멈추면된다. 
					public void run() {
					
					while( i.get()>0 &&time_b) {
						try {Thread.sleep(1000);} catch (InterruptedException e1) {e1.printStackTrace();}
						i.decrementAndGet();
						screen.setText(i.get()+" 초");
						screen.validate();
						
					}
				}
			};
			timeThread.start();
		}
	}
}
public class L05AnonymousClass {
	public static void main(String[]args) {
		new Timer();
	}
}
