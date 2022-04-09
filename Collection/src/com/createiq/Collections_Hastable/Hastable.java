package com.createiq.Collections_Hastable;

import java.util.Hashtable;

public class Hastable {
	
	public static void main(String [] args) {
		
		Hashtable<Integer, Integer> ht = new Hashtable<>();
		
		ht.put(100, 1);
		ht.put(101, 2);  // we are passing a integer key and integer value
		ht.put(102, 3);
		ht.put(103, 4);
		
//		ht.remove(103);
		
		System.out.println(ht);
		
		
	}

}
