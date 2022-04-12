package com.econ.synchronize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

public class L03Synchronize {
	
	//������ȯ�濡�� ����� �� �ִ� ������
	static AtomicInteger s_i=new AtomicInteger(0);
	//vector �� ArrayList�� ������ ���� ����ϴ� Ÿ������ ���� �Ȱ����� ������ ������� �ʰ� 
	//��� ��Ƽ������ ȯ�濡�� ����ȭ�� �ȴ�.
	static List vetor=new Vector();
	static List arr= Collections.synchronizedList(new ArrayList());
	static Map map=Collections.synchronizedMap(new HashMap());
	static List list= new ArrayList();
	public static void main(String[] args) throws InterruptedException {
		Thread[] t_arr=new Thread[100000];
		for(int k=0; k<100000; k++) {
			Thread t=new Thread() {
				@Override
				public void run() {
					for(int i=0; i<100; i++) {
						s_i.incrementAndGet(); 
						//s_i++;//�⺻���� �ƴϱ� ������ �⺻ ������ �Ұ���
						//s_i.set(s_i.get()+1);
						vetor.add(i);
						arr.add(i);
						map.put(i, i);
						//����ȭ �� (�⺻���� ����)
						synchronized (list) {
							list.add(i);
						}
					}
				}
			};
			t.start();
			t_arr[k]=t;
		}
		for(Thread t:t_arr) {
			t.join();
		}
		System.out.println(s_i.get());
		System.out.println(vetor.size());
		System.out.println(arr.size());
		System.out.println(map.size());
		System.out.println(list.size());

	}
}
