package com.multithreading;

public class syncDemo1 {

	public static void main(String[] args) {
		synchronization s1 = new synchronization();
		Thread t1= new Thread(s1);
		t1.start();
		Thread t2= new Thread(s1);
		t2.start();
		
		
	}

}
