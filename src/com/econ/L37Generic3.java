package com.econ;
//제네릭을 사용하면 타입 안정성을 제공해
//형변환이나 형 체크를 할 필요가 없어 코드가 간결해진다.
//제네릭의 타입변수로 기본형을 사용할 수 없다. 
//타입 변수의 형을 제한하고 싶으면 extends 를 하면 된다!!!
class ArrPrint<T extends Integer>{ //T 타입 변수 (제네릭)
	T[]arr;
	ArrPrint(T[]arr){
		this.arr=arr;
		System.out.println(arr.getClass()+":"+this.toString());
	}
	public String toString(){
		String msg="";
		for(int i=0; i<arr.length; i++) {
			msg+=arr[i]+",";
		}
		return msg;
	}
}
public class L37Generic3 {
	public static void main(String[]args) {
		Integer[] arr= {10,20,-200,30,40};
		new ArrPrint<Integer>(arr);
		String[] arr2= {"200","삼백","40"};
		//new ArrPrint<String>(arr2);
		//제네릭에 타입변수를 명시하지 않으면 자동으로 Object가된다.
	}
}
