package com.econ.gui;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
class LoginFrame extends Frame{
	Frame f=this;
	Button submit=new Button("����");
	Panel btnP=new Panel();
	TextField tf=new TextField("���̵� �Է�",10);
	Label l=new Label("ID:");
	public LoginFrame(String name){
		super(name);
		//��ư�� ������ �̺�Ʈ�� �߻��ϴ� ���� ��� �ִ´�
		//dom.addEventListener("",function(){});
		//commonent.addActionListener(new Object implement ActionListener() )
		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(tf.getText()+"���� ��ư�� ���Ƚ��ϴ�.");
			}
		});
		btnP.add(l);
		btnP.add(tf);
		btnP.add(submit);
		this.add(btnP);
		//�߻�Ŭ������ �������̽��� ������ �� �Ǿ �����ڸ� ȣ�� �� �� ������
		//�����ϸ鼭 �ٵ� �����ϸ� ����� �ִ�. �̶� �͸�Ŭ������ �����ȴ�. 
		//this.addWindowListener(new WindowListener(){}); 
		//�������̽��� �����ؾ��ϴ� ���� �ʹ� ���Ƽ� �������̽��� �̸������� �߻�Ŭ������ Adapter�� �����Ѵ�.
		this.addWindowListener(new WindowAdapter() {
			//this �� WindowAdapte�� ������ frame�� �����ϱ� ���� �ʵ忡 f�� �����
			public void windowClosing(WindowEvent e) {f.dispose();}
			public void windowClosed(WindowEvent e) {System.exit(0);}
		});
		this.setSize(400, 500);
		this.setVisible(true);
	}
}

public class L02Awt2 {
	public static void main(String[]args) {
		new LoginFrame("�α��� ���");
	}
}
