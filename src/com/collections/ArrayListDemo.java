package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class User{
	int id;
	String name;
	int age;
	String city;
	
	public User(int id,String name ,int age,String city){
		this.id= id;
		this.name=name;
		this.age= age;
		this.city=city;
		
	}
}
public class ArrayListDemo {

	public static void main(String[] args) {
		User u1= new User(1, "prasanna", 24,"kakinada");
		User u2= new User(2, "madhu", 25,"hyderabad");
		ArrayList al = new ArrayList();
		
		al.add(100);
		al.add("kathy");
		al.add(true);
		al.add(20.05);
		System.out.println(al);
		
		al.add(2, 200);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		
		System.out.println(al.contains("kathy"));
		al.add(u1);
		al.add(u2);
		System.out.println(al);
		
		System.out.println( al.get(4));
		System.out.println(u1.name);
		
		
		String[] arr = {"cat","dog", "horse","bat"};
		ArrayList as = new ArrayList(Arrays.asList(arr));
		System.out.println(as);
		Collections.sort(as,Collections.reverseOrder());
		System.out.println(as);
		System.out.println(as.size());
	}
}


