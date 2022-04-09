package com.createiq.Collections;

public class Student2 {
	
	private String  id;
	
	private String name;
	
	public Student2() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Student2(String id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + "]";
	}
	
}
	
