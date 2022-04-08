package com.econ.thread;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
class CardGameFrame extends JFrame{
	Card[] cards=new Card[12];
	Integer [] cards_nums= {1,1,2,2,3,3,4,4,5,5,6,6};
	LinkedList<Card> click_cards=new LinkedList<Card>();
	JFrame f=this;
	public CardGameFrame(String title) throws InterruptedException {
		super(title);
		randomCards();
		//Card 버튼 12개를 flame에 붙이기
		for(Card c :cards) {
			add(c);
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
					f.validate();
				}
			}
		});
		Thread t2=new Thread(new Runnable() {			
			@Override
			public void run() {
				try {
					for(Card c :cards) {
							Thread.sleep(100);
						c.setText("");
						f.validate();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t3=new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				while(true) {
					if(click_cards.size()==2) {
						if(click_cards.get(0).card_num!=click_cards.get(1).card_num) {
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}

							for(Card c: click_cards) {
								c.setBackground(new Color(255,255,255));
								c.setOpaque(true);
								c.setBorderPainted(false);
								c.setText("");
							}
						}
						click_cards.remove(1);
						click_cards.remove(0);						
					}

				}
			}
		});
		this.setLayout(new GridLayout(3,4,20,10));
		this.setBounds(600,100,600,800);
		this.setVisible(true);
		this.validate();//새로고침
		t1.start();
		t1.join();	
		t2.start();
		t2.join();
		setCardAction();
		t3.start();
	}
	public void randomCards() {
		LinkedList<Integer> card_list=new LinkedList<Integer>(Arrays.asList(cards_nums));
		for(int i=0; i< cards.length; i++){
			int random=(int)(new Random().nextDouble()*card_list.size());
			Card c=new Card(card_list.remove(random));
			cards[i]=c;
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
		@Override
		public void actionPerformed(ActionEvent e) {
			if(click_cards.size()==0) {
				System.out.println(c.card_num);

				click_cards.add(c);
				c.setText(c.card_num+"");
				c.setBackground(new Color(200,200,200));
				c.setOpaque(true);
				c.setBorderPainted(false);		
			}else if(click_cards.size()==1) {
				System.out.println(c.card_num);
				click_cards.add(c);
				c.setText(c.card_num+"");
				c.setBackground(new Color(200,200,200));
				c.setOpaque(true);
				c.setBorderPainted(false);
				c.validate();
				f.validate();

			}
		}
	}
}
class Card extends JButton{
	public int card_num;
	public Card(int card_num) {
		this.card_num=card_num;
		//this.setText(card_num+"");
	}
}
public class L06CardGame{
	public static void main(String[]args) {		
		try {
			new CardGameFrame("카드게임");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
