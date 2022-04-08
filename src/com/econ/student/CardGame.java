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
	Thread timeTh;  //header 부분 시간 출력 스레드
	Thread countDownTh; //header 부분 카운트 다운 출력 스레드 
	Thread shuffleTh; // 카드를 섞는 스레드
	static Thread checkCardTh; //저장된 cardInput을 계속해서 검사하는 스레드
	public CardGame() {
		setTitle("카드게임"); //프로그램 제목설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 상단'X' 버튼 눌렀을때 프로그램 종료
		
		//컨테이너 설정 시작
		
		Container cont = getContentPane(); // 최상위 body 객체 
		cont.setLayout(new BorderLayout()); //borderlayout 사용
		cont.setBackground(new Color(120,34,190));
		
		//컨테이너 설정 끝
		
		/*프로그램 header 부분 구현*/
		JPanel header = new JPanel(); 
		header_la = new JLabel();
		header_la.setFont(new Font("Arial",Font.BOLD,40)); //header label 글씨 크기 설정
		header.add(header_la);
		//header 부분 구현 끝
		
		/*timeThread 구현(header>header_la 에 매초 시간을 출력하는 스레드이다.)*/
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
		//timeTh 구현 및 실행 끝
		
		/*프로그램 body 디자인 구현*/
		JPanel body = new JPanel();
		body.setLayout(new GridLayout(3,4,10,10));
		for(int i =0; i<12; i++) { //3*4 크기만큼 카드를 생성한다.
			Card c = new Card(cardOrigin[i]);
			cardList.add(c);
			//c.setFont(new Font("Arial",Font.BOLD,30));
			c.setEnabled(false);
			body.add(c);
		}
		//body 디자인 구현 끝
		
		//shuffleTh 구현 초기 화면 보여주고 500ms 뒤 섞는다 -> 그다음에 ->2초 뒤에 글씨를 index 로 바꾼다.
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
					Thread.sleep(7000); //시간 조절
				}catch(InterruptedException e) {
					System.out.println(e.getMessage());
				} // 2초뒤 보여주는 숫자 를 index를 보여준다.
				
				for(Card c : cardList) {
					c.setText(Integer.toString(c.getIndex()));
				}
				startBtn.setEnabled(true);
				
			}
		});
		shuffleTh.start();
		//shuffleTh 스레드 구현 밑 실행 완료.
		
		/*footer 디자인 구현*/
		JPanel footer = new JPanel();
		startBtn = new JButton("게임 시작!");
		startBtn.setEnabled(false);
		footer.add(startBtn);
		//footer 디자인 구현 끝!
		
		/*startBtn 에 ActionEventListener 등록
		 * startBtn -클릭-> timeTh 종료,countDownTh시작
		 * -> 모든 card를 setEnabled(true)로 바꾸기
		 * ->모든 card에 ActionEventListener 등록
		 * ->cardInput 에저장된다.
		 * ->checkCardTh 실행된다.
		*/
		startBtn.addActionListener(new StartGame());
		
		//checkCardTh 구현
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
								System.out.println("빙고~");
								shuffle_list.remove(shuffle_list.indexOf(c1.value));
								shuffle_list.remove(shuffle_list.indexOf(c2.value));
								c1.setEnabled(false);
								c2.setEnabled(false);
							}else {
								System.out.println("땡~~~");
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
		
		
		/*화면 보이기, 크기 설정, header,body,footer 를 cont에 추가*/
		cont.add(header,BorderLayout.NORTH);
		cont.add(body,BorderLayout.CENTER);
		cont.add(footer,BorderLayout.SOUTH);
		setSize(600,600); //화면 크기 설정
		setVisible(true); // 보이게 설정
		/*화면 보이기, 크기 설정 끝*/
	}//생성자 끝!!

	public static void main(String[] args) {
		new CardGame();
	}//main() 끝!!!
	
	
	//inneerClass 로 StartGame class(startBtn ActionEvent class) 구현
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
						//size() 가 0이면 스레드 종료 구현 해야한다!!!!!!!!!!
						header_la.setText(Integer.toString(count--));
						header_la.setForeground(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
						try {
							Thread.sleep(1000);
						}catch(InterruptedException e) {
							System.out.println(e.getMessage());
							header_la.setText(Integer.toString(count));
							countDownTh.interrupt();
							JOptionPane.showMessageDialog(null,"와~ 성공이다");
							break;
						}
					}
					if(shuffle_list.size() != 0) {
						JOptionPane.showMessageDialog(null,"실패다 실패~ 껐다 다시키세요 ㅎㅎ");
						checkCardTh.interrupt();
					}
					
				}
			});
			
			countDownTh.start();
			checkCardTh.start();
			
		}//actionPerformed 끝!!
		
	}//StartGame class 끝!!
	
	//카드를 클릭했을때 이벤트 클래스
	class ClickCard implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			Card c = (Card)e.getSource();
			c.setText(Integer.toString(c.getValue()));
			c.setForeground(Color.RED);
			c.setFont(new Font("Arial",Font.BOLD,30));
			c.setEnabled(false);
			System.out.println("들어온 숫자 : "+c.getValue());
			System.out.println("인덱스 : "+c.getIndex());
			cardInput.add(c);
			
			
			
		}//actionPerformed 끝!!!
		
	}//ClickCard class 끝!!
	
	
}//CardGame class 끝!!!

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