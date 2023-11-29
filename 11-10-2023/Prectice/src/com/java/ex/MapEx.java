package com.java.ex;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
	
	public static void main(String[] args) {
        // Create a Map that maps names to ages
        Map<String, Integer> ageMap = new HashMap<>();

        // Adding key-value pairs to the Map
        ageMap.put("Ananya", 25);
        ageMap.put("Khafia", 30);
        ageMap.put("Pramita", 28);

        // Accessing values by key
        int ananyaAge = ageMap.get("Ananya");
        System.out.println("Ananya's age: " + ananyaAge);

        // Iterating through the Map using a for-each loop
        System.out.println("Name - Age mapping:");
        for (Map.Entry<String, Integer> entry : ageMap.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();
            System.out.println(name + " - " + age);
        }

        // Checking if a key is in the Map
        boolean containsKhafia = ageMap.containsKey("Khafia");
        System.out.println("Contains 'Khafia'? " + containsKhafia);

        // Removing a key-value pair from the Map
        ageMap.remove("Pramita");

        // Checking the size of the Map
        int size = ageMap.size();
        System.out.println("Map size: " + size);

        // Checking if the Map is empty
        boolean isEmpty = ageMap.isEmpty();
        System.out.println("Is Map empty? " + isEmpty);

        // Clearing the Map
        ageMap.clear();
        System.out.println("Map after clearing: " + ageMap);
    }
}


