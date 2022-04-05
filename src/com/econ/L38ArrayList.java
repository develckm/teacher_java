package com.econ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List; 
//util 패키는 개발에 유용한 class가 다수 포함됨 
//그 중에 대표적인게 자료형에 해당하는 컬렉션프레임워크가 있다.(list,set,map)
public class L38ArrayList {
	public static void main(String[]args) {
		int []a=new int [3]; //	배열은 선언시 길이를 고정해야 한다.
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+",");
		}
		System.out.println();
		String []b=new String[4];
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+",");
		}
		byte []c= {127,1,4}; //배열은 고정길이 만큼 미리 선언해야한다.(길이가 변하지 않는다.)
		
		//Array의 필드는 length 밖에 없다. 
		System.out.println("\nc.length:"+c.length);
		//Array는 가볍고 리털럴표기법을 지원해서 선언하기 변하지만 지원해주는 함수가 전혀없다.
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
		
		//int_list 의 총 합을 구하세요 
		int sum=0;
		for(int i=0; i<int_list.size(); i++) {
			sum+=int_list.get(i);
		}
		System.out.println("int_list total:"+sum);
		System.out.println(int_list.contains(301)); //있으면 true 없으면 false
		System.out.println(int_list.indexOf(320)); //있으면 index 없으면 -1
		System.out.println(int_list.indexOf(0));

		System.out.println(int_list); //toString이 구현되어 있다.
		System.out.println(int_list.remove(3)); //삭제한 값이 나오고 삭제한 위치만큼 한칸씩 순서를 당긴다.
		System.out.println(int_list); 

		//ArrayList 를 선언할 때 꼭 add로 값을 더해야한다.
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(0);
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add(2, 1000); //2번째 자리 이후의 요소를 다 한칸씩 밀고 2번째 자리에 1000을 추가
		list2.set(4, -10); //특정 인덱스에 요소(값)을 바꾼다. 
		System.out.println(list2);
		
		//////////////////////////////////////////////
		Iterator<Integer> it=list2.iterator();
		System.out.print("[");
		while(it.hasNext()) {
			System.out.print(it.next()+" ,");
		}
		System.out.println("]\n");
		////////////////////////////////////////////////
		
		//참조형의 Array를 ArrayList로 형변환 하는 방법(기본형이X)
		Integer[]nums= {11,12,13,14,15,16,17,18};
		ArrayList<Integer> num_list=new ArrayList<Integer>(Arrays.asList(nums));
		System.out.println(num_list);
		//for each 문
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
