package com.econ;

import java.util.Date;

class Person2{
	//mysql : Person{name: "최경민",age:37,birth:"1986-05-25"} => java의 mysql 커넥터 라이브러리가 mysql의 data를 자바의 객체로 변환
	 private String name;
	 private int age;
	 private Date birth;
	 //커넥터 라이브러리에서 하는 일
	 //Persion2 p=  new Person2();
	 //p.name="최경민";	 //????필드의 용도를 알수 없다. 
	 //p.setName("최경민"); //set필드() : 필드를 세팅하는 함수
	 
	 public void setName(String name) { //라이브러리가 세팅하는 용도 
		 this.name=name;
	 }
	 public String getName() {//실제로 사용할 때 호출하는 용도
		 return this.name;
	 }
	 //getter setter 로 필드를 캡슐화하는 행위(디자인패턴)이 너무 사용하기 좋아서 약속으로 사용되며 자동완성을 제공한다. 
	//마우스 오른쪽 -> Source => Generate Getters and Setters
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
		//getter setter 로 캡슐화한 필드의 집합을 beans라 부른다.
		//이는 디자인패턴의 일부로 통신을 할때 받아온 data를 java의 객체에 대입할때 용이하다.
		//대부분의 라이브러리와 프레임워크가 beans를 약속으로 사용한다. 
		
	}
}	
