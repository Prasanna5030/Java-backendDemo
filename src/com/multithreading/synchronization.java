package com.multithreading;

import java.util.ArrayList;
import java.util.List;

import healthcare.Doctor;

public class synchronization implements Runnable{
	Doctor d= new Doctor("prasanna", 24);
	public void run()
	{
		for(int i=0; i<=10; i++){
			System.out.printf("hi %s \n",i);
		}
		synchronized(d) {
			for(int i=0; i<=10; i++) {
				List<Doctor> listOFDoctors = new ArrayList<Doctor>();
				listOFDoctors.add(d);
				System.out.printf("Doctors added :%s \n",d.name );
				
			}
			
     	}
	for(int i=0; i<=10; i++){
		System.out.printf("namaste %s \n",i);
		}
	}
	
}
