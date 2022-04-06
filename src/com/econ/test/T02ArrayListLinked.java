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
		////////////Array 와 ArrayList와 LinkedList 반복문 속도 테스트 
		String nums="";
		long start=System.nanoTime();
		for(String num:arr) {
		}
		long end=System.nanoTime();
		
		System.out.println("\nArray 반복문 :"+(end-start));
		start=System.nanoTime();
		for(String num:list) {}
		end=System.nanoTime();
		System.out.println("\n List 반복문 :"+(end-start));
		start=System.nanoTime();
		for(String num:linked) {}
		end=System.nanoTime();
		System.out.println("\nlinked반복문 :"+(end-start));
		//배열의 단순 조회는 Array >> ArrayList > LinkedList
		
		start=System.nanoTime();
		arr[999999]="수정";
		end=System.nanoTime();
		System.out.println("\nArray[99999] 수정:"+(end-start));
		start=System.nanoTime();
		list.set(99999, "수정");
		end=System.nanoTime();
		System.out.println("\nlist.set(99999) 수정:"+(end-start));
		start=System.nanoTime();
		linked.set(99999, "수정");
		end=System.nanoTime();
		System.out.println("\nlinked.set(99999) 수정:"+(end-start));
		//배열의 특정 인덱스의 값 변경  Array >> ArrayList >> LinkedList

		start=System.nanoTime();
		list.remove(5);
		end=System.nanoTime();
		System.out.println("\nlist.remove(5) 삭제:"+(end-start));
		start=System.nanoTime();
		linked.remove(5);
		end=System.nanoTime();
		System.out.println("\nlinked.remove(5) 삭제:"+(end-start));
		
		
		start=System.nanoTime();
		list.add(5,"추가");
		end=System.nanoTime();
		System.out.println("\nlist.add(5) 추가:"+(end-start));
		start=System.nanoTime();
		linked.add(5,"추가");
		end=System.nanoTime();
		System.out.println("\nlinked.add(5) 추가:"+(end-start));

/*
 * 조회만 있는 경우 Array
 * Array로 할 수 없는 것들 (검색, 뒤쪽 데이터 삭제,길이 수정이 자유로운 경우) ArrayList 
 * Array로 할 수 없는 것들 + 앞쪽 데이터의 추가,삭제가 빈번한경우는 LinkedList 
 * */
/*
 * 배열은 어떤 자료구조인가요??
 *=>인덱스를 참조하고 길이가 있는 자료 구조입니다.
 *=>자바에는 배열이라 부르는 Array와 유사한 ArrayList와 LinkedList가 있습니다. 이를 컬렉션 프레임 워크라 부릅니다.
 *=>컬렉션프레임워크에 어떤것이 있냐? list와 set과 map을 구현한 클래스가 있습니다. 
 *=>Array와 ArrayList와 LinkedList의 차이점은 무엇인가요? 
 *=>Array는 데이터를 순서대로 정렬해서 길이와 인덱스가 있는 자료 구조
 *=>ArrayList는 Array 동일한데 길이가 변할 수 있고 배열을 지원하는 필드가 존재한다. 
 *=>LinkedList는 list를 구현해서 ArrayList와 거의 동일한데 데이터간에 링크가 있어 중간에 데이터를 삭제해도
 * 나머지 데이터들을 밀거나 당기지 않기 때문에 연산 속도가 빠르다. 
 * */				
	}
}










