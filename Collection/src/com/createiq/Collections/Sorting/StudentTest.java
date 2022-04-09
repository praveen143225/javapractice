package com.createiq.Collections.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StudentTest {
	
	public static void main(String [] args) {
		
		ArrayList<Student> listofStudents = new ArrayList<Student>();
		
		listofStudents.add(new Student(1, "praveen"));
		
		listofStudents.add(new Student(2, "Sunny"));
		
		listofStudents.add(new Student(3, "Keerthana"));
		
		listofStudents.add(new Student(4, "Chadrakala"));
			
		Collections.sort(listofStudents);
		
		
		Iterator<Student> itr = listofStudents.iterator();
		
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		
		}
		
	}

}
