package com.createiq.Collections_Hastable;

import java.util.Hashtable;
import java.util.Map;

public class HastableExample {
	
	public static void main(String [] args) {
		
     //creating a map on Book
		
		Map<Integer,Book> map = new Hashtable<Integer,Book>();
		
		Book b1= new Book(100, "Na Istam", "Ramgopal Varma", "ram", 800);
		
		Book b2 = new Book(101, "Harry Porter", "J.K rowing", "Censorship", 1000);
		
		Book b3=new Book(102, "Swami VIvekanandha", "Vivekanandha", "govt", 2000);
		
		 //Adding Books to map   
		map.put(1, b1);
		
		map.put(2, b2);
		
		map.put(3, b3);
		
		 //Traversing map  forEach loop
		
		for(Map.Entry<Integer, Book> entry:map.entrySet()) {
		
	    int key = entry.getKey();
	    
	    Book b = entry.getValue();
	    
	    System.out.println(key + " " + "details:");
	    
	    System.out.println(b.id  + " "+ b.Name + " "+ b.Author + " "+ b.Publisher + " "+ b.Quantity);
	    
	
	}
}
	
}