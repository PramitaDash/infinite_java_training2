package com.java.ex;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEx {
	

	 public static void main(String[] args) {
	        
	        SortedSet<Integer> numbers = new TreeSet<>();

	        numbers.add(5);
	        numbers.add(2);
	        numbers.add(8);
	        numbers.add(1);

	        // Iterating through the SortedSet (in ascending order)
	        System.out.println("SortedSet of numbers (ascending order):");
	        for (int number : numbers) {
	            System.out.println(number);
	        }

	        // Checking the first and last elements
	        int firstElement = numbers.first();
	        int lastElement = numbers.last();
	        System.out.println("First element: " + firstElement);
	        System.out.println("Last element: " + lastElement);

	        // Finding elements less than or equal to a given value
	        SortedSet<Integer> lessThanOrEqual5 = numbers.headSet(5);
	        System.out.println("Elements less than or equal to 5: " + lessThanOrEqual5);

	        // Finding elements greater than a given value
	        SortedSet<Integer> greaterThan2 = numbers.tailSet(2); // Exclude 2
	        System.out.println("Elements greater than 2: " + greaterThan2);

	        // Removing an element from the SortedSet
	        numbers.remove(8);

	        // Checking the size of the SortedSet
	        int size = numbers.size();
	        System.out.println("SortedSet size: " + size);

	        // Checking if the SortedSet is empty
	        boolean isEmpty = numbers.isEmpty();
	        System.out.println("Is SortedSet empty? " + isEmpty);

	        // Clearing the SortedSet
	        numbers.clear();
	        System.out.println("SortedSet after clearing: " + numbers);
	    }
	}

