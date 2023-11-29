package com.java.ex;

import java.util.HashSet;
import java.util.Set;

public class SetEx {

	   public static void main(String[] args) {
		     Set<Integer> numbers = new HashSet<>();
		// Adding elements to the Set
		        numbers.add(5);
		        numbers.add(2);
		        numbers.add(8);
		        numbers.add(5); // Adding a duplicate element (ignored)
		     // Iterating through the Set using a for-each loop
		             System.out.println("Set of numbers:");
		             for (int number : numbers) {
		                 System.out.println(number);
		             }
		     // Checking if an element is in the Set
		             boolean contains8 = numbers.contains(8);
		             System.out.println("Contains 8? " + contains8);
		       // Removing an element from the Set
		             numbers.remove(2);
		     // Checking the size of the Set
		             int size = numbers.size();
		             System.out.println("Set size: " + size);
		      // Checking if the Set is empty
		             boolean isEmpty = numbers.isEmpty();
		             System.out.println("Is Set empty? " + isEmpty);
		      // Clearing the Set
		             numbers.clear();
		             System.out.println("Set after clearing: " + numbers);
		         }
		     }

