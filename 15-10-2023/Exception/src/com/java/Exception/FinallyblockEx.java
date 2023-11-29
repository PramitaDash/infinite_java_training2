package com.java.ex;

public class FinallyblockEx {
	
	 public static void main(String[] args) {
	        try {//The code inside the following curly braces is enclosed in a `try` block. This is where you attempt a particular operation that may throw an exception.
	            int result = 10 / 2;//Inside the `try` block, you perform a division operation, which divides 10 by 2, resulting in the value `5`.
	            System.out.println("Result: " + result);//After the successful division operation, you print the result, which is "Result: 5," to the console.
	        } catch (ArithmeticException e) {//This is a `catch` block set up to catch an `ArithmeticException`.
	            System.out.println("Arithmetic Exceptionf: " + e.getMessage());
	        } finally {//The `finally` block is always executed, regardless of whether an exception is thrown or not
	            System.out.println("Finally block always executes.");//Inside the `finally` block, you print the message "Finally block always executes.
	        }
	    }

}
