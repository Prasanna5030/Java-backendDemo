package demo;

import java.util.ArrayList;

import healthcare.Doctor;

public class collectionsDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> a= new ArrayList<Integer>();
		a.add(new Integer(1));
		a.add(new Integer(2));
		a.add(new Integer(3));
		
		
		for (Integer i: a )
		System.out.printf("%s \n",i );
		
		
		ArrayList<Doctor> DoctorsList = new ArrayList<Doctor>();
		Doctor d1= new Doctor("Prasanna", 24);
		Doctor d2 =new Doctor("supriya", 23);
		Doctor d3 =new Doctor("lakshmi", 22);
		Doctor d4 = new Doctor("emma", 21);
		
		DoctorsList.add(d1);
		DoctorsList.add(d2);
		DoctorsList.add(d3);
		DoctorsList.add(d4);
	
		for(Doctor d :DoctorsList ) {
			System.out.printf("%s %s \n", d.name , d.getAge());
		}
	}

}
