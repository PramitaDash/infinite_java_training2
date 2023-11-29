package com.java.ex;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionEx {

	public static void main(String[] args){
		 Collection<String> names = new ArrayList<>();
		 names.add("Apple");
		 names.add("Mengo");
		 names.add("Banana");
	//print the collection
	System.out.println("Collection contains: " + names);
	//Checking if an element is present in the collection
	Boolean containsApple = names.contains("Apple");
	System.out.println("Contain 'Apple'? "+containsApple);
	// Removing an element from the collection
	names.remove("Mengo");
	//Checking the size of the collection
	int size = names.size();
	System.out.println("Collection size: " +size);
	//Checking if the collection is empty
	Boolean isEmpty = names.isEmpty();
	System.out.println("Is collection empty?" +isEmpty);
	//Iterating through the collection using a for-each loop
	for (String name : names) {
	          System.out.println(name);
	        }
	// Clearing the collection
	        names.clear();
	        System.out.println("Collection after clearing: " + names);
	    }
}
