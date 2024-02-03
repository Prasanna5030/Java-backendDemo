package com.multithreading;

import java.util.concurrent.Callable;

public class calls implements Callable<String>{

	public String call() throws InterruptedException {
		String s= "prasanna";
		for(int i=0 ;i<500; i++) {
			Thread.sleep(500);
			System.out.printf("%s %s \n", s, i);
		} 
		s=s.concat("muramalla");
		return s;
		
	}
}
