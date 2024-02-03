package demo;

import java.util.Iterator;
import java.util.TreeSet;

public class treeSetDemo {

	public static void main(String[] args) {
		System.out.println("TreeSet Demo  \n \n ");
		
		TreeSet<String> namesList = new TreeSet<String>();
		
		namesList.add("james");
		namesList.add("zetty");
		namesList.add("alex");
		namesList.add("peter");
		namesList.add("robert");
		namesList.add("amy");
		System.out.println("looping through namesList \n ");
		for(String i : namesList ) {
			System.out.println(i);
		}

		namesList.remove("alex");
		namesList.remove("amy");
		System.out.println("looping through namesList after removing objects   \n \n ");
		Iterator<String> itr= namesList.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.printf("%s \n",str);
		}
		

	}

}
