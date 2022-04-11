package com.econ.stutudent.choi_yunsu;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;



class gameClock {
	public gameClock(){
		new Thread(
			new Runnable () {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					while(true) {
						try {						
							Thread.sleep(1000);
						}
						catch(Exception e) {						
						}
						Date d = new Date();
						System.out.println(d.getTime()/1000); 						
					}
					
				}
			}
		).start();		
	}
	
}

class myButton implements ActionListener {
	Graphics g;
	JButton btn;
	int index;
	
	public myButton(JButton btn, int i, Graphics G) {
		this.g = G;
		this.btn = btn;
		this.index = i;
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(this.g.openList[this.index] == false) {			
			this.g.twoChecker += 1;
		}
		else if(  (this.g.openList[this.index] == true) 
				&& (this.g.twoChecker ==2)) {
			this.g.twoChecker += 1;
		}
		System.out.println(this.g.twoChecker);
		
		if(this.g.twoChecker == 1) {
			this.g.pair[this.g.twoChecker-1] = this.g.Deck[index];
			this.g.pairIndex[this.g.twoChecker-1] = index;
			this.g.openList[index] = true;
		}
		else if(this.g.twoChecker == 2) {
			this.g.pair[this.g.twoChecker-1] = this.g.Deck[index];
			this.g.pairIndex[this.g.twoChecker-1] = index;
			this.g.openList[index] = true;
		}
		
		if(this.g.twoChecker == 3) {
			this.g.twoChecker = 0 ;
			if(this.g.pair[0] != this.g.pair[1]) {
				this.g.openList[this.g.pairIndex[0]] = false;
				this.g.openList[this.g.pairIndex[1]] = false;
			}
		}
		this.g.ReverseCard();
		
//		new gameClock();
	}
}

class Graphics extends JFrame {
	Graphics g = this;
	JFrame f;
	JButton[] btn;
	Font font = new Font("¸¼Àº °íµñ", Font.PLAIN, 25);
	ImageIcon img = new  ImageIcon("src/com/econ/stutudent/choi_yunsu/snow_background.jpg");
	int[] Deck;
	boolean[] openList;
	int twoChecker;
	int[] pair = new int[2];
	int[] pairIndex = new int[2];
	
	public Graphics(int[] arr){
		this.f = new JFrame();
		this.Deck = arr;
		this.btn = new JButton[arr.length];
		this.openList = new boolean[arr.length];
		this.twoChecker = 0;
		
		for(int i = 0; i < arr.length; i++) {
			this.btn[i] = new JButton();
			this.btn[i].setFont(font);
			this.f.add(btn[i]);
			btn[i].addActionListener(new myButton(btn[i], i, g));
		}
		
		this.f.setLayout(new GridLayout(2, arr.length/2));
		this.f.setBounds(200, 200, 800, 400);
		this.f.setVisible(true);
		this.Ready();
	}
	
	void Ready () {
		for(int i = 0; i < Deck.length; i++) {
			this.btn[i].setText(""+Deck[i]);
			this.btn[i].setBackground(new Color(255, 255, 255));
			this.btn[i].setIcon(null);
			
			try { Thread.sleep(500); }
			catch (Exception e) { System.out.println("¿¡·¯ : "+e); }
		}
		
		try { Thread.sleep(500); }
		catch (Exception e) { System.out.println("¿¡·¯ : "+e); }
		
		for(int i = 0; i < Deck.length; i++) {
			this.btn[i].setText("");
			this.btn[i].setIcon(img);
		}
	}
	
	void ReverseCard () {
		for(int i = 0; i < Deck.length; i++) {
			if(this.openList[i]) {
				this.btn[i].setText(Deck[i]+"");
				this.btn[i].setBackground(new Color(255, 255, 255));
				this.btn[i].setIcon(null);
			}
			else {				
				this.btn[i].setText("");
				this.btn[i].setIcon(img);
			}
		}
	}
	
}

class Card {
	int [] cards;
	public Card(int num) {
		this.cards = new int[num*2];
		int c = 0;
		
		for(int i = 0; i < (num*2) ; i++) {
			if((i+1)%2 == 1) {				
				c = c +1;
			}
			this.cards[i] = c;
		}
	}
	
	int[] Shuffle() {
		int ran;
		boolean [] check = new boolean[cards.length];
		int [] result = new int[cards.length];
		
		for(int i = 0; i< cards.length; i++) {
			do {
				ran = (int)(Math.random()*(cards.length));
			}while(check[ran]);
			check[ran] = true;
			result[i] = cards[ran];
		}
		
		return result;
	}
}

public class Card_Game {
	public static void main (String[] args) {
		new Graphics(new Card(6).Shuffle());
//		gameClock gt = new gameClock();
	}
}
