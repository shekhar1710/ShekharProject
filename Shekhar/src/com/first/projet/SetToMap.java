package com.first.projet;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class SetToMap {

	public static void main(String[] args) {
		
		LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
		map.put("Shekhar", "Mechanical");
		map.put("Krushnat", "Mechanical");
		map.put("Rushikesh", "Civil");
		map.put("Gayatri", "Electronics");
		map.put("Rohit", "Cse");
		
		LinkedHashMap<String,String> map3 = new LinkedHashMap<String,String>();
		map3.put("Sneha", "IT");
		map3.put("Sandip", "Mechanical");
		map3.put("Abhijeet", "Civil");
		map3.put("Nitu", "IT");
		
		Map<String,LinkedHashMap<String,String>> map2 = new HashMap<String,LinkedHashMap<String,String>>();
		map2.put("Group W : ", map);
		map2.put("Group B : ", map3);
		
		Set<String> ss = map2.keySet();
		
		for(Object o : ss) {
			System.out.println(o);
			System.out.println(map2.get(o));
		}

	}

}