package com.econ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class L40HashMap {
	public static void main(String[]args) {
		//Map의 key는 문자열 외의 다른 타입도 사용가능 
		Map<String, String> user=new HashMap<String, String>();
		user.put("name", "최경민");
		user.put("age", "37");
		user.put("phone", "010-0000-0000");
		//Map은 순서가 없다. 
		System.out.println(user.size());
		System.out.println(user);
		System.out.println("user.phone:"+user.get("phone"));
		System.out.println(user.containsKey("phone"));
		System.out.println(user.containsValue("최경민"));
		System.out.println(user.remove("age"));
		System.out.println(user);
		user.put("age", "27");
		System.out.println(user);
		user.put("age", "47");
		System.out.println(user);
		//Map 전체 출력
		
		Set set=user.entrySet(); //Map이 Iterator를 사용하려면 Set의 도움을 받아야한다.
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Map.Entry u=(Map.Entry)it.next();
			System.out.println(u.getKey()+":"+u.getValue());
		}
		System.out.println("//////////////////////////////////////////");
		///////////////자바도 자바스크립트 처럼 반복문 출력을 쉽게 지원//////////
		for(Map.Entry u : user.entrySet()) {
			System.out.println(u.getKey()+":"+u.getValue());

		}
		//////////////자바스크립트 for in 처럼 key만 빼와서 반복문 작성 
		System.out.println("//////////////////////////////////////////");
		Iterator<String> it_keys=user.keySet().iterator();
		while(it_keys.hasNext()) {
			String key=it_keys.next();
			String val=user.get(key);
			System.out.println(key+":"+val);
		}
		System.out.println("//////////////////////////////////////////");
		for(String key : user.keySet()) {
			String val=user.get(key);
			System.out.println(key+":"+val);

		}
		System.out.println("///////////////////java8 forEach///////////////////////");
		user.forEach((key,value)->{
			System.out.println(key+":"+value);
		});
	}
}





