package com.java.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterFinder {
	
	public static void main(String[] args) {
//this define a string variable `text` with the value "Java Guides Net."
        String text = "Java Guides Net";
//This line prints a message to the console to indicate that the program will display duplicate characters in the string.
        System.out.println("Duplicate characters in the string are:");
// call the `findDuplicates` method and pass the `text` string as an argument. This method will find and print the duplicate characters in the string.
        findDuplicates(text);
    }

    public static void findDuplicates(String str) {
//This is the `findDuplicates` method, which takes a string as its parameter.
        Map<Character, Integer> charCountMap = new HashMap<>();
//create a `Map` named `charCountMap` to store character counts. The key is a character, and the value is an integer representing the count.

        for (char c : str.toCharArray()) {//This loop iterates over each character in the input string `str`
//  this line updates the count in the `charCountMap`. It uses `getOrDefault` to safely retrieve the current count (or 0 if not found) and then increments it by 1
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
//charCountMap.entrySet()) {`: This loop iterates over the entries (key-value pairs) in the `charCountMap`.

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {// Inside the loop, it checks if the count of a character is greater than 1, indicating a duplicate character.
// If a character is a duplicate, it prints the character (the key) followed by a space.
                System.out.print(entry.getKey() + " ");
            }
        }
    }

}
