package com.collections;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(2,4,6,7,9,10,13,17,16,24);
		
		Predicate<Integer> isEven = n1->n1%2==0;
		Predicate<Integer> isOdd = Predicate.not(isEven);
		
//		nums.forEach(n->n*2);
		
		System.out.println("'i from list:");
//		for(int i : nums) {
//			if(isEven.test(i)) {
//				System.out.println(i);
//			}
//		}
		System.out.println(nums);

	 List<Integer> li = nums.stream().filter(isEven).map(n->n*10).collect(Collectors.toList());
	 System.out.println(li);
	}

}
