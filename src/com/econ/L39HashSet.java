package com.econ;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class L39HashSet {
	public static void main(String[]args) {
		HashSet num_set=new HashSet();
		num_set.add(1);
		num_set.add(1);
		num_set.add(1);
		num_set.add(2);
		num_set.add(2);
		num_set.add(3);
		num_set.add(new Integer(3));

		//add�� �Ͼ�� ��� ��� �߿� ���� ���� �ִ��� �˻� �� ���Ѵ�  
		System.out.println(num_set);
		
		Set<String> str_set=new HashSet<String>();
		str_set.add("�ȳ�");
		str_set.add("�ڹ�");
		str_set.add("��!");
		str_set.add("�ȳ�");
		str_set.add(new String("�ȳ�")); //set���� ���� ���Ҷ� "==" or equals() �߿� ������� ���ϴ� �� Ȯ�� 
		System.out.println(str_set);
		//��ü�� �������� equals()�� �� �� ���Ѵ�.
		System.out.println(str_set.contains("�ȳ�")); 
		System.out.println(str_set.size());
		//set�� ����� ������ index�� key���� ������ �� �ִ� ���� ����.(������ ����.)
		//set�� ����� Iterator �ۿ� ����� ����.
		Iterator<String> it =str_set.iterator();
		System.out.print("[");
		while(it.hasNext()) {
			System.out.print(it.next()+", ");
		}
		System.out.print("]\n");

	}
}
