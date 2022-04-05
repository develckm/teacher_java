package com.econ;
class ArrayPrint{
	
	//배열은 기본형의 매개변수와 참조형의 매개변수를 확실히 구분한다. 
	public ArrayPrint(Object[]arr){
		String msg=arr.getClass()+"=";
		for(int i=0; i<arr.length; i++) {
			msg+=arr[i]+",";
		}
		System.out.println(msg);
	}
	//모든 타입을 매개변수로  받기위해 Object를 사용하면 
	//없는 필드 호출시 or 형변환 불가한 type으로 형변환시 오류 !
	//기본 데이터 타입의 배열을 사용할 수 없다. 
	//코드가 어떤 일을 하고 싶은지 불분명하다 
}


public class L36Generics2 {
	public static void main(String[]args) {
		Object[]arr= {100,20,1,-200,300,new Integer(120)};
		System.out.println(arr[0].getClass());
		//System.out.println(100.getClass());
		new ArrayPrint(arr);
		String[]arr2= {"100","20","1","-200","300","120"};
		new ArrayPrint(arr2);
		double[]arr3= {1.02,2.03,3.001,4.00001,5.21,7.11};
		//new ArraryPrint((Object)arr3); //배열을 캐스팅 형변환이 불가능하다

	}
}
