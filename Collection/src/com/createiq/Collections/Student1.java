package com.createiq.Collections;

public class Student1 {
	
	 private String id;
	
	private String name;
	
	public Student1() {
		// TODO Auto-generated constructor stub
	}

	public Student1(String id, String name) {
		super();
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
		return "Student1 [id=" + id + ", name=" + name + "]";
	}
	
	}
