package com.createiq.Collections;

import java.util.ArrayList;

public class Employe {
//	
//	input : { "id":"124"; "name":"Ramu" }, { "id":"134"; "name":"Somu" } 
//	Output : { "124":"Ramu"; "134":"Somu" }
//	
	public static void main(String [] args) {
		
//		Collection<E>
		
		ArrayList arrayList= new ArrayList();
		
		arrayList.add("id");
		
		arrayList.add("124");
		
		arrayList.add("name");
		
		arrayList.add("ramu");
		
		arrayList.add("id");
	
		arrayList.add("134");
		
		arrayList.add("name");
		
		arrayList.add("somu");
		
		System.out.println(arrayList);
		
//		arrayList.add(8,"sunny");
		
//		arrayList.set(1, "praveen");
		
		System.out.println(arrayList);
		
		
		
	}

}
