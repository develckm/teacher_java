package com.econ.test;

import java.util.ArrayList;
import java.util.LinkedList;

public class T02ArrayListLinked {
	public static void main(String[]args) {
		String [] arr=new String[1000000];
		ArrayList<String> list=new ArrayList<String>();
		LinkedList<String> linked=new LinkedList<String>();
		for( int i=0; i<arr.length; i++) {
			arr[i]=i+"";
			list.add(i+"");
			linked.add(i+"");
		}
		////////////Array �� ArrayList�� LinkedList �ݺ��� �ӵ� �׽�Ʈ 
		String nums="";
		long start=System.nanoTime();
		for(String num:arr) {
		}
		long end=System.nanoTime();
		
		System.out.println("\nArray �ݺ��� :"+(end-start));
		start=System.nanoTime();
		for(String num:list) {}
		end=System.nanoTime();
		System.out.println("\n List �ݺ��� :"+(end-start));
		start=System.nanoTime();
		for(String num:linked) {}
		end=System.nanoTime();
		System.out.println("\nlinked�ݺ��� :"+(end-start));
		//�迭�� �ܼ� ��ȸ�� Array >> ArrayList > LinkedList
		
		start=System.nanoTime();
		arr[999999]="����";
		end=System.nanoTime();
		System.out.println("\nArray[99999] ����:"+(end-start));
		start=System.nanoTime();
		list.set(99999, "����");
		end=System.nanoTime();
		System.out.println("\nlist.set(99999) ����:"+(end-start));
		start=System.nanoTime();
		linked.set(99999, "����");
		end=System.nanoTime();
		System.out.println("\nlinked.set(99999) ����:"+(end-start));
		//�迭�� Ư�� �ε����� �� ����  Array >> ArrayList >> LinkedList

		start=System.nanoTime();
		list.remove(5);
		end=System.nanoTime();
		System.out.println("\nlist.remove(5) ����:"+(end-start));
		start=System.nanoTime();
		linked.remove(5);
		end=System.nanoTime();
		System.out.println("\nlinked.remove(5) ����:"+(end-start));
		
		
		start=System.nanoTime();
		list.add(5,"�߰�");
		end=System.nanoTime();
		System.out.println("\nlist.add(5) �߰�:"+(end-start));
		start=System.nanoTime();
		linked.add(5,"�߰�");
		end=System.nanoTime();
		System.out.println("\nlinked.add(5) �߰�:"+(end-start));

/*
 * ��ȸ�� �ִ� ��� Array
 * Array�� �� �� ���� �͵� (�˻�, ���� ������ ����,���� ������ �����ο� ���) ArrayList 
 * Array�� �� �� ���� �͵� + ���� �������� �߰�,������ ����Ѱ��� LinkedList 
 * */
/*
 * �迭�� � �ڷᱸ���ΰ���??
 *=>�ε����� �����ϰ� ���̰� �ִ� �ڷ� �����Դϴ�.
 *=>�ڹٿ��� �迭�̶� �θ��� Array�� ������ ArrayList�� LinkedList�� �ֽ��ϴ�. �̸� �÷��� ������ ��ũ�� �θ��ϴ�.
 *=>�÷��������ӿ�ũ�� ����� �ֳ�? list�� set�� map�� ������ Ŭ������ �ֽ��ϴ�. 
 *=>Array�� ArrayList�� LinkedList�� �������� �����ΰ���? 
 *=>Array�� �����͸� ������� �����ؼ� ���̿� �ε����� �ִ� �ڷ� ����
 *=>ArrayList�� Array �����ѵ� ���̰� ���� �� �ְ� �迭�� �����ϴ� �ʵ尡 �����Ѵ�. 
 *=>LinkedList�� list�� �����ؼ� ArrayList�� ���� �����ѵ� �����Ͱ��� ��ũ�� �־� �߰��� �����͸� �����ص�
 * ������ �����͵��� �аų� ����� �ʱ� ������ ���� �ӵ��� ������. 
 * */				
	}
}










