package com.java.string;

public class ShortToStringExample {
	
	public static void main(String[] args) {
        // Convert Short to String using toString()
        Short shortValue = 1234;
// use the `Short.toString(shortValue)` method to convert the `Short` object `shortValue` to a string, and you store the result in the `stringValue` variable.
        String stringValue = Short.toString(shortValue);
        
//This line prints the text "Short Value: " followed by the value of `shortValue`, which is 1234, to the console.
        System.out.println("Short Value: " + shortValue);
// print the text "String Value: " followed by the value of `stringValue`, which is the string "1234," to the console.
        System.out.println("String Value: " + stringValue);
    }

}
