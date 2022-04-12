package com.econ.input_output;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
//image.jpeg �� ����� 
//jvm�� teacher_java ���� ��ο� ����Ǳ� ������ �����('./',' ')�� ������ ������Ʈ ������ �ȴ�.
//./src/com/ecom/input_out/image.jpeg
//������ c://Users/choegyeongmin/Documents/bigdata_study/teacher_java/src/com/econ/input_output/image.jpeg
//����� src/com/econ/input_output/image.jpeg or ./src/com/econ/input_output/image.jpeg
class CardFrame extends JFrame{
	JLabel image=new JLabel();
	public CardFrame() throws IOException {
		//�̹����� ���� ���� ���� =>� ������ ����� ���� ����
		BufferedImage thumbnail=new BufferedImage(300, 150, BufferedImage.TYPE_3BYTE_BGR);
		//BufferedImage �۰� �׸��� �׸��� ����̵Ǵ� �̹��� ���� �ҷ����� 
		BufferedImage img=ImageIO.read(new File("src/com/econ/input_output/image.jpeg"));
		thumbnail.createGraphics().drawImage(img, 0, 0, 300, 150, null);
		ImageIcon ii=new ImageIcon(thumbnail);
		image.setIcon(ii);
		this.add(image);
		this.setBounds(0,0,300,150);
		this.setVisible(true);
		
	}
	
}



public class L03ImageInput {
	public static void main(String[]args) {
		try {
			new CardFrame();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
