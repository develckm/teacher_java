package com.econ.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class T06CardGame2 {
	public static void main(String[]args) {
		//짝 맞추기 카드게임 
		Integer [] cards= {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9};
		LinkedList<Integer> card_list=new LinkedList<Integer>(Arrays.asList(cards));
		Integer [] random_cads=new Integer[18]; 
		for(int i=0; i<random_cads.length; i++) {
			int random=(int)(new Random().nextDouble()*card_list.size());
			int random_obj=card_list.remove(random);
			random_cads[i]=random_obj;
		}
		System.out.println(new ArrayList(Arrays.asList(random_cads)));
	}
}
