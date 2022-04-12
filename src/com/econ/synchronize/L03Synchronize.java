package com.econ.synchronize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

public class L03Synchronize {
	
	//스레드환경에서 사용할 수 있는 정수형
	static AtomicInteger s_i=new AtomicInteger(0);
	//vector 는 ArrayList가 나오기 전에 사용하던 타입으로 거의 똑같은데 지금은 사용하지 않고 
	//대신 멀티스레드 환경에서 동기화가 된다.
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
						//s_i++;//기본형이 아니기 때문에 기본 연산은 불가능
						//s_i.set(s_i.get()+1);
						vetor.add(i);
						arr.add(i);
						map.put(i, i);
						//동기화 블럭 (기본형은 금지)
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
