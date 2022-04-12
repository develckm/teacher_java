package com.econ.input_output;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
//image.jpeg 의 상대경로 
//jvm은 teacher_java 이하 경로에 실행되기 때문에 상대경로('./',' ')의 시작은 프로젝트 폴더가 된다.
//./src/com/ecom/input_out/image.jpeg
//절대경로 c://Users/choegyeongmin/Documents/bigdata_study/teacher_java/src/com/econ/input_output/image.jpeg
//상대경로 src/com/econ/input_output/image.jpeg or ./src/com/econ/input_output/image.jpeg
class CardFrame extends JFrame{
	JLabel image=new JLabel();
	public CardFrame() throws IOException {
		//이미지는 색의 블럭의 조합 =>어떤 색블럭을 사용할 건지 정해
		BufferedImage thumbnail=new BufferedImage(300, 150, BufferedImage.TYPE_3BYTE_BGR);
		//BufferedImage 작게 그림을 그릴때 대상이되는 이미지 파일 불러오기 
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
