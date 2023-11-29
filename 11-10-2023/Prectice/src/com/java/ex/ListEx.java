package com.java.ex;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
		    public static void main(String[] args) {
		    // Create a List of Strings
		     List<String> fruits = new ArrayList<>();
		   // Adding elements to the List
		        fruits.add("Apple");
		        fruits.add("Banana");
		        fruits.add("Cherry");
		        fruits.add("Date");
		// Accessing elements by index
		        System.out.println("First fruit: " + fruits.get(0));
		        System.out.println("Third fruit: " + fruits.get(2));
		// Modifying an element in the List
		        fruits.set(1, "Blueberry");
		        // Iterating through the List using a for-each loop
		        System.out.println("List of fruits:");
		        for (String fruit : fruits) {
		            System.out.println(fruit);
		        }
		// Checking if an element is in the List
		        boolean containsCherry = fruits.contains("Cherry");
		        System.out.println("Contains 'Cherry'? " + containsCherry);
		 // Removing an element from the List
		        fruits.remove("Date");
		 // Checking the size of the List
		        int size = fruits.size();
		        System.out.println("List size: " + size);
		// Checking if the List is empty
		        boolean isEmpty = fruits.isEmpty();
		        System.out.println("Is List empty? " + isEmpty);
		// Clearing the List
		        fruits.clear();
		        System.out.println("List after clearing: " + fruits);
		    }
		}


