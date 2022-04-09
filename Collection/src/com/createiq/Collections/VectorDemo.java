package com.createiq.Collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String [] args) {
		
		
		
		Vector<String> vector = new Vector<String>();
		
		vector.add("praveen");
		
		vector.add("chandrakala");
		
		vector.add("sunny");
		
		vector.add("keerthana");
		
		Iterator<String> itr = vector.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
      
	}

}
