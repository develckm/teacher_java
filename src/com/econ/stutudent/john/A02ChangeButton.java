package com.econ.stutudent.john;

import javax.swing.*;


import java.awt.event.*;
import java.util.Random;
import java.awt.*;

public class A02ChangeButton extends JFrame {
Container contentPane;
JPanel mp;
JLabel imageLabel;
JLabel contLabel;
JLabel resultl;
JLabel scorel;
ImageIcon img0;
ImageIcon img1;
ImageIcon img2;
ImageIcon cont3;
ImageIcon score0;
ImageIcon score1;
ImageIcon score2; 
ImageIcon score3; 
ImageIcon score4; 
ImageIcon score5;
ImageIcon score6;
ImageIcon score7;
ImageIcon score8;
ImageIcon score9; 
ImageIcon score10;
ImageIcon score11;
ImageIcon score12;
//ImageIcon score;
public A02ChangeButton() {
	setTitle("Image Change");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
	 score0 = new ImageIcon("src/com/econ/stutudent/john/random1.png");
	 score1 = new ImageIcon("src/com/econ/stutudent/john/random2.png");
	 score2 = new ImageIcon("src/com/econ/stutudent/john/random3.png");
	 score3 = new ImageIcon("src/com/econ/stutudent/john/random4.png");
	 score4 = new ImageIcon("src/com/econ/stutudent/john/random5.png");
	 score5 = new ImageIcon("src/com/econ/stutudent/john/random6.png");
	 score6 = new ImageIcon("src/com/econ/stutudent/john/random7.png");
	 score7 = new ImageIcon("src/com/econ/stutudent/john/random8.png");
	 score8 = new ImageIcon("src/com/econ/stutudent/john/random9.png");
	 score9 = new ImageIcon("src/com/econ/stutudent/john/random10.png");
	 score10 = new ImageIcon("src/com/econ/stutudent/john/random11.png");
	 score11 = new ImageIcon("src/com/econ/stutudent/john/random12.png");
	 score12 = new ImageIcon("src/com/econ/stutudent/john/5p.png");
	 
	
	
	img0 = new ImageIcon("src/com/econ/stutudent/john/6s.png");
	img1 = new ImageIcon("src/com/econ/stutudent/john/6r.png");
	img2 = new ImageIcon("src/com/econ/stutudent/john/6p.png");
	cont3 = new ImageIcon("src/com/econ/stutudent/john/cont3.png");
	
	mp=new JPanel();
	scorel= new JLabel(score12);
	imageLabel = new JLabel(img0);
	contLabel = new JLabel(cont3);
	resultl=new JLabel("vs");
	
	mp.setLayout(null);
	imageLabel.setBounds(0, 0, 400, 400);
	scorel.setBounds(0, 0, 400, 400);
	mp.add(imageLabel);
	mp.add(scorel);
	mp.setPreferredSize(scorel.getPreferredSize());
	
	
	contentPane = getContentPane();
	contentPane.setLayout(new BoxLayout(this.contentPane, BoxLayout.Y_AXIS));
	
//	contentPane.add(imageLabel);
//	contentPane.add(contLabel, BorderLayout.CENTER);
	contentPane.add(resultl);
	contentPane.add(mp);
	contentPane.add(new MenuPanel());

//	contentPane.setLayout(new GridLayout(3,3,0,0));
//	contentPane.add(imageLabel);
//	contentPane.add(contLabel);
//	contentPane.add(new MenuPanel());
	
	setSize(500, 700);
	setVisible(true);
	
}
class MenuPanel extends JPanel {
	boolean start_game = false;
	boolean win = false;
	int select_enemy=0;
	ImageIcon[] enemy_arr= {img0,img1,img2};
	ImageIcon[] score_arr= {score0,score1,score2,score3,score4,score5,score6,score7,score8,score9,score10,score11};
	String[] enemy_arr2= {"가위","바위","보"};
	public MenuPanel() {
		//62,68,69,147,57
		ImageIcon c1 = new ImageIcon("src/com/econ/stutudent/john/r01.png");//62,123
		ImageIcon c2 = new ImageIcon("src/com/econ/stutudent/john/s01.png");//68
		ImageIcon c3 = new ImageIcon("src/com/econ/stutudent/john/p01.png");//69
		ImageIcon c4 = new ImageIcon("src/com/econ/stutudent/john/c01.png");//147
		ImageIcon c5 = new ImageIcon("src/com/econ/stutudent/john/c02.png");//57
		
		ImageIcon c11 = new ImageIcon("src/com/econ/stutudent/john/r011.png");
		ImageIcon c21 = new ImageIcon("src/com/econ/stutudent/john/s011.png");
		ImageIcon c31 = new ImageIcon("src/com/econ/stutudent/john/p011.png");
		ImageIcon c41 = new ImageIcon("src/com/econ/stutudent/john/c011.png");
		ImageIcon c51 = new ImageIcon("src/com/econ/stutudent/john/c021.png");
		//62,68,69,147,57
		JButton btn1 = new JButton(c1);
		btn1.setBorderPainted(false); // 버튼 테두리 설정해제
		btn1.setPreferredSize(new Dimension(62, 123)); // 버튼 크기 지정
		btn1.setRolloverIcon(c11);
		
		JButton btn2 = new JButton(c2);
		btn2.setBorderPainted(false); // 버튼 테두리 설정해제
		btn2.setPreferredSize(new Dimension(68, 123)); // 버튼 크기 지정
		btn2.setRolloverIcon(c21);
		
		JButton btn3 = new JButton(c3);
		btn3.setBorderPainted(false); // 버튼 테두리 설정해제
		btn3.setPreferredSize(new Dimension(69, 123)); // 버튼 크기 지정
		btn3.setRolloverIcon(c31);
		
		JButton btn4 = new JButton(c4);
		btn4.setBorderPainted(false); // 버튼 테두리 설정해제
		btn4.setPreferredSize(new Dimension(147, 123)); // 버튼 크기 지정
		btn4.setRolloverIcon(c41);
		
		JButton startb = new JButton(c5);
		startb.setBorderPainted(false); // 버튼 테두리 설정해제
		startb.setPreferredSize(new Dimension(57, 123)); // 버튼 크기 지정
		startb.setRolloverIcon(c51);

		this.setLayout(null);
		btn1.setBounds(0, 0, 62, 123);
		btn2.setBounds(62, 0, 68, 123);
		btn3.setBounds(130, 0, 69, 123);
		btn4.setBounds(199, 0, 147, 123);
		startb.setBounds(346, 0, 57, 123);
		
//		btn1.setBounds(141, 0, 62, 123);
//		btn2.setBounds(203, 0, 68, 123);
//		btn3.setBounds(271, 0, 69, 123);
//		btn4.setBounds(340, 0, 147, 123);
//		startb.setBounds(487, 0, 57, 123);
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(startb);
		
//		btn1.addActionListener(new ActionListener() {
////			public void actionPerformed(ActionEvent e) {
//////				imageLabel.setIcon(img0);
////				int num=1;
////				System.out.println(num);
////				System.out.println(select_enemy);
////				String msg="";
////				if(num-select_enemy ==1 || num-select_enemy== -2) {
////					//msg="이기"
////						
////				}else if() {
////					
////				}else {
////					
////				}
////				String msg=(num-select_enemy ==1 || num-select_enemy== -2)?"이겼습니다."
////						:(num-select_enemy==0)?"비겼습니다.":"졌습니다";
//////				System.out.println((btn1.getText()+"vs"+enemy_arr2[select_enemy]+":"+msg));
////				resultl.setText(msg);
////				start_game=false;
////			}
//		});

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				imageLabel.setIcon(img1);
				int num=0;
				System.out.println(num);
				System.out.println(select_enemy);
				String msg=(num-select_enemy ==1 || num-select_enemy== -2)?"이겼습니다."
						:(num-select_enemy==0)?"비겼습니다.":"졌습니다";
//				System.out.println((btn1.getText()+"vs"+enemy_arr2[select_enemy]+":"+msg));
				resultl.setText(msg);
				start_game=false;
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				imageLabel.setIcon(img2);
				int num=2;
				System.out.println(num);
				System.out.println(select_enemy);
				String msg=(num-select_enemy ==1 || num-select_enemy== -2)?"이겼습니다."
						:(num-select_enemy==0)?"비겼습니다.":"졌습니다";
//				System.out.println((btn1.getText()+"vs"+enemy_arr2[select_enemy]+":"+msg));
				resultl.setText(msg);
				start_game=false;
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				imageLabel.setIcon(img2);
				if(!win) {
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							win=true;
							for(int j=0; j<2; j++) {
								for(int i=0; i<12;i++) {
									scorel.setIcon(score_arr[i]);
									try {
										Thread.sleep(100);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
							}
							while(win) {		
								int random=(int)(new Random().nextDouble()*12);
								for(int i=0; i<random;i++) {									
									scorel.setIcon(score_arr[i]);
									try {
										Thread.sleep(100);
									} catch (InterruptedException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								win=false;
							}
							
						}
					}).start();
				}

			}
		});
		startb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!start_game) {					
					new Thread(new Runnable() {
						@Override
						public void run() {
							start_game = true;
							while(start_game) {
								int random=(int)(new Random().nextDouble()*3);
								
								imageLabel.setIcon(enemy_arr[random]);
								select_enemy=random;
								try {
									Thread.sleep(100);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							
						}}).start();
				}

					
			}
		});
	}
}

public static void main(String[] args) {
	new A02ChangeButton();
}
}


//imageLabel = new JLabel(img0);
//JLabel test= new JLabel(new ImageIcon("src/com/econ/stutudent/john/c011.png"));
//JPanel mp=new JPanel();
//mp.setLayout(null);
//imageLabel.setBounds(0, 0, 400, 400);
//test.setBounds(0, 0, 400, 400);
//mp.add(test);
//mp.add(imageLabel);
//mp.setPreferredSize(test.getPreferredSize());
