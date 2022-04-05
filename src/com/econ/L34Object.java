package com.econ;

import java.lang.Object;
import java.util.Objects;
import java.util.Scanner;
class NoteBook{
	String keyboard="키보드";
	String monitor="OLED모니터";
	String mouse="터치패드";
	@Override
	public String toString() {
		return "NoteBook={\"keyboard\": \"" + keyboard + "\", \"monitor\": \""
				+ monitor + "\", \"mouse\": \"" + mouse + "\"}";
	}
	@Override
	public int hashCode() {
		return Objects.hash(keyboard, monitor, mouse);
	}
	//정석의 검사식 
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //두개가 완전히 같은지 
			return true;
		if (obj == null) //null은 비교하지 않겠다. 
			return false;
		if (getClass() != obj.getClass()) //타입이 다른지 
			return false;
		NoteBook other = (NoteBook) obj; 
		return (Objects.equals(keyboard, other.keyboard)
				&& Objects.equals(monitor, other.monitor)
				&& Objects.equals(mouse, other.mouse));
	}
}
//${object.className}={"${member.name()}":"${member.value}","${otherMembers}"}
public class L34Object {
	public static void main(String[]args) {
		NoteBook nb=new NoteBook();
		System.out.println(nb);
		System.out.println(nb.getClass());
		NoteBook nb2=new NoteBook();
		System.out.println("nb==nb2:"+(nb==nb2));
		System.out.println("nb.equals(nb2):"+(nb.equals(nb2)));
		nb2.keyboard="야광키보드";		
		System.out.println("nb.equals(nb2):"+(nb.equals(nb2)));
		String a="안녕";
		String b="안녕";
		String d=new String("안녕");
		System.out.println(a==b);
		System.out.println(a==d);
		Scanner sc= new Scanner(System.in);
		String c=sc.nextLine();
		System.out.println(a==c);
		
		//모든 클래스틑 Object를 상속받는다
		//1. 생성자를 작성할 수 있다.
		//2. new 연산자로 객체를 생성할 수 있다.
		//3. toString()으로 객체 설명서를 재정의 할 수 있다.
		//4. equals()로 객체 간의 비교를 할 수 있다.
	}
}
