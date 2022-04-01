package com.econ;
//import java.lang.*;
class Receiver{}
class HDMI{}
class LED{}
class Power{ int v; Power(int v){this.v=v; }}
//class TeleVision extends Object{ 생략되어 있
class TeleVision{

	LED [] oled;
	Receiver s; //타입을 한글로 사용하지 마세요
	HDMI hdmi;
	Power p;
	int chanel;
	public TeleVision(int voltage,int chanel){
		//생성자가 하는 일은 필드를 정의하고, 파라미터로 넘어온 값으로 기본값을 정의하는 것  
		this.oled=new LED[10000000];	
		this.s=new Receiver(); //타입을 한글로 사용하지 마세요
		this.hdmi=new HDMI();
		this.p=new Power(voltage);
		this.chanel=chanel;
		//System.out.println("생산자 :"+super.toString());
		System.out.println("환영합니다 에이콘 tv :"+this.toString());
		//부모에서 정의한 이름과 같은 이름의 함수를 정의하는 것을 오버라이딩이라 하고
		//이름이 같은데 super or this로 다르게 접근할 수있는 상태를 다형성이라 한다. 
	}
	//2.Object.String() 객체에 대한 설명서 
	@Override //부모의 필드를 재정의 했다는 표시
	public String toString() {
		return "저희 tv 는 "+this.p.v+"볼트에서 동작하고 LED(OLED) "+oled.length+"개 있습니다. 생산자는 "+super.toString();
	}
	//부모에게 물려받은 필드는 super로 접근하고 부모에게 물려받았는데 재정의한 것은 this로 접근한다. 
	
}
public class L24SuperField {
	public static void main(String[]args) {
		TeleVision tv= new TeleVision(220, 7); //1.Object가 참조형 데이터를 생성하는 설계도  
		System.out.println(tv.toString());
	}
}
