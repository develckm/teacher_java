package com.econ;

//추상 클래스인 Clock을 만든다.
//run에서 바늘이 1초에 몇번 움직일 건지 정하고(구현)
//start로 실행하면 시계가 운직인다. 
abstract class Clock{
	int count=0;
	String name="아날로그 시계";
	abstract void run(int count);
	public void start() {
		System.out.println(name+" 1초에 "+count+"번 움직인다.");
	}
}
class AClock extends Clock{
	void run(int count) {
		this.count=count;
	}	
}

public class L31AbstractCalss2 {
	public static void main(String []args) {
		Clock c2=new Clock() { //익명클래스가 생성된다,AClock과 동일한 형태의 클래스지만 이름이 없는 형태다.
			void run(int count) {
				this.count=count;
			}
		}; //추상 클래스를 객체로 생성하려면 꼭 바디를 만들어야한다. 
		c2.run(2);
		c2.start();

		Clock c=new AClock();
		c.run(1);
		c.start();
	}
}





