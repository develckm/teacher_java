package com.econ;
class ArrayPrint{
	
	//�迭�� �⺻���� �Ű������� �������� �Ű������� Ȯ���� �����Ѵ�. 
	public ArrayPrint(Object[]arr){
		String msg=arr.getClass()+"=";
		for(int i=0; i<arr.length; i++) {
			msg+=arr[i]+",";
		}
		System.out.println(msg);
	}
	//��� Ÿ���� �Ű�������  �ޱ����� Object�� ����ϸ� 
	//���� �ʵ� ȣ��� or ����ȯ �Ұ��� type���� ����ȯ�� ���� !
	//�⺻ ������ Ÿ���� �迭�� ����� �� ����. 
	//�ڵ尡 � ���� �ϰ� ������ �Һи��ϴ� 
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
		//new ArraryPrint((Object)arr3); //�迭�� ĳ���� ����ȯ�� �Ұ����ϴ�

	}
}
