package com.createiq.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetMethodDemo {
	
	public static void main(String[] args) {
		
		Set<String> colours = new HashSet<String>();
		
		colours.add("red");
		colours.add("blue");
		colours.add("black");
		colours.add("yellow");
		colours.add("green");
//		colours.add(null);
//		colours.add(null);
		
		Iterator<String> itr = colours.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		System.out.println("--------------------------");
		
		colours.forEach(c-> System.out.println(c)); // lamda features in java 8
		
//		colors.forEach(c ->c.equals("b") System.out.println(c));
		
		List<String> list = new ArrayList<String>(colours);
		
		Collections.sort(list);
		
		System.out.println("-----------------");
		
		System.out.println(list);
		
		System.out.println("------------------");
		
		Iterator<String> itr2 = list.iterator();
		
		while(itr2.hasNext()) {
			
			System.out.println(itr2.next());
			
		}

		}	
	}


