package com.econ;
//���׸��� ����ϸ� Ÿ�� �������� ������
//����ȯ�̳� �� üũ�� �� �ʿ䰡 ���� �ڵ尡 ����������.
//���׸��� Ÿ�Ժ����� �⺻���� ����� �� ����. 
//Ÿ�� ������ ���� �����ϰ� ������ extends �� �ϸ� �ȴ�!!!
class ArrPrint<T extends Integer>{ //T Ÿ�� ���� (���׸�)
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
		String[] arr2= {"200","���","40"};
		//new ArrPrint<String>(arr2);
		//���׸��� Ÿ�Ժ����� ������� ������ �ڵ����� Object���ȴ�.
	}
}
