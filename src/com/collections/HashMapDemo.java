package com.collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//objects can be entered as key-values pairs
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(101, "prasanna");
		hm.put(102, "vissu");
		hm.put(103, "surekha");
		hm.put(104, "madhu");
		
		System.out.println(hm.get(104));
		System.out.println(hm);
		System.out.println(hm.containsKey(103));
		System.out.println(hm.containsValue("vissu"));
		System.out.println(hm.keySet());
		System.out.println(hm.values8());
	}

}
