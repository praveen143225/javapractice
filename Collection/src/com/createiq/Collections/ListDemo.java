package com.createiq.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class ListDemo {
	
	public static void main(String args[]) {
		
//		Collection<E>
		

           //Heterogeneous 
		
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add(12);
		
		arrayList.add(3.14);
		
		arrayList.add("praveen");
		
		arrayList.add('c');
		
		arrayList.add(123.45);
		
		arrayList.add("true");
		
		arrayList.add(new Student(1, "praveen"));
		
		System.out.println(arrayList);

}

	
}	
	
	
	