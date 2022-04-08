package com.econ.thread;

import java.awt.GridLayout;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
class CardGameFrame extends JFrame{
	Card[] cards=new Card[12];
	Integer [] cards_nums= {1,1,2,2,3,3,4,4,5,5,6,6};		
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
						Thread.sleep(500);
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
							Thread.sleep(500);
						c.setText("");
						f.validate();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		this.setLayout(new GridLayout(3,4));
		this.setBounds(600,100,600,800);
		this.setVisible(true);
		this.validate();//새로고침
		t1.start();
		t1.join();	
		t2.start();
	}
	public void randomCards() {
		LinkedList<Integer> card_list=new LinkedList<Integer>(Arrays.asList(cards_nums));
		for(int i=0; i< cards.length; i++){
			int random=(int)(new Random().nextDouble()*card_list.size());
			cards[i]=new Card(card_list.remove(random));
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
