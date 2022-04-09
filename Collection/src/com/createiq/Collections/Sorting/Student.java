package com.createiq.Collections.Sorting;

public class Student implements Comparable<Student>{

	int id;
	
	String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.getId()-this.getId();
	}
	
	

}
