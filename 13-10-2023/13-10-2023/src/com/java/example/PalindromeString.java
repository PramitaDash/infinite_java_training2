package com.java.example;

public class PalindromeString {
	
		  public static void main(String[] args) {

		    String str = "Radar", reverseStr = "";//Initialize a string variable `str` with the value "Radar," which is the string you want to check for being a palindrome.
		    
		    int strLength = str.length();//Declare an empty string variable `reverseStr` to store the reversed version of the input string.

		    for (int i = (strLength - 1); i >=0; --i) { //Calculate the length of the input string `str` and store it in the variable `strLength`.
		      reverseStr = reverseStr + str.charAt(i);// Inside the loop, it appends each character of the input string in reverse order to `reverseStr`.
		    }

		    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {//It converts both the input string `str` and `reverseStr` to lowercase using the `toLowerCase()` method to make the comparison case-insensitive
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }
		  }

}
