package com.java.ex;

public class ExceptionHandlingEx {
	
	public static void main(String []args) { 
	      try { // The code inside the following curly braces is enclosed in a `try` block. This is where you attempt a particular operation that may throw an exception.

	         int data = 10/2; //Inside the `try` block, you perform a division operation, which divides 10 by 2, resulting in the value `5`.
	         System.out.println(data);//After the successful division operation, you print the value `5` to the console
	      } catch(NullPointerException e) { //This is a `catch` block that is set up to catch a `NullPointerException`. However, no `NullPointerException` is thrown in the `try` block, so this block is not executed.
	         System.out.println(e);
	      } finally { //The `finally` block is always executed, regardless of whether an exception is thrown or not.
	         System.out.println("finally block is always executed"); // Inside the `finally` block, you print the message "finally block is always executed."

	      } 
	      System.out.println("rest of the code...");//After the `try`, `catch`, and `finally` blocks, you print "rest of the code..." to the console.
	 }

}
