package com.econ;
//import java.lang.*;
class Receiver{}
class HDMI{}
class LED{}
class Power{ int v; Power(int v){this.v=v; }}
//class TeleVision extends Object{ �����Ǿ� ��
class TeleVision{

	LED [] oled;
	Receiver s; //Ÿ���� �ѱ۷� ������� ������
	HDMI hdmi;
	Power p;
	int chanel;
	public TeleVision(int voltage,int chanel){
		//�����ڰ� �ϴ� ���� �ʵ带 �����ϰ�, �Ķ���ͷ� �Ѿ�� ������ �⺻���� �����ϴ� ��  
		this.oled=new LED[10000000];	
		this.s=new Receiver(); //Ÿ���� �ѱ۷� ������� ������
		this.hdmi=new HDMI();
		this.p=new Power(voltage);
		this.chanel=chanel;
		//System.out.println("������ :"+super.toString());
		System.out.println("ȯ���մϴ� ������ tv :"+this.toString());
		//�θ𿡼� ������ �̸��� ���� �̸��� �Լ��� �����ϴ� ���� �������̵��̶� �ϰ�
		//�̸��� ������ super or this�� �ٸ��� ������ ���ִ� ���¸� �������̶� �Ѵ�. 
	}
	//2.Object.String() ��ü�� ���� ���� 
	@Override //�θ��� �ʵ带 ������ �ߴٴ� ǥ��
	public String toString() {
		return "���� tv �� "+this.p.v+"��Ʈ���� �����ϰ� LED(OLED) "+oled.length+"�� �ֽ��ϴ�. �����ڴ� "+super.toString();
	}
	//�θ𿡰� �������� �ʵ�� super�� �����ϰ� �θ𿡰� �����޾Ҵµ� �������� ���� this�� �����Ѵ�. 
	
}
public class L24SuperField {
	public static void main(String[]args) {
		TeleVision tv= new TeleVision(220, 7); //1.Object�� ������ �����͸� �����ϴ� ���赵  
		System.out.println(tv.toString());
	}
}
