package com.econ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List; 
//util ��Ű�� ���߿� ������ class�� �ټ� ���Ե� 
//�� �߿� ��ǥ���ΰ� �ڷ����� �ش��ϴ� �÷��������ӿ�ũ�� �ִ�.(list,set,map)
public class L38ArrayList {
	public static void main(String[]args) {
		int []a=new int [3]; //	�迭�� ����� ���̸� �����ؾ� �Ѵ�.
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
		String []b=new String[4];
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+",");
		}
		byte []c= {127,1,4}; //�迭�� �������� ��ŭ �̸� �����ؾ��Ѵ�.(���̰� ������ �ʴ´�.)
		
		//Array�� �ʵ�� length �ۿ� ����. 
		System.out.println("\nc.length:"+c.length);
		//Array�� ������ ���з�ǥ����� �����ؼ� �����ϱ� �������� �������ִ� �Լ��� ��������.
		ArrayList<Object> list =new ArrayList<Object>();
		list.add("20");
		list.add(20);
		list.add(10.3);
		list.add(400.0f);
		System.out.println("list.size():"+list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+",");
		}
		System.out.println();
		List<Integer> int_list=new ArrayList<Integer>();
		int_list.add(300);
		int_list.add(30);
		int_list.add(-100);
		int_list.add(300);

		int_list.add(320);
		int_list.add(20);
		int_list.add(1);
		int_list.add(30);
		int_list.add(33);
		
		//int_list �� �� ���� ���ϼ��� 
		int sum=0;
		for(int i=0; i<int_list.size(); i++) {
			sum+=int_list.get(i);
		}
		System.out.println("int_list total:"+sum);
		System.out.println(int_list.contains(301)); //������ true ������ false
		System.out.println(int_list.indexOf(320)); //������ index ������ -1
		System.out.println(int_list.indexOf(0));

		System.out.println(int_list); //toString�� �����Ǿ� �ִ�.
		System.out.println(int_list.remove(3)); //������ ���� ������ ������ ��ġ��ŭ ��ĭ�� ������ ����.
		System.out.println(int_list); 

		//ArrayList �� ������ �� �� add�� ���� ���ؾ��Ѵ�.
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(0);
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(2, 1000); //2��° �ڸ� ������ ��Ҹ� �� ��ĭ�� �а� 2��° �ڸ��� 1000�� �߰�
		list2.set(4, -10); //Ư�� �ε����� ���(��)�� �ٲ۴�. 
		System.out.println(list2);
		
		//////////////////////////////////////////////
		Iterator<Integer> it=list2.iterator();
		System.out.print("[");
		while(it.hasNext()) {
			System.out.print(it.next()+" ,");
		}
		System.out.println("]\n");
		////////////////////////////////////////////////
		
		//�������� Array�� ArrayList�� ����ȯ �ϴ� ���(�⺻����X)
		Integer[]nums= {11,12,13,14,15,16,17,18};
		ArrayList<Integer> num_list=new ArrayList<Integer>(Arrays.asList(nums));
		System.out.println(num_list);
		//for each ��
		System.out.println("///////////for each(js for of)//////////////////");
		for(int num : num_list) {
			System.out.print(num+",");
		}
		System.out.println("\n///////////stream forEach(js forEach)//////////////////");
		num_list.forEach((num)->{
			System.out.print(num+",");
		});
		
	}
}
