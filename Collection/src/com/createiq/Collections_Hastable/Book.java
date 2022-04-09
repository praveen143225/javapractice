package com.createiq.Collections_Hastable;

public class Book {

	int id;
	
	String Name,Author,Publisher;
	
	int Quantity;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String name, String author, String publisher, int quantity) {
		
		this.id = id;
		Name = name;
		Author = author;
		Publisher = publisher;
		Quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", Name=" + Name + ", Author=" + Author + ", Publisher=" + Publisher + ", Quantity="
				+ Quantity + "]";
	}
	
	
	
	
	
}
