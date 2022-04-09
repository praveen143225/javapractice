package com.createiq.Collections;

import java.util.Vector;

public class VectorExample {
	
	public static void main(String [] args) {
		
		Vector<String> v = new Vector<String>();
		
		// by using a Add method of list
		v.add("Lion");
		v.add("tiger");
		v.add("cheetha");
		v.add("hiena");
		v.add("jaguar");
		
		//by using a AddElements method of Vector
		
		v.addElement("Goat");
		v.addElement("rat");
		v.addElement("Fish");
		
		System.out.println("Elements are :" +v);
		
		System.out.println(" the first animal is : "  + v.firstElement());
		
		System.out.println("size is :" + v.size());
		
		System.out.println("default capacity :"  + v.capacity());
		
		System.out.println("remove at the index of 4 :" + v.remove(4));
	}

}
