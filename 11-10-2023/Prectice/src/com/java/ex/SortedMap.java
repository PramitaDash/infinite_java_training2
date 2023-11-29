package com.java.ex;

import java.util.TreeMap;


public class SortedMap {
	
	public static void main(String[] args) {
		
    java.util.SortedMap<String, Integer> ageMap = new TreeMap<>();
    ageMap.put("Ananya", 25);
ageMap.put("Khafia", 30);
ageMap.put("Pramita", 28);
ageMap.put("Smruti", 22);

// Iterating through the SortedMap (in ascending order of keys)
System.out.println("SortedMap of names and ages (ascending order of keys):");
for (String name : ageMap.keySet()) {
 int age = ageMap.get(name);
 System.out.println(name + " - " + age);
}

// Checking the first and last keys
String firstKey = ageMap.firstKey();
String lastKey = ageMap.lastKey();
System.out.println("First key: " + firstKey);
System.out.println("Last key: " + lastKey);

// Finding entries with keys less than or equal to a given key
java.util.SortedMap<String, Integer> lessThanOrEqualPramita = ageMap.headMap("Pramita");
System.out.println("Entries with keys less than or equal to 'Pramita': " + lessThanOrEqualPramita);

// Finding entries with keys greater than a given key
java.util.SortedMap<String, Integer> greaterThanSmruti = ageMap.tailMap("Smruti");
System.out.println("Entries with keys greater than 'Smruti': " + greaterThanSmruti);

// Removing an entry from the SortedMap
ageMap.remove("Khafia");

// Checking the size of the SortedMap
int size = ageMap.size();
System.out.println("SortedMap size: " + size);

// Checking if the SortedMap is empty
boolean isEmpty = ageMap.isEmpty();
System.out.println("Is SortedMap empty? " + isEmpty);

// Clearing the SortedMap
ageMap.clear();
System.out.println("SortedMap after clearing: " + ageMap);
}
}


