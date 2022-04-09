package com.createiq.Collections_Hastable;

import java.util.Hashtable;

public class Hashtable2 {
	
	//remove method is applied
	
	public static void main(String [] args) {
		
		Hashtable<Integer, String> map = new Hashtable<>();
		
			map.put(1, "Praveen");
			map.put(2, "Chandrakala");
			map.put(3, "Sunny");
			map.put(4, "Keerthana");
			
			System.out.println("Before removing is :" + map);
			
			//after removing method is 
			
			map.remove(1);
			
			System.out.println("After removing method is :" +map);
			
	}

}
