package com.javafeatures;

import java.util.function.Predicate;
//interface A1{
//	boolean result(int i , int j);
//}
//
//class B1 implements A1{
//
//	@Override
//	public boolean result(int i , int j) {
//		if(i%j!=0) {
//			return true;
//		}else {
//			return false;
//		}
//		
//	}
//	
//}
public class javapredicate {

	public static void main(String[] args) {
		Predicate<Integer> predicates = (i)->i*i<100;
		System.out.printf("result is: %s", predicates.test(5));
//		A1 obj = new B1();
//		System.out.println(obj.result(4,5));
		
		String[] s= {"madhu", "prasanna", "surekha", "vissu", "jay","ron", "bob", "kathy", "Mahesh","suresh"};
		
		
		Predicate<String> predicate = s1->s1.equalsIgnoreCase("Prasanna");
		
		for(String s2 : s) {
			if(predicate.test(s2)) {
				System.out.println(s2);
			}
		}
		
		
	}
}
