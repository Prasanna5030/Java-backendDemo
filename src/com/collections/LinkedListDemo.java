package com.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import healthcare.Doctor;

public class LinkedListDemo {

	public static void main(String[] args) {
		Doctor d1= new Doctor("laxmi", 24);
		Doctor d2= new Doctor("surya", 24);
		LinkedList li = new LinkedList();
		li.add(10);
		li.add("prasanna");
		li.add("kumar");
		li.add(24.03);
		li.add('M');
		li.add(true);
		li.add(d1);
		li.add(d2);
		
		System.out.println(li);
		li.remove(true);
		li.remove(2);
		li.add(2, "muramalla");
		System.out.println(li);
		Iterator itr= li.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());	
		}
		System.out.println(li.getLast());
		li.addFirst(1000);
		System.out.println(li);
		
		int[] arr1= {10,20,30,40,50};
		LinkedList<Integer> list = new LinkedList(Arrays.asList(arr1));
		System.out.println(list);
		
		
	}

}
