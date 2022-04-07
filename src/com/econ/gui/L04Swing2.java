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
	JButton b=new JButton("����");
	public SignInFrame(String title) {
		super(title);
		p.add(l);
		p.add(tf);
		p.add(b);
		f.add(p);
		f.addWindowListener(new WindowCloser(this) );
		b.addActionListener(new SubmitAction(this)); //�ܼ�â�� tf�� �Էµ� ���� ���!
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
		System.out.println("�ԷµȰ� :"+c.tf.getText());
	}
}

class WindowCloser implements WindowListener{
	JFrame f;
	public WindowCloser(JFrame f) {this.f=f;}
	public void windowOpened(WindowEvent e) {
		System.out.println("����");
	}
	public void windowClosing(WindowEvent e) {
		System.out.println("������ ��");
		f.dispose();
	}
	public void windowClosed(WindowEvent e) {
		System.out.println("������. JVM ����!");
		System.exit(0);
	}
	public void windowIconified(WindowEvent e) {
		System.out.println("�۾���");
	}
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Ŀ��");
	}
	public void windowActivated(WindowEvent e) {
		//System.out.println("windowActivated : ������");
	}
	public void windowDeactivated(WindowEvent e) {
		//System.out.println("windowDeactivated : ���� ���� ��");		
	}
}



public class L04Swing2 {
	public static void main(String[]args) {
		new SignInFrame("�α���");
	}
}
