package com.createiq.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Duplicate_Array_Set {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList= new ArrayList<String>();
		
		arrayList.add("kp");
		arrayList.add("chandrakala");
		arrayList.add("sunny");
		arrayList.add("keerthana");
		arrayList.add("kp");
		
//		before printing the duplicates in arraylist
		
		System.out.println(arrayList);
		
		Set<String> set = new HashSet<String>(arrayList);
		
//		 after printing the duplicates in set
		
		System.out.println(set);
		
	}

}
