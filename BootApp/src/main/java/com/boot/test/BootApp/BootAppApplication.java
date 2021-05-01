package com.boot.test.BootApp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootAppApplication {

	public static void main(String[] args) {
		
		/* 
		 * BinarySearchImpl imp = new BinarySearchImpl(new BubbleSortAlogithem()); int
		 * num = imp.binarySearch(new int[] {1,2,3}, 4);
		 * System.out.println("Searched no is :  "+num);
		 */
		
		/*
		 * int [] marks = {1,2,012}; for(int i= 0; i< marks.length; i++) {
		 * System.out.println("aaaaaaaaaa  "+marks[i]); }
		 * 
		 * System.out.println("ddd  "+013);
		 */
		/*
		 * int i = 1; System.out.println(i = i++); System.out.println(i = i++);
		 */
		
		//int[] a = new int[0];
		
		/*
		 * ArrayList<Integer> a = new ArrayList<Integer>(); a.add(1); a.add(3);
		 * a.add(2); a.add(4);
		 * 
		 * for (Integer num : a) { System.out.println(num+1); }
		 */
		
		/*
		 * ArrayList<Integer> list = new ArrayList<Integer>(); list.add(1); list.add(2);
		 * 
		 * 
		 * 
		 * System.out.println(list.toString());
		 * 
		 * ApplicationContext context = SpringApplication.run(BootAppApplication.class,
		 * args); BinarySearchImpl binarySearch =
		 * context.getBean(BinarySearchImpl.class);
		 * 
		 * int num = binarySearch.binarySearch(new int[] {1,2,3}, 4);
		 * System.out.println("Searched no is :  "+num);
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		/*
		 * String name = "testing"; String reversed = "";
		 * 
		 * for(int i = name.length()-1; i >= 0 ; i--){
		 * 
		 * reversed += name.charAt(i);
		 * 
		 * }
		 */
		
		
		
		String country = "india";
		
		Map<Character,Integer> countryMap = new HashMap<Character,Integer>();
		
		for(int i = 0; i < country.length(); i++) {
			
			
			if(countryMap.containsKey(country.charAt(i))) {
				int count = countryMap.get(country.charAt(i));
				
				countryMap.put(country.charAt(i), count+1);
			}else {
				countryMap.put(country.charAt(i), 1);
			}
			
			
		}
		
		for (Map.Entry<Character, Integer> m : countryMap.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
		
		
		
		
	
		
		
		
		
		
	}

}
