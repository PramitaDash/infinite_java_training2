package com.java.string;

public class StringPermutations {
	
	  public static void main(String[] args) {
//define a string variable `input` with the value "abc." This is the input string for which you want to generate permutations.

	        String input = "abc";
//the `generatePermutations` method with the input string `input` and an empty string as the initial "ans" (answer) to start the permutation generation process.
	        generatePermutations(input, "");
//After generating and displaying all permutations, you print a message to indicate that all permutations of the input string have been displayed.
	        System.out.println("All permutations of " + input + " have been displayed.");
	    }
//This is the `generatePermutations` method, which takes two string parameters
	    public static void generatePermutations(String str, String ans) {
	        if (str.length() == 0) {// This condition checks if the length of the remaining string `str` is 0, which means all characters have been used to build a permutation.
//If the above condition is met, you print the current permutation `ans`.
	            System.out.println(ans);
	            return;//After printing the permutation, you return from the method.
	        }
// use a loop to iterate through the characters in the input string `str`.
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);//u get the character at the current position `i` in the string `str`
//You create a new string `remaining` by removing the character at position `i` from the original string `str`.
	            String remaining = str.substring(0, i) + str.substring(i + 1);
//call the `generatePermutations` method with the updated `remaining` string and the current permutation `ans` extended by the character `ch`.
	            generatePermutations(remaining, ans + ch);
	        }
	    }

}
