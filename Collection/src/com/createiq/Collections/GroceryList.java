package com.createiq.Collections;

import java.util.ArrayList;

public class GroceryList {
	
	ArrayList<String > gl = new ArrayList<String>();
	
	public void add(String item) {
		
		gl.add(item);
	}
	
	public void printGrocerylist() {
		
		System.out.println("you have "+gl.size()+"list of items");
		for( int i=0; i<gl.size();i++) {
			System.out.println((i+1)+"."+gl.get(i));
		}	
	}
	public void modifyitem(int position , String currentitem) {
		
		gl.set(position, currentitem);
		
	}
	
	public String remove(int position) {
		return gl.remove(position);
	}
	
	public int searchitem(String currentitem) {
		return gl.indexOf(currentitem);
		
	}
	
	public static void main(String[] args) {
		
		GroceryList grolist = new GroceryList();
		
		grolist.add("chicken");
		grolist.add("mutton");
		grolist.add("fish");
		grolist.add("france");
		grolist.add("thalakay");
		
		grolist.printGrocerylist();
		
		System.out.println(grolist.searchitem("curd"));
		
		grolist.modifyitem(1, "heritage");
		
		grolist.printGrocerylist();
		
		
	}

}
