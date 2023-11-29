package com.java.ex;

public class MulExpHandling {
	
	public static void main(String[] args) {
        try {//The code inside the following curly braces is enclosed in a `try` block.
            int[] numbers = {1, 2, 3};// You declare an integer array `numbers` with three elements: 1, 2, and 3.
            int result = numbers[4] / 0; // ArrayIndexOutOfBoundsException and ArithmeticException
            System.out.println("Result: " + result);//You try to print the value of `result`, but it won't be reached due to the exceptions thrown earlier.
        } catch (ArrayIndexOutOfBoundsException e) {//You have a `catch` block set up to catch an `ArrayIndexOutOfBoundsException`
            System.out.println("Array Index Out of Bounds: " + e.getMessage());//Inside the `catch` block, you print "Array Index Out of Bounds" along with the error message provided by the exception (`e.getMessage()`).
        }
    }

}
