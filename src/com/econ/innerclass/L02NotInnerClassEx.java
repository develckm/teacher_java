package com.econ.innerclass;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

interface ButtonColor{
	//상수 규칙 staitc class 멤버(클래스가 해석될때 메소드 영역에 생성)
	//상수==고정값(바뀌지 않는) 정보로 사용하기 위해
	public static final Color DEFAULT= new Color(200,200,220);
	//인터페이스 내부에 선언하는 모든 변수는 상수가 된다.
	Color ACTIVE=new Color(150,150,170); 
	//인테페이스는 필드를 선언할 수 없기 때문에 상수를 선언하는 용도로 많이 사용된다.
	Color OVER=new Color(180,180,200); 

}

public class L02NotInnerClassEx {
	public static void main(String[]args) {
		Calculator cal=new Calculator();
		cal.setBounds(0, 0, 300, 600);
		cal.setVisible(true);
	}
}
class Calculator extends JFrame{
	JPanel  bp=new JPanel();	
	JButton [] b_arr = new JButton[12];
	JButton b7=new JButton("7");
	JButton b8=new JButton("8");
	JButton b9=new JButton("9");
	JButton b4=new JButton("4");
	JButton b5=new JButton("5");
	JButton b6=new JButton("6");
	JButton b1=new JButton("1");
	JButton b2=new JButton("2");
	JButton b3=new JButton("3");
	JButton bm=new JButton("+/-");
	JButton b0=new JButton("0");
	JButton bd=new JButton(".");
	JTextField screen=new JTextField();
	public Calculator() {
		b_arr[0]=b7;
		b_arr[1]=b8;
		b_arr[2]=b9;
		b_arr[3]=b4;
		b_arr[4]=b5;
		b_arr[5]=b6;
		b_arr[6]=b1;
		b_arr[7]=b2;
		b_arr[8]=b3;
		b_arr[9]=bm;
		b_arr[10]=b0;
		b_arr[11]=bd;
		this.setLayout(new BorderLayout());
		this.add(screen, BorderLayout.NORTH);
		bp.setLayout(new GridLayout(4, 3, 1, 1));
		for(JButton b : b_arr) {
			b.addMouseListener(new ButtonHandler(screen));
			b.setBackground(ButtonColor.DEFAULT);
			b.setOpaque(true);
			b.setBorderPainted(false);
			bp.add(b);
		}
		this.add(bp, BorderLayout.CENTER);
	}
}
class ButtonHandler implements MouseListener{
	JTextField screen;
	public ButtonHandler(JTextField screen) {
		this.screen=screen;
	}
	@Override
	public void mouseClicked(MouseEvent e) {//addActionListener와 동일한 이벤트
	}
	@Override
	public void mousePressed(MouseEvent e) {

		JButton b=(JButton)e.getSource();
		String b_text=b.getText();
		b.setBackground(ButtonColor.ACTIVE);
		screen.setText(screen.getText()+b_text);
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		JButton b=(JButton)e.getSource();
		b.setBackground(ButtonColor.DEFAULT);
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		JButton b=(JButton)e.getSource();
		b.setBackground(ButtonColor.OVER);
	}
	@Override
	public void mouseExited(MouseEvent e) {		
		JButton b=(JButton)e.getSource();
		b.setBackground(ButtonColor.DEFAULT);
	}
}






