package com.first.projet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayList {

	public static void main(String[] args) {
		
		List<String> mechanical = Arrays.asList("Shekhar","Krushnat","Atul");
		List<String> civil = Arrays.asList("Rushikesh","Shrikant","Manik");
		List<String> electronics = Arrays.asList("Gayatri","Arav","Yuvraj");
		List<String> computer = Arrays.asList("Rohit","Mohit","Purohit");
		List<String> electrical = Arrays.asList("Godavari","Kailas","Shankar");

		
		Map<String, List<String>> map = new HashMap<>();
		
		map.put("Mechanical :", mechanical);
		map.put("Civil :", civil);
		map.put("Electronics :", electronics);
		map.put("Computer :", computer);
		map.put("Electrical", electrical);
		
		Set<String> set = map.keySet();
		for(Object o : set) {
			
			System.out.println(o);
			System.out.println(map.get(o));
		}
	}

}
