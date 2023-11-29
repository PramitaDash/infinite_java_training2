package com.java.string;

public class IntegerToStringExample {
	
	public static void main(String[] args) {
        // Convert Integer to String using toString()
        Integer intValue = 12345;
// In this line, you declare a variable `stringValue` of type `String`.    
        String stringValue = Integer.toString(intValue);
//This line prints the text "Integer Value: " followed by the value of `intValue`, which is 12345, to the console. 
        System.out.println("Integer Value: " + intValue);
// print the text "String Value: " followed by the value of `stringValue`, which is the string "12345," to the console.
        System.out.println("String Value: " + stringValue);
    }

}
