package com.econ.student;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;

import javax.swing.*;
import javax.swing.event.*;



import java.util.*;

public class CardGame extends JFrame {
	JButton startBtn;
	JLabel header_la;
	ArrayList<Card> cardList = new ArrayList<>();
	int[] cardOrigin = {1,1,2,2,3,3,4,4,5,5,6,6};
	int[] shuffle_array = new int[cardOrigin.length];
	static ArrayList<Integer> shuffle_list;
	static  Queue<Card> cardInput = new LinkedList<Card>();
	Thread timeTh;  //header �κ� �ð� ��� ������
	Thread countDownTh; //header �κ� ī��Ʈ �ٿ� ��� ������ 
	Thread shuffleTh; // ī�带 ���� ������
	static Thread checkCardTh; //����� cardInput�� ����ؼ� �˻��ϴ� ������
	public CardGame() {
		setTitle("ī�����"); //���α׷� ������
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���'X' ��ư �������� ���α׷� ����
		
		//�����̳� ���� ����
		
		Container cont = getContentPane(); // �ֻ��� body ��ü 
		cont.setLayout(new BorderLayout()); //borderlayout ���
		cont.setBackground(new Color(120,34,190));
		
		//�����̳� ���� ��
		
		/*���α׷� header �κ� ����*/
		JPanel header = new JPanel(); 
		header_la = new JLabel();
		header_la.setFont(new Font("Arial",Font.BOLD,40)); //header label �۾� ũ�� ����
		header.add(header_la);
		//header �κ� ���� ��
		
		/*timeThread ����(header>header_la �� ���� �ð��� ����ϴ� �������̴�.)*/
		timeTh = new Thread(new Runnable() {
			@Override
			public void run() {
				while(!timeTh.isInterrupted()) {
					LocalTime time = LocalTime.now();
					String t = time.getHour()+":"+time.getMinute()+":"+time.getSecond();
					header_la.setText(t);
				}
			}
		});
		timeTh.start();
		//timeTh ���� �� ���� ��
		
		/*���α׷� body ������ ����*/
		JPanel body = new JPanel();
		body.setLayout(new GridLayout(3,4,10,10));
		for(int i =0; i<12; i++) { //3*4 ũ�⸸ŭ ī�带 �����Ѵ�.
			Card c = new Card(cardOrigin[i]);
			cardList.add(c);
			//c.setFont(new Font("Arial",Font.BOLD,30));
			c.setEnabled(false);
			body.add(c);
		}
		//body ������ ���� ��
		
		//shuffleTh ���� �ʱ� ȭ�� �����ְ� 500ms �� ���´� -> �״����� ->2�� �ڿ� �۾��� index �� �ٲ۴�.
		shuffleTh = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {System.out.println(e.getMessage());}
				
				for(int i = 0; i<cardOrigin.length; i++) {
					int rand = (int)(Math.random()*cardOrigin.length);
					if(shuffle_array[rand] != 0) {
						i--;
					}else {
						shuffle_array[rand] = cardOrigin[i];
					}
				}
				shuffle_list = new ArrayList<Integer>(Arrays.asList(Arrays.stream(shuffle_array).boxed().toArray(Integer[]::new)));
 				
				for(int i = 0;i<shuffle_array.length; i++) {
					cardList.get(i).setValue(shuffle_array[i]);
					cardList.get(i).setText(Integer.toString(cardList.get(i).getValue()));
					cardList.get(i).setIndex(i);
				}

				try {
					Thread.sleep(7000); //�ð� ����
				}catch(InterruptedException e) {
					System.out.println(e.getMessage());
				} // 2�ʵ� �����ִ� ���� �� index�� �����ش�.
				
				for(Card c : cardList) {
					c.setText(Integer.toString(c.getIndex()));
				}
				startBtn.setEnabled(true);
				
			}
		});
		shuffleTh.start();
		//shuffleTh ������ ���� �� ���� �Ϸ�.
		
		/*footer ������ ����*/
		JPanel footer = new JPanel();
		startBtn = new JButton("���� ����!");
		startBtn.setEnabled(false);
		footer.add(startBtn);
		//footer ������ ���� ��!
		
		/*startBtn �� ActionEventListener ���
		 * startBtn -Ŭ��-> timeTh ����,countDownTh����
		 * -> ��� card�� setEnabled(true)�� �ٲٱ�
		 * ->��� card�� ActionEventListener ���
		 * ->cardInput ������ȴ�.
		 * ->checkCardTh ����ȴ�.
		*/
		startBtn.addActionListener(new StartGame());
		
		//checkCardTh ����
		checkCardTh = new Thread(new Runnable() {
			@Override
			public void run() {
				while(shuffle_list.size()!=0) {
					System.out.println(shuffle_list.size()!=0);
					try {
						Thread.sleep(500);
						if(cardInput.size() >= 2) {
							Card c1 = cardInput.poll();
							Card c2 = cardInput.poll();
							c1.setText(Integer.toString(c1.getValue()));
							c2.setText(Integer.toString(c2.getValue()));
							if(c1.getValue() == c2.getValue()) {
								System.out.println("����~");
								shuffle_list.remove(shuffle_list.indexOf(c1.value));
								shuffle_list.remove(shuffle_list.indexOf(c2.value));
								c1.setEnabled(false);
								c2.setEnabled(false);
							}else {
								System.out.println("��~~~");
								c1.setText(Integer.toString(c1.getIndex()));
								c2.setText(Integer.toString(c2.getIndex()));
								c1.setForeground(Color.black);
								c2.setForeground(Color.black);
								c1.setFont(null);
								c2.setFont(null);
								c1.setEnabled(true);
								c2.setEnabled(true);
							}
							
						}
						
						System.out.println("shuffle_list :"+shuffle_list);
					}catch(InterruptedException e) {
						System.out.println(e.getMessage());
						for(Card c : cardList) {
							c.setEnabled(false);
						}
						break;
					}
					
					
				}
				countDownTh.interrupt();
				
			}
		});
		
		
		/*ȭ�� ���̱�, ũ�� ����, header,body,footer �� cont�� �߰�*/
		cont.add(header,BorderLayout.NORTH);
		cont.add(body,BorderLayout.CENTER);
		cont.add(footer,BorderLayout.SOUTH);
		setSize(600,600); //ȭ�� ũ�� ����
		setVisible(true); // ���̰� ����
		/*ȭ�� ���̱�, ũ�� ���� ��*/
	}//������ ��!!

	public static void main(String[] args) {
		new CardGame();
	}//main() ��!!!
	
	
	//inneerClass �� StartGame class(startBtn ActionEvent class) ����
	class StartGame implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			startBtn.setEnabled(false);
			timeTh.interrupt();
			countDownTh = new Thread(new Runnable() {
				@Override
				public void run() {
					int count = 20;
					for(Card c : cardList) {
						c.setEnabled(true);
						c.addActionListener(new ClickCard());
					}
					while(count >=0 && countDownTh.isAlive()) {
						//size() �� 0�̸� ������ ���� ���� �ؾ��Ѵ�!!!!!!!!!!
						header_la.setText(Integer.toString(count--));
						header_la.setForeground(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
						try {
							Thread.sleep(1000);
						}catch(InterruptedException e) {
							System.out.println(e.getMessage());
							header_la.setText(Integer.toString(count));
							countDownTh.interrupt();
							JOptionPane.showMessageDialog(null,"��~ �����̴�");
							break;
						}
					}
					if(shuffle_list.size() != 0) {
						JOptionPane.showMessageDialog(null,"���д� ����~ ���� �ٽ�Ű���� ����");
						checkCardTh.interrupt();
					}
					
				}
			});
			
			countDownTh.start();
			checkCardTh.start();
			
		}//actionPerformed ��!!
		
	}//StartGame class ��!!
	
	//ī�带 Ŭ�������� �̺�Ʈ Ŭ����
	class ClickCard implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			Card c = (Card)e.getSource();
			c.setText(Integer.toString(c.getValue()));
			c.setForeground(Color.RED);
			c.setFont(new Font("Arial",Font.BOLD,30));
			c.setEnabled(false);
			System.out.println("���� ���� : "+c.getValue());
			System.out.println("�ε��� : "+c.getIndex());
			cardInput.add(c);
			
			
			
		}//actionPerformed ��!!!
		
	}//ClickCard class ��!!
	
	
}//CardGame class ��!!!

class Card extends JButton{
	int value;
	int index;
	public Card(int x) {
		this.value = x;
		this.setText(Integer.toString(x));
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getIndex(int value) {
		return this.index;
	}
	public int getIndex() {
		return this.index;
	}
	public void setValue(int value) {
		this.value =value;
	}
	
	public int getValue(int index) {
		return this.value;
	}
	public int getValue() {
		return this.value;
	}
}