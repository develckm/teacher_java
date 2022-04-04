package com.econ;

import java.util.Timer;
import java.util.TimerTask;

class Engine{
	int oil;
	int RPM;
	public void upRPM(int oil) {
		this.oil=oil;
		++this.RPM;
	}
	public void downAccel(int push) {}
}

//interface는 class의 설계도 (type을 명시하기 전에 스케치를 하는 것)
interface Carable{//자동차의 설계도 => 바디를 명시할 수없다.
	String handle="핸들";//public String final static handle="핸들";(class 변수)
	//Carable(){} //인터페이스는 객체의 설계도기 때문에 생성자를 명시할 수 없다. 
	void turnLeft(int left);
	void turnRight(int right);
	void downAccel(int push);
	//private void upRPM(int oil){} //private은 내부에서만 사용가능한데 인터페이스는 설계도의 설계도이기 때문에 private은 쓸모가 없다.
}
interface Carable2{
	//바디가 구현되지 않은 메소드를 추상메소드라 하고 interface내부에서는 생략가능(모든 메소드가 추상메소드)하다.  
	public abstract void moveForward();
	public abstract void moveBackward();
	public abstract void downAccel(int push);
}

//인터페이스는 extends가 아니라 implements로 구현해야한다.
class BMW extends Engine implements Carable,Carable2 {
	//인터페이스에는 메소드만 존재하고 멤버 변수가 없기 때문에 상속받은 변수와 멤버 변수가 겹치지 않는다.
	//인터페이스의 메소드는 구현되지 않은 설계도 형태기 때문에 상속받은 메소드와 이름이 겹쳐도 아무 상관이 없다. 
	public void turnLeft(int left){}
	public void turnRight(int right){}
	public void downAccel(int push){} //Engine의 메소드가 우선순위가 높다. 
	public void moveForward(){}
	public void moveBackward(){}
}
class QM3 extends Engine implements Carable{
	@Override
	public void turnLeft(int left) {}
	@Override
	public void turnRight(int right) {
		super.downAccel(20);
	}
}
class MoveCar{
	Carable b; 
	public MoveCar(Carable b) {
		this.b=b;
	}
	public void leftMove(int a) {
		b.turnLeft(a);
		System.out.println(a+"만큼 왼쪽으로 움직였다.");
	}
	public void rightMove(int a) {
		b.turnRight(a);
		System.out.println(a+"만큼 오른쪽으로 움직였다.");
	}

}
public class L29Interface {	
	public static void main(String[]args) {
		System.out.println(Carable.handle);
		//Caralbe c=new Carable(); //인터페이스는 객체가 될 수 없다.
		BMW b=new BMW();
		Carable bmw=(Carable)new BMW();
		Carable qm3=new QM3();
		//두개의 다른 타입의 객체를 1개의 타입으로 참조함 
		
		new MoveCar(new BMW()).rightMove(100); //QM3를 움직이려면 어떻게 해야할까???? 
		new MoveCar(new QM3()).rightMove(50);
	}

}

































