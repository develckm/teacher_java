package com.econ.thread;

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
interface CardColor{
	Color FRONT=new Color(240, 245, 255);
	Color FRONT_TEXT=new Color(15, 15, 25);
	Color BACK=new Color(200, 205, 215);
	//Color BACK_TEXT=new Color(200, 205, 215); //���� ���ڻ��� �Ȱ��� �ؼ� ������ �ʰ� �ϱ�

	Color BACK_TEXT=new Color(185, 185, 185);
	Color FAILED=new Color(240, 100, 100);
	Color FAILED_TEXT=new Color(105, 15, 25);
	Color SUCCESS=new Color(200, 240, 200);
	Color SUCCESS_TEXT=new Color(15, 115, 25);	
}
class CardGameFrame extends JFrame{
	Card[] cards=new Card[12];
	Integer [] cards_nums= {1,1,2,2,3,3,4,4,5,5,6,6};	
	LinkedList<Card> click_cards=new LinkedList<Card>();
	JFrame f=this;
	public CardGameFrame(String title) throws InterruptedException {
		super(title);
		randomCards();
		//Card ��ư 12���� flame�� ���̱�
		for(Card c :cards) {
			add(c);
		}
		Thread t1=new ShowCard();
		Thread t2=new HideCard();
		Thread t3=new CheckSucces();
		
		this.setLayout(new GridLayout(3,4,20,10));
		this.setBounds(600,100,600,800);
		this.setVisible(true);
		this.validate();//���ΰ�ħ
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {f.dispose();}
			public void windowClosed(WindowEvent e) {System.exit(0);}
		});
		t1.start(); //ȭ�鿡 ī�� ���
		t1.join();	
		t2.start(); //ȭ�鿡 ��µ� ī�� ������
		t2.join();
		setCardAction(); //ī�带 ���� �� �ֵ��� �׼� ����ϱ�
		t3.start(); //0.5�ʵ��� ������ �������� 2���� ī�尡 �ǹٸ��� �˻��ϱ� 
	}
	//ó�� �����ϸ� ȭ�鿡 ī�� ���̰� �ϴ� ������
	class ShowCard extends Thread{
		@Override
		public void run() {
			for(Card c :cards) {
				try {Thread.sleep(100);} catch (InterruptedException e) {e.printStackTrace();}
				c.setOpaque(true);
				c.setBorderPainted(false);
				c.setBackground(CardColor.FRONT); 
				c.setText(c.card_num+"");
				c.setForeground(CardColor.FRONT_TEXT);

				f.validate();
			}
		}
	}
	//ó�� �����ϸ� ȭ�鿡 ī�� ���̴� ���� ���ߴ� ������
	class HideCard extends Thread{
		@Override
		public void run() {
			try {Thread.sleep(5000);} catch (InterruptedException e) {e.printStackTrace();}	
			for(Card c :cards) {
				try {Thread.sleep(100);} catch (InterruptedException e) {e.printStackTrace();}
				c.setBackground(CardColor.BACK); 
				c.setForeground(CardColor.BACK_TEXT);
			}
		}
	}
	//ī�尡 2�� ���õǾ��� �� ¦�� �´��� �˻��ϴ� ������ 
	class CheckSucces extends Thread{
		@Override
		public void run() {
			//������ �ΰ��� ī�尡 ������ .5�ʸ��� ������ �˻��ϴ� �ڵ� 
			while(true) {
				try {Thread.sleep(500);} catch (InterruptedException e1) {	e1.printStackTrace();}
				if(click_cards.size()==2) { 
					//�������� �� �ٽ� ������
					if(click_cards.get(0).card_num!=click_cards.get(1).card_num) {
						try {Thread.sleep(500);} catch (InterruptedException e1) {e1.printStackTrace();}
						for(Card c: click_cards) {
							c.setBackground(CardColor.FAILED); 
							c.setForeground(CardColor.FAILED_TEXT);
						}
						try {Thread.sleep(200);} catch (InterruptedException e1) {	e1.printStackTrace();}								
						for(Card c: click_cards) {
							c.setBackground(CardColor.BACK); 
							c.setForeground(CardColor.BACK_TEXT);								
						}
					}else{
					//�������� �� �ٽ� ���������� �ʵ��� true�� �ٲٱ�
						for(Card c: click_cards) {
							c.success=true;
							c.setBackground(CardColor.SUCCESS); 
							c.setForeground(CardColor.SUCCESS_TEXT);								

						}
					}
					click_cards.clear();	
					//�����ϵ� �����ϵ� 2�� Ŭ���ϰ� ���� Ŭ�� �ʱ�ȭ
				}
			}
		}
	}
	public void randomCards() { //��ȣ�� �������� �����鼭 ī�� �����ϱ�  
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
	public void setCardAction() {//ī�忡 ������ �̺�Ʈ �߻��ñ⵵�� �׼� �����ϱ�
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
			
			if(c.success) return;//�̹� ������ ī��� ���� �� ����. 
			if(click_cards.size()<2) {//ī��� 2�� ���� �� �ִ�.
				//ī�带 ������ �� click_cards �迭�� �ִµ� click_cards�� 2���� ������ ������ �� ��ó�� �ѹ� ǥ���ϰ� �� �ٲٱ�
				if(click_cards.size()==1 && c==click_cards.get(0) ) return;
				click_cards.add(c);
				c.setBackground(CardColor.FRONT);
				c.setForeground(CardColor.FRONT_TEXT);
			}
		}
	}
}
class Card extends JButton{
	public int card_num; //������ 2���� ī�尡 ������ ���� �� ���
	public boolean success=false; //ī�� ã�� �����ϸ� TRUE�� �ȴ�. 
	public Card(int card_num) {
		this.card_num=card_num;
	}
}
public class L06CardGame{
	public static void main(String[]args) {		
		try {
			new CardGameFrame("ī�����");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
