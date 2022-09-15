package com.first.projet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayList {

	public static void main(String[] args) {
		
		List<String> mechanical = Arrays.asList("Shekhar","Krushnat");
		List<String> civil = Arrays.asList("Rushikesh","Shrikant");
		List<String> electronics = Arrays.asList("Gayatri","Arav");
		List<String> computer = Arrays.asList("Rohit","Mohit");

		
		Map<String, List<String>> map = new HashMap<>();
		
		map.put("Mechanical :", mechanical);
		map.put("Civil :", civil);
		map.put("Electronics :", electronics);
		map.put("Computer :", computer);
		
		
		Set<String> set = map.keySet();
		for(Object o : set) {
			
			System.out.println(o);
			System.out.println(map.get(o));
		}
	}

}
