package com.javafeatures;

import java.util.function.Predicate;

//class demo implements Predicate<Integer>{
//	public boolean test(Integer i) {
//		if(i%2==0) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//}
public class PredicateDemo {

	public static void main(String[] args) {
//		demo d1= new demo();
//		System.out.println(d1.test(5));
		Predicate<String> predicate = i-> i.length()>5;
		System.out.println(predicate.test("saty"));
	}

}
