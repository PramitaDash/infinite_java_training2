package com.java.string;

public class BooleanToStringExample {
	
	public static void main(String[] args) {
//This line declares a variable `boolValue` of type `boolean` and assigns it the value `true`. This represents a boolean with a true value.
        boolean boolValue = true;
//use the `Boolean.toString(boolValue)` method to convert the boolean `boolValue` to a string and store the result in the `stringValue` variable. Since `boolValue` is `true`, the resulting string is "true."
        String stringValue = Boolean.toString(boolValue);
// This line prints the text "Boolean Value: " followed by the value of `boolValue`, which is `true`. The output will be "Boolean Value: true" on the console.
        System.out.println("Boolean Value: " + boolValue);
// print the text "String Value: " followed by the value of `stringValue`, which is the string "true." The output will be "String Value: true" on the console.
        System.out.println("String Value: " + stringValue);
    }

}
