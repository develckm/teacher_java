package com.econ;

import java.lang.Object;
import java.util.Objects;
import java.util.Scanner;
class NoteBook{
	String keyboard="Ű����";
	String monitor="OLED�����";
	String mouse="��ġ�е�";
	@Override
	public String toString() {
		return "NoteBook={\"keyboard\": \"" + keyboard + "\", \"monitor\": \""
				+ monitor + "\", \"mouse\": \"" + mouse + "\"}";
	}
	@Override
	public int hashCode() {
		return Objects.hash(keyboard, monitor, mouse);
	}
	//������ �˻�� 
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //�ΰ��� ������ ������ 
			return true;
		if (obj == null) //null�� ������ �ʰڴ�. 
			return false;
		if (getClass() != obj.getClass()) //Ÿ���� �ٸ��� 
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
		nb2.keyboard="�߱�Ű����";		
		System.out.println("nb.equals(nb2):"+(nb.equals(nb2)));
		String a="�ȳ�";
		String b="�ȳ�";
		String d=new String("�ȳ�");
		System.out.println(a==b);
		System.out.println(a==d);
		Scanner sc= new Scanner(System.in);
		String c=sc.nextLine();
		System.out.println(a==c);
		
		//��� Ŭ�����z Object�� ��ӹ޴´�
		//1. �����ڸ� �ۼ��� �� �ִ�.
		//2. new �����ڷ� ��ü�� ������ �� �ִ�.
		//3. toString()���� ��ü ������ ������ �� �� �ִ�.
		//4. equals()�� ��ü ���� �񱳸� �� �� �ִ�.
	}
}
