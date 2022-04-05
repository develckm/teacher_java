package com.econ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class L40HashMap {
	public static void main(String[]args) {
		//Map�� key�� ���ڿ� ���� �ٸ� Ÿ�Ե� ��밡�� 
		Map<String, String> user=new HashMap<String, String>();
		user.put("name", "�ְ��");
		user.put("age", "37");
		user.put("phone", "010-0000-0000");
		//Map�� ������ ����. 
		System.out.println(user.size());
		System.out.println(user);
		System.out.println("user.phone:"+user.get("phone"));
		System.out.println(user.containsKey("phone"));
		System.out.println(user.containsValue("�ְ��"));
		System.out.println(user.remove("age"));
		System.out.println(user);
		user.put("age", "27");
		System.out.println(user);
		user.put("age", "47");
		System.out.println(user);
		//Map ��ü ���
		
		Set set=user.entrySet(); //Map�� Iterator�� ����Ϸ��� Set�� ������ �޾ƾ��Ѵ�.
		Iterator it=set.iterator();
		while(it.hasNext()) {
			Map.Entry u=(Map.Entry)it.next();
			System.out.println(u.getKey()+":"+u.getValue());
		}
		System.out.println("//////////////////////////////////////////");
		///////////////�ڹٵ� �ڹٽ�ũ��Ʈ ó�� �ݺ��� ����� ���� ����//////////
		for(Map.Entry u : user.entrySet()) {
			System.out.println(u.getKey()+":"+u.getValue());

		}
		//////////////�ڹٽ�ũ��Ʈ for in ó�� key�� ���ͼ� �ݺ��� �ۼ� 
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





