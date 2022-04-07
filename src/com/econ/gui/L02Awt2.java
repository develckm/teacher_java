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
	Button submit=new Button("제출");
	Panel btnP=new Panel();
	TextField tf=new TextField("아이디를 입력",10);
	Label l=new Label("ID:");
	public LoginFrame(String name){
		super(name);
		//버튼에 무한히 이벤트가 발생하는 것을 듣고 있는다
		//dom.addEventListener("",function(){});
		//commonent.addActionListener(new Object implement ActionListener() )
		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(tf.getText()+"제출 버튼이 눌렸습니다.");
			}
		});
		btnP.add(l);
		btnP.add(tf);
		btnP.add(submit);
		this.add(btnP);
		//추상클래스와 인터페이스는 구현이 덜 되어서 생성자를 호출 할 수 없지만
		//생성하면서 바디를 구현하면 만들수 있다. 이때 익명클래스가 생성된다. 
		//this.addWindowListener(new WindowListener(){}); 
		//인터페이스는 구현해야하는 것이 너무 많아서 인터페이스를 미리구현한 추상클래스인 Adapter가 존재한다.
		this.addWindowListener(new WindowAdapter() {
			//this 는 WindowAdapte기 때문에 frame을 참조하기 위해 필드에 f를 등록함
			public void windowClosing(WindowEvent e) {f.dispose();}
			public void windowClosed(WindowEvent e) {System.exit(0);}
		});
		this.setSize(400, 500);
		this.setVisible(true);
	}
}

public class L02Awt2 {
	public static void main(String[]args) {
		new LoginFrame("로그인 양식");
	}
}
