package com.econ.gui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class SignInFrame extends JFrame{
	JFrame f=this;
	JPanel p=new JPanel();
	JLabel l=new JLabel("ID");
	JTextField tf=new JTextField("",10);
	JButton b=new JButton("제출");
	public SignInFrame(String title) {
		super(title);
		p.add(l);
		p.add(tf);
		p.add(b);
		f.add(p);
		f.addWindowListener(new WindowCloser(this) );
		b.addActionListener(new SubmitAction(this)); //콘솔창에 tf에 입력된 값이 출력!
		f.setBounds(300, 100, 200, 300);
		f.setVisible(true);
	}
}
class SubmitAction implements ActionListener{
	SignInFrame c;
	public SubmitAction(SignInFrame c) {
		this.c=c;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("입력된값 :"+c.tf.getText());
	}
}

class WindowCloser implements WindowListener{
	JFrame f;
	public WindowCloser(JFrame f) {this.f=f;}
	public void windowOpened(WindowEvent e) {
		System.out.println("열림");
	}
	public void windowClosing(WindowEvent e) {
		System.out.println("닫히는 중");
		f.dispose();
	}
	public void windowClosed(WindowEvent e) {
		System.out.println("닫혔다. JVM 종료!");
		System.exit(0);
	}
	public void windowIconified(WindowEvent e) {
		System.out.println("작아짐");
	}
	public void windowDeiconified(WindowEvent e) {
		System.out.println("커짐");
	}
	public void windowActivated(WindowEvent e) {
		//System.out.println("windowActivated : 관심중");
	}
	public void windowDeactivated(WindowEvent e) {
		//System.out.println("windowDeactivated : 관심 벗어 남");		
	}
}



public class L04Swing2 {
	public static void main(String[]args) {
		new SignInFrame("로그인");
	}
}
