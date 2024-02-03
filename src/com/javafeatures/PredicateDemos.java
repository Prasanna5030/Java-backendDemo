package com.javafeatures;

import java.util.function.Predicate;

public class PredicateDemos {

	public static void main(String[] args) {
		Predicate<Integer> isEven= i->i%2==0;
		Predicate<Integer> isDivisbleby10 = i->i%10==0;
		Predicate<Integer> isDivisbleby4= i->i%4==0;
		
		int[] intArr= {2,4,8,20,15,20,24,30,40,64,100,44,60};
		
		isEvenAndDivby4(isEven.and(isDivisbleby4), intArr);
		
		isEvenAndDivBy10(isEven.and(isDivisbleby10), intArr);
	}

	public static void isEvenAndDivby4(Predicate<Integer> p, int[] array) {
		for(int i : array) {
			if(p.test(i))
				
			System.out.println(i);
		}
	}
	public static void isEvenAndDivBy10(Predicate<Integer> p, int[] arr) {
		for(int i : arr) {
			if(p.test(i))
				System.out.println(i);
		}
	}
}
