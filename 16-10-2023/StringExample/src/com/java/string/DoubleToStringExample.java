package com.java.string;

public class DoubleToStringExample {
	
	 public static void main(String[] args) {
//This line declares a variable `doubleValue` of type `double` and assigns it the value 123.45.
	        double doubleValue = 123.45;
//`Double.toString(doubleValue)` method to convert the double `doubleValue` to a string, and you store the result in the `stringValue` variable. The resulting string is "123.45."
	        String stringValue = Double.toString(doubleValue);
	        
//This line prints the text "Double Value: " followed by the value of `doubleValue`, which is 123.45, to the console

	        System.out.println("Double Value: " + doubleValue);
// you print the text "String Value: " followed by the value of `stringValue`, which is the string "123.45," to the console.
	        System.out.println("String Value: " + stringValue);
	    }

}
