package com.econ;
//�̿ϼ�type�� abstract class�� �������� (interface�� class�� ����)
interface TVable{ //�������̽� ������ ��� �޼ҵ��  public abstract�� ������ �߻� �޼ҵ�� 
	void turnChannel();
	void powerOff();
	void powerOn();
	void choiceChannel(int num);
}
abstract class MTV implements TVable{
	//�߻�Ŭ������ �߻� �޼��带 ������ �� �ִ�. 
	int volume;
	public void speaker(int volume) {
		this.volume=volume;
		System.out.println("�Ҹ��� "+this.volume+"��ŭ Ŀ�����.");
	}
	public void powerOn() {
		System.out.println("tv ������ �������ϴ�.");
	}
	public void powerOff() {
		System.out.println("tv ������ �������ϴ�.");
	}
	
}
class TV extends MTV{
	public void turnChannel() {
		System.out.println("ä���� ��ĭ ���������!");
	}
	public void choiceChannel(int num) {		
		System.out.println("ä���� "+num+"���� ���������.");
	}
	
}
public class L30AbstractClass {
	public static void main(String []args) {
		//MTV mtv=new MTV();
		MTV tv=new TV();// �߻�Ŭ������ Ÿ���� �� �� �ִ�.
		TVable tv2=new TV(); 
		TV tv3=new TV();
	}
}
