package com.econ;

import java.util.Date;

class Person2{
	//mysql : Person{name: "�ְ��",age:37,birth:"1986-05-25"} => java�� mysql Ŀ���� ���̺귯���� mysql�� data�� �ڹ��� ��ü�� ��ȯ
	 private String name;
	 private int age;
	 private Date birth;
	 //Ŀ���� ���̺귯������ �ϴ� ��
	 //Persion2 p=  new Person2();
	 //p.name="�ְ��";	 //????�ʵ��� �뵵�� �˼� ����. 
	 //p.setName("�ְ��"); //set�ʵ�() : �ʵ带 �����ϴ� �Լ�
	 
	 public void setName(String name) { //���̺귯���� �����ϴ� �뵵 
		 this.name=name;
	 }
	 public String getName() {//������ ����� �� ȣ���ϴ� �뵵
		 return this.name;
	 }
	 //getter setter �� �ʵ带 ĸ��ȭ�ϴ� ����(����������)�� �ʹ� ����ϱ� ���Ƽ� ������� ���Ǹ� �ڵ��ϼ��� �����Ѵ�. 
	//���콺 ������ -> Source => Generate Getters and Setters
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	 
	 
}

public class L28Beans {
	public static void main(String args) {
		//getter setter �� ĸ��ȭ�� �ʵ��� ������ beans�� �θ���.
		//�̴� ������������ �Ϻη� ����� �Ҷ� �޾ƿ� data�� java�� ��ü�� �����Ҷ� �����ϴ�.
		//��κ��� ���̺귯���� �����ӿ�ũ�� beans�� ������� ����Ѵ�. 
		
	}
}	
