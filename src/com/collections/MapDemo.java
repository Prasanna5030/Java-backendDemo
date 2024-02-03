package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		
		//map 
		List<String> li = Arrays.asList("prasanna","satya", "muramalla","kumar");
//		List<String> list= new ArrayList<String>();
//		list=li.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
//		System.out.println(list); 
		
		
		//map
		List<Integer> nl = Arrays.asList(2,4,5,2,10,30);
//		
//		List<Integer> al = new ArrayList<Integer>();
//		
//		al= nl.stream().map(i->i*2).collect(Collectors.toList());
//		System.out.println(al);
		
		//forEach
		List<Integer> nums = Arrays.asList(2,3,4,5,6,7,8,9);
		nums.forEach(i->System.out.println(i));
	
		
	}
}
