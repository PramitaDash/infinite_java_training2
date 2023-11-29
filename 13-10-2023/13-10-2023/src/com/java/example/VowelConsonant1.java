package com.java.example;

public class VowelConsonant1 {
	
	    public static void main(String[] args) {

	        char ch = 'z';

	        switch (ch) {//The `switch` statement begins here. It specifies the variable `ch` that you want to evaluate for different cases. The `switch` statement will determine which code block to execute based on the value of `ch`.
//In the `switch` block, there are several `case` statements. Each `case` statement represents a possible value for the variable `ch`. In this code, 'a', 'e', 'i', 'o', and 'u' are listed as vowel cases. If `ch` matches any of these vowel cases, the following block will be executed.
	            case 'a':
	            case 'e':	
	            case 'i':
	            case 'o':
	            case 'u':
	                System.out.println(ch + " is vowel");
	                break;
	            default:
	                System.out.println(ch + " is consonant");
	        }
	    }
	}


