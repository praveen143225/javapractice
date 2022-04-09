package com.createiq.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String [] args) {
		
		Map<String, String> capitals = new HashMap<>();
		
		System.out.println(capitals.size());
		capitals.put("India", "New Delhi");
		capitals.put("England", "landon");
		capitals.put("Russia", "Mascow");
		
		System.out.println(capitals);
		System.out.println("the capital of the india is :"  + capitals.get("India"));
		capitals.put("India", "Hyderabad");
		
		System.out.println("the capital of the india is :"  + capitals.get("India"));
		System.out.println(capitals.containsValue("landon"));
		
		if(capitals.containsValue("mascow")) {
			
			System.out.println(" the russia is in the list");
		}else {
			
			System.out.println(" there is no country present in the list");
		}
		System.out.println("-----------------------------------");
		
		capitals.put(null, "the country is in not present in list");
		
		String output = "Australia";
		
		if(capitals.containsKey(output)) {
			
			System.out.println("Australia is in the list");
			System.out.println(capitals.get(output));
		}else {
			System.out.println(capitals.get(null));
		}
		System.out.println(capitals.size());
		capitals.clear();
		System.out.println(capitals.size());
		
		if(!capitals.containsKey(output)) {
			System.out.println(capitals.putIfAbsent(output, "sydney"));
		}else {
			System.out.println(capitals.get(null));
		}
	
		capitals.replace("India", "mumbai", "Hyderabad");
		System.out.println(capitals.get("India"));
	}

}
