package com.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<String> myCallable = new calls();
		ExecutorService executor = Executors.newFixedThreadPool(5);
		Future<String> future=executor.submit(myCallable);
		System.out.println(future.get());
	}

//	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		Callable<Integer> mycallable= new myCallable();
//		ExecutorService executor= Executors.newFixedThreadPool(10);
//		Future<Integer>  future=executor.submit(mycallable);
//		System.out.println(future.get());
//	}

}
