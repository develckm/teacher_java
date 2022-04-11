package com.econ.stutudent.sungjea;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import com.econ.thread.CardGameFrame.CardActionHander;
//import com.econ.thread.CardGameFrame.WindowHandler;
class CardGameFrame extends JFrame{
	public boolean res=true;
	MyDialog dlg;
	MyDialog2 dlg2;
	int time=30;
	int score=0;
	JPanel resultP=new JPanel();
	JPanel buttonP=new JPanel();
	JLabel timeL=new JLabel(time+"초");
	JLabel scoreL=new JLabel(score+"점");
	Card[] cards=new Card[12];
	Integer [] cards_nums= {1,1,2,2,3,3,4,4,5,5,6,6};	
	LinkedList<Card> clk_arr=new LinkedList<Card>();
	JFrame f=this;
	public CardGameFrame(String title) throws InterruptedException{
		super(title);
		dlg=new MyDialog(this,"실패");
		dlg2=new MyDialog2(this,"성공");
		randomCards();
		//Card 버튼 12개를 frame에 붙이기
		for(Card c :cards) {
			buttonP.add(c);
		}	
		Thread t1=new Thread(new Runnable() {			
			@Override
			public void run() {
				for(Card c :cards) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					c.setText(c.card_num+"");
					c.setBackground(new Color(255,255,255));
					f.validate();
				}
			}
		});
		Thread t2=new Thread(new Runnable() {			
			@Override
			public void run() {
					for(Card c :cards) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						c.setText("");
						c.setBackground(new Color(200,200,200));
						f.validate();
					}
			}
		});
		Thread t3=new Thread(new Runnable() {
			public void run() {
				while(true) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
					if(clk_arr.size()==2) {
						if(clk_arr.get(0).card_num!=clk_arr.get(1).card_num) {
							try {
								Thread.sleep(300);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
							for(Card c: clk_arr) {
								c.setBackground(new Color(240,100,100));
							}
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							for(Card c: clk_arr) {
								c.setOpaque(true);
								c.setText("");
								c.setBackground(new Color(200,200,200));


							}
						}else {
							for(Card c: clk_arr) {		
							c.setBackground(new Color(200,240,200));
							c.success=true;
							score+=10;
							scoreL.setText(Integer.toString(score)+"점");
								if(score==120) {
									timeL.setText("성공하셨습니다!!!");
									dlg2.setVisible(true);
									res=false;
								}
							}
						}				
						clk_arr.clear();
					}
				}
			}	
		});
		Thread t4=new timer();
		
		this.setLayout(new BorderLayout());
		buttonP.setLayout(new GridLayout(3,4,20,10));
		resultP.add(timeL);
		resultP.add(scoreL);
		this.add(resultP,BorderLayout.NORTH);
		this.add(buttonP,BorderLayout.CENTER);
		this.setBounds(600,100,600,800);
		this.setVisible(true);
		this.validate();

		t4.start();			
		t1.start();
		t1.join();	
		t2.start();
		t2.join();
		setCardAction();						
		t3.start();
		this.addWindowListener(new WindowHandler());
	}
	class timer extends Thread{
		public void run() {
			int t=time;
			try {
				Thread.sleep(2400);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			while(t>0 && res){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				t--;
				timeL.setText(Integer.toString(t)+"초");
				System.out.println(t);
				if(t==0) {
					dlg.setVisible(true);
					timeL.setText("게임 실패!!!");
					res=false;
				}
			
			}
		}
		
	}
	class MyDialog extends JDialog{
		JPanel p= new JPanel();
	    JLabel l = new JLabel("게임 실패!!!!!!!!!");
	    JPanel p2= new JPanel();
	    JLabel l2 = new JLabel("다시 시도하시겠습니까?");
	    JButton yesBtn=new JButton("네");
	    JButton noBtn=new JButton("아니요");
	   
	    MyDialog(JFrame frame, String title){
	        super(frame,title);
	        this.setLayout(new FlowLayout());
	        p.add(l);
	        p2.add(l2);
	        p2.add(yesBtn);
	        p2.add(noBtn);
	        this.add(p);
	        this.add(p2);
	        this.setLayout(new GridLayout(2,1));
	        this.setBounds(700,400,500,200); 
	    }
	}
	class MyDialog2 extends JDialog{
		JPanel p= new JPanel();
	    JLabel l = new JLabel("성공하셨습니다!!!!");
	    JPanel p2= new JPanel();
	    JLabel l2 = new JLabel("다시 하시겠습니까?");
	    JButton yesBtn=new JButton("네");
	    JButton noBtn=new JButton("아니요");

	    MyDialog2(JFrame frame, String title){
	        super(frame,title);
	        this.setLayout(new FlowLayout());
	        p.add(l);
	        p2.add(l2);
	        p2.add(yesBtn);
	        p2.add(noBtn);
	        this.add(p);
	        this.add(p2);
	        this.setLayout(new GridLayout(2,1));
	        this.setBounds(700,400,500,200); 
	    }
	}

	class WindowHandler extends WindowAdapter{
		public void windowClosing(WindowEvent e) {f.dispose();}
		public void windowClosed(WindowEvent e) {System.exit(0);}
	}	
	public void randomCards() {
		LinkedList<Integer> card_list=new LinkedList<Integer>(Arrays.asList(cards_nums));
		for(int i=0; i< cards.length; i++){
			int random=(int)(new Random().nextDouble()*card_list.size());
			cards[i]=new Card(card_list.remove(random));
		}	
	}
	public void setCardAction() {
		for(Card c: cards) {
			c.addActionListener(new CardActionHander(c));
		}
	}
	class CardActionHander implements ActionListener{
		Card c;
		CardActionHander(Card c){
			this.c=c;
		}
		public void actionPerformed(ActionEvent e) {
			if(res) {
				if(c.success==true) return;
					if(clk_arr.size()<2) {		
						if(clk_arr.size()==1 && c==clk_arr.get(0) ) return;
							System.out.println(c.card_num);
							clk_arr.add(c);
							c.setText(c.card_num+"");
							c.setBackground(new Color(255,255,255));					
				}
			}
		}
	}
}
class Card extends JButton{
	public int card_num;
	public boolean success=false; //카드 찾기 성공하면 TRUE가 된다.
	public Card(int card_num) {
		this.card_num=card_num;
		//this.setText(card_num+"");
	}
}
public class L06CardGame{
	public static void main(String[]args) throws InterruptedException {		
		new CardGameFrame("카드게임");
	}
}
