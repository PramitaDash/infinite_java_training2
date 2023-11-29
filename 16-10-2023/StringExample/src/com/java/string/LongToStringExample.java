package com.java.string;

public class LongToStringExample {
	public static void main(String[] args) {
        // Convert Long to String using toString()
        Long longValue = 123456789L;
//declare a variable `stringValue` of type `String`. You use the `Long.toString(longValue)` method to convert the `Long` object `longValue` to a string, and you store the result in the `stringValue` variable
        String stringValue = Long.toString(longValue);
        
 //This line prints the text "Long Value: " followed by the value of `longValue`, which is 123456789, to the console.
        System.out.println("Long Value: " + longValue);
//print the text "String Value: " followed by the value of `stringValue`, which is the string "123456789," to the console
        System.out.println("String Value: " + stringValue);
    }

}
