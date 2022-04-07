package com.econ.gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//�����ڸ� �����ϸ� �ȴ�!
class WindowClose implements WindowListener{
	Frame f;
	public WindowClose(Frame f) {
		this.f=f;
	}
	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		this.f.dispose(); //closed�� ȣ��ȴ�.
		System.out.println("Ŭ���� ��ư�� �������ϴ�.");
	}
	public void windowClosed(WindowEvent e) {
		System.out.println("â�� �������ϴ�.");
		System.exit(0);//dispose()�� â�� ������ jvm�� ������ ��� ��������� ���Ľɿ� �ѹ��� ����
	}
	public void windowIconified(WindowEvent e) {}public void windowDeiconified(WindowEvent e) {}public void windowActivated(WindowEvent e) {}public void windowDeactivated(WindowEvent e) {}
}
public class L01Awt {
	public static void main(String[]args) {
		Frame f=new Frame("�α���");
		Panel p=new Panel();
		Label l=new Label();
		TextField tf=new TextField(10);
		l.setText("���̵�");
		Button b= new Button("�Է�");
		p.add(l);
		p.add(tf);
		p.add(b);
		f.add(p);
		f.setSize(300, 400);
		f.setVisible(true);
		f.addWindowListener(new WindowClose(f));
	}
}
