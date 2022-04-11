package com.econ.stutudent.jeahyuk;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
interface CardColor{
	Color FRONT=new Color(240, 245, 255);
	Color FRONT_TEXT=new Color(0, 0, 0);
	Color BACK=new Color(200, 205, 215);
	Color BACK_TEXT=new Color(200, 205, 215); 
	Color FAILED=new Color(255, 102, 102);
	Color FAILED_TEXT=new Color(0, 0, 0);
	Color SUCCESS=new Color(155, 255, 153);
	Color SUCCESS_TEXT=new Color(32, 32, 32);	
}
class CardGameFrame extends JFrame{
	int time=30;
	int score=0;
	JPanel timep=new JPanel();
	JPanel buttonp=new JPanel();
	
	JLabel timel=new JLabel(time+"珥�");
	JLabel scorel=new JLabel(score+"�젏");
	Card[] cards=new Card[12];
	Integer [] cards_nums= {1,1,2,2,3,3,4,4,5,5,6,6};		
	LinkedList<Card> click_cards=new LinkedList<Card>();
	JFrame f=this;
	
	public CardGameFrame(String title) throws InterruptedException {
		super(title);
		randomCards();
		for(Card c :cards) {
			buttonp.add(c);
		}
		this.setLayout(new BorderLayout());
		buttonp.setLayout(new GridLayout(3,4,20,20));
		timep.add(timel);
		timep.add(scorel);
		this.add(timep,BorderLayout.NORTH);
		this.add(buttonp,BorderLayout.CENTER);
		this.setBounds(600,100,600,800);
		this.setVisible(true);
		this.validate();
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
			@Override
			public void windowClosed(WindowEvent e) {
				System.exit(0);
			}
		});
		Thread timer=new Thread(new Runnable() {
			int i=0;
			Card[] c=cards;
			@Override
			public void run() {
				while(time>0) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					time--;	
					timel.setText(time+"珥�");
				}
				if(time==0) {
					JOptionPane.showMessageDialog(null, "�떆媛� 醫낅즺 �떦�떊�쓽 �젏�닔�뒗 "+score+"�젏 �엯�땲�떎.");
				}
			}
		});
		Thread t1=new Thread(new Runnable() {			
			@Override
			public void run() {
				for(Card c :cards) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {e.printStackTrace();}
					c.setOpaque(true);
					c.setBorderPainted(false);
					c.setBackground(CardColor.FRONT); 
					c.setText(c.card_num+"");
					c.setForeground(CardColor.FRONT_TEXT);
					f.validate();
				}
			}
		});
		Thread t2=new Thread(new Runnable() {			
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				for(Card c :cards) {
					try {Thread.sleep(100);} catch (InterruptedException e) {e.printStackTrace();}
					c.setBackground(CardColor.BACK); 
					c.setForeground(CardColor.BACK_TEXT);
				}
			}
		});
		Thread t3=new Thread(new Runnable(){
			int i=0;
			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(click_cards.size()==2) { 
						if(click_cards.get(0).card_num!=click_cards.get(1).card_num) {
							try {
								Thread.sleep(500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							for(Card c: click_cards) {
								c.setBackground(CardColor.FAILED); 
								c.setForeground(CardColor.FAILED_TEXT);
							}
							try {
								Thread.sleep(200);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}								
							for(Card c: click_cards) {		
								c.setBackground(CardColor.BACK); 
								c.setForeground(CardColor.BACK_TEXT);					
							}
							score-=1;
							scorel.setText(score+"�젏");
						}else{
							for(Card c: click_cards) {			
								c.success=true;
								c.setBackground(CardColor.SUCCESS); 
								c.setForeground(CardColor.SUCCESS_TEXT);
								score+=1;
								scorel.setText(score+"�젏");
								if(c.success) {
									i++;
									if(i==cards.length) {
										timer.stop();
										JOptionPane.showMessageDialog(null, "�꽦怨�! �떦�떊�쓽 �젏�닔�뒗 "+score+"�젏 �엯�땲�떎!");
									}
								}
							}
						}
						click_cards.clear();
					}
				}
			}
		});
		
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		setCard();
		timer.start();
		t3.start();
	}
	public void randomCards() {
		LinkedList<Integer> card_list=new LinkedList<Integer>(Arrays.asList(cards_nums));
		for(int i=0; i< cards.length; i++){
			int random=(int)(new Random().nextDouble()*card_list.size());
			Card c=new Card(card_list.remove(random));
			c.setBackground(CardColor.FRONT);
			c.setOpaque(true);
			c.setBorderPainted(false);	
			cards[i]=c;
		}	
	}
	public void setCard() {
		for(Card c: cards) {
			c.addActionListener(new Cardclick(c));
		}
	}
	class Cardclick implements ActionListener{
		Card c;
		Cardclick(Card c){
			this.c=c;
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(c.success) return;
			if(click_cards.size()<2) {
				if(click_cards.size()==1 && c==click_cards.get(0) ) return;
				click_cards.add(c);
				c.setBackground(CardColor.FRONT);
				c.setForeground(CardColor.FRONT_TEXT);
			}
		}
		
	}
}
class Card extends JButton{
	public int card_num;
	public boolean success=false;
	public Card(int card_num) {
		this.card_num=card_num;
	}
}
public class L06CardGameKwonjaehyuk{
	public static void main(String[]args) {		
		try {
			new CardGameFrame("移대뱶寃뚯엫");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}