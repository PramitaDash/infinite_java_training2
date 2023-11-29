package com.java.string;

public class CharToStringExample {
	
	public static void main(String[] args) {
//		This line declares a variable `charValue` of type `char` and assigns it the character 'A'. You are storing the character 'A' in the variable `charValue`.

        char charValue = 'A';
        
//  this line declare a variable `stringValue` of type `String`. You use the `Character.toString(charValue)` method to convert the character `charValue` to a string and store it in the `stringValue` variable.
        String stringValue = Character.toString(charValue);
// This line prints the text "Character Value: " followed by the value of `charValue` (which is 'A') to the console.
        System.out.println("Character Value: " + charValue);
// This line prints the text "String Value: " followed by the value of `stringValue`, which is the result of converting the character 'A' to a string, so it also prints 'A' to the console       
        System.out.println("String Value: " + stringValue);
    }

}
