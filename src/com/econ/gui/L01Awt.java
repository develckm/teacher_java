package com.econ.gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//생성자를 구현하면 된다!
class WindowClose implements WindowListener{
	Frame f;
	public WindowClose(Frame f) {
		this.f=f;
	}
	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		this.f.dispose(); //closed가 호출된다.
		System.out.println("클로즈 버튼을 눌렀습니다.");
	}
	public void windowClosed(WindowEvent e) {
		System.out.println("창이 꺼졌습니다.");
		System.exit(0);//dispose()로 창이 꺼지면 jvm이 할일이 없어서 종료되지만 노파심에 한번더 종료
	}
	public void windowIconified(WindowEvent e) {}public void windowDeiconified(WindowEvent e) {}public void windowActivated(WindowEvent e) {}public void windowDeactivated(WindowEvent e) {}
}
public class L01Awt {
	public static void main(String[]args) {
		Frame f=new Frame("로그인");
		Panel p=new Panel();
		Label l=new Label();
		TextField tf=new TextField(10);
		l.setText("아이디");
		Button b= new Button("입력");
		p.add(l);
		p.add(tf);
		p.add(b);
		f.add(p);
		f.setSize(300, 400);
		f.setVisible(true);
		f.addWindowListener(new WindowClose(f));
	}
}
