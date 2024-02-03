package com.collections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		p.add("kumar");
		p.add("Prasanna");
		p.add("muramalla");
		p.add("satya");
		p.add("muramalla");
		p.poll();
System.out.println(p);
        p.poll();
	}

}
