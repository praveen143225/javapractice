package com.createiq.Collections_Hastable;

import java.util.Hashtable;
import java.util.Map;

public class Deprtment {
	
	
	public static void main(String [] args) {
		
		Hashtable<Integer, Employe> ht = new Hashtable<Integer,Employe>();
		
		Employe e1 = new Employe(101, "Praveen", "Infosys", 70000.00);
		Employe e2 = new Employe(102, "Chandrakala", "Yashoda", 60000.00);
		Employe e3 = new Employe(103, "Sunny", "Genpact", 100000.00);
		Employe e4 = new Employe(104, "keerthana", "TCS", 800000.00);
		
		ht.put(1, e1);
		ht.put(2, e2);
		ht.put(3, e3);
		ht.put(4, e4);
		
		for(Map.Entry<Integer, Employe> entry:ht.entrySet()) {
			
			int emp = entry.getKey();
			
			Employe e = entry.getValue();
			 
			 System.out.println(emp +" "+ " Details:");
			 
			 System.out.println(e.id+" "+ e.name+" "+ e.office+" "+ e.salary);
			 
			 
		
		}
		
	}

}
