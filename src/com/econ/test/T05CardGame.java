package com.econ.test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class Card{
	int num;
	String img;
	boolean flip;
	Card(int num){
		this.num=num;
	}
}
public class T05CardGame {
	public static void main(String[]args) {
		//짝 맞추기 카드게임 
		Integer [] cards= {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9};
		Integer [] random_cads=new Integer[18]; 
		for(int i=0; i<cards.length;) {
			int random=(int)((new Random().nextDouble())*18);			
			if(random_cads[random]==null) {
				random_cads[random]=cards[i];
				i++;
			}
		}
		System.out.println(new ArrayList(Arrays.asList(random_cads)));
	}
}
