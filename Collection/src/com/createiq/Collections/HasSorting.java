package com.createiq.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class HasSorting {

	public static void main(String [] args) {
		
		HashSet<String> countries = new HashSet<>();
		
		countries.add("india");
		countries.add("pakisthan");
		countries.add("england");
		countries.add("australiya");
		countries.add("china");
		countries.add("america");
		
		TreeSet<String> treeset = new TreeSet<>(countries);
		
		List<String> list = new ArrayList<>(countries);
	
		Collections.sort(list);
		
//		Collections.sort(list,new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.compareTo(o2) ;
//			}
//		});
		
		for(String country : list) {
			
			if(country.startsWith("i")) {
				
			}
			
			System.out.println(country);
		}
	}		

}
