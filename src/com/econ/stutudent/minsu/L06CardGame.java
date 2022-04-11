package com.econ.stutudent.minsu;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;


class CardGameFrame extends JFrame{
	Card[] cards=new Card[12];
	Integer [] cards_nums= {1,1,2,2,3,3,4,4,5,5,6,6};
	ArrayList<Integer> cards_list=new ArrayList<Integer>(Arrays.asList(cards_nums));

	public CardGameFrame(String title) throws InterruptedException {
		super(title);
		randomCards();
		
		//Card 버튼 12개를 frame에 붙이기
        for(Card c :cards) {
        	add(c);
		}
		
		this.setLayout(new GridLayout(3,4));
		this.setBounds(600,100,600,800);
		this.setVisible(true);
		//this.validate(); //새로고침
		
		Thread t=new ShowCard();
		t.join();
		t.start();
	
		
	}

	class ShowCard extends Thread{
		@Override
		public void run() {
			for(Card c :cards) {
				try {
					Thread.sleep(1000);
					c.setText("dd");
				}
				catch (InterruptedException e) {
						e.printStackTrace();
				}
			}
		}
	}
	
	public void randomCards() {
		for(int i=0; i< cards_nums.length; i++){
			int r_num=(int)(new Random().nextDouble()*cards_list.size());
			Card c=new Card(cards_list.remove(r_num));
			cards[i]=c;
		}
    }
}
	
class Card extends JButton{
	int card_num;
	public Card(int card_num) {
		this.card_num=card_num;
		this.setText(card_num+"");
	}
}
public class L06CardGame{
	public static void main(String[]args) throws InterruptedException {		
		new CardGameFrame("카드게임");
	}
}

//수를 랜덤으로 섞고 순차적으로 나타나게 한 후, 순차적으로 수만 보이지 않게 없애라.





