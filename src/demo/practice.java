package demo;

import java.util.ArrayList;
import java.util.Iterator;

import healthcare.Doctor;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Doctor d1 = new Doctor("pk",  24);
    Doctor d2 = new Doctor("ms",  26);
    Doctor d3 = new Doctor("mspk",  28);
    Doctor d4 = new Doctor("spk",  30);
    Doctor d5 = new Doctor("msp",  34);
    
    Doctor[] listofDoctors= {d1, d2,d3, d4,d5 };
    
    ArrayList<Doctor> listOfDoctors= new ArrayList<Doctor>(); 
    listOfDoctors.add(d1);
    listOfDoctors.add(d2);
    listOfDoctors.add(d3);
    listOfDoctors.add(d4);
    listOfDoctors.add(d5);
    
    Iterator itr = listOfDoctors.iterator();
    
    while(itr.hasNext()) {
    	Doctor d = (Doctor) itr.next();
    	if(d.getAge()<30)
    	System.out.printf("%s %s \n", d.name , d.getAge());
    }
    
    for(Doctor d : listofDoctors) {
    	if(d.getAge()>29)
    	System.out.printf("%s %s \n" ,d.name , d.getAge());
    }
	}

}
